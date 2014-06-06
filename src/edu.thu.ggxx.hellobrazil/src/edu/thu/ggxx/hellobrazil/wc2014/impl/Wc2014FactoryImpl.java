/**
 */
package edu.thu.ggxx.hellobrazil.wc2014.impl;

import edu.thu.ggxx.hellobrazil.wc2014.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Wc2014FactoryImpl extends EFactoryImpl implements Wc2014Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Wc2014Factory init() {
		try {
			Wc2014Factory theWc2014Factory = (Wc2014Factory)EPackage.Registry.INSTANCE.getEFactory(Wc2014Package.eNS_URI);
			if (theWc2014Factory != null) {
				return theWc2014Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Wc2014FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wc2014FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Wc2014Package.WORLD_CUP: return (EObject)createWorldCup();
			case Wc2014Package.TEAM: return (EObject)createTeam();
			case Wc2014Package.MATCH: return (EObject)createMatch();
			case Wc2014Package.GROUP_MATCH: return (EObject)createGroupMatch();
			case Wc2014Package.ELIMINATION_MATCH: return (EObject)createEliminationMatch();
			case Wc2014Package.GROUP: return (EObject)createGroup();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorldCup createWorldCup() {
		WorldCupImpl worldCup = new WorldCupImpl();
		return worldCup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team createTeam() {
		TeamImpl team = new TeamImpl();
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Match createMatch() {
		MatchImpl match = new MatchImpl();
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupMatch createGroupMatch() {
		GroupMatchImpl groupMatch = new GroupMatchImpl();
		return groupMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EliminationMatch createEliminationMatch() {
		EliminationMatchImpl eliminationMatch = new EliminationMatchImpl();
		return eliminationMatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Wc2014Package getWc2014Package() {
		return (Wc2014Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Wc2014Package getPackage() {
		return Wc2014Package.eINSTANCE;
	}

} //Wc2014FactoryImpl
