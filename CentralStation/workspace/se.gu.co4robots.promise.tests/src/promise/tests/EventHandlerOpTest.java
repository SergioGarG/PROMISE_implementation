/**
 */
package promise.tests;

import junit.textui.TestRunner;

import promise.EventHandlerOp;
import promise.PromiseFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Event Handler Op</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EventHandlerOpTest extends CompositionOperatorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EventHandlerOpTest.class);
	}

	/**
	 * Constructs a new Event Handler Op test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventHandlerOpTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Event Handler Op test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EventHandlerOp getFixture() {
		return (EventHandlerOp)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PromiseFactory.eINSTANCE.createEventHandlerOp());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //EventHandlerOpTest
