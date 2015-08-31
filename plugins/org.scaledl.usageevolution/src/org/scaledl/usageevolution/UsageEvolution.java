/**
 */
package org.scaledl.usageevolution;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.entity.Entity;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Usage Evolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.scaledl.usageevolution.UsageEvolution#getUsages <em>Usages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.scaledl.usageevolution.UsageevolutionPackage#getUsageEvolution()
 * @model
 * @generated
 */
public interface UsageEvolution extends EObject, Entity {
	/**
	 * Returns the value of the '<em><b>Usages</b></em>' containment reference list.
	 * The list contents are of type {@link org.scaledl.usageevolution.Usage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usages</em>' containment reference list isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usages</em>' containment reference list.
	 * @see org.scaledl.usageevolution.UsageevolutionPackage#getUsageEvolution_Usages()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Usage> getUsages();

} // UsageEvolution
