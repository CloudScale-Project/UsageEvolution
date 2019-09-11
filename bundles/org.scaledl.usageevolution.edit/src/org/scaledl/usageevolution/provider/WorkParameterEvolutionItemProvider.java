/**
 */
package org.scaledl.usageevolution.provider;

import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.palladiosimulator.pcm.parameter.VariableCharacterisation;
import org.palladiosimulator.pcm.parameter.VariableUsage;
import org.palladiosimulator.pcm.usagemodel.EntryLevelSystemCall;
import org.scaledl.usageevolution.UsageevolutionPackage;

/**
 * This is the item provider adapter for a {@link org.scaledl.usageevolution.WorkParameterEvolution} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class WorkParameterEvolutionItemProvider extends ItemProviderAdapter
		implements IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public WorkParameterEvolutionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public List<IItemPropertyDescriptor> getPropertyDescriptorsGen(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addEvolutionPropertyDescriptor(object);
			addVariableCharacterisationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated NOT
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(
			final Object object) {
		itemPropertyDescriptors = null; // Force rebuild
		this.getPropertyDescriptorsGen(object);
		return this.itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Evolution feature.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	protected void addEvolutionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(
						((ComposeableAdapterFactory) adapterFactory)
								.getRootAdapterFactory(),
						getResourceLocator(),
						getString("_UI_WorkParameterEvolution_evolution_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_WorkParameterEvolution_evolution_feature",
								"_UI_WorkParameterEvolution_type"),
						UsageevolutionPackage.Literals.WORK_PARAMETER_EVOLUTION__EVOLUTION,
						true, false, true, null, null, null));
	}

	class VariableCharacterisationPropertyDescriptor extends
			ItemPropertyDescriptor {

		public VariableCharacterisationPropertyDescriptor(
				final AdapterFactory adapterFactory,
				final ResourceLocator resourceLocator,
				final String displayName, final String description,
				final EStructuralFeature feature, final boolean isSettable,
				final boolean multiLine, final boolean sortChoices,
				final Object staticImage, final String category,
				final String[] filterFlags) {
			super(adapterFactory, resourceLocator, displayName, description,
					feature, isSettable, multiLine, sortChoices, staticImage,
					category, filterFlags);
			// TODO Auto-generated constructor stub
		}

		public IItemLabelProvider getOrgLabelProvider(final Object thisObject) {
			return super.getLabelProvider(thisObject);
		}

		@Override
		public IItemLabelProvider getLabelProvider(final Object thisObject) {
			return new IItemLabelProvider() {

				@Override
				public String getText(final Object object) {
					if (object instanceof VariableCharacterisation) {
						final VariableCharacterisation varChar = (VariableCharacterisation) object;
						try {
							final VariableUsage usage = varChar
									.getVariableUsage_VariableCharacterisation();

							String ref = usage
									.getNamedReference__VariableUsage()
									.getReferenceName();
							if (usage.eContainer() instanceof EntryLevelSystemCall) {
								final EntryLevelSystemCall call = (EntryLevelSystemCall) usage
										.eContainer();
								ref = call
										.getOperationSignature__EntryLevelSystemCall()
										.getEntityName()
										+ "." + ref;
								ref = call
										.getOperationSignature__EntryLevelSystemCall()
										.getInterface__OperationSignature()
										.getEntityName()
										+ "." + ref;
							}
							return ref + "." + varChar.getType().getName();// getOrgLabelProvider(object).getText(object);
						} catch (final Exception e) {
							return VariableCharacterisationPropertyDescriptor.this
									.getOrgLabelProvider(object)
									.getText(object);
						}
					}
					return VariableCharacterisationPropertyDescriptor.this
							.getOrgLabelProvider(object).getText(object);
				}

				@Override
				public Object getImage(final Object object) {
					return VariableCharacterisationPropertyDescriptor.this
							.getOrgLabelProvider(object).getImage(object);
				}

			};
		}
	}

	protected void addVariableCharacterisationPropertyDescriptor(
			final Object object) {
		this.itemPropertyDescriptors
				.add(new VariableCharacterisationPropertyDescriptor(
						((ComposeableAdapterFactory) this.adapterFactory)
								.getRootAdapterFactory(),
						this.getResourceLocator(),
						this.getString("_UI_WorkParameterEvolution_variableCharacterisation_feature"),
						this.getString(
								"_UI_PropertyDescriptor_description",
								"_UI_WorkParameterEvolution_variableCharacterisation_feature",
								"_UI_WorkParameterEvolution_type"),
						UsageevolutionPackage.Literals.WORK_PARAMETER_EVOLUTION__VARIABLE_CHARACTERISATION,
						true, false, true, null, null, null));

	}

	/**
	 * This returns WorkParameterEvolution.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(
				object,
				getResourceLocator().getImage(
						"full/obj16/WorkParameterEvolution"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_WorkParameterEvolution_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return UsageevolutionEditPlugin.INSTANCE;
	}

}
