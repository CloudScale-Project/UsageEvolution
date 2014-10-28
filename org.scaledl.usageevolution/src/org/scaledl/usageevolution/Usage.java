/**
 */
package org.scaledl.usageevolution;

import de.uka.ipd.sdq.pcm.core.entity.Entity;

import de.uka.ipd.sdq.pcm.usagemodel.UsageScenario;

import dlim.Sequence;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.scaledl.usageevolution.Usage#getLoadEvolution <em>Load Evolution</em>}</li>
 *   <li>{@link org.scaledl.usageevolution.Usage#getWorkEvolutions <em>Work Evolutions</em>}</li>
 *   <li>{@link org.scaledl.usageevolution.Usage#getScenario <em>Scenario</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.scaledl.usageevolution.UsageevolutionPackage#getUsage()
 * @model
 * @generated
 */
public interface Usage extends EObject, Entity {
	/**
     * Returns the value of the '<em><b>Load Evolution</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Evolution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Load Evolution</em>' reference.
     * @see #setLoadEvolution(Sequence)
     * @see org.scaledl.usageevolution.UsageevolutionPackage#getUsage_LoadEvolution()
     * @model
     * @generated
     */
	Sequence getLoadEvolution();

	/**
     * Sets the value of the '{@link org.scaledl.usageevolution.Usage#getLoadEvolution <em>Load Evolution</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Load Evolution</em>' reference.
     * @see #getLoadEvolution()
     * @generated
     */
	void setLoadEvolution(Sequence value);

	/**
     * Returns the value of the '<em><b>Work Evolutions</b></em>' containment reference list.
     * The list contents are of type {@link org.scaledl.usageevolution.WorkParameterEvolution}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Evolutions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Work Evolutions</em>' containment reference list.
     * @see org.scaledl.usageevolution.UsageevolutionPackage#getUsage_WorkEvolutions()
     * @model containment="true"
     * @generated
     */
	EList<WorkParameterEvolution> getWorkEvolutions();

	/**
     * Returns the value of the '<em><b>Scenario</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Scenario</em>' reference.
     * @see #setScenario(UsageScenario)
     * @see org.scaledl.usageevolution.UsageevolutionPackage#getUsage_Scenario()
     * @model required="true"
     * @generated
     */
	UsageScenario getScenario();

	/**
     * Sets the value of the '{@link org.scaledl.usageevolution.Usage#getScenario <em>Scenario</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Scenario</em>' reference.
     * @see #getScenario()
     * @generated
     */
	void setScenario(UsageScenario value);

} // Usage
