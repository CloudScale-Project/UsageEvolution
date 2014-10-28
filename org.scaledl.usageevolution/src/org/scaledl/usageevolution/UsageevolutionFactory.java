/**
 */
package org.scaledl.usageevolution;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.scaledl.usageevolution.UsageevolutionPackage
 * @generated
 */
public interface UsageevolutionFactory extends EFactory {
	/**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	UsageevolutionFactory eINSTANCE = org.scaledl.usageevolution.impl.UsageevolutionFactoryImpl.init();

	/**
     * Returns a new object of class '<em>Usage Evolution</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Usage Evolution</em>'.
     * @generated
     */
	UsageEvolution createUsageEvolution();

	/**
     * Returns a new object of class '<em>Usage</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Usage</em>'.
     * @generated
     */
	Usage createUsage();

	/**
     * Returns a new object of class '<em>Work Parameter Evolution</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Work Parameter Evolution</em>'.
     * @generated
     */
	WorkParameterEvolution createWorkParameterEvolution();

	/**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
	UsageevolutionPackage getUsageevolutionPackage();

} //UsageevolutionFactory
