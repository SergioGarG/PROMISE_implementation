/**
 */
package promise.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import promise.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see promise.PromisePackage
 * @generated
 */
public class PromiseAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PromisePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PromiseAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PromisePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PromiseSwitch<Adapter> modelSwitch =
		new PromiseSwitch<Adapter>() {
			@Override
			public Adapter caseOperator(Operator object) {
				return createOperatorAdapter();
			}
			@Override
			public Adapter caseFallBackOp(FallBackOp object) {
				return createFallBackOpAdapter();
			}
			@Override
			public Adapter caseSequenceOp(SequenceOp object) {
				return createSequenceOpAdapter();
			}
			@Override
			public Adapter caseParallelOp(ParallelOp object) {
				return createParallelOpAdapter();
			}
			@Override
			public Adapter caseEventHandlerOp(EventHandlerOp object) {
				return createEventHandlerOpAdapter();
			}
			@Override
			public Adapter caseConditionOp(ConditionOp object) {
				return createConditionOpAdapter();
			}
			@Override
			public Adapter caseMission(Mission object) {
				return createMissionAdapter();
			}
			@Override
			public Adapter casePattern(Pattern object) {
				return createPatternAdapter();
			}
			@Override
			public Adapter caseCompositionOperator(CompositionOperator object) {
				return createCompositionOperatorAdapter();
			}
			@Override
			public Adapter caseRobot(Robot object) {
				return createRobotAdapter();
			}
			@Override
			public Adapter caseNamedElement(NamedElement object) {
				return createNamedElementAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseDelegateOp(DelegateOp object) {
				return createDelegateOpAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseMovementPatterns(MovementPatterns object) {
				return createMovementPatternsAdapter();
			}
			@Override
			public Adapter caseVisit(Visit object) {
				return createVisitAdapter();
			}
			@Override
			public Adapter caseSequencedVisit(SequencedVisit object) {
				return createSequencedVisitAdapter();
			}
			@Override
			public Adapter caseOrderderVisit(OrderderVisit object) {
				return createOrderderVisitAdapter();
			}
			@Override
			public Adapter caseStrictOrderedVisit(StrictOrderedVisit object) {
				return createStrictOrderedVisitAdapter();
			}
			@Override
			public Adapter caseFairVisit(FairVisit object) {
				return createFairVisitAdapter();
			}
			@Override
			public Adapter casePatrolling(Patrolling object) {
				return createPatrollingAdapter();
			}
			@Override
			public Adapter caseSequencedPatrolling(SequencedPatrolling object) {
				return createSequencedPatrollingAdapter();
			}
			@Override
			public Adapter caseOrderedPatrolling(OrderedPatrolling object) {
				return createOrderedPatrollingAdapter();
			}
			@Override
			public Adapter caseStrictOreredPatrolling(StrictOreredPatrolling object) {
				return createStrictOreredPatrollingAdapter();
			}
			@Override
			public Adapter caseFairPatrolling(FairPatrolling object) {
				return createFairPatrollingAdapter();
			}
			@Override
			public Adapter caseAvoidancePatterns(AvoidancePatterns object) {
				return createAvoidancePatternsAdapter();
			}
			@Override
			public Adapter caseUpperRestrictedAvoidance(UpperRestrictedAvoidance object) {
				return createUpperRestrictedAvoidanceAdapter();
			}
			@Override
			public Adapter caseExactRestrictedAvoidance(ExactRestrictedAvoidance object) {
				return createExactRestrictedAvoidanceAdapter();
			}
			@Override
			public Adapter caseLowerRestrictedAvoidance(LowerRestrictedAvoidance object) {
				return createLowerRestrictedAvoidanceAdapter();
			}
			@Override
			public Adapter caseFutureAvoidance(FutureAvoidance object) {
				return createFutureAvoidanceAdapter();
			}
			@Override
			public Adapter caseGlobalAvoidance(GlobalAvoidance object) {
				return createGlobalAvoidanceAdapter();
			}
			@Override
			public Adapter casePastAvoidance(PastAvoidance object) {
				return createPastAvoidanceAdapter();
			}
			@Override
			public Adapter caseTriggerPatterns(TriggerPatterns object) {
				return createTriggerPatternsAdapter();
			}
			@Override
			public Adapter caseWait(Wait object) {
				return createWaitAdapter();
			}
			@Override
			public Adapter caseDelayedReaction(DelayedReaction object) {
				return createDelayedReactionAdapter();
			}
			@Override
			public Adapter caseInstantReaction(InstantReaction object) {
				return createInstantReactionAdapter();
			}
			@Override
			public Adapter caseContext(Context object) {
				return createContextAdapter();
			}
			@Override
			public Adapter caseLocation(Location object) {
				return createLocationAdapter();
			}
			@Override
			public Adapter caseSimpleAction(SimpleAction object) {
				return createSimpleActionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link promise.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.Operator
	 * @generated
	 */
	public Adapter createOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.FallBackOp <em>Fall Back Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.FallBackOp
	 * @generated
	 */
	public Adapter createFallBackOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.SequenceOp <em>Sequence Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.SequenceOp
	 * @generated
	 */
	public Adapter createSequenceOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.ParallelOp <em>Parallel Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.ParallelOp
	 * @generated
	 */
	public Adapter createParallelOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.EventHandlerOp <em>Event Handler Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.EventHandlerOp
	 * @generated
	 */
	public Adapter createEventHandlerOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.ConditionOp <em>Condition Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.ConditionOp
	 * @generated
	 */
	public Adapter createConditionOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.Mission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.Mission
	 * @generated
	 */
	public Adapter createMissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.Pattern
	 * @generated
	 */
	public Adapter createPatternAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.CompositionOperator <em>Composition Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.CompositionOperator
	 * @generated
	 */
	public Adapter createCompositionOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.Robot
	 * @generated
	 */
	public Adapter createRobotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.DelegateOp <em>Delegate Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.DelegateOp
	 * @generated
	 */
	public Adapter createDelegateOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.MovementPatterns <em>Movement Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.MovementPatterns
	 * @generated
	 */
	public Adapter createMovementPatternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.Visit <em>Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.Visit
	 * @generated
	 */
	public Adapter createVisitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.SequencedVisit <em>Sequenced Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.SequencedVisit
	 * @generated
	 */
	public Adapter createSequencedVisitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.OrderderVisit <em>Orderder Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.OrderderVisit
	 * @generated
	 */
	public Adapter createOrderderVisitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.StrictOrderedVisit <em>Strict Ordered Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.StrictOrderedVisit
	 * @generated
	 */
	public Adapter createStrictOrderedVisitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.FairVisit <em>Fair Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.FairVisit
	 * @generated
	 */
	public Adapter createFairVisitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.Patrolling <em>Patrolling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.Patrolling
	 * @generated
	 */
	public Adapter createPatrollingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.SequencedPatrolling <em>Sequenced Patrolling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.SequencedPatrolling
	 * @generated
	 */
	public Adapter createSequencedPatrollingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.OrderedPatrolling <em>Ordered Patrolling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.OrderedPatrolling
	 * @generated
	 */
	public Adapter createOrderedPatrollingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.StrictOreredPatrolling <em>Strict Orered Patrolling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.StrictOreredPatrolling
	 * @generated
	 */
	public Adapter createStrictOreredPatrollingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.FairPatrolling <em>Fair Patrolling</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.FairPatrolling
	 * @generated
	 */
	public Adapter createFairPatrollingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.AvoidancePatterns <em>Avoidance Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.AvoidancePatterns
	 * @generated
	 */
	public Adapter createAvoidancePatternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.UpperRestrictedAvoidance <em>Upper Restricted Avoidance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.UpperRestrictedAvoidance
	 * @generated
	 */
	public Adapter createUpperRestrictedAvoidanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.ExactRestrictedAvoidance <em>Exact Restricted Avoidance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.ExactRestrictedAvoidance
	 * @generated
	 */
	public Adapter createExactRestrictedAvoidanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.LowerRestrictedAvoidance <em>Lower Restricted Avoidance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.LowerRestrictedAvoidance
	 * @generated
	 */
	public Adapter createLowerRestrictedAvoidanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.FutureAvoidance <em>Future Avoidance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.FutureAvoidance
	 * @generated
	 */
	public Adapter createFutureAvoidanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.GlobalAvoidance <em>Global Avoidance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.GlobalAvoidance
	 * @generated
	 */
	public Adapter createGlobalAvoidanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.PastAvoidance <em>Past Avoidance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.PastAvoidance
	 * @generated
	 */
	public Adapter createPastAvoidanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.TriggerPatterns <em>Trigger Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.TriggerPatterns
	 * @generated
	 */
	public Adapter createTriggerPatternsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.Wait
	 * @generated
	 */
	public Adapter createWaitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.DelayedReaction <em>Delayed Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.DelayedReaction
	 * @generated
	 */
	public Adapter createDelayedReactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.InstantReaction <em>Instant Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.InstantReaction
	 * @generated
	 */
	public Adapter createInstantReactionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.Context
	 * @generated
	 */
	public Adapter createContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.Location
	 * @generated
	 */
	public Adapter createLocationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link promise.SimpleAction <em>Simple Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see promise.SimpleAction
	 * @generated
	 */
	public Adapter createSimpleActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PromiseAdapterFactory
