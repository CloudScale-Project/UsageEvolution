package org.scaledl.usageevolution.wizard.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public class PatternFilter extends ViewerFilter {

    private String extension;

    public PatternFilter(String extension) {
        super();
        this.extension = extension;
    }
    
    @Override
    public boolean select(Viewer viewer, Object parentElement, Object element) {
        if (element instanceof IFile) {
            return (extension.equals(((IFile)element).getFileExtension()));
        }
        return true;
    }

}
