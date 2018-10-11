/**
 */
package promise.tests;

import junit.textui.TestRunner;

import promise.NotOrderedLocation;
import promise.PromiseFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Not Ordered Location</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NotOrderedLocationTest extends LocationTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NotOrderedLocationTest.class);
	}

	/**
	 * Constructs a new Not Ordered Location test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotOrderedLocationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Not Ordered Location test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NotOrderedLocation getFixture() {
		return (NotOrderedLocation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PromiseFactory.eINSTANCE.createNotOrderedLocation());
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

} //NotOrderedLocationTest
