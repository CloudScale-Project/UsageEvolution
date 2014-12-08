package org.scaledl.usageevolution.wizard.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.scaledl.usageevolution.*;

import tools.descartes.dlim.Sequence;
import de.uka.ipd.sdq.pcm.usagemodel.UsageModel;
import de.uka.ipd.sdq.pcm.usagemodel.UsageScenario;

public class UsageEvolutionFileGenerator {

    
    
    public static IFile generate(UsageEvolutionSetupModel model) {
        ResourceSet resourceSet = new ResourceSetImpl();
 
        try {
            // Create the resource for the usage evolution file
            Resource resource = resourceSet.createResource (URI.createPlatformResourceURI(model.usageEvolutionFileName, false));
        
            // Load the limbo and usage model into the resource set, and retrieve elements
            Resource limboResource = resourceSet.getResource (URI.createPlatformResourceURI(model.loadLimboFileName, false), true);
            Sequence sequence = (Sequence) limboResource.getContents().get(0);

            Resource usageResource = resourceSet.getResource (URI.createPlatformResourceURI(model.usageModelFileName, false), true);
            UsageScenario scenario = ((UsageModel)usageResource.getContents().get(0)).getUsageScenario_UsageModel().get(0);           
            
            // Create usage evolution content
            UsageEvolution evolution = UsageevolutionFactory.eINSTANCE.createUsageEvolution();
            evolution.setEntityName(model.getUsageEvolutionEntityName());
            Usage usage = UsageevolutionFactory.eINSTANCE.createUsage();
            usage.setEntityName(model.getUsageEntityName());
            usage.setLoadEvolution(sequence);
            usage.setScenario(scenario);
            evolution.getUsages().add(usage);
            
            // Add to the resource and save
            resource.getContents().add(evolution);
            resource.save(null);  
            
            String platformString = resource.getURI().toPlatformString(true);
            return (IFile)ResourcesPlugin.getWorkspace().getRoot().findMember(platformString);
            
            
        } catch (Exception e) {
            return null;
        } 
        
    }

}
