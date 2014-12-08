package org.scaledl.usageevolution.wizard.wizards;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

/**
 * The "New" wizard page allows setting the container for the new file as well as the file name. The
 * page will only accept file name without the extension OR with the extension that matches the
 * expected one (usageevolution).
 */

public class SelectUsageModelPage extends WizardPage {
    private DataBindingContext m_bindingContext;
    private Text usageModelFileNameText;
    private UsageEvolutionSetupModel model;
    private Label lblSelectUsageModel;

    private ISelection selection;

    /**
     * Constructor for SampleNewWizardPage.
     * 
     * @param pageName
     */
    public SelectUsageModelPage(ISelection selection) {
        super("wizardPage");
        setTitle("Create Usage Evolution Model (step 2 of 3)");
        setDescription("Select Palladio usage model to create an evolution for\n(leave empty to define this at a later stage)");
        this.selection = selection;
    }

    /**
     * @see IDialogPage#createControl(Composite)
     */
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NULL);
        Label label;
        container.setLayout(new GridLayout(2, false));
        lblSelectUsageModel = new Label(container, SWT.NULL);
        lblSelectUsageModel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        lblSelectUsageModel.setText("Select usage model");

        Button button = new Button(container, SWT.PUSH);
        button.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
        button.setText("Browse...");
        button.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent e) {
                handleBrowse();
            }
        });

        usageModelFileNameText = new Text(container, SWT.BORDER | SWT.SINGLE);
        GridData gd_usageModelFileNameText = new GridData(SWT.LEFT, SWT.CENTER, true, false, 2, 1);
        gd_usageModelFileNameText.widthHint = 580;
        usageModelFileNameText.setLayoutData(gd_usageModelFileNameText);

        m_bindingContext = initDataBindings();
        setControl(container);
    }


    /**
     * Uses the standard container selection dialog to choose the new value for the container field.
     */

    private void handleBrowse() {
        // maybe use getContextSelection to open at default location later in 5th parameter
        List<ViewerFilter> filters = new ArrayList<ViewerFilter>();
        filters.add(new PatternFilter("usagemodel"));
        
        IFile[] files = WorkspaceResourceDialog.openFileSelection(getShell(), null, "Select usage model", false, 
                null, filters);

        if (files.length != 0 && files[0] != null) {
            String portableString = files[0].getFullPath().toPortableString();
            model.setUsageModelFileName(portableString);
        }
    }

    public void setModel(UsageEvolutionSetupModel setupModel) {
        this.model = setupModel;

    }
    
    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        IObservableValue observeTextUsageModelFileNameTextObserveWidget = WidgetProperties.text(SWT.Modify).observe(usageModelFileNameText);
        IObservableValue usageModelFileNameModelObserveValue = BeanProperties.value("usageModelFileName").observe(model);
        bindingContext.bindValue(observeTextUsageModelFileNameTextObserveWidget, usageModelFileNameModelObserveValue, null, null);
        //
        return bindingContext;
    }
}
