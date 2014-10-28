/**
 */
package org.scaledl.usageevolution.impl;

import de.uka.ipd.sdq.pcm.core.entity.impl.EntityImpl;

import de.uka.ipd.sdq.pcm.usagemodel.UsageScenario;

import dlim.Sequence;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.scaledl.usageevolution.Usage;
import org.scaledl.usageevolution.UsageevolutionPackage;
import org.scaledl.usageevolution.WorkParameterEvolution;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.scaledl.usageevolution.impl.UsageImpl#getLoadEvolution <em>Load Evolution</em>}</li>
 *   <li>{@link org.scaledl.usageevolution.impl.UsageImpl#getWorkEvolutions <em>Work Evolutions</em>}</li>
 *   <li>{@link org.scaledl.usageevolution.impl.UsageImpl#getScenario <em>Scenario</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsageImpl extends EntityImpl implements Usage {
	/**
     * The cached value of the '{@link #getLoadEvolution() <em>Load Evolution</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLoadEvolution()
     * @generated
     * @ordered
     */
	protected Sequence loadEvolution;

	/**
     * The cached value of the '{@link #getWorkEvolutions() <em>Work Evolutions</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getWorkEvolutions()
     * @generated
     * @ordered
     */
	protected EList<WorkParameterEvolution> workEvolutions;

	/**
     * The cached value of the '{@link #getScenario() <em>Scenario</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getScenario()
     * @generated
     * @ordered
     */
	protected UsageScenario scenario;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected UsageImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return UsageevolutionPackage.Literals.USAGE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Sequence getLoadEvolution() {
        if (loadEvolution != null && loadEvolution.eIsProxy()) {
            InternalEObject oldLoadEvolution = (InternalEObject)loadEvolution;
            loadEvolution = (Sequence)eResolveProxy(oldLoadEvolution);
            if (loadEvolution != oldLoadEvolution) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsageevolutionPackage.USAGE__LOAD_EVOLUTION, oldLoadEvolution, loadEvolution));
            }
        }
        return loadEvolution;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Sequence basicGetLoadEvolution() {
        return loadEvolution;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLoadEvolution(Sequence newLoadEvolution) {
        Sequence oldLoadEvolution = loadEvolution;
        loadEvolution = newLoadEvolution;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UsageevolutionPackage.USAGE__LOAD_EVOLUTION, oldLoadEvolution, loadEvolution));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<WorkParameterEvolution> getWorkEvolutions() {
        if (workEvolutions == null) {
            workEvolutions = new EObjectContainmentEList<WorkParameterEvolution>(WorkParameterEvolution.class, this, UsageevolutionPackage.USAGE__WORK_EVOLUTIONS);
        }
        return workEvolutions;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public UsageScenario getScenario() {
        if (scenario != null && ((EObject)scenario).eIsProxy()) {
            InternalEObject oldScenario = (InternalEObject)scenario;
            scenario = (UsageScenario)eResolveProxy(oldScenario);
            if (scenario != oldScenario) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UsageevolutionPackage.USAGE__SCENARIO, oldScenario, scenario));
            }
        }
        return scenario;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public UsageScenario basicGetScenario() {
        return scenario;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setScenario(UsageScenario newScenario) {
        UsageScenario oldScenario = scenario;
        scenario = newScenario;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UsageevolutionPackage.USAGE__SCENARIO, oldScenario, scenario));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case UsageevolutionPackage.USAGE__WORK_EVOLUTIONS:
                return ((InternalEList<?>)getWorkEvolutions()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case UsageevolutionPackage.USAGE__LOAD_EVOLUTION:
                if (resolve) return getLoadEvolution();
                return basicGetLoadEvolution();
            case UsageevolutionPackage.USAGE__WORK_EVOLUTIONS:
                return getWorkEvolutions();
            case UsageevolutionPackage.USAGE__SCENARIO:
                if (resolve) return getScenario();
                return basicGetScenario();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case UsageevolutionPackage.USAGE__LOAD_EVOLUTION:
                setLoadEvolution((Sequence)newValue);
                return;
            case UsageevolutionPackage.USAGE__WORK_EVOLUTIONS:
                getWorkEvolutions().clear();
                getWorkEvolutions().addAll((Collection<? extends WorkParameterEvolution>)newValue);
                return;
            case UsageevolutionPackage.USAGE__SCENARIO:
                setScenario((UsageScenario)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eUnset(int featureID) {
        switch (featureID) {
            case UsageevolutionPackage.USAGE__LOAD_EVOLUTION:
                setLoadEvolution((Sequence)null);
                return;
            case UsageevolutionPackage.USAGE__WORK_EVOLUTIONS:
                getWorkEvolutions().clear();
                return;
            case UsageevolutionPackage.USAGE__SCENARIO:
                setScenario((UsageScenario)null);
                return;
        }
        super.eUnset(featureID);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public boolean eIsSet(int featureID) {
        switch (featureID) {
            case UsageevolutionPackage.USAGE__LOAD_EVOLUTION:
                return loadEvolution != null;
            case UsageevolutionPackage.USAGE__WORK_EVOLUTIONS:
                return workEvolutions != null && !workEvolutions.isEmpty();
            case UsageevolutionPackage.USAGE__SCENARIO:
                return scenario != null;
        }
        return super.eIsSet(featureID);
    }

} //UsageImpl
