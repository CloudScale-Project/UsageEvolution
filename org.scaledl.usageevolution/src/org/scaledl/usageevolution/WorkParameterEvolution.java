/**
 */
package org.scaledl.usageevolution;

import dlim.Sequence;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work Parameter Evolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.scaledl.usageevolution.WorkParameterEvolution#getEvolution <em>Evolution</em>}</li>
 *   <li>{@link org.scaledl.usageevolution.WorkParameterEvolution#getParameterName <em>Parameter Name</em>}</li>
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
	 * If the meaning of the '<em>Evolution</em>' reference isn't clear,
	 * there really should be more of a description here...
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
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Evolution</em>' reference.
     * @see #getEvolution()
     * @generated
     */
	void setEvolution(Sequence value);

	/**
     * Returns the value of the '<em><b>Parameter Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Parameter Name</em>' attribute.
     * @see #setParameterName(String)
     * @see org.scaledl.usageevolution.UsageevolutionPackage#getWorkParameterEvolution_ParameterName()
     * @model
     * @generated
     */
	String getParameterName();

	/**
     * Sets the value of the '{@link org.scaledl.usageevolution.WorkParameterEvolution#getParameterName <em>Parameter Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Parameter Name</em>' attribute.
     * @see #getParameterName()
     * @generated
     */
	void setParameterName(String value);

} // WorkParameterEvolution
