/**
 */
package promise.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import promise.Action;
import promise.DelegateOp;
import promise.Event;
import promise.Location;
import promise.PromisePackage;
import promise.Tasks;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegate Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link promise.impl.DelegateOpImpl#getTask <em>Task</em>}</li>
 *   <li>{@link promise.impl.DelegateOpImpl#getInputAction <em>Input Action</em>}</li>
 *   <li>{@link promise.impl.DelegateOpImpl#getStoppingEvent <em>Stopping Event</em>}</li>
 *   <li>{@link promise.impl.DelegateOpImpl#getInputLocations <em>Input Locations</em>}</li>
 *   <li>{@link promise.impl.DelegateOpImpl#getInputResource <em>Input Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DelegateOpImpl extends OperatorImpl implements DelegateOp {
	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected Tasks task;

	/**
	 * The cached value of the '{@link #getInputAction() <em>Input Action</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> inputAction;

	/**
	 * The cached value of the '{@link #getStoppingEvent() <em>Stopping Event</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoppingEvent()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> stoppingEvent;

	/**
	 * The cached value of the '{@link #getInputLocations() <em>Input Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> inputLocations;

	/**
	 * The cached value of the '{@link #getInputResource() <em>Input Resource</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputResource()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> inputResource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DelegateOpImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PromisePackage.Literals.DELEGATE_OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tasks getTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask(Tasks newTask, NotificationChain msgs) {
		Tasks oldTask = task;
		task = newTask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PromisePackage.DELEGATE_OP__TASK, oldTask, newTask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTask(Tasks newTask) {
		if (newTask != task) {
			NotificationChain msgs = null;
			if (task != null)
				msgs = ((InternalEObject)task).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PromisePackage.DELEGATE_OP__TASK, null, msgs);
			if (newTask != null)
				msgs = ((InternalEObject)newTask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PromisePackage.DELEGATE_OP__TASK, null, msgs);
			msgs = basicSetTask(newTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PromisePackage.DELEGATE_OP__TASK, newTask, newTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getInputAction() {
		if (inputAction == null) {
			inputAction = new EObjectResolvingEList<Action>(Action.class, this, PromisePackage.DELEGATE_OP__INPUT_ACTION);
		}
		return inputAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Event> getStoppingEvent() {
		if (stoppingEvent == null) {
			stoppingEvent = new EObjectResolvingEList<Event>(Event.class, this, PromisePackage.DELEGATE_OP__STOPPING_EVENT);
		}
		return stoppingEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Location> getInputLocations() {
		if (inputLocations == null) {
			inputLocations = new EObjectResolvingEList<Location>(Location.class, this, PromisePackage.DELEGATE_OP__INPUT_LOCATIONS);
		}
		return inputLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getInputResource() {
		if (inputResource == null) {
			inputResource = new EObjectResolvingEList<Action>(Action.class, this, PromisePackage.DELEGATE_OP__INPUT_RESOURCE);
		}
		return inputResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PromisePackage.DELEGATE_OP__TASK:
				return basicSetTask(null, msgs);
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
			case PromisePackage.DELEGATE_OP__TASK:
				return getTask();
			case PromisePackage.DELEGATE_OP__INPUT_ACTION:
				return getInputAction();
			case PromisePackage.DELEGATE_OP__STOPPING_EVENT:
				return getStoppingEvent();
			case PromisePackage.DELEGATE_OP__INPUT_LOCATIONS:
				return getInputLocations();
			case PromisePackage.DELEGATE_OP__INPUT_RESOURCE:
				return getInputResource();
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
			case PromisePackage.DELEGATE_OP__TASK:
				setTask((Tasks)newValue);
				return;
			case PromisePackage.DELEGATE_OP__INPUT_ACTION:
				getInputAction().clear();
				getInputAction().addAll((Collection<? extends Action>)newValue);
				return;
			case PromisePackage.DELEGATE_OP__STOPPING_EVENT:
				getStoppingEvent().clear();
				getStoppingEvent().addAll((Collection<? extends Event>)newValue);
				return;
			case PromisePackage.DELEGATE_OP__INPUT_LOCATIONS:
				getInputLocations().clear();
				getInputLocations().addAll((Collection<? extends Location>)newValue);
				return;
			case PromisePackage.DELEGATE_OP__INPUT_RESOURCE:
				getInputResource().clear();
				getInputResource().addAll((Collection<? extends Action>)newValue);
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
			case PromisePackage.DELEGATE_OP__TASK:
				setTask((Tasks)null);
				return;
			case PromisePackage.DELEGATE_OP__INPUT_ACTION:
				getInputAction().clear();
				return;
			case PromisePackage.DELEGATE_OP__STOPPING_EVENT:
				getStoppingEvent().clear();
				return;
			case PromisePackage.DELEGATE_OP__INPUT_LOCATIONS:
				getInputLocations().clear();
				return;
			case PromisePackage.DELEGATE_OP__INPUT_RESOURCE:
				getInputResource().clear();
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
			case PromisePackage.DELEGATE_OP__TASK:
				return task != null;
			case PromisePackage.DELEGATE_OP__INPUT_ACTION:
				return inputAction != null && !inputAction.isEmpty();
			case PromisePackage.DELEGATE_OP__STOPPING_EVENT:
				return stoppingEvent != null && !stoppingEvent.isEmpty();
			case PromisePackage.DELEGATE_OP__INPUT_LOCATIONS:
				return inputLocations != null && !inputLocations.isEmpty();
			case PromisePackage.DELEGATE_OP__INPUT_RESOURCE:
				return inputResource != null && !inputResource.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DelegateOpImpl
