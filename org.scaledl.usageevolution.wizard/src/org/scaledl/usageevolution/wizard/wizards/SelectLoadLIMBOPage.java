package org.scaledl.usageevolution.wizard.wizards;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.layout.GridData;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;

public class SelectLoadLIMBOPage extends WizardPage {
    private DataBindingContext m_bindingContext;
    private Text textLimboFileName;
    private UsageEvolutionSetupModel model;
    private ISelection selection;
    private Label lblSelectLimboDlim;

    /**
     * Create the wizard.
     */
    public SelectLoadLIMBOPage(ISelection selection) {
        super("wizardPage3");
        setTitle("Create Usage Evolution Model (step 3 of 3)");
        setDescription("Select a DLIM model created with the LIMBO tool that defines the load evolution\n(leave empty to define this at a later stage)");
        this.selection = selection;
    }

    /**
     * Create contents of the wizard.
     * @param parent
     */
    public void createControl(Composite parent) {
        Composite container = new Composite(parent, SWT.NULL);

        setControl(container);
        container.setLayout(new GridLayout(2, false));
        
        lblSelectLimboDlim = new Label(container, SWT.NONE);
        lblSelectLimboDlim.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
        lblSelectLimboDlim.setText(" Select LIMBO DLIM model");
        
        Button btnNewButton = new Button(container, SWT.NONE);
        btnNewButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                handleBrowse();
            }
        });
        btnNewButton.setText("Browse...");
        
        textLimboFileName = new Text(container, SWT.BORDER);
        textLimboFileName.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
        m_bindingContext = initDataBindings();
    }
    
    public void handleBrowse() {
        List<ViewerFilter> filters = new ArrayList<ViewerFilter>();
        filters.add(new PatternFilter("dlim"));
        IFile[] files = WorkspaceResourceDialog.openFileSelection(getShell(), null, "Select usage model", false, null,
                filters);

        if (files.length != 0 && files[0] != null) {
            String portableString = files[0].getFullPath().toPortableString();
            model.setLoadLimboFileName(portableString);
        }
    }
     
    public void setModel(UsageEvolutionSetupModel setupModel) {
        this.model = setupModel;
    }
    
    protected DataBindingContext initDataBindings() {
        DataBindingContext bindingContext = new DataBindingContext();
        //
        IObservableValue observeTextTextLimboFileNameObserveWidget = WidgetProperties.text(SWT.Modify).observe(textLimboFileName);
        IObservableValue loadLimboFileNameModelObserveValue = BeanProperties.value("loadLimboFileName").observe(model);
        bindingContext.bindValue(observeTextTextLimboFileNameObserveWidget, loadLimboFileNameModelObserveValue, null, null);
        //
        return bindingContext;
    }
}
