package org.scaledl.usageevolution.wizard.wizards;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class UsageEvolutionSetupModel {

    String usageEvolutionFileName = "";
    String usageModelFileName = "";
    String loadLimboFileName = "";
    
    public String getUsageEntityName() {
        return usageEntityName;
    }

    public void setUsageEntityName(String usageEntityName) {
        if (this.usageEntityName != usageEntityName) {
            support.firePropertyChange("usageEntityName", this.usageEntityName,
                    this.usageEntityName = usageEntityName);
        }
       this.usageEntityName = usageEntityName;
    }

    public String getUsageEvolutionEntityName() {
        return usageEvolutionEntityName;
    }

    public void setUsageEvolutionEntityName(String usageEvolutionEntityName) {
        if (this.usageEvolutionEntityName != usageEvolutionEntityName) {
            support.firePropertyChange("usageEvolutionEntityName", this.usageEvolutionEntityName,
                    this.usageEvolutionEntityName = usageEvolutionEntityName);
        }
       this.usageEvolutionEntityName = usageEvolutionEntityName;
    }
    
    String usageEntityName = "Initial";
    String usageEvolutionEntityName = "Evolution";
    
//    boolean skipUsageScenario = false;
//    boolean skipLoadLimbo = false;

    public String getUsageEvolutionFileName() {
        return usageEvolutionFileName;
    }

    public void setUsageEvolutionFileName(String usageEvolutionFileName) {
        if (this.usageEvolutionFileName != usageEvolutionFileName) {
            support.firePropertyChange("usageEvolutionFileName", this.usageEvolutionFileName,
                    this.usageEvolutionFileName = usageEvolutionFileName);
        }
    }

    public String getUsageModelFileName() {
        return usageModelFileName;
    }

    public void setUsageModelFileName(String usageModelFileName) {
        if (this.usageModelFileName != usageModelFileName) {
            support.firePropertyChange("usageModelFileName", this.usageModelFileName,
                    this.usageModelFileName = usageModelFileName);
        }
    }

    public String getLoadLimboFileName() {
        return loadLimboFileName;
    }

    public void setLoadLimboFileName(String loadLimboFileName) {
        if (this.loadLimboFileName != loadLimboFileName) {
            support.firePropertyChange("loadLimboFileName", this.loadLimboFileName,
                    this.loadLimboFileName = loadLimboFileName);
        }
    }
/*
    public boolean isSkipUsageScenario() {
        return skipUsageScenario;
    }

    public void setSkipUsageScenario(boolean skipUsageScenario) {
        if (this.skipUsageScenario != skipUsageScenario) {
            support.firePropertyChange("skipUsageScenario", this.skipUsageScenario,
                    this.skipUsageScenario = skipUsageScenario);
        }
    }

    public boolean isSkipLoadLimbo() {
        return skipLoadLimbo;
    }

    public void setSkipLoadLimbo(boolean skipLoadLimbo) {
        if (this.skipLoadLimbo != skipLoadLimbo) {
            support.firePropertyChange("skipLoadLimbo", this.skipLoadLimbo, this.skipLoadLimbo = skipLoadLimbo);
        }
    }
*/
    transient PropertyChangeSupport support = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
        support.addPropertyChangeListener(propertyName, listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(String propertyName, PropertyChangeListener listener) {
        support.removePropertyChangeListener(propertyName, listener);
    }

}
