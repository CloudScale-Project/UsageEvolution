/**
 */
package org.scaledl.usageevolution.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.pcm.core.entity.impl.EntityImpl;
import org.scaledl.usageevolution.Usage;
import org.scaledl.usageevolution.UsageEvolution;
import org.scaledl.usageevolution.UsageevolutionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Usage Evolution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.scaledl.usageevolution.impl.UsageEvolutionImpl#getUsages <em>Usages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UsageEvolutionImpl extends EntityImpl implements UsageEvolution {
    /**
     * The cached value of the '{@link #getUsages() <em>Usages</em>}' containment reference list.
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getUsages()
     * @generated
     * @ordered
     */
    protected EList<Usage> usages;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected UsageEvolutionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UsageevolutionPackage.Literals.USAGE_EVOLUTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public EList<Usage> getUsages() {
        if (this.usages == null) {
            this.usages = new EObjectContainmentEList<Usage>(Usage.class, this,
                    UsageevolutionPackage.USAGE_EVOLUTION__USAGES);
        }
        return this.usages;
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
        case UsageevolutionPackage.USAGE_EVOLUTION__USAGES:
            return ((InternalEList<?>) this.getUsages()).basicRemove(otherEnd, msgs);
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
        case UsageevolutionPackage.USAGE_EVOLUTION__USAGES:
            return this.getUsages();
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
        case UsageevolutionPackage.USAGE_EVOLUTION__USAGES:
            this.getUsages().clear();
            this.getUsages().addAll((Collection<? extends Usage>) newValue);
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
        case UsageevolutionPackage.USAGE_EVOLUTION__USAGES:
            this.getUsages().clear();
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
        case UsageevolutionPackage.USAGE_EVOLUTION__USAGES:
            return this.usages != null && !this.usages.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // UsageEvolutionImpl
