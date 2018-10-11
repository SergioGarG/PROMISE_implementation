/**
 */
package promise.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import promise.DelegateOp;
import promise.PromiseFactory;
import promise.PromisePackage;

/**
 * This is the item provider adapter for a {@link promise.DelegateOp} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DelegateOpItemProvider extends OperatorItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegateOpItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addInputLocationsPropertyDescriptor(object);
			addInputRobotPropertyDescriptor(object);
			addInputActionPropertyDescriptor(object);
			addStoppingEventPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Input Locations feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputLocationsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DelegateOp_inputLocations_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DelegateOp_inputLocations_feature", "_UI_DelegateOp_type"),
				 PromisePackage.Literals.DELEGATE_OP__INPUT_LOCATIONS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input Robot feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputRobotPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DelegateOp_inputRobot_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DelegateOp_inputRobot_feature", "_UI_DelegateOp_type"),
				 PromisePackage.Literals.DELEGATE_OP__INPUT_ROBOT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DelegateOp_inputAction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DelegateOp_inputAction_feature", "_UI_DelegateOp_type"),
				 PromisePackage.Literals.DELEGATE_OP__INPUT_ACTION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stopping Event feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStoppingEventPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_DelegateOp_stoppingEvent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_DelegateOp_stoppingEvent_feature", "_UI_DelegateOp_type"),
				 PromisePackage.Literals.DELEGATE_OP__STOPPING_EVENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PromisePackage.Literals.DELEGATE_OP__PATTERN);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DelegateOp.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DelegateOp"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((DelegateOp)object).getLabel();
		return label == null || label.length() == 0 ?
			getString("_UI_DelegateOp_type") :
			getString("_UI_DelegateOp_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DelegateOp.class)) {
			case PromisePackage.DELEGATE_OP__PATTERN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.DELEGATE_OP__PATTERN,
				 PromiseFactory.eINSTANCE.createVisit()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.DELEGATE_OP__PATTERN,
				 PromiseFactory.eINSTANCE.createSequencedVisit()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.DELEGATE_OP__PATTERN,
				 PromiseFactory.eINSTANCE.createOrderderVisit()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.DELEGATE_OP__PATTERN,
				 PromiseFactory.eINSTANCE.createStrictOrderedVisit()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.DELEGATE_OP__PATTERN,
				 PromiseFactory.eINSTANCE.createFairVisit()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.DELEGATE_OP__PATTERN,
				 PromiseFactory.eINSTANCE.createPatrolling()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.DELEGATE_OP__PATTERN,
				 PromiseFactory.eINSTANCE.createSequencedPatrolling()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.DELEGATE_OP__PATTERN,
				 PromiseFactory.eINSTANCE.createOrderedPatrolling()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.DELEGATE_OP__PATTERN,
				 PromiseFactory.eINSTANCE.createStrictOreredPatrolling()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.DELEGATE_OP__PATTERN,
				 PromiseFactory.eINSTANCE.createFairPatrolling()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.DELEGATE_OP__PATTERN,
				 PromiseFactory.eINSTANCE.createUpperRestrictedAvoidance()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.DELEGATE_OP__PATTERN,
				 PromiseFactory.eINSTANCE.createExactRestrictedAvoidance()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.DELEGATE_OP__PATTERN,
				 PromiseFactory.eINSTANCE.createLowerRestrictedAvoidance()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.DELEGATE_OP__PATTERN,
				 PromiseFactory.eINSTANCE.createFutureAvoidance()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.DELEGATE_OP__PATTERN,
				 PromiseFactory.eINSTANCE.createGlobalAvoidance()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.DELEGATE_OP__PATTERN,
				 PromiseFactory.eINSTANCE.createPastAvoidance()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.DELEGATE_OP__PATTERN,
				 PromiseFactory.eINSTANCE.createWait()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.DELEGATE_OP__PATTERN,
				 PromiseFactory.eINSTANCE.createDelayedReaction()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.DELEGATE_OP__PATTERN,
				 PromiseFactory.eINSTANCE.createInstantReaction()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.DELEGATE_OP__PATTERN,
				 PromiseFactory.eINSTANCE.createSimpleAction()));
	}

}
