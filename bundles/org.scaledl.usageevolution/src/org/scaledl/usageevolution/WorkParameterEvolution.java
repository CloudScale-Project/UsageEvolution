/**
 */
package org.scaledl.usageevolution;

import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.parameter.VariableCharacterisation;

import tools.descartes.dlim.Sequence;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Work Parameter Evolution</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.scaledl.usageevolution.WorkParameterEvolution#getEvolution <em>Evolution</em>}</li>
 *   <li>{@link org.scaledl.usageevolution.WorkParameterEvolution#getVariableCharacterisation <em>Variable Characterisation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.scaledl.usageevolution.UsageevolutionPackage#getWorkParameterEvolution()
 * @model
 * @generated
 */
public interface WorkParameterEvolution extends EObject {
	/**
	 * Returns the value of the '<em><b>Evolution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evolution</em>' reference isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evolution</em>' reference.
	 * @see #setEvolution(Sequence)
	 * @see org.scaledl.usageevolution.UsageevolutionPackage#getWorkParameterEvolution_Evolution()
	 * @model required="true"
	 * @generated
	 */
	Sequence getEvolution();

	/**
	 * Sets the value of the '{@link org.scaledl.usageevolution.WorkParameterEvolution#getEvolution <em>Evolution</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evolution</em>' reference.
	 * @see #getEvolution()
	 * @generated
	 */
	void setEvolution(Sequence value);

	/**
	 * Returns the value of the '<em><b>Variable Characterisation</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Characterisation</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Variable Characterisation</em>' reference.
	 * @see #setVariableCharacterisation(VariableCharacterisation)
	 * @see org.scaledl.usageevolution.UsageevolutionPackage#getWorkParameterEvolution_VariableCharacterisation()
	 * @model required="true"
	 * @generated
	 */
	VariableCharacterisation getVariableCharacterisation();

	/**
	 * Sets the value of the '{@link org.scaledl.usageevolution.WorkParameterEvolution#getVariableCharacterisation <em>Variable Characterisation</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Characterisation</em>' reference.
	 * @see #getVariableCharacterisation()
	 * @generated
	 */
	void setVariableCharacterisation(VariableCharacterisation value);

} // WorkParameterEvolution
