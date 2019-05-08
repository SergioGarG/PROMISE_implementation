/**
 */
package promise.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import promise.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see promise.PromisePackage
 * @generated
 */
public class PromiseSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PromisePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PromiseSwitch() {
		if (modelPackage == null) {
			modelPackage = PromisePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case PromisePackage.OPERATOR: {
				Operator operator = (Operator)theEObject;
				T result = caseOperator(operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.FALL_BACK_OP: {
				FallBackOp fallBackOp = (FallBackOp)theEObject;
				T result = caseFallBackOp(fallBackOp);
				if (result == null) result = caseCompositionOperator(fallBackOp);
				if (result == null) result = caseOperator(fallBackOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.SEQUENCE_OP: {
				SequenceOp sequenceOp = (SequenceOp)theEObject;
				T result = caseSequenceOp(sequenceOp);
				if (result == null) result = caseCompositionOperator(sequenceOp);
				if (result == null) result = caseOperator(sequenceOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.PARALLEL_OP: {
				ParallelOp parallelOp = (ParallelOp)theEObject;
				T result = caseParallelOp(parallelOp);
				if (result == null) result = caseCompositionOperator(parallelOp);
				if (result == null) result = caseOperator(parallelOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.EVENT_HANDLER_OP: {
				EventHandlerOp eventHandlerOp = (EventHandlerOp)theEObject;
				T result = caseEventHandlerOp(eventHandlerOp);
				if (result == null) result = caseEventBasedOperator(eventHandlerOp);
				if (result == null) result = caseCompositionOperator(eventHandlerOp);
				if (result == null) result = caseOperator(eventHandlerOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.CONDITION_OP: {
				ConditionOp conditionOp = (ConditionOp)theEObject;
				T result = caseConditionOp(conditionOp);
				if (result == null) result = caseEventBasedOperator(conditionOp);
				if (result == null) result = caseCompositionOperator(conditionOp);
				if (result == null) result = caseOperator(conditionOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.MISSION: {
				Mission mission = (Mission)theEObject;
				T result = caseMission(mission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.TASKS: {
				Tasks tasks = (Tasks)theEObject;
				T result = caseTasks(tasks);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.COMPOSITION_OPERATOR: {
				CompositionOperator compositionOperator = (CompositionOperator)theEObject;
				T result = caseCompositionOperator(compositionOperator);
				if (result == null) result = caseOperator(compositionOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.ROBOT: {
				Robot robot = (Robot)theEObject;
				T result = caseRobot(robot);
				if (result == null) result = caseNamedElement(robot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.NAMED_ELEMENT: {
				NamedElement namedElement = (NamedElement)theEObject;
				T result = caseNamedElement(namedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.EVENT: {
				Event event = (Event)theEObject;
				T result = caseEvent(event);
				if (result == null) result = caseNamedElement(event);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.DELEGATE_OP: {
				DelegateOp delegateOp = (DelegateOp)theEObject;
				T result = caseDelegateOp(delegateOp);
				if (result == null) result = caseOperator(delegateOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseNamedElement(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.MOVEMENT_PATTERNS: {
				MovementPatterns movementPatterns = (MovementPatterns)theEObject;
				T result = caseMovementPatterns(movementPatterns);
				if (result == null) result = caseTasks(movementPatterns);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.VISIT: {
				Visit visit = (Visit)theEObject;
				T result = caseVisit(visit);
				if (result == null) result = caseMovementPatterns(visit);
				if (result == null) result = caseTasks(visit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.SEQUENCED_VISIT: {
				SequencedVisit sequencedVisit = (SequencedVisit)theEObject;
				T result = caseSequencedVisit(sequencedVisit);
				if (result == null) result = caseMovementPatterns(sequencedVisit);
				if (result == null) result = caseTasks(sequencedVisit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.ORDERDER_VISIT: {
				OrderderVisit orderderVisit = (OrderderVisit)theEObject;
				T result = caseOrderderVisit(orderderVisit);
				if (result == null) result = caseMovementPatterns(orderderVisit);
				if (result == null) result = caseTasks(orderderVisit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.STRICT_ORDERED_VISIT: {
				StrictOrderedVisit strictOrderedVisit = (StrictOrderedVisit)theEObject;
				T result = caseStrictOrderedVisit(strictOrderedVisit);
				if (result == null) result = caseMovementPatterns(strictOrderedVisit);
				if (result == null) result = caseTasks(strictOrderedVisit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.FAIR_VISIT: {
				FairVisit fairVisit = (FairVisit)theEObject;
				T result = caseFairVisit(fairVisit);
				if (result == null) result = caseMovementPatterns(fairVisit);
				if (result == null) result = caseTasks(fairVisit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.PATROLLING: {
				Patrolling patrolling = (Patrolling)theEObject;
				T result = casePatrolling(patrolling);
				if (result == null) result = caseMovementPatterns(patrolling);
				if (result == null) result = caseTasks(patrolling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.SEQUENCED_PATROLLING: {
				SequencedPatrolling sequencedPatrolling = (SequencedPatrolling)theEObject;
				T result = caseSequencedPatrolling(sequencedPatrolling);
				if (result == null) result = caseMovementPatterns(sequencedPatrolling);
				if (result == null) result = caseTasks(sequencedPatrolling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.ORDERED_PATROLLING: {
				OrderedPatrolling orderedPatrolling = (OrderedPatrolling)theEObject;
				T result = caseOrderedPatrolling(orderedPatrolling);
				if (result == null) result = caseMovementPatterns(orderedPatrolling);
				if (result == null) result = caseTasks(orderedPatrolling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.STRICT_ORERED_PATROLLING: {
				StrictOreredPatrolling strictOreredPatrolling = (StrictOreredPatrolling)theEObject;
				T result = caseStrictOreredPatrolling(strictOreredPatrolling);
				if (result == null) result = caseMovementPatterns(strictOreredPatrolling);
				if (result == null) result = caseTasks(strictOreredPatrolling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.FAIR_PATROLLING: {
				FairPatrolling fairPatrolling = (FairPatrolling)theEObject;
				T result = caseFairPatrolling(fairPatrolling);
				if (result == null) result = caseMovementPatterns(fairPatrolling);
				if (result == null) result = caseTasks(fairPatrolling);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.AVOIDANCE_PATTERNS: {
				AvoidancePatterns avoidancePatterns = (AvoidancePatterns)theEObject;
				T result = caseAvoidancePatterns(avoidancePatterns);
				if (result == null) result = caseTasks(avoidancePatterns);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.UPPER_RESTRICTED_AVOIDANCE: {
				UpperRestrictedAvoidance upperRestrictedAvoidance = (UpperRestrictedAvoidance)theEObject;
				T result = caseUpperRestrictedAvoidance(upperRestrictedAvoidance);
				if (result == null) result = caseAvoidancePatterns(upperRestrictedAvoidance);
				if (result == null) result = caseTasks(upperRestrictedAvoidance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.EXACT_RESTRICTED_AVOIDANCE: {
				ExactRestrictedAvoidance exactRestrictedAvoidance = (ExactRestrictedAvoidance)theEObject;
				T result = caseExactRestrictedAvoidance(exactRestrictedAvoidance);
				if (result == null) result = caseAvoidancePatterns(exactRestrictedAvoidance);
				if (result == null) result = caseTasks(exactRestrictedAvoidance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.LOWER_RESTRICTED_AVOIDANCE: {
				LowerRestrictedAvoidance lowerRestrictedAvoidance = (LowerRestrictedAvoidance)theEObject;
				T result = caseLowerRestrictedAvoidance(lowerRestrictedAvoidance);
				if (result == null) result = caseAvoidancePatterns(lowerRestrictedAvoidance);
				if (result == null) result = caseTasks(lowerRestrictedAvoidance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.FUTURE_AVOIDANCE: {
				FutureAvoidance futureAvoidance = (FutureAvoidance)theEObject;
				T result = caseFutureAvoidance(futureAvoidance);
				if (result == null) result = caseAvoidancePatterns(futureAvoidance);
				if (result == null) result = caseTasks(futureAvoidance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.GLOBAL_AVOIDANCE: {
				GlobalAvoidance globalAvoidance = (GlobalAvoidance)theEObject;
				T result = caseGlobalAvoidance(globalAvoidance);
				if (result == null) result = caseAvoidancePatterns(globalAvoidance);
				if (result == null) result = caseTasks(globalAvoidance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.PAST_AVOIDANCE: {
				PastAvoidance pastAvoidance = (PastAvoidance)theEObject;
				T result = casePastAvoidance(pastAvoidance);
				if (result == null) result = caseAvoidancePatterns(pastAvoidance);
				if (result == null) result = caseTasks(pastAvoidance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.TRIGGER_PATTERNS: {
				TriggerPatterns triggerPatterns = (TriggerPatterns)theEObject;
				T result = caseTriggerPatterns(triggerPatterns);
				if (result == null) result = caseTasks(triggerPatterns);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.WAIT: {
				Wait wait = (Wait)theEObject;
				T result = caseWait(wait);
				if (result == null) result = caseTriggerPatterns(wait);
				if (result == null) result = caseTasks(wait);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.DELAYED_REACTION: {
				DelayedReaction delayedReaction = (DelayedReaction)theEObject;
				T result = caseDelayedReaction(delayedReaction);
				if (result == null) result = caseTriggerPatterns(delayedReaction);
				if (result == null) result = caseTasks(delayedReaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.INSTANT_REACTION: {
				InstantReaction instantReaction = (InstantReaction)theEObject;
				T result = caseInstantReaction(instantReaction);
				if (result == null) result = caseTriggerPatterns(instantReaction);
				if (result == null) result = caseTasks(instantReaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.LOCATION: {
				Location location = (Location)theEObject;
				T result = caseLocation(location);
				if (result == null) result = caseNamedElement(location);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.SIMPLE_ACTION: {
				SimpleAction simpleAction = (SimpleAction)theEObject;
				T result = caseSimpleAction(simpleAction);
				if (result == null) result = caseTasks(simpleAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.TASK_COMBINATION_OP: {
				TaskCombinationOp taskCombinationOp = (TaskCombinationOp)theEObject;
				T result = caseTaskCombinationOp(taskCombinationOp);
				if (result == null) result = caseCompositionOperator(taskCombinationOp);
				if (result == null) result = caseOperator(taskCombinationOp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.EVENT_ASSIGNMENT: {
				EventAssignment eventAssignment = (EventAssignment)theEObject;
				T result = caseEventAssignment(eventAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.EVENT_BASED_OPERATOR: {
				EventBasedOperator eventBasedOperator = (EventBasedOperator)theEObject;
				T result = caseEventBasedOperator(eventBasedOperator);
				if (result == null) result = caseCompositionOperator(eventBasedOperator);
				if (result == null) result = caseOperator(eventBasedOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.CHECK: {
				Check check = (Check)theEObject;
				T result = caseCheck(check);
				if (result == null) result = caseMovementPatterns(check);
				if (result == null) result = caseTasks(check);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.CHECK_AND_DELIVER: {
				CheckAndDeliver checkAndDeliver = (CheckAndDeliver)theEObject;
				T result = caseCheckAndDeliver(checkAndDeliver);
				if (result == null) result = caseMovementPatterns(checkAndDeliver);
				if (result == null) result = caseTasks(checkAndDeliver);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.CHECK_SUPPLIES: {
				CheckSupplies checkSupplies = (CheckSupplies)theEObject;
				T result = caseCheckSupplies(checkSupplies);
				if (result == null) result = caseMovementPatterns(checkSupplies);
				if (result == null) result = caseTasks(checkSupplies);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.CHECK_AND_DELIVER_QCH: {
				CheckAndDeliverQCh checkAndDeliverQCh = (CheckAndDeliverQCh)theEObject;
				T result = caseCheckAndDeliverQCh(checkAndDeliverQCh);
				if (result == null) result = caseMovementPatterns(checkAndDeliverQCh);
				if (result == null) result = caseTasks(checkAndDeliverQCh);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case PromisePackage.TEST_ITAAP_AS: {
				TestITAAPAs testITAAPAs = (TestITAAPAs)theEObject;
				T result = caseTestITAAPAs(testITAAPAs);
				if (result == null) result = caseMovementPatterns(testITAAPAs);
				if (result == null) result = caseTasks(testITAAPAs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fall Back Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fall Back Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFallBackOp(FallBackOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequenceOp(SequenceOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parallel Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parallel Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParallelOp(ParallelOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Handler Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Handler Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventHandlerOp(EventHandlerOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionOp(ConditionOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMission(Mission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tasks</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tasks</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTasks(Tasks object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composition Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composition Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositionOperator(CompositionOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Robot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Robot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRobot(Robot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delegate Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delegate Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelegateOp(DelegateOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Movement Patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Movement Patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMovementPatterns(MovementPatterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Visit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Visit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVisit(Visit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequenced Visit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequenced Visit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequencedVisit(SequencedVisit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orderder Visit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orderder Visit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderderVisit(OrderderVisit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strict Ordered Visit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strict Ordered Visit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrictOrderedVisit(StrictOrderedVisit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fair Visit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fair Visit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFairVisit(FairVisit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patrolling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patrolling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatrolling(Patrolling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequenced Patrolling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequenced Patrolling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequencedPatrolling(SequencedPatrolling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ordered Patrolling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ordered Patrolling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderedPatrolling(OrderedPatrolling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strict Orered Patrolling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strict Orered Patrolling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrictOreredPatrolling(StrictOreredPatrolling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fair Patrolling</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fair Patrolling</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFairPatrolling(FairPatrolling object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Avoidance Patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Avoidance Patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvoidancePatterns(AvoidancePatterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Upper Restricted Avoidance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Upper Restricted Avoidance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUpperRestrictedAvoidance(UpperRestrictedAvoidance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exact Restricted Avoidance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exact Restricted Avoidance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExactRestrictedAvoidance(ExactRestrictedAvoidance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lower Restricted Avoidance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lower Restricted Avoidance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLowerRestrictedAvoidance(LowerRestrictedAvoidance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Future Avoidance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Future Avoidance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFutureAvoidance(FutureAvoidance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Avoidance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Avoidance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalAvoidance(GlobalAvoidance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Past Avoidance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Past Avoidance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePastAvoidance(PastAvoidance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger Patterns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger Patterns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriggerPatterns(TriggerPatterns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wait</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wait</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWait(Wait object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Delayed Reaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Delayed Reaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelayedReaction(DelayedReaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instant Reaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instant Reaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstantReaction(InstantReaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Location</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Location</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocation(Location object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleAction(SimpleAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Combination Op</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Combination Op</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskCombinationOp(TaskCombinationOp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventAssignment(EventAssignment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event Based Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Based Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventBasedOperator(EventBasedOperator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheck(Check object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check And Deliver</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check And Deliver</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckAndDeliver(CheckAndDeliver object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check Supplies</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check Supplies</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckSupplies(CheckSupplies object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Check And Deliver QCh</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Check And Deliver QCh</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCheckAndDeliverQCh(CheckAndDeliverQCh object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test ITAAP As</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test ITAAP As</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestITAAPAs(TestITAAPAs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PromiseSwitch
