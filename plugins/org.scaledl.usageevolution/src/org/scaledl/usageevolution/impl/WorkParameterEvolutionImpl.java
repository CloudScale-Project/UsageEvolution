/**
 */
package org.scaledl.usageevolution.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.palladiosimulator.pcm.parameter.VariableCharacterisation;
import org.scaledl.usageevolution.UsageevolutionPackage;
import org.scaledl.usageevolution.WorkParameterEvolution;

import tools.descartes.dlim.Sequence;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Work Parameter Evolution</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.scaledl.usageevolution.impl.WorkParameterEvolutionImpl#getEvolution <em>Evolution
 * </em>}</li>
 * <li>
 * {@link org.scaledl.usageevolution.impl.WorkParameterEvolutionImpl#getVariableCharacterisation
 * <em>Variable Characterisation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkParameterEvolutionImpl extends MinimalEObjectImpl.Container implements WorkParameterEvolution {
    /**
     * The cached value of the '{@link #getEvolution() <em>Evolution</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getEvolution()
     * @generated
     * @ordered
     */
    protected Sequence evolution;

    /**
     * The cached value of the '{@link #getVariableCharacterisation()
     * <em>Variable Characterisation</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getVariableCharacterisation()
     * @generated
     * @ordered
     */
    protected VariableCharacterisation variableCharacterisation;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected WorkParameterEvolutionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UsageevolutionPackage.Literals.WORK_PARAMETER_EVOLUTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Sequence getEvolution() {
        if (this.evolution != null && this.evolution.eIsProxy()) {
            final InternalEObject oldEvolution = (InternalEObject) this.evolution;
            this.evolution = (Sequence) this.eResolveProxy(oldEvolution);
            if (this.evolution != oldEvolution) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            UsageevolutionPackage.WORK_PARAMETER_EVOLUTION__EVOLUTION, oldEvolution, this.evolution));
                }
            }
        }
        return this.evolution;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Sequence basicGetEvolution() {
        return this.evolution;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setEvolution(final Sequence newEvolution) {
        final Sequence oldEvolution = this.evolution;
        this.evolution = newEvolution;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    UsageevolutionPackage.WORK_PARAMETER_EVOLUTION__EVOLUTION, oldEvolution, this.evolution));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public VariableCharacterisation getVariableCharacterisation() {
        if (this.variableCharacterisation != null && ((EObject) this.variableCharacterisation).eIsProxy()) {
            final InternalEObject oldVariableCharacterisation = (InternalEObject) this.variableCharacterisation;
            this.variableCharacterisation = (VariableCharacterisation) this.eResolveProxy(oldVariableCharacterisation);
            if (this.variableCharacterisation != oldVariableCharacterisation) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            UsageevolutionPackage.WORK_PARAMETER_EVOLUTION__VARIABLE_CHARACTERISATION,
                            oldVariableCharacterisation, this.variableCharacterisation));
                }
            }
        }
        return this.variableCharacterisation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public VariableCharacterisation basicGetVariableCharacterisation() {
        return this.variableCharacterisation;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setVariableCharacterisation(final VariableCharacterisation newVariableCharacterisation) {
        final VariableCharacterisation oldVariableCharacterisation = this.variableCharacterisation;
        this.variableCharacterisation = newVariableCharacterisation;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    UsageevolutionPackage.WORK_PARAMETER_EVOLUTION__VARIABLE_CHARACTERISATION,
                    oldVariableCharacterisation, this.variableCharacterisation));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case UsageevolutionPackage.WORK_PARAMETER_EVOLUTION__EVOLUTION:
            if (resolve) {
                return this.getEvolution();
            }
            return this.basicGetEvolution();
        case UsageevolutionPackage.WORK_PARAMETER_EVOLUTION__VARIABLE_CHARACTERISATION:
            if (resolve) {
                return this.getVariableCharacterisation();
            }
            return this.basicGetVariableCharacterisation();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case UsageevolutionPackage.WORK_PARAMETER_EVOLUTION__EVOLUTION:
            this.setEvolution((Sequence) newValue);
            return;
        case UsageevolutionPackage.WORK_PARAMETER_EVOLUTION__VARIABLE_CHARACTERISATION:
            this.setVariableCharacterisation((VariableCharacterisation) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case UsageevolutionPackage.WORK_PARAMETER_EVOLUTION__EVOLUTION:
            this.setEvolution((Sequence) null);
            return;
        case UsageevolutionPackage.WORK_PARAMETER_EVOLUTION__VARIABLE_CHARACTERISATION:
            this.setVariableCharacterisation((VariableCharacterisation) null);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case UsageevolutionPackage.WORK_PARAMETER_EVOLUTION__EVOLUTION:
            return this.evolution != null;
        case UsageevolutionPackage.WORK_PARAMETER_EVOLUTION__VARIABLE_CHARACTERISATION:
            return this.variableCharacterisation != null;
        }
        return super.eIsSet(featureID);
    }

} // WorkParameterEvolutionImpl
