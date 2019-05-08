/**
 */
package promise.tests;

import junit.textui.TestRunner;

import promise.CheckAndDeliver;
import promise.PromiseFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Check And Deliver</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CheckAndDeliverTest extends MovementPatternsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CheckAndDeliverTest.class);
	}

	/**
	 * Constructs a new Check And Deliver test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckAndDeliverTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Check And Deliver test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CheckAndDeliver getFixture() {
		return (CheckAndDeliver)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PromiseFactory.eINSTANCE.createCheckAndDeliver());
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

} //CheckAndDeliverTest
