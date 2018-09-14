/**
 */
package promise;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see promise.PromiseFactory
 * @model kind="package"
 * @generated
 */
public interface PromisePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "promise";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://gu.se/co4robots.promise";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "co4robots.promise";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PromisePackage eINSTANCE = promise.impl.PromisePackageImpl.init();

	/**
	 * The meta object id for the '{@link promise.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.OperatorImpl
	 * @see promise.impl.PromisePackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Affecting Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__AFFECTING_EVENT = 0;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link promise.impl.CompositionOperatorImpl <em>Composition Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.CompositionOperatorImpl
	 * @see promise.impl.PromisePackageImpl#getCompositionOperator()
	 * @generated
	 */
	int COMPOSITION_OPERATOR = 8;

	/**
	 * The feature id for the '<em><b>Affecting Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATOR__AFFECTING_EVENT = OPERATOR__AFFECTING_EVENT;

	/**
	 * The feature id for the '<em><b>Input Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATOR__INPUT_OPERATORS = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composition Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATOR_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composition Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATOR_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.FallBackOpImpl <em>Fall Back Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.FallBackOpImpl
	 * @see promise.impl.PromisePackageImpl#getFallBackOp()
	 * @generated
	 */
	int FALL_BACK_OP = 1;

	/**
	 * The feature id for the '<em><b>Affecting Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALL_BACK_OP__AFFECTING_EVENT = COMPOSITION_OPERATOR__AFFECTING_EVENT;

	/**
	 * The feature id for the '<em><b>Input Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALL_BACK_OP__INPUT_OPERATORS = COMPOSITION_OPERATOR__INPUT_OPERATORS;

	/**
	 * The number of structural features of the '<em>Fall Back Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALL_BACK_OP_FEATURE_COUNT = COMPOSITION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fall Back Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FALL_BACK_OP_OPERATION_COUNT = COMPOSITION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.SequenceOpImpl <em>Sequence Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.SequenceOpImpl
	 * @see promise.impl.PromisePackageImpl#getSequenceOp()
	 * @generated
	 */
	int SEQUENCE_OP = 2;

	/**
	 * The feature id for the '<em><b>Affecting Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OP__AFFECTING_EVENT = COMPOSITION_OPERATOR__AFFECTING_EVENT;

	/**
	 * The feature id for the '<em><b>Input Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OP__INPUT_OPERATORS = COMPOSITION_OPERATOR__INPUT_OPERATORS;

	/**
	 * The number of structural features of the '<em>Sequence Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OP_FEATURE_COUNT = COMPOSITION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sequence Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OP_OPERATION_COUNT = COMPOSITION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.ParallelOpImpl <em>Parallel Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.ParallelOpImpl
	 * @see promise.impl.PromisePackageImpl#getParallelOp()
	 * @generated
	 */
	int PARALLEL_OP = 3;

	/**
	 * The feature id for the '<em><b>Affecting Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_OP__AFFECTING_EVENT = COMPOSITION_OPERATOR__AFFECTING_EVENT;

	/**
	 * The feature id for the '<em><b>Input Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_OP__INPUT_OPERATORS = COMPOSITION_OPERATOR__INPUT_OPERATORS;

	/**
	 * The number of structural features of the '<em>Parallel Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_OP_FEATURE_COUNT = COMPOSITION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Parallel Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLEL_OP_OPERATION_COUNT = COMPOSITION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.EventHandlerOpImpl <em>Event Handler Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.EventHandlerOpImpl
	 * @see promise.impl.PromisePackageImpl#getEventHandlerOp()
	 * @generated
	 */
	int EVENT_HANDLER_OP = 4;

	/**
	 * The feature id for the '<em><b>Affecting Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER_OP__AFFECTING_EVENT = COMPOSITION_OPERATOR__AFFECTING_EVENT;

	/**
	 * The feature id for the '<em><b>Input Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER_OP__INPUT_OPERATORS = COMPOSITION_OPERATOR__INPUT_OPERATORS;

	/**
	 * The feature id for the '<em><b>Input Observed Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER_OP__INPUT_OBSERVED_EVENTS = COMPOSITION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Handler Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER_OP_FEATURE_COUNT = COMPOSITION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event Handler Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_HANDLER_OP_OPERATION_COUNT = COMPOSITION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.ConditionOpImpl <em>Condition Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.ConditionOpImpl
	 * @see promise.impl.PromisePackageImpl#getConditionOp()
	 * @generated
	 */
	int CONDITION_OP = 5;

	/**
	 * The feature id for the '<em><b>Affecting Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OP__AFFECTING_EVENT = COMPOSITION_OPERATOR__AFFECTING_EVENT;

	/**
	 * The feature id for the '<em><b>Input Operators</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OP__INPUT_OPERATORS = COMPOSITION_OPERATOR__INPUT_OPERATORS;

	/**
	 * The feature id for the '<em><b>Input Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OP__INPUT_EVENTS = COMPOSITION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Condition Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OP_FEATURE_COUNT = COMPOSITION_OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Condition Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OP_OPERATION_COUNT = COMPOSITION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.MissionImpl <em>Mission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.MissionImpl
	 * @see promise.impl.PromisePackageImpl#getMission()
	 * @generated
	 */
	int MISSION = 6;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__CONDITIONS = 1;

	/**
	 * The feature id for the '<em><b>Robots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__ROBOTS = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION__LOCATION = 3;

	/**
	 * The number of structural features of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Mission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link promise.impl.PatternImpl <em>Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.PatternImpl
	 * @see promise.impl.PromisePackageImpl#getPattern()
	 * @generated
	 */
	int PATTERN = 7;

	/**
	 * The number of structural features of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATTERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link promise.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.NamedElementImpl
	 * @see promise.impl.PromisePackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link promise.impl.RobotImpl <em>Robot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.RobotImpl
	 * @see promise.impl.PromisePackageImpl#getRobot()
	 * @generated
	 */
	int ROBOT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Robot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROBOT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.ConditionImpl
	 * @see promise.impl.PromisePackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.EventImpl
	 * @see promise.impl.PromisePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__DESCRIPTION = CONDITION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.LocationImpl
	 * @see promise.impl.PromisePackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.DelegateOpImpl <em>Delegate Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.DelegateOpImpl
	 * @see promise.impl.PromisePackageImpl#getDelegateOp()
	 * @generated
	 */
	int DELEGATE_OP = 13;

	/**
	 * The feature id for the '<em><b>Affecting Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_OP__AFFECTING_EVENT = OPERATOR__AFFECTING_EVENT;

	/**
	 * The feature id for the '<em><b>Input Locations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_OP__INPUT_LOCATIONS = OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Robot</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_OP__INPUT_ROBOT = OPERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_OP__PATTERN = OPERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Input Action</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_OP__INPUT_ACTION = OPERATOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Stopping Event</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_OP__STOPPING_EVENT = OPERATOR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Delegate Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_OP_FEATURE_COUNT = OPERATOR_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Delegate Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELEGATE_OP_OPERATION_COUNT = OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.ActionImpl
	 * @see promise.impl.PromisePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = CONDITION__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DESCRIPTION = CONDITION__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.MovementPatternsImpl <em>Movement Patterns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.MovementPatternsImpl
	 * @see promise.impl.PromisePackageImpl#getMovementPatterns()
	 * @generated
	 */
	int MOVEMENT_PATTERNS = 16;

	/**
	 * The number of structural features of the '<em>Movement Patterns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_PATTERNS_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Movement Patterns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVEMENT_PATTERNS_OPERATION_COUNT = PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.VisitImpl <em>Visit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.VisitImpl
	 * @see promise.impl.PromisePackageImpl#getVisit()
	 * @generated
	 */
	int VISIT = 17;

	/**
	 * The number of structural features of the '<em>Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT_FEATURE_COUNT = MOVEMENT_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISIT_OPERATION_COUNT = MOVEMENT_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.SequencedVisitImpl <em>Sequenced Visit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.SequencedVisitImpl
	 * @see promise.impl.PromisePackageImpl#getSequencedVisit()
	 * @generated
	 */
	int SEQUENCED_VISIT = 18;

	/**
	 * The number of structural features of the '<em>Sequenced Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCED_VISIT_FEATURE_COUNT = MOVEMENT_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sequenced Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCED_VISIT_OPERATION_COUNT = MOVEMENT_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.OrderderVisitImpl <em>Orderder Visit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.OrderderVisitImpl
	 * @see promise.impl.PromisePackageImpl#getOrderderVisit()
	 * @generated
	 */
	int ORDERDER_VISIT = 19;

	/**
	 * The number of structural features of the '<em>Orderder Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERDER_VISIT_FEATURE_COUNT = MOVEMENT_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Orderder Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERDER_VISIT_OPERATION_COUNT = MOVEMENT_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.StrictOrderedVisitImpl <em>Strict Ordered Visit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.StrictOrderedVisitImpl
	 * @see promise.impl.PromisePackageImpl#getStrictOrderedVisit()
	 * @generated
	 */
	int STRICT_ORDERED_VISIT = 20;

	/**
	 * The number of structural features of the '<em>Strict Ordered Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICT_ORDERED_VISIT_FEATURE_COUNT = MOVEMENT_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Strict Ordered Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICT_ORDERED_VISIT_OPERATION_COUNT = MOVEMENT_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.FairVisitImpl <em>Fair Visit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.FairVisitImpl
	 * @see promise.impl.PromisePackageImpl#getFairVisit()
	 * @generated
	 */
	int FAIR_VISIT = 21;

	/**
	 * The number of structural features of the '<em>Fair Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIR_VISIT_FEATURE_COUNT = MOVEMENT_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fair Visit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIR_VISIT_OPERATION_COUNT = MOVEMENT_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.PatrollingImpl <em>Patrolling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.PatrollingImpl
	 * @see promise.impl.PromisePackageImpl#getPatrolling()
	 * @generated
	 */
	int PATROLLING = 22;

	/**
	 * The number of structural features of the '<em>Patrolling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATROLLING_FEATURE_COUNT = MOVEMENT_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Patrolling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATROLLING_OPERATION_COUNT = MOVEMENT_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.SequencedPatrollingImpl <em>Sequenced Patrolling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.SequencedPatrollingImpl
	 * @see promise.impl.PromisePackageImpl#getSequencedPatrolling()
	 * @generated
	 */
	int SEQUENCED_PATROLLING = 23;

	/**
	 * The number of structural features of the '<em>Sequenced Patrolling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCED_PATROLLING_FEATURE_COUNT = MOVEMENT_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sequenced Patrolling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCED_PATROLLING_OPERATION_COUNT = MOVEMENT_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.OrderedPatrollingImpl <em>Ordered Patrolling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.OrderedPatrollingImpl
	 * @see promise.impl.PromisePackageImpl#getOrderedPatrolling()
	 * @generated
	 */
	int ORDERED_PATROLLING = 24;

	/**
	 * The number of structural features of the '<em>Ordered Patrolling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_PATROLLING_FEATURE_COUNT = MOVEMENT_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ordered Patrolling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_PATROLLING_OPERATION_COUNT = MOVEMENT_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.StrictOreredPatrollingImpl <em>Strict Orered Patrolling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.StrictOreredPatrollingImpl
	 * @see promise.impl.PromisePackageImpl#getStrictOreredPatrolling()
	 * @generated
	 */
	int STRICT_ORERED_PATROLLING = 25;

	/**
	 * The number of structural features of the '<em>Strict Orered Patrolling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICT_ORERED_PATROLLING_FEATURE_COUNT = MOVEMENT_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Strict Orered Patrolling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRICT_ORERED_PATROLLING_OPERATION_COUNT = MOVEMENT_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.FairPatrollingImpl <em>Fair Patrolling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.FairPatrollingImpl
	 * @see promise.impl.PromisePackageImpl#getFairPatrolling()
	 * @generated
	 */
	int FAIR_PATROLLING = 26;

	/**
	 * The number of structural features of the '<em>Fair Patrolling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIR_PATROLLING_FEATURE_COUNT = MOVEMENT_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fair Patrolling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAIR_PATROLLING_OPERATION_COUNT = MOVEMENT_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.AvoidancePatternsImpl <em>Avoidance Patterns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.AvoidancePatternsImpl
	 * @see promise.impl.PromisePackageImpl#getAvoidancePatterns()
	 * @generated
	 */
	int AVOIDANCE_PATTERNS = 27;

	/**
	 * The number of structural features of the '<em>Avoidance Patterns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOIDANCE_PATTERNS_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Avoidance Patterns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVOIDANCE_PATTERNS_OPERATION_COUNT = PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.UpperRestrictedAvoidanceImpl <em>Upper Restricted Avoidance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.UpperRestrictedAvoidanceImpl
	 * @see promise.impl.PromisePackageImpl#getUpperRestrictedAvoidance()
	 * @generated
	 */
	int UPPER_RESTRICTED_AVOIDANCE = 28;

	/**
	 * The number of structural features of the '<em>Upper Restricted Avoidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_RESTRICTED_AVOIDANCE_FEATURE_COUNT = AVOIDANCE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Upper Restricted Avoidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_RESTRICTED_AVOIDANCE_OPERATION_COUNT = AVOIDANCE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.ExactRestrictedAvoidanceImpl <em>Exact Restricted Avoidance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.ExactRestrictedAvoidanceImpl
	 * @see promise.impl.PromisePackageImpl#getExactRestrictedAvoidance()
	 * @generated
	 */
	int EXACT_RESTRICTED_AVOIDANCE = 29;

	/**
	 * The number of structural features of the '<em>Exact Restricted Avoidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACT_RESTRICTED_AVOIDANCE_FEATURE_COUNT = AVOIDANCE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exact Restricted Avoidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXACT_RESTRICTED_AVOIDANCE_OPERATION_COUNT = AVOIDANCE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.LowerRestrictedAvoidanceImpl <em>Lower Restricted Avoidance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.LowerRestrictedAvoidanceImpl
	 * @see promise.impl.PromisePackageImpl#getLowerRestrictedAvoidance()
	 * @generated
	 */
	int LOWER_RESTRICTED_AVOIDANCE = 30;

	/**
	 * The number of structural features of the '<em>Lower Restricted Avoidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_RESTRICTED_AVOIDANCE_FEATURE_COUNT = AVOIDANCE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Lower Restricted Avoidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOWER_RESTRICTED_AVOIDANCE_OPERATION_COUNT = AVOIDANCE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.FutureAvoidanceImpl <em>Future Avoidance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.FutureAvoidanceImpl
	 * @see promise.impl.PromisePackageImpl#getFutureAvoidance()
	 * @generated
	 */
	int FUTURE_AVOIDANCE = 31;

	/**
	 * The number of structural features of the '<em>Future Avoidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE_AVOIDANCE_FEATURE_COUNT = AVOIDANCE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Future Avoidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUTURE_AVOIDANCE_OPERATION_COUNT = AVOIDANCE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.GlobalAvoidanceImpl <em>Global Avoidance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.GlobalAvoidanceImpl
	 * @see promise.impl.PromisePackageImpl#getGlobalAvoidance()
	 * @generated
	 */
	int GLOBAL_AVOIDANCE = 32;

	/**
	 * The number of structural features of the '<em>Global Avoidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_AVOIDANCE_FEATURE_COUNT = AVOIDANCE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Global Avoidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_AVOIDANCE_OPERATION_COUNT = AVOIDANCE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.PastAvoidanceImpl <em>Past Avoidance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.PastAvoidanceImpl
	 * @see promise.impl.PromisePackageImpl#getPastAvoidance()
	 * @generated
	 */
	int PAST_AVOIDANCE = 33;

	/**
	 * The number of structural features of the '<em>Past Avoidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST_AVOIDANCE_FEATURE_COUNT = AVOIDANCE_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Past Avoidance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAST_AVOIDANCE_OPERATION_COUNT = AVOIDANCE_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.TriggerPatternsImpl <em>Trigger Patterns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.TriggerPatternsImpl
	 * @see promise.impl.PromisePackageImpl#getTriggerPatterns()
	 * @generated
	 */
	int TRIGGER_PATTERNS = 34;

	/**
	 * The number of structural features of the '<em>Trigger Patterns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PATTERNS_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trigger Patterns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_PATTERNS_OPERATION_COUNT = PATTERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.WaitImpl <em>Wait</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.WaitImpl
	 * @see promise.impl.PromisePackageImpl#getWait()
	 * @generated
	 */
	int WAIT = 35;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT__DESCRIPTION = TRIGGER_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_FEATURE_COUNT = TRIGGER_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Wait</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WAIT_OPERATION_COUNT = TRIGGER_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.DelayedReactionImpl <em>Delayed Reaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.DelayedReactionImpl
	 * @see promise.impl.PromisePackageImpl#getDelayedReaction()
	 * @generated
	 */
	int DELAYED_REACTION = 36;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_REACTION__DESCRIPTION = TRIGGER_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Delayed Reaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_REACTION_FEATURE_COUNT = TRIGGER_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Delayed Reaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELAYED_REACTION_OPERATION_COUNT = TRIGGER_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.InstantReactionImpl <em>Instant Reaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.InstantReactionImpl
	 * @see promise.impl.PromisePackageImpl#getInstantReaction()
	 * @generated
	 */
	int INSTANT_REACTION = 37;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_REACTION__DESCRIPTION = TRIGGER_PATTERNS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instant Reaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_REACTION_FEATURE_COUNT = TRIGGER_PATTERNS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instant Reaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANT_REACTION_OPERATION_COUNT = TRIGGER_PATTERNS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.ContextImpl <em>Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.ContextImpl
	 * @see promise.impl.PromisePackageImpl#getContext()
	 * @generated
	 */
	int CONTEXT = 38;

	/**
	 * The feature id for the '<em><b>Robot</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__ROBOT = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT__LOCATION = 1;

	/**
	 * The number of structural features of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link promise.impl.OrderedLocationImpl <em>Ordered Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.OrderedLocationImpl
	 * @see promise.impl.PromisePackageImpl#getOrderedLocation()
	 * @generated
	 */
	int ORDERED_LOCATION = 39;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LOCATION__NAME = LOCATION__NAME;

	/**
	 * The number of structural features of the '<em>Ordered Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LOCATION_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ordered Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_LOCATION_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link promise.impl.NotOrderedLocationImpl <em>Not Ordered Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.NotOrderedLocationImpl
	 * @see promise.impl.PromisePackageImpl#getNotOrderedLocation()
	 * @generated
	 */
	int NOT_ORDERED_LOCATION = 40;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ORDERED_LOCATION__NAME = LOCATION__NAME;

	/**
	 * The number of structural features of the '<em>Not Ordered Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ORDERED_LOCATION_FEATURE_COUNT = LOCATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Not Ordered Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_ORDERED_LOCATION_OPERATION_COUNT = LOCATION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link promise.impl.SimpleActionImpl <em>Simple Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see promise.impl.SimpleActionImpl
	 * @see promise.impl.PromisePackageImpl#getSimpleAction()
	 * @generated
	 */
	int SIMPLE_ACTION = 41;

	/**
	 * The number of structural features of the '<em>Simple Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTION_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ACTION_OPERATION_COUNT = PATTERN_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link promise.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see promise.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the reference list '{@link promise.Operator#getAffectingEvent <em>Affecting Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Affecting Event</em>'.
	 * @see promise.Operator#getAffectingEvent()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_AffectingEvent();

	/**
	 * Returns the meta object for class '{@link promise.FallBackOp <em>Fall Back Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fall Back Op</em>'.
	 * @see promise.FallBackOp
	 * @generated
	 */
	EClass getFallBackOp();

	/**
	 * Returns the meta object for class '{@link promise.SequenceOp <em>Sequence Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Op</em>'.
	 * @see promise.SequenceOp
	 * @generated
	 */
	EClass getSequenceOp();

	/**
	 * Returns the meta object for class '{@link promise.ParallelOp <em>Parallel Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallel Op</em>'.
	 * @see promise.ParallelOp
	 * @generated
	 */
	EClass getParallelOp();

	/**
	 * Returns the meta object for class '{@link promise.EventHandlerOp <em>Event Handler Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Handler Op</em>'.
	 * @see promise.EventHandlerOp
	 * @generated
	 */
	EClass getEventHandlerOp();

	/**
	 * Returns the meta object for the reference list '{@link promise.EventHandlerOp#getInputObservedEvents <em>Input Observed Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Observed Events</em>'.
	 * @see promise.EventHandlerOp#getInputObservedEvents()
	 * @see #getEventHandlerOp()
	 * @generated
	 */
	EReference getEventHandlerOp_InputObservedEvents();

	/**
	 * Returns the meta object for class '{@link promise.ConditionOp <em>Condition Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Op</em>'.
	 * @see promise.ConditionOp
	 * @generated
	 */
	EClass getConditionOp();

	/**
	 * Returns the meta object for the reference list '{@link promise.ConditionOp#getInputEvents <em>Input Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Events</em>'.
	 * @see promise.ConditionOp#getInputEvents()
	 * @see #getConditionOp()
	 * @generated
	 */
	EReference getConditionOp_InputEvents();

	/**
	 * Returns the meta object for class '{@link promise.Mission <em>Mission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mission</em>'.
	 * @see promise.Mission
	 * @generated
	 */
	EClass getMission();

	/**
	 * Returns the meta object for the containment reference list '{@link promise.Mission#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operator</em>'.
	 * @see promise.Mission#getOperator()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_Operator();

	/**
	 * Returns the meta object for the containment reference list '{@link promise.Mission#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see promise.Mission#getConditions()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_Conditions();

	/**
	 * Returns the meta object for the containment reference list '{@link promise.Mission#getRobots <em>Robots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Robots</em>'.
	 * @see promise.Mission#getRobots()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_Robots();

	/**
	 * Returns the meta object for the containment reference list '{@link promise.Mission#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location</em>'.
	 * @see promise.Mission#getLocation()
	 * @see #getMission()
	 * @generated
	 */
	EReference getMission_Location();

	/**
	 * Returns the meta object for class '{@link promise.Pattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pattern</em>'.
	 * @see promise.Pattern
	 * @generated
	 */
	EClass getPattern();

	/**
	 * Returns the meta object for class '{@link promise.CompositionOperator <em>Composition Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition Operator</em>'.
	 * @see promise.CompositionOperator
	 * @generated
	 */
	EClass getCompositionOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link promise.CompositionOperator#getInputOperators <em>Input Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Operators</em>'.
	 * @see promise.CompositionOperator#getInputOperators()
	 * @see #getCompositionOperator()
	 * @generated
	 */
	EReference getCompositionOperator_InputOperators();

	/**
	 * Returns the meta object for class '{@link promise.Robot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Robot</em>'.
	 * @see promise.Robot
	 * @generated
	 */
	EClass getRobot();

	/**
	 * Returns the meta object for class '{@link promise.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see promise.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link promise.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see promise.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link promise.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see promise.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for class '{@link promise.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see promise.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for class '{@link promise.DelegateOp <em>Delegate Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delegate Op</em>'.
	 * @see promise.DelegateOp
	 * @generated
	 */
	EClass getDelegateOp();

	/**
	 * Returns the meta object for the reference list '{@link promise.DelegateOp#getInputLocations <em>Input Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Locations</em>'.
	 * @see promise.DelegateOp#getInputLocations()
	 * @see #getDelegateOp()
	 * @generated
	 */
	EReference getDelegateOp_InputLocations();

	/**
	 * Returns the meta object for the reference list '{@link promise.DelegateOp#getInputRobot <em>Input Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Robot</em>'.
	 * @see promise.DelegateOp#getInputRobot()
	 * @see #getDelegateOp()
	 * @generated
	 */
	EReference getDelegateOp_InputRobot();

	/**
	 * Returns the meta object for the containment reference '{@link promise.DelegateOp#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pattern</em>'.
	 * @see promise.DelegateOp#getPattern()
	 * @see #getDelegateOp()
	 * @generated
	 */
	EReference getDelegateOp_Pattern();

	/**
	 * Returns the meta object for the reference list '{@link promise.DelegateOp#getInputAction <em>Input Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Action</em>'.
	 * @see promise.DelegateOp#getInputAction()
	 * @see #getDelegateOp()
	 * @generated
	 */
	EReference getDelegateOp_InputAction();

	/**
	 * Returns the meta object for the reference list '{@link promise.DelegateOp#getStoppingEvent <em>Stopping Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stopping Event</em>'.
	 * @see promise.DelegateOp#getStoppingEvent()
	 * @see #getDelegateOp()
	 * @generated
	 */
	EReference getDelegateOp_StoppingEvent();

	/**
	 * Returns the meta object for class '{@link promise.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see promise.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link promise.Condition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see promise.Condition#getDescription()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Description();

	/**
	 * Returns the meta object for class '{@link promise.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see promise.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for class '{@link promise.MovementPatterns <em>Movement Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Movement Patterns</em>'.
	 * @see promise.MovementPatterns
	 * @generated
	 */
	EClass getMovementPatterns();

	/**
	 * Returns the meta object for class '{@link promise.Visit <em>Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visit</em>'.
	 * @see promise.Visit
	 * @generated
	 */
	EClass getVisit();

	/**
	 * Returns the meta object for class '{@link promise.SequencedVisit <em>Sequenced Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequenced Visit</em>'.
	 * @see promise.SequencedVisit
	 * @generated
	 */
	EClass getSequencedVisit();

	/**
	 * Returns the meta object for class '{@link promise.OrderderVisit <em>Orderder Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orderder Visit</em>'.
	 * @see promise.OrderderVisit
	 * @generated
	 */
	EClass getOrderderVisit();

	/**
	 * Returns the meta object for class '{@link promise.StrictOrderedVisit <em>Strict Ordered Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strict Ordered Visit</em>'.
	 * @see promise.StrictOrderedVisit
	 * @generated
	 */
	EClass getStrictOrderedVisit();

	/**
	 * Returns the meta object for class '{@link promise.FairVisit <em>Fair Visit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fair Visit</em>'.
	 * @see promise.FairVisit
	 * @generated
	 */
	EClass getFairVisit();

	/**
	 * Returns the meta object for class '{@link promise.Patrolling <em>Patrolling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patrolling</em>'.
	 * @see promise.Patrolling
	 * @generated
	 */
	EClass getPatrolling();

	/**
	 * Returns the meta object for class '{@link promise.SequencedPatrolling <em>Sequenced Patrolling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequenced Patrolling</em>'.
	 * @see promise.SequencedPatrolling
	 * @generated
	 */
	EClass getSequencedPatrolling();

	/**
	 * Returns the meta object for class '{@link promise.OrderedPatrolling <em>Ordered Patrolling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Patrolling</em>'.
	 * @see promise.OrderedPatrolling
	 * @generated
	 */
	EClass getOrderedPatrolling();

	/**
	 * Returns the meta object for class '{@link promise.StrictOreredPatrolling <em>Strict Orered Patrolling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strict Orered Patrolling</em>'.
	 * @see promise.StrictOreredPatrolling
	 * @generated
	 */
	EClass getStrictOreredPatrolling();

	/**
	 * Returns the meta object for class '{@link promise.FairPatrolling <em>Fair Patrolling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fair Patrolling</em>'.
	 * @see promise.FairPatrolling
	 * @generated
	 */
	EClass getFairPatrolling();

	/**
	 * Returns the meta object for class '{@link promise.AvoidancePatterns <em>Avoidance Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Avoidance Patterns</em>'.
	 * @see promise.AvoidancePatterns
	 * @generated
	 */
	EClass getAvoidancePatterns();

	/**
	 * Returns the meta object for class '{@link promise.UpperRestrictedAvoidance <em>Upper Restricted Avoidance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Upper Restricted Avoidance</em>'.
	 * @see promise.UpperRestrictedAvoidance
	 * @generated
	 */
	EClass getUpperRestrictedAvoidance();

	/**
	 * Returns the meta object for class '{@link promise.ExactRestrictedAvoidance <em>Exact Restricted Avoidance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exact Restricted Avoidance</em>'.
	 * @see promise.ExactRestrictedAvoidance
	 * @generated
	 */
	EClass getExactRestrictedAvoidance();

	/**
	 * Returns the meta object for class '{@link promise.LowerRestrictedAvoidance <em>Lower Restricted Avoidance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lower Restricted Avoidance</em>'.
	 * @see promise.LowerRestrictedAvoidance
	 * @generated
	 */
	EClass getLowerRestrictedAvoidance();

	/**
	 * Returns the meta object for class '{@link promise.FutureAvoidance <em>Future Avoidance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Future Avoidance</em>'.
	 * @see promise.FutureAvoidance
	 * @generated
	 */
	EClass getFutureAvoidance();

	/**
	 * Returns the meta object for class '{@link promise.GlobalAvoidance <em>Global Avoidance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Avoidance</em>'.
	 * @see promise.GlobalAvoidance
	 * @generated
	 */
	EClass getGlobalAvoidance();

	/**
	 * Returns the meta object for class '{@link promise.PastAvoidance <em>Past Avoidance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Past Avoidance</em>'.
	 * @see promise.PastAvoidance
	 * @generated
	 */
	EClass getPastAvoidance();

	/**
	 * Returns the meta object for class '{@link promise.TriggerPatterns <em>Trigger Patterns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger Patterns</em>'.
	 * @see promise.TriggerPatterns
	 * @generated
	 */
	EClass getTriggerPatterns();

	/**
	 * Returns the meta object for class '{@link promise.Wait <em>Wait</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Wait</em>'.
	 * @see promise.Wait
	 * @generated
	 */
	EClass getWait();

	/**
	 * Returns the meta object for the attribute '{@link promise.Wait#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see promise.Wait#getDescription()
	 * @see #getWait()
	 * @generated
	 */
	EAttribute getWait_Description();

	/**
	 * Returns the meta object for class '{@link promise.DelayedReaction <em>Delayed Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delayed Reaction</em>'.
	 * @see promise.DelayedReaction
	 * @generated
	 */
	EClass getDelayedReaction();

	/**
	 * Returns the meta object for the attribute '{@link promise.DelayedReaction#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see promise.DelayedReaction#getDescription()
	 * @see #getDelayedReaction()
	 * @generated
	 */
	EAttribute getDelayedReaction_Description();

	/**
	 * Returns the meta object for class '{@link promise.InstantReaction <em>Instant Reaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instant Reaction</em>'.
	 * @see promise.InstantReaction
	 * @generated
	 */
	EClass getInstantReaction();

	/**
	 * Returns the meta object for the attribute '{@link promise.InstantReaction#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see promise.InstantReaction#getDescription()
	 * @see #getInstantReaction()
	 * @generated
	 */
	EAttribute getInstantReaction_Description();

	/**
	 * Returns the meta object for class '{@link promise.Context <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context</em>'.
	 * @see promise.Context
	 * @generated
	 */
	EClass getContext();

	/**
	 * Returns the meta object for the containment reference list '{@link promise.Context#getRobot <em>Robot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Robot</em>'.
	 * @see promise.Context#getRobot()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Robot();

	/**
	 * Returns the meta object for the containment reference list '{@link promise.Context#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Location</em>'.
	 * @see promise.Context#getLocation()
	 * @see #getContext()
	 * @generated
	 */
	EReference getContext_Location();

	/**
	 * Returns the meta object for class '{@link promise.OrderedLocation <em>Ordered Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Location</em>'.
	 * @see promise.OrderedLocation
	 * @generated
	 */
	EClass getOrderedLocation();

	/**
	 * Returns the meta object for class '{@link promise.NotOrderedLocation <em>Not Ordered Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Ordered Location</em>'.
	 * @see promise.NotOrderedLocation
	 * @generated
	 */
	EClass getNotOrderedLocation();

	/**
	 * Returns the meta object for class '{@link promise.SimpleAction <em>Simple Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Action</em>'.
	 * @see promise.SimpleAction
	 * @generated
	 */
	EClass getSimpleAction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PromiseFactory getPromiseFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link promise.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.OperatorImpl
		 * @see promise.impl.PromisePackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Affecting Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__AFFECTING_EVENT = eINSTANCE.getOperator_AffectingEvent();

		/**
		 * The meta object literal for the '{@link promise.impl.FallBackOpImpl <em>Fall Back Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.FallBackOpImpl
		 * @see promise.impl.PromisePackageImpl#getFallBackOp()
		 * @generated
		 */
		EClass FALL_BACK_OP = eINSTANCE.getFallBackOp();

		/**
		 * The meta object literal for the '{@link promise.impl.SequenceOpImpl <em>Sequence Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.SequenceOpImpl
		 * @see promise.impl.PromisePackageImpl#getSequenceOp()
		 * @generated
		 */
		EClass SEQUENCE_OP = eINSTANCE.getSequenceOp();

		/**
		 * The meta object literal for the '{@link promise.impl.ParallelOpImpl <em>Parallel Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.ParallelOpImpl
		 * @see promise.impl.PromisePackageImpl#getParallelOp()
		 * @generated
		 */
		EClass PARALLEL_OP = eINSTANCE.getParallelOp();

		/**
		 * The meta object literal for the '{@link promise.impl.EventHandlerOpImpl <em>Event Handler Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.EventHandlerOpImpl
		 * @see promise.impl.PromisePackageImpl#getEventHandlerOp()
		 * @generated
		 */
		EClass EVENT_HANDLER_OP = eINSTANCE.getEventHandlerOp();

		/**
		 * The meta object literal for the '<em><b>Input Observed Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_HANDLER_OP__INPUT_OBSERVED_EVENTS = eINSTANCE.getEventHandlerOp_InputObservedEvents();

		/**
		 * The meta object literal for the '{@link promise.impl.ConditionOpImpl <em>Condition Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.ConditionOpImpl
		 * @see promise.impl.PromisePackageImpl#getConditionOp()
		 * @generated
		 */
		EClass CONDITION_OP = eINSTANCE.getConditionOp();

		/**
		 * The meta object literal for the '<em><b>Input Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_OP__INPUT_EVENTS = eINSTANCE.getConditionOp_InputEvents();

		/**
		 * The meta object literal for the '{@link promise.impl.MissionImpl <em>Mission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.MissionImpl
		 * @see promise.impl.PromisePackageImpl#getMission()
		 * @generated
		 */
		EClass MISSION = eINSTANCE.getMission();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__OPERATOR = eINSTANCE.getMission_Operator();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__CONDITIONS = eINSTANCE.getMission_Conditions();

		/**
		 * The meta object literal for the '<em><b>Robots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__ROBOTS = eINSTANCE.getMission_Robots();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MISSION__LOCATION = eINSTANCE.getMission_Location();

		/**
		 * The meta object literal for the '{@link promise.impl.PatternImpl <em>Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.PatternImpl
		 * @see promise.impl.PromisePackageImpl#getPattern()
		 * @generated
		 */
		EClass PATTERN = eINSTANCE.getPattern();

		/**
		 * The meta object literal for the '{@link promise.impl.CompositionOperatorImpl <em>Composition Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.CompositionOperatorImpl
		 * @see promise.impl.PromisePackageImpl#getCompositionOperator()
		 * @generated
		 */
		EClass COMPOSITION_OPERATOR = eINSTANCE.getCompositionOperator();

		/**
		 * The meta object literal for the '<em><b>Input Operators</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITION_OPERATOR__INPUT_OPERATORS = eINSTANCE.getCompositionOperator_InputOperators();

		/**
		 * The meta object literal for the '{@link promise.impl.RobotImpl <em>Robot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.RobotImpl
		 * @see promise.impl.PromisePackageImpl#getRobot()
		 * @generated
		 */
		EClass ROBOT = eINSTANCE.getRobot();

		/**
		 * The meta object literal for the '{@link promise.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.NamedElementImpl
		 * @see promise.impl.PromisePackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link promise.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.EventImpl
		 * @see promise.impl.PromisePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '{@link promise.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.LocationImpl
		 * @see promise.impl.PromisePackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '{@link promise.impl.DelegateOpImpl <em>Delegate Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.DelegateOpImpl
		 * @see promise.impl.PromisePackageImpl#getDelegateOp()
		 * @generated
		 */
		EClass DELEGATE_OP = eINSTANCE.getDelegateOp();

		/**
		 * The meta object literal for the '<em><b>Input Locations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATE_OP__INPUT_LOCATIONS = eINSTANCE.getDelegateOp_InputLocations();

		/**
		 * The meta object literal for the '<em><b>Input Robot</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATE_OP__INPUT_ROBOT = eINSTANCE.getDelegateOp_InputRobot();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATE_OP__PATTERN = eINSTANCE.getDelegateOp_Pattern();

		/**
		 * The meta object literal for the '<em><b>Input Action</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATE_OP__INPUT_ACTION = eINSTANCE.getDelegateOp_InputAction();

		/**
		 * The meta object literal for the '<em><b>Stopping Event</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELEGATE_OP__STOPPING_EVENT = eINSTANCE.getDelegateOp_StoppingEvent();

		/**
		 * The meta object literal for the '{@link promise.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.ConditionImpl
		 * @see promise.impl.PromisePackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__DESCRIPTION = eINSTANCE.getCondition_Description();

		/**
		 * The meta object literal for the '{@link promise.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.ActionImpl
		 * @see promise.impl.PromisePackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '{@link promise.impl.MovementPatternsImpl <em>Movement Patterns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.MovementPatternsImpl
		 * @see promise.impl.PromisePackageImpl#getMovementPatterns()
		 * @generated
		 */
		EClass MOVEMENT_PATTERNS = eINSTANCE.getMovementPatterns();

		/**
		 * The meta object literal for the '{@link promise.impl.VisitImpl <em>Visit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.VisitImpl
		 * @see promise.impl.PromisePackageImpl#getVisit()
		 * @generated
		 */
		EClass VISIT = eINSTANCE.getVisit();

		/**
		 * The meta object literal for the '{@link promise.impl.SequencedVisitImpl <em>Sequenced Visit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.SequencedVisitImpl
		 * @see promise.impl.PromisePackageImpl#getSequencedVisit()
		 * @generated
		 */
		EClass SEQUENCED_VISIT = eINSTANCE.getSequencedVisit();

		/**
		 * The meta object literal for the '{@link promise.impl.OrderderVisitImpl <em>Orderder Visit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.OrderderVisitImpl
		 * @see promise.impl.PromisePackageImpl#getOrderderVisit()
		 * @generated
		 */
		EClass ORDERDER_VISIT = eINSTANCE.getOrderderVisit();

		/**
		 * The meta object literal for the '{@link promise.impl.StrictOrderedVisitImpl <em>Strict Ordered Visit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.StrictOrderedVisitImpl
		 * @see promise.impl.PromisePackageImpl#getStrictOrderedVisit()
		 * @generated
		 */
		EClass STRICT_ORDERED_VISIT = eINSTANCE.getStrictOrderedVisit();

		/**
		 * The meta object literal for the '{@link promise.impl.FairVisitImpl <em>Fair Visit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.FairVisitImpl
		 * @see promise.impl.PromisePackageImpl#getFairVisit()
		 * @generated
		 */
		EClass FAIR_VISIT = eINSTANCE.getFairVisit();

		/**
		 * The meta object literal for the '{@link promise.impl.PatrollingImpl <em>Patrolling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.PatrollingImpl
		 * @see promise.impl.PromisePackageImpl#getPatrolling()
		 * @generated
		 */
		EClass PATROLLING = eINSTANCE.getPatrolling();

		/**
		 * The meta object literal for the '{@link promise.impl.SequencedPatrollingImpl <em>Sequenced Patrolling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.SequencedPatrollingImpl
		 * @see promise.impl.PromisePackageImpl#getSequencedPatrolling()
		 * @generated
		 */
		EClass SEQUENCED_PATROLLING = eINSTANCE.getSequencedPatrolling();

		/**
		 * The meta object literal for the '{@link promise.impl.OrderedPatrollingImpl <em>Ordered Patrolling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.OrderedPatrollingImpl
		 * @see promise.impl.PromisePackageImpl#getOrderedPatrolling()
		 * @generated
		 */
		EClass ORDERED_PATROLLING = eINSTANCE.getOrderedPatrolling();

		/**
		 * The meta object literal for the '{@link promise.impl.StrictOreredPatrollingImpl <em>Strict Orered Patrolling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.StrictOreredPatrollingImpl
		 * @see promise.impl.PromisePackageImpl#getStrictOreredPatrolling()
		 * @generated
		 */
		EClass STRICT_ORERED_PATROLLING = eINSTANCE.getStrictOreredPatrolling();

		/**
		 * The meta object literal for the '{@link promise.impl.FairPatrollingImpl <em>Fair Patrolling</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.FairPatrollingImpl
		 * @see promise.impl.PromisePackageImpl#getFairPatrolling()
		 * @generated
		 */
		EClass FAIR_PATROLLING = eINSTANCE.getFairPatrolling();

		/**
		 * The meta object literal for the '{@link promise.impl.AvoidancePatternsImpl <em>Avoidance Patterns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.AvoidancePatternsImpl
		 * @see promise.impl.PromisePackageImpl#getAvoidancePatterns()
		 * @generated
		 */
		EClass AVOIDANCE_PATTERNS = eINSTANCE.getAvoidancePatterns();

		/**
		 * The meta object literal for the '{@link promise.impl.UpperRestrictedAvoidanceImpl <em>Upper Restricted Avoidance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.UpperRestrictedAvoidanceImpl
		 * @see promise.impl.PromisePackageImpl#getUpperRestrictedAvoidance()
		 * @generated
		 */
		EClass UPPER_RESTRICTED_AVOIDANCE = eINSTANCE.getUpperRestrictedAvoidance();

		/**
		 * The meta object literal for the '{@link promise.impl.ExactRestrictedAvoidanceImpl <em>Exact Restricted Avoidance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.ExactRestrictedAvoidanceImpl
		 * @see promise.impl.PromisePackageImpl#getExactRestrictedAvoidance()
		 * @generated
		 */
		EClass EXACT_RESTRICTED_AVOIDANCE = eINSTANCE.getExactRestrictedAvoidance();

		/**
		 * The meta object literal for the '{@link promise.impl.LowerRestrictedAvoidanceImpl <em>Lower Restricted Avoidance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.LowerRestrictedAvoidanceImpl
		 * @see promise.impl.PromisePackageImpl#getLowerRestrictedAvoidance()
		 * @generated
		 */
		EClass LOWER_RESTRICTED_AVOIDANCE = eINSTANCE.getLowerRestrictedAvoidance();

		/**
		 * The meta object literal for the '{@link promise.impl.FutureAvoidanceImpl <em>Future Avoidance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.FutureAvoidanceImpl
		 * @see promise.impl.PromisePackageImpl#getFutureAvoidance()
		 * @generated
		 */
		EClass FUTURE_AVOIDANCE = eINSTANCE.getFutureAvoidance();

		/**
		 * The meta object literal for the '{@link promise.impl.GlobalAvoidanceImpl <em>Global Avoidance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.GlobalAvoidanceImpl
		 * @see promise.impl.PromisePackageImpl#getGlobalAvoidance()
		 * @generated
		 */
		EClass GLOBAL_AVOIDANCE = eINSTANCE.getGlobalAvoidance();

		/**
		 * The meta object literal for the '{@link promise.impl.PastAvoidanceImpl <em>Past Avoidance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.PastAvoidanceImpl
		 * @see promise.impl.PromisePackageImpl#getPastAvoidance()
		 * @generated
		 */
		EClass PAST_AVOIDANCE = eINSTANCE.getPastAvoidance();

		/**
		 * The meta object literal for the '{@link promise.impl.TriggerPatternsImpl <em>Trigger Patterns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.TriggerPatternsImpl
		 * @see promise.impl.PromisePackageImpl#getTriggerPatterns()
		 * @generated
		 */
		EClass TRIGGER_PATTERNS = eINSTANCE.getTriggerPatterns();

		/**
		 * The meta object literal for the '{@link promise.impl.WaitImpl <em>Wait</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.WaitImpl
		 * @see promise.impl.PromisePackageImpl#getWait()
		 * @generated
		 */
		EClass WAIT = eINSTANCE.getWait();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WAIT__DESCRIPTION = eINSTANCE.getWait_Description();

		/**
		 * The meta object literal for the '{@link promise.impl.DelayedReactionImpl <em>Delayed Reaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.DelayedReactionImpl
		 * @see promise.impl.PromisePackageImpl#getDelayedReaction()
		 * @generated
		 */
		EClass DELAYED_REACTION = eINSTANCE.getDelayedReaction();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELAYED_REACTION__DESCRIPTION = eINSTANCE.getDelayedReaction_Description();

		/**
		 * The meta object literal for the '{@link promise.impl.InstantReactionImpl <em>Instant Reaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.InstantReactionImpl
		 * @see promise.impl.PromisePackageImpl#getInstantReaction()
		 * @generated
		 */
		EClass INSTANT_REACTION = eINSTANCE.getInstantReaction();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANT_REACTION__DESCRIPTION = eINSTANCE.getInstantReaction_Description();

		/**
		 * The meta object literal for the '{@link promise.impl.ContextImpl <em>Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.ContextImpl
		 * @see promise.impl.PromisePackageImpl#getContext()
		 * @generated
		 */
		EClass CONTEXT = eINSTANCE.getContext();

		/**
		 * The meta object literal for the '<em><b>Robot</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__ROBOT = eINSTANCE.getContext_Robot();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTEXT__LOCATION = eINSTANCE.getContext_Location();

		/**
		 * The meta object literal for the '{@link promise.impl.OrderedLocationImpl <em>Ordered Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.OrderedLocationImpl
		 * @see promise.impl.PromisePackageImpl#getOrderedLocation()
		 * @generated
		 */
		EClass ORDERED_LOCATION = eINSTANCE.getOrderedLocation();

		/**
		 * The meta object literal for the '{@link promise.impl.NotOrderedLocationImpl <em>Not Ordered Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.NotOrderedLocationImpl
		 * @see promise.impl.PromisePackageImpl#getNotOrderedLocation()
		 * @generated
		 */
		EClass NOT_ORDERED_LOCATION = eINSTANCE.getNotOrderedLocation();

		/**
		 * The meta object literal for the '{@link promise.impl.SimpleActionImpl <em>Simple Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see promise.impl.SimpleActionImpl
		 * @see promise.impl.PromisePackageImpl#getSimpleAction()
		 * @generated
		 */
		EClass SIMPLE_ACTION = eINSTANCE.getSimpleAction();

	}

} //PromisePackage
