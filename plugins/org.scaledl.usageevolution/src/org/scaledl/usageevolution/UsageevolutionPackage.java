/**
 */
package org.scaledl.usageevolution;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.palladiosimulator.pcm.core.entity.EntityPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta
 * objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see org.scaledl.usageevolution.UsageevolutionFactory
 * @model kind="package"
 * @generated
 */
public interface UsageevolutionPackage extends EPackage {
    /**
     * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNAME = "usageevolution";

    /**
     * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_URI = "http://usageevolution/1.0";

    /**
     * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    String eNS_PREFIX = "usageevolution";

    /**
     * The singleton instance of the package. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    UsageevolutionPackage eINSTANCE = org.scaledl.usageevolution.impl.UsageevolutionPackageImpl.init();

    /**
     * The meta object id for the '{@link org.scaledl.usageevolution.impl.UsageEvolutionImpl
     * <em>Usage Evolution</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.scaledl.usageevolution.impl.UsageEvolutionImpl
     * @see org.scaledl.usageevolution.impl.UsageevolutionPackageImpl#getUsageEvolution()
     * @generated
     */
    int USAGE_EVOLUTION = 0;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int USAGE_EVOLUTION__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int USAGE_EVOLUTION__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Usages</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int USAGE_EVOLUTION__USAGES = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Usage Evolution</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int USAGE_EVOLUTION_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.scaledl.usageevolution.impl.UsageImpl <em>Usage</em>}'
     * class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.scaledl.usageevolution.impl.UsageImpl
     * @see org.scaledl.usageevolution.impl.UsageevolutionPackageImpl#getUsage()
     * @generated
     */
    int USAGE = 1;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int USAGE__ID = EntityPackage.ENTITY__ID;

    /**
     * The feature id for the '<em><b>Entity Name</b></em>' attribute. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int USAGE__ENTITY_NAME = EntityPackage.ENTITY__ENTITY_NAME;

    /**
     * The feature id for the '<em><b>Load Evolution</b></em>' reference. <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int USAGE__LOAD_EVOLUTION = EntityPackage.ENTITY_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Work Evolutions</b></em>' containment reference list. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int USAGE__WORK_EVOLUTIONS = EntityPackage.ENTITY_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Scenario</b></em>' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int USAGE__SCENARIO = EntityPackage.ENTITY_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>Usage</em>' class. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int USAGE_FEATURE_COUNT = EntityPackage.ENTITY_FEATURE_COUNT + 3;

    /**
     * The meta object id for the '
     * {@link org.scaledl.usageevolution.impl.WorkParameterEvolutionImpl
     * <em>Work Parameter Evolution</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see org.scaledl.usageevolution.impl.WorkParameterEvolutionImpl
     * @see org.scaledl.usageevolution.impl.UsageevolutionPackageImpl#getWorkParameterEvolution()
     * @generated
     */
    int WORK_PARAMETER_EVOLUTION = 2;

    /**
     * The feature id for the '<em><b>Evolution</b></em>' reference. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int WORK_PARAMETER_EVOLUTION__EVOLUTION = 0;

    /**
     * The feature id for the '<em><b>Variable Characterisation</b></em>' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int WORK_PARAMETER_EVOLUTION__VARIABLE_CHARACTERISATION = 1;

    /**
     * The number of structural features of the '<em>Work Parameter Evolution</em>' class. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     * @ordered
     */
    int WORK_PARAMETER_EVOLUTION_FEATURE_COUNT = 2;

    /**
     * Returns the meta object for class '{@link org.scaledl.usageevolution.UsageEvolution
     * <em>Usage Evolution</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Usage Evolution</em>'.
     * @see org.scaledl.usageevolution.UsageEvolution
     * @generated
     */
    EClass getUsageEvolution();

    /**
     * Returns the meta object for the containment reference list '
     * {@link org.scaledl.usageevolution.UsageEvolution#getUsages <em>Usages</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Usages</em>'.
     * @see org.scaledl.usageevolution.UsageEvolution#getUsages()
     * @see #getUsageEvolution()
     * @generated
     */
    EReference getUsageEvolution_Usages();

    /**
     * Returns the meta object for class '{@link org.scaledl.usageevolution.Usage <em>Usage</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Usage</em>'.
     * @see org.scaledl.usageevolution.Usage
     * @generated
     */
    EClass getUsage();

    /**
     * Returns the meta object for the reference '
     * {@link org.scaledl.usageevolution.Usage#getLoadEvolution <em>Load Evolution</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Load Evolution</em>'.
     * @see org.scaledl.usageevolution.Usage#getLoadEvolution()
     * @see #getUsage()
     * @generated
     */
    EReference getUsage_LoadEvolution();

    /**
     * Returns the meta object for the containment reference list '
     * {@link org.scaledl.usageevolution.Usage#getWorkEvolutions <em>Work Evolutions</em>}'. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the containment reference list '<em>Work Evolutions</em>'.
     * @see org.scaledl.usageevolution.Usage#getWorkEvolutions()
     * @see #getUsage()
     * @generated
     */
    EReference getUsage_WorkEvolutions();

    /**
     * Returns the meta object for the reference '
     * {@link org.scaledl.usageevolution.Usage#getScenario <em>Scenario</em>}'. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Scenario</em>'.
     * @see org.scaledl.usageevolution.Usage#getScenario()
     * @see #getUsage()
     * @generated
     */
    EReference getUsage_Scenario();

    /**
     * Returns the meta object for class '{@link org.scaledl.usageevolution.WorkParameterEvolution
     * <em>Work Parameter Evolution</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for class '<em>Work Parameter Evolution</em>'.
     * @see org.scaledl.usageevolution.WorkParameterEvolution
     * @generated
     */
    EClass getWorkParameterEvolution();

    /**
     * Returns the meta object for the reference '
     * {@link org.scaledl.usageevolution.WorkParameterEvolution#getEvolution <em>Evolution</em>}'.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Evolution</em>'.
     * @see org.scaledl.usageevolution.WorkParameterEvolution#getEvolution()
     * @see #getWorkParameterEvolution()
     * @generated
     */
    EReference getWorkParameterEvolution_Evolution();

    /**
     * Returns the meta object for the reference '
     * {@link org.scaledl.usageevolution.WorkParameterEvolution#getVariableCharacterisation
     * <em>Variable Characterisation</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @return the meta object for the reference '<em>Variable Characterisation</em>'.
     * @see org.scaledl.usageevolution.WorkParameterEvolution#getVariableCharacterisation()
     * @see #getWorkParameterEvolution()
     * @generated
     */
    EReference getWorkParameterEvolution_VariableCharacterisation();

    /**
     * Returns the factory that creates the instances of the model. <!-- begin-user-doc --> <!--
     * end-user-doc -->
     *
     * @return the factory that creates the instances of the model.
     * @generated
     */
    UsageevolutionFactory getUsageevolutionFactory();

    /**
     * <!-- begin-user-doc --> Defines literals for the meta objects that represent
     * <ul>
     * <li>each class,</li>
     * <li>each feature of each class,</li>
     * <li>each operation of each class,</li>
     * <li>each enum,</li>
     * <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     *
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '
         * {@link org.scaledl.usageevolution.impl.UsageEvolutionImpl <em>Usage Evolution</em>}'
         * class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.scaledl.usageevolution.impl.UsageEvolutionImpl
         * @see org.scaledl.usageevolution.impl.UsageevolutionPackageImpl#getUsageEvolution()
         * @generated
         */
        EClass USAGE_EVOLUTION = eINSTANCE.getUsageEvolution();

        /**
         * The meta object literal for the '<em><b>Usages</b></em>' containment reference list
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference USAGE_EVOLUTION__USAGES = eINSTANCE.getUsageEvolution_Usages();

        /**
         * The meta object literal for the '{@link org.scaledl.usageevolution.impl.UsageImpl
         * <em>Usage</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.scaledl.usageevolution.impl.UsageImpl
         * @see org.scaledl.usageevolution.impl.UsageevolutionPackageImpl#getUsage()
         * @generated
         */
        EClass USAGE = eINSTANCE.getUsage();

        /**
         * The meta object literal for the '<em><b>Load Evolution</b></em>' reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference USAGE__LOAD_EVOLUTION = eINSTANCE.getUsage_LoadEvolution();

        /**
         * The meta object literal for the '<em><b>Work Evolutions</b></em>' containment reference
         * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference USAGE__WORK_EVOLUTIONS = eINSTANCE.getUsage_WorkEvolutions();

        /**
         * The meta object literal for the '<em><b>Scenario</b></em>' reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference USAGE__SCENARIO = eINSTANCE.getUsage_Scenario();

        /**
         * The meta object literal for the '
         * {@link org.scaledl.usageevolution.impl.WorkParameterEvolutionImpl
         * <em>Work Parameter Evolution</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @see org.scaledl.usageevolution.impl.WorkParameterEvolutionImpl
         * @see org.scaledl.usageevolution.impl.UsageevolutionPackageImpl#getWorkParameterEvolution()
         * @generated
         */
        EClass WORK_PARAMETER_EVOLUTION = eINSTANCE.getWorkParameterEvolution();

        /**
         * The meta object literal for the '<em><b>Evolution</b></em>' reference feature. <!--
         * begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference WORK_PARAMETER_EVOLUTION__EVOLUTION = eINSTANCE.getWorkParameterEvolution_Evolution();

        /**
         * The meta object literal for the '<em><b>Variable Characterisation</b></em>' reference
         * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
         *
         * @generated
         */
        EReference WORK_PARAMETER_EVOLUTION__VARIABLE_CHARACTERISATION = eINSTANCE
                .getWorkParameterEvolution_VariableCharacterisation();

    }

} // UsageevolutionPackage
