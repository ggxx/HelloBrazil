/**
 */
package edu.thu.ggxx.hellobrazil.wc2014.tests;

import edu.thu.ggxx.hellobrazil.wc2014.GroupMatch;
import edu.thu.ggxx.hellobrazil.wc2014.Wc2014Factory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Group Match</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GroupMatchTest extends MatchTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GroupMatchTest.class);
	}

	/**
	 * Constructs a new Group Match test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupMatchTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Group Match test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GroupMatch getFixture() {
		return (GroupMatch)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Wc2014Factory.eINSTANCE.createGroupMatch());
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

} //GroupMatchTest
