/**
 */
package org.scaledl.usageevolution;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.palladiosimulator.pcm.core.entity.Entity;
import org.palladiosimulator.pcm.usagemodel.UsageScenario;

import tools.descartes.dlim.Sequence;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Usage</b></em>'. <!--
 * end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.scaledl.usageevolution.Usage#getLoadEvolution <em>Load Evolution</em>}</li>
 *   <li>{@link org.scaledl.usageevolution.Usage#getWorkEvolutions <em>Work Evolutions</em>}</li>
 *   <li>{@link org.scaledl.usageevolution.Usage#getScenario <em>Scenario</em>}</li>
 *   <li>{@link org.scaledl.usageevolution.Usage#isRepeatingPattern <em>Repeating Pattern</em>}</li>
 *   <li>{@link org.scaledl.usageevolution.Usage#getEvolutionStepWidth <em>Evolution Step Width</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.scaledl.usageevolution.UsageevolutionPackage#getUsage()
 * @model
 * @generated
 */
public interface Usage extends EObject, Entity {
	/**
	 * Returns the value of the '<em><b>Load Evolution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Load Evolution</em>' reference isn't clear, there really should be
	 * more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Evolution</em>' reference.
	 * @see #setLoadEvolution(Sequence)
	 * @see org.scaledl.usageevolution.UsageevolutionPackage#getUsage_LoadEvolution()
	 * @model
	 * @generated
	 */
	Sequence getLoadEvolution();

	/**
	 * Sets the value of the '{@link org.scaledl.usageevolution.Usage#getLoadEvolution <em>Load Evolution</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Evolution</em>' reference.
	 * @see #getLoadEvolution()
	 * @generated
	 */
	void setLoadEvolution(Sequence value);

	/**
	 * Returns the value of the '<em><b>Work Evolutions</b></em>' containment reference list. The
	 * list contents are of type {@link org.scaledl.usageevolution.WorkParameterEvolution}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work Evolutions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 *
	 * @return the value of the '<em>Work Evolutions</em>' containment reference list.
	 * @see org.scaledl.usageevolution.UsageevolutionPackage#getUsage_WorkEvolutions()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkParameterEvolution> getWorkEvolutions();

	/**
	 * Returns the value of the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scenario</em>' reference isn't clear, there really should be more
	 * of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scenario</em>' reference.
	 * @see #setScenario(UsageScenario)
	 * @see org.scaledl.usageevolution.UsageevolutionPackage#getUsage_Scenario()
	 * @model required="true"
	 * @generated
	 */
	UsageScenario getScenario();

	/**
	 * Sets the value of the '{@link org.scaledl.usageevolution.Usage#getScenario <em>Scenario</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scenario</em>' reference.
	 * @see #getScenario()
	 * @generated
	 */
	void setScenario(UsageScenario value);

	/**
	 * Returns the value of the '<em><b>Repeating Pattern</b></em>' attribute.
	 * The default value is <code>"False"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repeating Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repeating Pattern</em>' attribute.
	 * @see #setRepeatingPattern(boolean)
	 * @see org.scaledl.usageevolution.UsageevolutionPackage#getUsage_RepeatingPattern()
	 * @model default="False"
	 * @generated
	 */
	boolean isRepeatingPattern();

	/**
	 * Sets the value of the '{@link org.scaledl.usageevolution.Usage#isRepeatingPattern <em>Repeating Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repeating Pattern</em>' attribute.
	 * @see #isRepeatingPattern()
	 * @generated
	 */
	void setRepeatingPattern(boolean value);

	/**
	 * Returns the value of the '<em><b>Evolution Step Width</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evolution Step Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evolution Step Width</em>' attribute.
	 * @see #setEvolutionStepWidth(double)
	 * @see org.scaledl.usageevolution.UsageevolutionPackage#getUsage_EvolutionStepWidth()
	 * @model default="1"
	 * @generated
	 */
	double getEvolutionStepWidth();

	/**
	 * Sets the value of the '{@link org.scaledl.usageevolution.Usage#getEvolutionStepWidth <em>Evolution Step Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evolution Step Width</em>' attribute.
	 * @see #getEvolutionStepWidth()
	 * @generated
	 */
	void setEvolutionStepWidth(double value);

} // Usage
