/**
 */
package promise.provider;


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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import promise.Mission;
import promise.PromiseFactory;
import promise.PromisePackage;

/**
 * This is the item provider adapter for a {@link promise.Mission} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MissionItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MissionItemProvider(AdapterFactory adapterFactory) {
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

			addEventassignmentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Eventassignment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEventassignmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Mission_eventassignment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Mission_eventassignment_feature", "_UI_Mission_type"),
				 PromisePackage.Literals.MISSION__EVENTASSIGNMENT,
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
			childrenFeatures.add(PromisePackage.Literals.MISSION__OPERATOR);
			childrenFeatures.add(PromisePackage.Literals.MISSION__ROBOTS);
			childrenFeatures.add(PromisePackage.Literals.MISSION__ACTIONS);
			childrenFeatures.add(PromisePackage.Literals.MISSION__EVENTS);
			childrenFeatures.add(PromisePackage.Literals.MISSION__LOCATIONS);
			childrenFeatures.add(PromisePackage.Literals.MISSION__EVENTASSIGNMENT);
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
	 * This returns Mission.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Mission"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Mission_type");
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

		switch (notification.getFeatureID(Mission.class)) {
			case PromisePackage.MISSION__OPERATOR:
			case PromisePackage.MISSION__ROBOTS:
			case PromisePackage.MISSION__ACTIONS:
			case PromisePackage.MISSION__EVENTS:
			case PromisePackage.MISSION__LOCATIONS:
			case PromisePackage.MISSION__EVENTASSIGNMENT:
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
				(PromisePackage.Literals.MISSION__OPERATOR,
				 PromiseFactory.eINSTANCE.createFallBackOp()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.MISSION__OPERATOR,
				 PromiseFactory.eINSTANCE.createSequenceOp()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.MISSION__OPERATOR,
				 PromiseFactory.eINSTANCE.createParallelOp()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.MISSION__OPERATOR,
				 PromiseFactory.eINSTANCE.createEventHandlerOp()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.MISSION__OPERATOR,
				 PromiseFactory.eINSTANCE.createConditionOp()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.MISSION__OPERATOR,
				 PromiseFactory.eINSTANCE.createDelegateOp()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.MISSION__OPERATOR,
				 PromiseFactory.eINSTANCE.createANDOp()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.MISSION__OPERATOR,
				 PromiseFactory.eINSTANCE.createOROp()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.MISSION__ROBOTS,
				 PromiseFactory.eINSTANCE.createRobot()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.MISSION__ACTIONS,
				 PromiseFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.MISSION__EVENTS,
				 PromiseFactory.eINSTANCE.createEvent()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.MISSION__LOCATIONS,
				 PromiseFactory.eINSTANCE.createLocation()));

		newChildDescriptors.add
			(createChildParameter
				(PromisePackage.Literals.MISSION__EVENTASSIGNMENT,
				 PromiseFactory.eINSTANCE.createEventAssignment()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PromiseEditPlugin.INSTANCE;
	}

}
