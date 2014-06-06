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
 * An implementation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.impl.TeamImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.impl.TeamImpl#getAtGroup <em>At Group</em>}</li>
 *   <li>{@link edu.thu.ggxx.hellobrazil.wc2014.impl.TeamImpl#getFlag <em>Flag</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TeamImpl extends CDOObjectImpl implements Team {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Wc2014Package.Literals.TEAM;
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
	public String getCountry() {
		return (String)eGet(Wc2014Package.Literals.TEAM__COUNTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		eSet(Wc2014Package.Literals.TEAM__COUNTRY, newCountry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group getAtGroup() {
		return (Group)eGet(Wc2014Package.Literals.TEAM__AT_GROUP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAtGroup(Group newAtGroup) {
		eSet(Wc2014Package.Literals.TEAM__AT_GROUP, newAtGroup);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFlag() {
		return (String)eGet(Wc2014Package.Literals.TEAM__FLAG, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlag(String newFlag) {
		eSet(Wc2014Package.Literals.TEAM__FLAG, newFlag);
	}

} //TeamImpl
