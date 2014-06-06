/**
 */
package edu.thu.ggxx.hellobrazil.wc2014.impl;

import edu.thu.ggxx.hellobrazil.wc2014.Match;
import edu.thu.ggxx.hellobrazil.wc2014.Team;
import edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.impl.MatchImpl#getHome <em>Home</em>}</li>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.impl.MatchImpl#getAway <em>Away</em>}</li>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.impl.MatchImpl#getId <em>Id</em>}</li>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.impl.MatchImpl#getMatchDate <em>Match Date</em>}</li>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.impl.MatchImpl#getScores <em>Scores</em>}</li>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.impl.MatchImpl#getStadium <em>Stadium</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatchImpl extends CDOObjectImpl implements Match {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wc2014Package.Literals.MATCH;
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
	public Team getHome() {
		return (Team)eGet(Wc2014Package.Literals.MATCH__HOME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHome(Team newHome) {
		eSet(Wc2014Package.Literals.MATCH__HOME, newHome);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getAway() {
		return (Team)eGet(Wc2014Package.Literals.MATCH__AWAY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAway(Team newAway) {
		eSet(Wc2014Package.Literals.MATCH__AWAY, newAway);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eGet(Wc2014Package.Literals.MATCH__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(Wc2014Package.Literals.MATCH__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getMatchDate() {
		return (Date)eGet(Wc2014Package.Literals.MATCH__MATCH_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatchDate(Date newMatchDate) {
		eSet(Wc2014Package.Literals.MATCH__MATCH_DATE, newMatchDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScores() {
		return (String)eGet(Wc2014Package.Literals.MATCH__SCORES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScores(String newScores) {
		eSet(Wc2014Package.Literals.MATCH__SCORES, newScores);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStadium() {
		return (String)eGet(Wc2014Package.Literals.MATCH__STADIUM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStadium(String newStadium) {
		eSet(Wc2014Package.Literals.MATCH__STADIUM, newStadium);
	}

} //MatchImpl
