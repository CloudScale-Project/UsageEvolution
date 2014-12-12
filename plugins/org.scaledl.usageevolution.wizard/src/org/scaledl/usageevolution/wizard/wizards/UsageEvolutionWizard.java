package org.scaledl.usageevolution.wizard.wizards;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;

/**
 * This is a sample new wizard. Its role is to create a new file 
 * resource in the provided container. If the container resource
 * (a folder or a project) is selected in the workspace 
 * when the wizard is opened, it will accept it as the target
 * container. The wizard creates one file with the extension
 * "usageevolution". If a sample multi-page editor (also available
 * as a template) is registered for the same extension, it will
 * be able to open it.
 */

public class UsageEvolutionWizard extends Wizard implements INewWizard {
	private SelectUsageModelPage page;
	private WizardNewFileCreationPage newFilePage;
	private SelectLoadLIMBOPage loadPage;
	private IStructuredSelection selection;
	static final String FILEEXTENSION = "usageevolution";
	static final String DEFAULT_FILENAME = "default";

	private UsageEvolutionSetupModel setupModel = new UsageEvolutionSetupModel();
	
	/**
	 * Constructor for UsageEvolutionWizard.
	 */
	public UsageEvolutionWizard() {
		super();
		setNeedsProgressMonitor(true);
	}
	
	/**
	 * Adding the page to the wizard.
	 */

	public void addPages() {
	    newFilePage = new WizardNewFileCreationPage("New usage evolution", selection);
	    newFilePage.setFileExtension(FILEEXTENSION);
	    newFilePage.setTitle("Usage Evolution Model");
        newFilePage.setTitle("Create Usage Evolution Model (step 1 of 3)");
        newFilePage.setFileName(DEFAULT_FILENAME + "." + FILEEXTENSION);
        //newFilePage.setModel(setupModel);
	    
        // Try and get the resource selection to determine a current directory for the file dialog.
        //
        if (selection != null && !selection.isEmpty()) {
            // Get the resource...
            //
            Object selectedElement = selection.iterator().next();
            if (selectedElement instanceof IResource) {
                // Get the resource parent, if its a file.
                //
                IResource selectedResource = (IResource)selectedElement;
                if (selectedResource.getType() == IResource.FILE) {
                    selectedResource = selectedResource.getParent();
                }

                // This gives us a directory...
                //
                if (selectedResource instanceof IFolder || selectedResource instanceof IProject) {
                    // Set this for the container.
                    //
                    newFilePage.setContainerFullPath(selectedResource.getFullPath());

                    // Make up a unique new name here.
                    //
                    String defaultModelBaseFilename = DEFAULT_FILENAME;
                    String defaultModelFilenameExtension = FILEEXTENSION;
                    String modelFilename = defaultModelBaseFilename + "." + defaultModelFilenameExtension;
                    for (int i = 1; ((IContainer)selectedResource).findMember(modelFilename) != null; ++i) {
                        modelFilename = defaultModelBaseFilename + i + "." + defaultModelFilenameExtension;
                    }
                    newFilePage.setFileName(modelFilename);
                }
            }
        }	    
	    
	    addPage(newFilePage);
		page = new SelectUsageModelPage(selection);
		page.setModel(setupModel);
		addPage(page);
        loadPage = new SelectLoadLIMBOPage(selection);
        loadPage.setModel(setupModel);
        addPage(loadPage);
	}

	/**
	 * This method is called when 'Finish' button is pressed in
	 * the wizard. We will create an operation and run it
	 * using wizard as execution context.
	 */
	public boolean performFinish() {
	    IPath path = newFilePage.getContainerFullPath();
	    if (!path.hasTrailingSeparator())
	        path = path.addTrailingSeparator();
        final String ueFileName = path+ newFilePage.getFileName();
	    
	    setupModel.setUsageEvolutionFileName(ueFileName);
	    
		IRunnableWithProgress op = new IRunnableWithProgress() {
			public void run(IProgressMonitor monitor) throws InvocationTargetException {
				try {
					doFinish(setupModel, monitor);
				} catch (CoreException e) {
					throw new InvocationTargetException(e);
				} finally {
					monitor.done();
				}
			}
		};
		try {
			getContainer().run(true, false, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			Throwable realException = e.getTargetException();
			MessageDialog.openError(getShell(), "Error", realException.getMessage());
			return false;
		}
		return true;
	}
	
	/**
	 * The worker method. It will find the container, create the
	 * file if missing or just replace its contents, and open
	 * the editor on the newly created file.
	 */

	private void doFinish(	      
		UsageEvolutionSetupModel model,
		IProgressMonitor monitor)
		throws CoreException {
	    
        monitor.beginTask("Creating " + setupModel.usageEvolutionFileName, 2);
        final IFile file = UsageEvolutionFileGenerator.generate(setupModel);
        monitor.worked(1);
        monitor.setTaskName("Opening file for editing...");

        getShell().getDisplay().asyncExec(new Runnable() {
            public void run() {
                if ((file != null) && (file.exists())) {
                    IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
                    try {
                        IDE.openEditor(page, file, true);
                    } catch (PartInitException e) {

                    }
                } else {
                    MessageDialog.openError(getShell(), "File creation error",
                            "Could not create the UsageEvolution model");
                }
            }
        });
        monitor.worked(1);
	}
	
	/**
	 * We will accept the selection in the workbench to see if
	 * we can initialize from it.
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
	}
}