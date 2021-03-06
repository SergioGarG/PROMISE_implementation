/**
 */
package promise.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import promise.Action;
import promise.AvoidancePatterns;
import promise.Check;
import promise.CheckAndDeliver;
import promise.CheckAndDeliverQCh;
import promise.CheckSupplies;
import promise.CompositionOperator;
import promise.ConditionOp;
import promise.DelayedReaction;
import promise.DelegateOp;
import promise.Event;
import promise.EventAssignment;
import promise.EventBasedOperator;
import promise.EventHandlerOp;
import promise.ExactRestrictedAvoidance;
import promise.FairPatrolling;
import promise.FairVisit;
import promise.FallBackOp;
import promise.FutureAvoidance;
import promise.GlobalAvoidance;
import promise.InstantReaction;
import promise.Location;
import promise.LowerRestrictedAvoidance;
import promise.Mission;
import promise.MovementPatterns;
import promise.NamedElement;
import promise.Operator;
import promise.OrderderVisit;
import promise.OrderedPatrolling;
import promise.ParallelOp;
import promise.PastAvoidance;
import promise.Patrolling;
import promise.PromiseFactory;
import promise.PromisePackage;
import promise.Robot;
import promise.SequenceOp;
import promise.SequencedPatrolling;
import promise.SequencedVisit;
import promise.SimpleAction;
import promise.StrictOrderedVisit;
import promise.StrictOreredPatrolling;
import promise.TaskCombinationOp;
import promise.Tasks;
import promise.TestITAAPAs;
import promise.TriggerPatterns;
import promise.UpperRestrictedAvoidance;
import promise.Visit;
import promise.Wait;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PromisePackageImpl extends EPackageImpl implements PromisePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fallBackOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventHandlerOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass missionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tasksEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositionOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass robotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delegateOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass movementPatternsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequencedVisitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderderVisitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strictOrderedVisitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fairVisitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patrollingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequencedPatrollingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderedPatrollingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strictOreredPatrollingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fairPatrollingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass avoidancePatternsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass upperRestrictedAvoidanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exactRestrictedAvoidanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lowerRestrictedAvoidanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass futureAvoidanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalAvoidanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pastAvoidanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerPatternsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass waitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass delayedReactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instantReactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass locationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskCombinationOpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventAssignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventBasedOperatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkAndDeliverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkSuppliesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkAndDeliverQChEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testITAAPAsEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see promise.PromisePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PromisePackageImpl() {
		super(eNS_URI, PromiseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PromisePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PromisePackage init() {
		if (isInited) return (PromisePackage)EPackage.Registry.INSTANCE.getEPackage(PromisePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPromisePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PromisePackageImpl thePromisePackage = registeredPromisePackage instanceof PromisePackageImpl ? (PromisePackageImpl)registeredPromisePackage : new PromisePackageImpl();

		isInited = true;

		// Create package meta-data objects
		thePromisePackage.createPackageContents();

		// Initialize created meta-data
		thePromisePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePromisePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PromisePackage.eNS_URI, thePromisePackage);
		return thePromisePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperator() {
		return operatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperator_Parent() {
		return (EReference)operatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperator_EventAssigned() {
		return (EReference)operatorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFallBackOp() {
		return fallBackOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSequenceOp() {
		return sequenceOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParallelOp() {
		return parallelOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParallelOp_InputRobots() {
		return (EReference)parallelOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventHandlerOp() {
		return eventHandlerOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConditionOp() {
		return conditionOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMission() {
		return missionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMission_Operator() {
		return (EReference)missionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMission_Robots() {
		return (EReference)missionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMission_Actions() {
		return (EReference)missionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMission_Events() {
		return (EReference)missionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMission_Locations() {
		return (EReference)missionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMission_Eventassignment() {
		return (EReference)missionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTasks() {
		return tasksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompositionOperator() {
		return compositionOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompositionOperator_InputOperators() {
		return (EReference)compositionOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRobot() {
		return robotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvent_Description() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDelegateOp() {
		return delegateOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDelegateOp_Task() {
		return (EReference)delegateOpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDelegateOp_InputAction() {
		return (EReference)delegateOpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDelegateOp_StoppingEvent() {
		return (EReference)delegateOpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDelegateOp_InputLocations() {
		return (EReference)delegateOpEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDelegateOp_InputResource() {
		return (EReference)delegateOpEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAction_Description() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMovementPatterns() {
		return movementPatternsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVisit() {
		return visitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSequencedVisit() {
		return sequencedVisitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderderVisit() {
		return orderderVisitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrictOrderedVisit() {
		return strictOrderedVisitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFairVisit() {
		return fairVisitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPatrolling() {
		return patrollingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSequencedPatrolling() {
		return sequencedPatrollingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderedPatrolling() {
		return orderedPatrollingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrictOreredPatrolling() {
		return strictOreredPatrollingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFairPatrolling() {
		return fairPatrollingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAvoidancePatterns() {
		return avoidancePatternsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUpperRestrictedAvoidance() {
		return upperRestrictedAvoidanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExactRestrictedAvoidance() {
		return exactRestrictedAvoidanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLowerRestrictedAvoidance() {
		return lowerRestrictedAvoidanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFutureAvoidance() {
		return futureAvoidanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlobalAvoidance() {
		return globalAvoidanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPastAvoidance() {
		return pastAvoidanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTriggerPatterns() {
		return triggerPatternsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWait() {
		return waitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWait_Description() {
		return (EAttribute)waitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDelayedReaction() {
		return delayedReactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDelayedReaction_Description() {
		return (EAttribute)delayedReactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInstantReaction() {
		return instantReactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInstantReaction_Description() {
		return (EAttribute)instantReactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocation() {
		return locationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleAction() {
		return simpleActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaskCombinationOp() {
		return taskCombinationOpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventAssignment() {
		return eventAssignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventAssignment_InputEvent() {
		return (EReference)eventAssignmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventAssignment_InputOperators() {
		return (EReference)eventAssignmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventAssignment_Parent_event() {
		return (EReference)eventAssignmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventBasedOperator() {
		return eventBasedOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventBasedOperator_InputEvents() {
		return (EReference)eventBasedOperatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheck() {
		return checkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheckAndDeliver() {
		return checkAndDeliverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheckSupplies() {
		return checkSuppliesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheckAndDeliverQCh() {
		return checkAndDeliverQChEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTestITAAPAs() {
		return testITAAPAsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PromiseFactory getPromiseFactory() {
		return (PromiseFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		operatorEClass = createEClass(OPERATOR);
		createEReference(operatorEClass, OPERATOR__PARENT);
		createEReference(operatorEClass, OPERATOR__EVENT_ASSIGNED);

		fallBackOpEClass = createEClass(FALL_BACK_OP);

		sequenceOpEClass = createEClass(SEQUENCE_OP);

		parallelOpEClass = createEClass(PARALLEL_OP);
		createEReference(parallelOpEClass, PARALLEL_OP__INPUT_ROBOTS);

		eventHandlerOpEClass = createEClass(EVENT_HANDLER_OP);

		conditionOpEClass = createEClass(CONDITION_OP);

		missionEClass = createEClass(MISSION);
		createEReference(missionEClass, MISSION__OPERATOR);
		createEReference(missionEClass, MISSION__ROBOTS);
		createEReference(missionEClass, MISSION__ACTIONS);
		createEReference(missionEClass, MISSION__EVENTS);
		createEReference(missionEClass, MISSION__LOCATIONS);
		createEReference(missionEClass, MISSION__EVENTASSIGNMENT);

		tasksEClass = createEClass(TASKS);

		compositionOperatorEClass = createEClass(COMPOSITION_OPERATOR);
		createEReference(compositionOperatorEClass, COMPOSITION_OPERATOR__INPUT_OPERATORS);

		robotEClass = createEClass(ROBOT);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		eventEClass = createEClass(EVENT);
		createEAttribute(eventEClass, EVENT__DESCRIPTION);

		delegateOpEClass = createEClass(DELEGATE_OP);
		createEReference(delegateOpEClass, DELEGATE_OP__TASK);
		createEReference(delegateOpEClass, DELEGATE_OP__INPUT_ACTION);
		createEReference(delegateOpEClass, DELEGATE_OP__STOPPING_EVENT);
		createEReference(delegateOpEClass, DELEGATE_OP__INPUT_LOCATIONS);
		createEReference(delegateOpEClass, DELEGATE_OP__INPUT_RESOURCE);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__DESCRIPTION);

		movementPatternsEClass = createEClass(MOVEMENT_PATTERNS);

		visitEClass = createEClass(VISIT);

		sequencedVisitEClass = createEClass(SEQUENCED_VISIT);

		orderderVisitEClass = createEClass(ORDERDER_VISIT);

		strictOrderedVisitEClass = createEClass(STRICT_ORDERED_VISIT);

		fairVisitEClass = createEClass(FAIR_VISIT);

		patrollingEClass = createEClass(PATROLLING);

		sequencedPatrollingEClass = createEClass(SEQUENCED_PATROLLING);

		orderedPatrollingEClass = createEClass(ORDERED_PATROLLING);

		strictOreredPatrollingEClass = createEClass(STRICT_ORERED_PATROLLING);

		fairPatrollingEClass = createEClass(FAIR_PATROLLING);

		avoidancePatternsEClass = createEClass(AVOIDANCE_PATTERNS);

		upperRestrictedAvoidanceEClass = createEClass(UPPER_RESTRICTED_AVOIDANCE);

		exactRestrictedAvoidanceEClass = createEClass(EXACT_RESTRICTED_AVOIDANCE);

		lowerRestrictedAvoidanceEClass = createEClass(LOWER_RESTRICTED_AVOIDANCE);

		futureAvoidanceEClass = createEClass(FUTURE_AVOIDANCE);

		globalAvoidanceEClass = createEClass(GLOBAL_AVOIDANCE);

		pastAvoidanceEClass = createEClass(PAST_AVOIDANCE);

		triggerPatternsEClass = createEClass(TRIGGER_PATTERNS);

		waitEClass = createEClass(WAIT);
		createEAttribute(waitEClass, WAIT__DESCRIPTION);

		delayedReactionEClass = createEClass(DELAYED_REACTION);
		createEAttribute(delayedReactionEClass, DELAYED_REACTION__DESCRIPTION);

		instantReactionEClass = createEClass(INSTANT_REACTION);
		createEAttribute(instantReactionEClass, INSTANT_REACTION__DESCRIPTION);

		locationEClass = createEClass(LOCATION);

		simpleActionEClass = createEClass(SIMPLE_ACTION);

		taskCombinationOpEClass = createEClass(TASK_COMBINATION_OP);

		eventAssignmentEClass = createEClass(EVENT_ASSIGNMENT);
		createEReference(eventAssignmentEClass, EVENT_ASSIGNMENT__INPUT_EVENT);
		createEReference(eventAssignmentEClass, EVENT_ASSIGNMENT__INPUT_OPERATORS);
		createEReference(eventAssignmentEClass, EVENT_ASSIGNMENT__PARENT_EVENT);

		eventBasedOperatorEClass = createEClass(EVENT_BASED_OPERATOR);
		createEReference(eventBasedOperatorEClass, EVENT_BASED_OPERATOR__INPUT_EVENTS);

		checkEClass = createEClass(CHECK);

		checkAndDeliverEClass = createEClass(CHECK_AND_DELIVER);

		checkSuppliesEClass = createEClass(CHECK_SUPPLIES);

		checkAndDeliverQChEClass = createEClass(CHECK_AND_DELIVER_QCH);

		testITAAPAsEClass = createEClass(TEST_ITAAP_AS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fallBackOpEClass.getESuperTypes().add(this.getCompositionOperator());
		sequenceOpEClass.getESuperTypes().add(this.getCompositionOperator());
		parallelOpEClass.getESuperTypes().add(this.getCompositionOperator());
		eventHandlerOpEClass.getESuperTypes().add(this.getEventBasedOperator());
		conditionOpEClass.getESuperTypes().add(this.getEventBasedOperator());
		compositionOperatorEClass.getESuperTypes().add(this.getOperator());
		robotEClass.getESuperTypes().add(this.getNamedElement());
		eventEClass.getESuperTypes().add(this.getNamedElement());
		delegateOpEClass.getESuperTypes().add(this.getOperator());
		actionEClass.getESuperTypes().add(this.getNamedElement());
		movementPatternsEClass.getESuperTypes().add(this.getTasks());
		visitEClass.getESuperTypes().add(this.getMovementPatterns());
		sequencedVisitEClass.getESuperTypes().add(this.getMovementPatterns());
		orderderVisitEClass.getESuperTypes().add(this.getMovementPatterns());
		strictOrderedVisitEClass.getESuperTypes().add(this.getMovementPatterns());
		fairVisitEClass.getESuperTypes().add(this.getMovementPatterns());
		patrollingEClass.getESuperTypes().add(this.getMovementPatterns());
		sequencedPatrollingEClass.getESuperTypes().add(this.getMovementPatterns());
		orderedPatrollingEClass.getESuperTypes().add(this.getMovementPatterns());
		strictOreredPatrollingEClass.getESuperTypes().add(this.getMovementPatterns());
		fairPatrollingEClass.getESuperTypes().add(this.getMovementPatterns());
		avoidancePatternsEClass.getESuperTypes().add(this.getTasks());
		upperRestrictedAvoidanceEClass.getESuperTypes().add(this.getAvoidancePatterns());
		exactRestrictedAvoidanceEClass.getESuperTypes().add(this.getAvoidancePatterns());
		lowerRestrictedAvoidanceEClass.getESuperTypes().add(this.getAvoidancePatterns());
		futureAvoidanceEClass.getESuperTypes().add(this.getAvoidancePatterns());
		globalAvoidanceEClass.getESuperTypes().add(this.getAvoidancePatterns());
		pastAvoidanceEClass.getESuperTypes().add(this.getAvoidancePatterns());
		triggerPatternsEClass.getESuperTypes().add(this.getTasks());
		waitEClass.getESuperTypes().add(this.getTriggerPatterns());
		delayedReactionEClass.getESuperTypes().add(this.getTriggerPatterns());
		instantReactionEClass.getESuperTypes().add(this.getTriggerPatterns());
		locationEClass.getESuperTypes().add(this.getNamedElement());
		simpleActionEClass.getESuperTypes().add(this.getTasks());
		taskCombinationOpEClass.getESuperTypes().add(this.getCompositionOperator());
		eventBasedOperatorEClass.getESuperTypes().add(this.getCompositionOperator());
		checkEClass.getESuperTypes().add(this.getMovementPatterns());
		checkAndDeliverEClass.getESuperTypes().add(this.getMovementPatterns());
		checkSuppliesEClass.getESuperTypes().add(this.getMovementPatterns());
		checkAndDeliverQChEClass.getESuperTypes().add(this.getMovementPatterns());
		testITAAPAsEClass.getESuperTypes().add(this.getMovementPatterns());

		// Initialize classes, features, and operations; add parameters
		initEClass(operatorEClass, Operator.class, "Operator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperator_Parent(), this.getCompositionOperator(), this.getCompositionOperator_InputOperators(), "parent", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOperator_EventAssigned(), this.getEventAssignment(), this.getEventAssignment_InputOperators(), "eventAssigned", null, 0, 1, Operator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fallBackOpEClass, FallBackOp.class, "FallBackOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequenceOpEClass, SequenceOp.class, "SequenceOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(parallelOpEClass, ParallelOp.class, "ParallelOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParallelOp_InputRobots(), this.getRobot(), null, "inputRobots", null, 0, -1, ParallelOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventHandlerOpEClass, EventHandlerOp.class, "EventHandlerOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conditionOpEClass, ConditionOp.class, "ConditionOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(missionEClass, Mission.class, "Mission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMission_Operator(), this.getOperator(), null, "operator", null, 0, -1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMission_Robots(), this.getRobot(), null, "robots", null, 1, -1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMission_Actions(), this.getAction(), null, "actions", null, 0, -1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMission_Events(), this.getEvent(), null, "events", null, 0, -1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMission_Locations(), this.getLocation(), null, "locations", null, 0, -1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMission_Eventassignment(), this.getEventAssignment(), null, "eventassignment", null, 0, -1, Mission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tasksEClass, Tasks.class, "Tasks", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(compositionOperatorEClass, CompositionOperator.class, "CompositionOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompositionOperator_InputOperators(), this.getOperator(), this.getOperator_Parent(), "inputOperators", null, 0, -1, CompositionOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(robotEClass, Robot.class, "Robot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvent_Description(), ecorePackage.getEString(), "description", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delegateOpEClass, DelegateOp.class, "DelegateOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDelegateOp_Task(), this.getTasks(), null, "task", null, 1, 1, DelegateOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelegateOp_InputAction(), this.getAction(), null, "inputAction", null, 0, -1, DelegateOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelegateOp_StoppingEvent(), this.getEvent(), null, "stoppingEvent", null, 0, -1, DelegateOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelegateOp_InputLocations(), this.getLocation(), null, "inputLocations", null, 0, -1, DelegateOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDelegateOp_InputResource(), this.getAction(), null, "inputResource", null, 0, -1, DelegateOp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Description(), ecorePackage.getEString(), "description", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(movementPatternsEClass, MovementPatterns.class, "MovementPatterns", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(visitEClass, Visit.class, "Visit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequencedVisitEClass, SequencedVisit.class, "SequencedVisit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orderderVisitEClass, OrderderVisit.class, "OrderderVisit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strictOrderedVisitEClass, StrictOrderedVisit.class, "StrictOrderedVisit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fairVisitEClass, FairVisit.class, "FairVisit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(patrollingEClass, Patrolling.class, "Patrolling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sequencedPatrollingEClass, SequencedPatrolling.class, "SequencedPatrolling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(orderedPatrollingEClass, OrderedPatrolling.class, "OrderedPatrolling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(strictOreredPatrollingEClass, StrictOreredPatrolling.class, "StrictOreredPatrolling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fairPatrollingEClass, FairPatrolling.class, "FairPatrolling", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(avoidancePatternsEClass, AvoidancePatterns.class, "AvoidancePatterns", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(upperRestrictedAvoidanceEClass, UpperRestrictedAvoidance.class, "UpperRestrictedAvoidance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(exactRestrictedAvoidanceEClass, ExactRestrictedAvoidance.class, "ExactRestrictedAvoidance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lowerRestrictedAvoidanceEClass, LowerRestrictedAvoidance.class, "LowerRestrictedAvoidance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(futureAvoidanceEClass, FutureAvoidance.class, "FutureAvoidance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(globalAvoidanceEClass, GlobalAvoidance.class, "GlobalAvoidance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pastAvoidanceEClass, PastAvoidance.class, "PastAvoidance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(triggerPatternsEClass, TriggerPatterns.class, "TriggerPatterns", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(waitEClass, Wait.class, "Wait", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWait_Description(), ecorePackage.getEString(), "description", null, 0, 1, Wait.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(delayedReactionEClass, DelayedReaction.class, "DelayedReaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDelayedReaction_Description(), ecorePackage.getEString(), "description", null, 0, 1, DelayedReaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instantReactionEClass, InstantReaction.class, "InstantReaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstantReaction_Description(), ecorePackage.getEString(), "description", null, 0, 1, InstantReaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(locationEClass, Location.class, "Location", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleActionEClass, SimpleAction.class, "SimpleAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(taskCombinationOpEClass, TaskCombinationOp.class, "TaskCombinationOp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eventAssignmentEClass, EventAssignment.class, "EventAssignment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventAssignment_InputEvent(), this.getEvent(), null, "inputEvent", null, 0, 1, EventAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventAssignment_InputOperators(), this.getOperator(), this.getOperator_EventAssigned(), "inputOperators", null, 0, 1, EventAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEventAssignment_Parent_event(), this.getEventBasedOperator(), this.getEventBasedOperator_InputEvents(), "parent_event", null, 0, 1, EventAssignment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventBasedOperatorEClass, EventBasedOperator.class, "EventBasedOperator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEventBasedOperator_InputEvents(), this.getEventAssignment(), this.getEventAssignment_Parent_event(), "inputEvents", null, 0, -1, EventBasedOperator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(checkEClass, Check.class, "Check", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(checkAndDeliverEClass, CheckAndDeliver.class, "CheckAndDeliver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(checkSuppliesEClass, CheckSupplies.class, "CheckSupplies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(checkAndDeliverQChEClass, CheckAndDeliverQCh.class, "CheckAndDeliverQCh", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(testITAAPAsEClass, TestITAAPAs.class, "TestITAAPAs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PromisePackageImpl
