/**
 */
package edu.thu.ggxx.hellobrazil.wc2014.impl;

import edu.thu.ggxx.hellobrazil.wc2014.EliminationMatch;
import edu.thu.ggxx.hellobrazil.wc2014.Team;
import edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Elimination Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.impl.EliminationMatchImpl#getWinner <em>Winner</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EliminationMatchImpl extends MatchImpl implements EliminationMatch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EliminationMatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wc2014Package.Literals.ELIMINATION_MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getWinner() {
		return (Team)eGet(Wc2014Package.Literals.ELIMINATION_MATCH__WINNER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWinner(Team newWinner) {
		eSet(Wc2014Package.Literals.ELIMINATION_MATCH__WINNER, newWinner);
	}

} //EliminationMatchImpl
