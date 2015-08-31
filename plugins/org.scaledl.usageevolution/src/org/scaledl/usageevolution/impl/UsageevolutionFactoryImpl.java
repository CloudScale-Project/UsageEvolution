/**
 */
package org.scaledl.usageevolution.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.scaledl.usageevolution.Usage;
import org.scaledl.usageevolution.UsageEvolution;
import org.scaledl.usageevolution.UsageevolutionFactory;
import org.scaledl.usageevolution.UsageevolutionPackage;
import org.scaledl.usageevolution.WorkParameterEvolution;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class UsageevolutionFactoryImpl extends EFactoryImpl implements
		UsageevolutionFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static UsageevolutionFactory init() {
		try {
			UsageevolutionFactory theUsageevolutionFactory = (UsageevolutionFactory) EPackage.Registry.INSTANCE
					.getEFactory(UsageevolutionPackage.eNS_URI);
			if (theUsageevolutionFactory != null) {
				return theUsageevolutionFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UsageevolutionFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public UsageevolutionFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case UsageevolutionPackage.USAGE_EVOLUTION:
			return createUsageEvolution();
		case UsageevolutionPackage.USAGE:
			return createUsage();
		case UsageevolutionPackage.WORK_PARAMETER_EVOLUTION:
			return createWorkParameterEvolution();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsageEvolution createUsageEvolution() {
		UsageEvolutionImpl usageEvolution = new UsageEvolutionImpl();
		return usageEvolution;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage createUsage() {
		UsageImpl usage = new UsageImpl();
		return usage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WorkParameterEvolution createWorkParameterEvolution() {
		WorkParameterEvolutionImpl workParameterEvolution = new WorkParameterEvolutionImpl();
		return workParameterEvolution;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsageevolutionPackage getUsageevolutionPackage() {
		return (UsageevolutionPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UsageevolutionPackage getPackage() {
		return UsageevolutionPackage.eINSTANCE;
	}

} // UsageevolutionFactoryImpl
