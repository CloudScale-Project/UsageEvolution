/**
 */
package org.scaledl.usageevolution.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.scaledl.usageevolution.UsageevolutionPackage;
import org.scaledl.usageevolution.WorkParameterEvolution;

import tools.descartes.dlim.Sequence;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Work Parameter Evolution</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.scaledl.usageevolution.impl.WorkParameterEvolutionImpl#getEvolution <em>Evolution</em>}</li>
 *   <li>{@link org.scaledl.usageevolution.impl.WorkParameterEvolutionImpl#getParameterName <em>Parameter Name</em>}</li>
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
     * The default value of the '{@link #getParameterName() <em>Parameter Name</em>}' attribute.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @see #getParameterName()
     * @generated
     * @ordered
     */
    protected static final String PARAMETER_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getParameterName() <em>Parameter Name</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getParameterName()
     * @generated
     * @ordered
     */
    protected String parameterName = PARAMETER_NAME_EDEFAULT;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    protected WorkParameterEvolutionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UsageevolutionPackage.Literals.WORK_PARAMETER_EVOLUTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Sequence getEvolution() {
        if (evolution != null && evolution.eIsProxy()) {
            InternalEObject oldEvolution = (InternalEObject)evolution;
            evolution = (Sequence)eResolveProxy(oldEvolution);
            if (evolution != oldEvolution) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsageevolutionPackage.WORK_PARAMETER_EVOLUTION__EVOLUTION, oldEvolution, evolution));
            }
        }
        return evolution;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    public Sequence basicGetEvolution() {
        return evolution;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEvolution(Sequence newEvolution) {
        Sequence oldEvolution = evolution;
        evolution = newEvolution;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UsageevolutionPackage.WORK_PARAMETER_EVOLUTION__EVOLUTION, oldEvolution, evolution));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getParameterName() {
        return parameterName;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParameterName(String newParameterName) {
        String oldParameterName = parameterName;
        parameterName = newParameterName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UsageevolutionPackage.WORK_PARAMETER_EVOLUTION__PARAMETER_NAME, oldParameterName, parameterName));
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UsageevolutionPackage.WORK_PARAMETER_EVOLUTION__EVOLUTION:
                if (resolve) return getEvolution();
                return basicGetEvolution();
            case UsageevolutionPackage.WORK_PARAMETER_EVOLUTION__PARAMETER_NAME:
                return getParameterName();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case UsageevolutionPackage.WORK_PARAMETER_EVOLUTION__EVOLUTION:
                setEvolution((Sequence)newValue);
                return;
            case UsageevolutionPackage.WORK_PARAMETER_EVOLUTION__PARAMETER_NAME:
                setParameterName((String)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case UsageevolutionPackage.WORK_PARAMETER_EVOLUTION__EVOLUTION:
                setEvolution((Sequence)null);
                return;
            case UsageevolutionPackage.WORK_PARAMETER_EVOLUTION__PARAMETER_NAME:
                setParameterName(PARAMETER_NAME_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case UsageevolutionPackage.WORK_PARAMETER_EVOLUTION__EVOLUTION:
                return evolution != null;
            case UsageevolutionPackage.WORK_PARAMETER_EVOLUTION__PARAMETER_NAME:
                return PARAMETER_NAME_EDEFAULT == null ? parameterName != null : !PARAMETER_NAME_EDEFAULT.equals(parameterName);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (parameterName: ");
        result.append(parameterName);
        result.append(')');
        return result.toString();
    }

} // WorkParameterEvolutionImpl
