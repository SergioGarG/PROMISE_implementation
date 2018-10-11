/**
 */
package promise.tests;

import junit.textui.TestRunner;

import promise.DelayedReaction;
import promise.PromiseFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Delayed Reaction</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DelayedReactionTest extends TriggerPatternsTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DelayedReactionTest.class);
	}

	/**
	 * Constructs a new Delayed Reaction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayedReactionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Delayed Reaction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DelayedReaction getFixture() {
		return (DelayedReaction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(PromiseFactory.eINSTANCE.createDelayedReaction());
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

} //DelayedReactionTest
