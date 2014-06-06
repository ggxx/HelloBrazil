/**
 */
package edu.thu.ggxx.hellobrazil.wc2014.tests;

import edu.thu.ggxx.hellobrazil.wc2014.Team;
import edu.thu.ggxx.hellobrazil.wc2014.Wc2014Factory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TeamTest extends TestCase {

	/**
	 * The fixture for this Team test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Team fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TeamTest.class);
	}

	/**
	 * Constructs a new Team test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TeamTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Team test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Team fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Team test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Team getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Wc2014Factory.eINSTANCE.createTeam());
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

} //TeamTest
