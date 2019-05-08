/**
 */
package promise.tests;

import junit.textui.TestRunner;

import promise.PromiseFactory;
import promise.TestITAAPAs;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Test ITAAP As</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TestITAAPAsTest extends MovementPatternsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TestITAAPAsTest.class);
	}

	/**
	 * Constructs a new Test ITAAP As test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestITAAPAsTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Test ITAAP As test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TestITAAPAs getFixture() {
		return (TestITAAPAs)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PromiseFactory.eINSTANCE.createTestITAAPAs());
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

} //TestITAAPAsTest
