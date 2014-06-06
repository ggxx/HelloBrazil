/**
 */
package edu.thu.ggxx.hellobrazil.wc2014.impl;

import edu.thu.ggxx.hellobrazil.wc2014.Group;
import edu.thu.ggxx.hellobrazil.wc2014.Match;
import edu.thu.ggxx.hellobrazil.wc2014.Team;
import edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package;
import edu.thu.ggxx.hellobrazil.wc2014.WorldCup;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>World Cup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.impl.WorldCupImpl#getYear <em>Year</em>}</li>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.impl.WorldCupImpl#getTeams <em>Teams</em>}</li>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.impl.WorldCupImpl#getMatches <em>Matches</em>}</li>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.impl.WorldCupImpl#getGroups <em>Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorldCupImpl extends CDOObjectImpl implements WorldCup {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorldCupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wc2014Package.Literals.WORLD_CUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYear() {
		return (Integer)eGet(Wc2014Package.Literals.WORLD_CUP__YEAR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear) {
		eSet(Wc2014Package.Literals.WORLD_CUP__YEAR, newYear);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Team> getTeams() {
		return (EList<Team>)eGet(Wc2014Package.Literals.WORLD_CUP__TEAMS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Match> getMatches() {
		return (EList<Match>)eGet(Wc2014Package.Literals.WORLD_CUP__MATCHES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Group> getGroups() {
		return (EList<Group>)eGet(Wc2014Package.Literals.WORLD_CUP__GROUPS, true);
	}

} //WorldCupImpl
