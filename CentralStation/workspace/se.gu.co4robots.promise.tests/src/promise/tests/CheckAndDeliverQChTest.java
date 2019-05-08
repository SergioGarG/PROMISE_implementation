/**
 */
package promise.tests;

import junit.textui.TestRunner;

import promise.CheckAndDeliverQCh;
import promise.PromiseFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Check And Deliver QCh</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CheckAndDeliverQChTest extends MovementPatternsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CheckAndDeliverQChTest.class);
	}

	/**
	 * Constructs a new Check And Deliver QCh test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckAndDeliverQChTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Check And Deliver QCh test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CheckAndDeliverQCh getFixture() {
		return (CheckAndDeliverQCh)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PromiseFactory.eINSTANCE.createCheckAndDeliverQCh());
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

} //CheckAndDeliverQChTest
