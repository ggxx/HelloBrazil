/**
 */
package edu.thu.ggxx.hellobrazil.wc2014.impl;

import edu.thu.ggxx.hellobrazil.wc2014.Group;
import edu.thu.ggxx.hellobrazil.wc2014.Team;
import edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.impl.GroupImpl#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.impl.GroupImpl#getFirstTeam <em>First Team</em>}</li>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.impl.GroupImpl#getSecondTeam <em>Second Team</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupImpl extends CDOObjectImpl implements Group {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wc2014Package.Literals.GROUP;
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
	public String getGroupName() {
		return (String)eGet(Wc2014Package.Literals.GROUP__GROUP_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroupName(String newGroupName) {
		eSet(Wc2014Package.Literals.GROUP__GROUP_NAME, newGroupName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getFirstTeam() {
		return (Team)eGet(Wc2014Package.Literals.GROUP__FIRST_TEAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstTeam(Team newFirstTeam) {
		eSet(Wc2014Package.Literals.GROUP__FIRST_TEAM, newFirstTeam);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getSecondTeam() {
		return (Team)eGet(Wc2014Package.Literals.GROUP__SECOND_TEAM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondTeam(Team newSecondTeam) {
		eSet(Wc2014Package.Literals.GROUP__SECOND_TEAM, newSecondTeam);
	}

} //GroupImpl
