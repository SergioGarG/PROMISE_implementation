/**
 */
package promise;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see promise.PromisePackage
 * @generated
 */
public interface PromiseFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PromiseFactory eINSTANCE = promise.impl.PromiseFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Fall Back Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fall Back Op</em>'.
	 * @generated
	 */
	FallBackOp createFallBackOp();

	/**
	 * Returns a new object of class '<em>Sequence Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence Op</em>'.
	 * @generated
	 */
	SequenceOp createSequenceOp();

	/**
	 * Returns a new object of class '<em>Parallel Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parallel Op</em>'.
	 * @generated
	 */
	ParallelOp createParallelOp();

	/**
	 * Returns a new object of class '<em>Event Handler Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Handler Op</em>'.
	 * @generated
	 */
	EventHandlerOp createEventHandlerOp();

	/**
	 * Returns a new object of class '<em>Condition Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Condition Op</em>'.
	 * @generated
	 */
	ConditionOp createConditionOp();

	/**
	 * Returns a new object of class '<em>Mission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mission</em>'.
	 * @generated
	 */
	Mission createMission();

	/**
	 * Returns a new object of class '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Robot</em>'.
	 * @generated
	 */
	Robot createRobot();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Delegate Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delegate Op</em>'.
	 * @generated
	 */
	DelegateOp createDelegateOp();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Visit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Visit</em>'.
	 * @generated
	 */
	Visit createVisit();

	/**
	 * Returns a new object of class '<em>Sequenced Visit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequenced Visit</em>'.
	 * @generated
	 */
	SequencedVisit createSequencedVisit();

	/**
	 * Returns a new object of class '<em>Orderder Visit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orderder Visit</em>'.
	 * @generated
	 */
	OrderderVisit createOrderderVisit();

	/**
	 * Returns a new object of class '<em>Strict Ordered Visit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strict Ordered Visit</em>'.
	 * @generated
	 */
	StrictOrderedVisit createStrictOrderedVisit();

	/**
	 * Returns a new object of class '<em>Fair Visit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fair Visit</em>'.
	 * @generated
	 */
	FairVisit createFairVisit();

	/**
	 * Returns a new object of class '<em>Patrolling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patrolling</em>'.
	 * @generated
	 */
	Patrolling createPatrolling();

	/**
	 * Returns a new object of class '<em>Sequenced Patrolling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequenced Patrolling</em>'.
	 * @generated
	 */
	SequencedPatrolling createSequencedPatrolling();

	/**
	 * Returns a new object of class '<em>Ordered Patrolling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ordered Patrolling</em>'.
	 * @generated
	 */
	OrderedPatrolling createOrderedPatrolling();

	/**
	 * Returns a new object of class '<em>Strict Orered Patrolling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Strict Orered Patrolling</em>'.
	 * @generated
	 */
	StrictOreredPatrolling createStrictOreredPatrolling();

	/**
	 * Returns a new object of class '<em>Fair Patrolling</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fair Patrolling</em>'.
	 * @generated
	 */
	FairPatrolling createFairPatrolling();

	/**
	 * Returns a new object of class '<em>Upper Restricted Avoidance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Upper Restricted Avoidance</em>'.
	 * @generated
	 */
	UpperRestrictedAvoidance createUpperRestrictedAvoidance();

	/**
	 * Returns a new object of class '<em>Exact Restricted Avoidance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exact Restricted Avoidance</em>'.
	 * @generated
	 */
	ExactRestrictedAvoidance createExactRestrictedAvoidance();

	/**
	 * Returns a new object of class '<em>Lower Restricted Avoidance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lower Restricted Avoidance</em>'.
	 * @generated
	 */
	LowerRestrictedAvoidance createLowerRestrictedAvoidance();

	/**
	 * Returns a new object of class '<em>Future Avoidance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Future Avoidance</em>'.
	 * @generated
	 */
	FutureAvoidance createFutureAvoidance();

	/**
	 * Returns a new object of class '<em>Global Avoidance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Avoidance</em>'.
	 * @generated
	 */
	GlobalAvoidance createGlobalAvoidance();

	/**
	 * Returns a new object of class '<em>Past Avoidance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Past Avoidance</em>'.
	 * @generated
	 */
	PastAvoidance createPastAvoidance();

	/**
	 * Returns a new object of class '<em>Wait</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wait</em>'.
	 * @generated
	 */
	Wait createWait();

	/**
	 * Returns a new object of class '<em>Delayed Reaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delayed Reaction</em>'.
	 * @generated
	 */
	DelayedReaction createDelayedReaction();

	/**
	 * Returns a new object of class '<em>Instant Reaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instant Reaction</em>'.
	 * @generated
	 */
	InstantReaction createInstantReaction();

	/**
	 * Returns a new object of class '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Location</em>'.
	 * @generated
	 */
	Location createLocation();

	/**
	 * Returns a new object of class '<em>Simple Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Action</em>'.
	 * @generated
	 */
	SimpleAction createSimpleAction();

	/**
	 * Returns a new object of class '<em>AND Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AND Op</em>'.
	 * @generated
	 */
	ANDOp createANDOp();

	/**
	 * Returns a new object of class '<em>OR Op</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>OR Op</em>'.
	 * @generated
	 */
	OROp createOROp();

	/**
	 * Returns a new object of class '<em>Event Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Assignment</em>'.
	 * @generated
	 */
	EventAssignment createEventAssignment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PromisePackage getPromisePackage();

} //PromiseFactory
