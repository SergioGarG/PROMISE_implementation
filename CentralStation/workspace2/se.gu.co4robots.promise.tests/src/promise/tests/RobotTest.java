/**
 */
package promise.tests;

import junit.textui.TestRunner;

import promise.PromiseFactory;
import promise.Robot;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Robot</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RobotTest.class);
	}

	/**
	 * Constructs a new Robot test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Robot test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Robot getFixture() {
		return (Robot)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PromiseFactory.eINSTANCE.createRobot());
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

} //RobotTest
