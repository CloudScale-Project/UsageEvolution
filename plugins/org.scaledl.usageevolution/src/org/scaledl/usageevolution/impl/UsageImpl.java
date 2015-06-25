/**
 */
package org.scaledl.usageevolution.impl;

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
import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;
import org.scaledl.usageevolution.Usage;
import org.scaledl.usageevolution.UsageevolutionPackage;
import org.scaledl.usageevolution.WorkParameterEvolution;

import tools.descartes.dlim.Sequence;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Usage</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.scaledl.usageevolution.impl.UsageImpl#getLoadEvolution <em>Load Evolution</em>}</li>
 * <li>{@link org.scaledl.usageevolution.impl.UsageImpl#getWorkEvolutions <em>Work Evolutions</em>}</li>
 * <li>{@link org.scaledl.usageevolution.impl.UsageImpl#getScenario <em>Scenario</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsageImpl extends EntityImpl implements Usage {
    /**
     * The cached value of the '{@link #getLoadEvolution() <em>Load Evolution</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getLoadEvolution()
     * @generated
     * @ordered
     */
    protected Sequence loadEvolution;

    /**
     * The cached value of the '{@link #getWorkEvolutions() <em>Work Evolutions</em>}' containment
     * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getWorkEvolutions()
     * @generated
     * @ordered
     */
    protected EList<WorkParameterEvolution> workEvolutions;

    /**
     * The cached value of the '{@link #getScenario() <em>Scenario</em>}' reference. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getScenario()
     * @generated
     * @ordered
     */
    protected UsageScenario scenario;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected UsageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UsageevolutionPackage.Literals.USAGE;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Sequence getLoadEvolution() {
        if (this.loadEvolution != null && this.loadEvolution.eIsProxy()) {
            final InternalEObject oldLoadEvolution = (InternalEObject) this.loadEvolution;
            this.loadEvolution = (Sequence) this.eResolveProxy(oldLoadEvolution);
            if (this.loadEvolution != oldLoadEvolution) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            UsageevolutionPackage.USAGE__LOAD_EVOLUTION, oldLoadEvolution, this.loadEvolution));
                }
            }
        }
        return this.loadEvolution;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public Sequence basicGetLoadEvolution() {
        return this.loadEvolution;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setLoadEvolution(final Sequence newLoadEvolution) {
        final Sequence oldLoadEvolution = this.loadEvolution;
        this.loadEvolution = newLoadEvolution;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, UsageevolutionPackage.USAGE__LOAD_EVOLUTION,
                    oldLoadEvolution, this.loadEvolution));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<WorkParameterEvolution> getWorkEvolutions() {
        if (this.workEvolutions == null) {
            this.workEvolutions = new EObjectContainmentEList<WorkParameterEvolution>(WorkParameterEvolution.class,
                    this,
                    UsageevolutionPackage.USAGE__WORK_EVOLUTIONS);
        }
        return this.workEvolutions;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public UsageScenario getScenario() {
        if (this.scenario != null && ((EObject) this.scenario).eIsProxy()) {
            final InternalEObject oldScenario = (InternalEObject) this.scenario;
            this.scenario = (UsageScenario) this.eResolveProxy(oldScenario);
            if (this.scenario != oldScenario) {
                if (this.eNotificationRequired()) {
                    this.eNotify(new ENotificationImpl(this, Notification.RESOLVE,
                            UsageevolutionPackage.USAGE__SCENARIO,
                            oldScenario, this.scenario));
                }
            }
        }
        return this.scenario;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public UsageScenario basicGetScenario() {
        return this.scenario;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setScenario(final UsageScenario newScenario) {
        final UsageScenario oldScenario = this.scenario;
        this.scenario = newScenario;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, UsageevolutionPackage.USAGE__SCENARIO,
                    oldScenario,
                    this.scenario));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case UsageevolutionPackage.USAGE__WORK_EVOLUTIONS:
            return ((InternalEList<?>) this.getWorkEvolutions()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case UsageevolutionPackage.USAGE__LOAD_EVOLUTION:
            if (resolve) {
                return this.getLoadEvolution();
            }
            return this.basicGetLoadEvolution();
        case UsageevolutionPackage.USAGE__WORK_EVOLUTIONS:
            return this.getWorkEvolutions();
        case UsageevolutionPackage.USAGE__SCENARIO:
            if (resolve) {
                return this.getScenario();
            }
            return this.basicGetScenario();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case UsageevolutionPackage.USAGE__LOAD_EVOLUTION:
            this.setLoadEvolution((Sequence) newValue);
            return;
        case UsageevolutionPackage.USAGE__WORK_EVOLUTIONS:
            this.getWorkEvolutions().clear();
            this.getWorkEvolutions().addAll((Collection<? extends WorkParameterEvolution>) newValue);
            return;
        case UsageevolutionPackage.USAGE__SCENARIO:
            this.setScenario((UsageScenario) newValue);
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
        case UsageevolutionPackage.USAGE__LOAD_EVOLUTION:
            this.setLoadEvolution((Sequence) null);
            return;
        case UsageevolutionPackage.USAGE__WORK_EVOLUTIONS:
            this.getWorkEvolutions().clear();
            return;
        case UsageevolutionPackage.USAGE__SCENARIO:
            this.setScenario((UsageScenario) null);
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
        case UsageevolutionPackage.USAGE__LOAD_EVOLUTION:
            return this.loadEvolution != null;
        case UsageevolutionPackage.USAGE__WORK_EVOLUTIONS:
            return this.workEvolutions != null && !this.workEvolutions.isEmpty();
        case UsageevolutionPackage.USAGE__SCENARIO:
            return this.scenario != null;
        }
        return super.eIsSet(featureID);
    }

} // UsageImpl
