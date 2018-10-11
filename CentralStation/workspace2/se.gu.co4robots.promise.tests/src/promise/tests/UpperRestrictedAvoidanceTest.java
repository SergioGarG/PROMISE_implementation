/**
 */
package promise.tests;

import junit.textui.TestRunner;

import promise.PromiseFactory;
import promise.UpperRestrictedAvoidance;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Upper Restricted Avoidance</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UpperRestrictedAvoidanceTest extends AvoidancePatternsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UpperRestrictedAvoidanceTest.class);
	}

	/**
	 * Constructs a new Upper Restricted Avoidance test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperRestrictedAvoidanceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Upper Restricted Avoidance test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UpperRestrictedAvoidance getFixture() {
		return (UpperRestrictedAvoidance)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PromiseFactory.eINSTANCE.createUpperRestrictedAvoidance());
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

} //UpperRestrictedAvoidanceTest
