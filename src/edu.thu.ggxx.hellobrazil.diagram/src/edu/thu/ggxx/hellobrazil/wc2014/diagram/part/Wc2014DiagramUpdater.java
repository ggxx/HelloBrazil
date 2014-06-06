package edu.thu.ggxx.hellobrazil.wc2014.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import edu.thu.ggxx.hellobrazil.wc2014.EliminationMatch;
import edu.thu.ggxx.hellobrazil.wc2014.Group;
import edu.thu.ggxx.hellobrazil.wc2014.GroupMatch;
import edu.thu.ggxx.hellobrazil.wc2014.Match;
import edu.thu.ggxx.hellobrazil.wc2014.Team;
import edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package;
import edu.thu.ggxx.hellobrazil.wc2014.WorldCup;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.EliminationMatchEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.EliminationMatchWinnerEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.GroupEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.GroupFirstTeamEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.GroupMatchEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.GroupSecondTeamEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.MatchAwayEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.MatchHomeEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.TeamAtGroupEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.TeamEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.WorldCupEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.providers.Wc2014ElementTypes;

/**
 * @generated
 */
public class Wc2014DiagramUpdater {

	/**
	 * @generated
	 */
	public static List<Wc2014NodeDescriptor> getSemanticChildren(View view) {
		switch (Wc2014VisualIDRegistry.getVisualID(view)) {
		case WorldCupEditPart.VISUAL_ID:
			return getWorldCup_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Wc2014NodeDescriptor> getWorldCup_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		WorldCup modelElement = (WorldCup) view.getElement();
		LinkedList<Wc2014NodeDescriptor> result = new LinkedList<Wc2014NodeDescriptor>();
		for (Iterator<?> it = modelElement.getMatches().iterator(); it
				.hasNext();) {
			Match childElement = (Match) it.next();
			int visualID = Wc2014VisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == EliminationMatchEditPart.VISUAL_ID) {
				result.add(new Wc2014NodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == GroupMatchEditPart.VISUAL_ID) {
				result.add(new Wc2014NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTeams().iterator(); it.hasNext();) {
			Team childElement = (Team) it.next();
			int visualID = Wc2014VisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == TeamEditPart.VISUAL_ID) {
				result.add(new Wc2014NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getGroups().iterator(); it.hasNext();) {
			Group childElement = (Group) it.next();
			int visualID = Wc2014VisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == GroupEditPart.VISUAL_ID) {
				result.add(new Wc2014NodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Wc2014LinkDescriptor> getContainedLinks(View view) {
		switch (Wc2014VisualIDRegistry.getVisualID(view)) {
		case WorldCupEditPart.VISUAL_ID:
			return getWorldCup_1000ContainedLinks(view);
		case EliminationMatchEditPart.VISUAL_ID:
			return getEliminationMatch_2001ContainedLinks(view);
		case TeamEditPart.VISUAL_ID:
			return getTeam_2002ContainedLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_2003ContainedLinks(view);
		case GroupMatchEditPart.VISUAL_ID:
			return getGroupMatch_2004ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Wc2014LinkDescriptor> getIncomingLinks(View view) {
		switch (Wc2014VisualIDRegistry.getVisualID(view)) {
		case EliminationMatchEditPart.VISUAL_ID:
			return getEliminationMatch_2001IncomingLinks(view);
		case TeamEditPart.VISUAL_ID:
			return getTeam_2002IncomingLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_2003IncomingLinks(view);
		case GroupMatchEditPart.VISUAL_ID:
			return getGroupMatch_2004IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Wc2014LinkDescriptor> getOutgoingLinks(View view) {
		switch (Wc2014VisualIDRegistry.getVisualID(view)) {
		case EliminationMatchEditPart.VISUAL_ID:
			return getEliminationMatch_2001OutgoingLinks(view);
		case TeamEditPart.VISUAL_ID:
			return getTeam_2002OutgoingLinks(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_2003OutgoingLinks(view);
		case GroupMatchEditPart.VISUAL_ID:
			return getGroupMatch_2004OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Wc2014LinkDescriptor> getWorldCup_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Wc2014LinkDescriptor> getEliminationMatch_2001ContainedLinks(
			View view) {
		EliminationMatch modelElement = (EliminationMatch) view.getElement();
		LinkedList<Wc2014LinkDescriptor> result = new LinkedList<Wc2014LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Match_Home_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Match_Away_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_EliminationMatch_Winner_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Wc2014LinkDescriptor> getTeam_2002ContainedLinks(
			View view) {
		Team modelElement = (Team) view.getElement();
		LinkedList<Wc2014LinkDescriptor> result = new LinkedList<Wc2014LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Team_AtGroup_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Wc2014LinkDescriptor> getGroup_2003ContainedLinks(
			View view) {
		Group modelElement = (Group) view.getElement();
		LinkedList<Wc2014LinkDescriptor> result = new LinkedList<Wc2014LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Group_FirstTeam_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Group_SecondTeam_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Wc2014LinkDescriptor> getGroupMatch_2004ContainedLinks(
			View view) {
		GroupMatch modelElement = (GroupMatch) view.getElement();
		LinkedList<Wc2014LinkDescriptor> result = new LinkedList<Wc2014LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Match_Home_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Match_Away_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Wc2014LinkDescriptor> getEliminationMatch_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Wc2014LinkDescriptor> getTeam_2002IncomingLinks(View view) {
		Team modelElement = (Team) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Wc2014LinkDescriptor> result = new LinkedList<Wc2014LinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Group_FirstTeam_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Match_Home_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Group_SecondTeam_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Match_Away_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_EliminationMatch_Winner_4006(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Wc2014LinkDescriptor> getGroup_2003IncomingLinks(
			View view) {
		Group modelElement = (Group) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<Wc2014LinkDescriptor> result = new LinkedList<Wc2014LinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Team_AtGroup_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Wc2014LinkDescriptor> getGroupMatch_2004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<Wc2014LinkDescriptor> getEliminationMatch_2001OutgoingLinks(
			View view) {
		EliminationMatch modelElement = (EliminationMatch) view.getElement();
		LinkedList<Wc2014LinkDescriptor> result = new LinkedList<Wc2014LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Match_Home_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Match_Away_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_EliminationMatch_Winner_4006(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Wc2014LinkDescriptor> getTeam_2002OutgoingLinks(View view) {
		Team modelElement = (Team) view.getElement();
		LinkedList<Wc2014LinkDescriptor> result = new LinkedList<Wc2014LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Team_AtGroup_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Wc2014LinkDescriptor> getGroup_2003OutgoingLinks(
			View view) {
		Group modelElement = (Group) view.getElement();
		LinkedList<Wc2014LinkDescriptor> result = new LinkedList<Wc2014LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Group_FirstTeam_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Group_SecondTeam_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<Wc2014LinkDescriptor> getGroupMatch_2004OutgoingLinks(
			View view) {
		GroupMatch modelElement = (GroupMatch) view.getElement();
		LinkedList<Wc2014LinkDescriptor> result = new LinkedList<Wc2014LinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Match_Home_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Match_Away_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Wc2014LinkDescriptor> getIncomingFeatureModelFacetLinks_Group_FirstTeam_4001(
			Team target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Wc2014LinkDescriptor> result = new LinkedList<Wc2014LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == Wc2014Package.eINSTANCE
					.getGroup_FirstTeam()) {
				result.add(new Wc2014LinkDescriptor(setting.getEObject(),
						target, Wc2014ElementTypes.GroupFirstTeam_4001,
						GroupFirstTeamEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Wc2014LinkDescriptor> getIncomingFeatureModelFacetLinks_Match_Home_4002(
			Team target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Wc2014LinkDescriptor> result = new LinkedList<Wc2014LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == Wc2014Package.eINSTANCE
					.getMatch_Home()) {
				result.add(new Wc2014LinkDescriptor(setting.getEObject(),
						target, Wc2014ElementTypes.MatchHome_4002,
						MatchHomeEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Wc2014LinkDescriptor> getIncomingFeatureModelFacetLinks_Group_SecondTeam_4003(
			Team target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Wc2014LinkDescriptor> result = new LinkedList<Wc2014LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == Wc2014Package.eINSTANCE
					.getGroup_SecondTeam()) {
				result.add(new Wc2014LinkDescriptor(setting.getEObject(),
						target, Wc2014ElementTypes.GroupSecondTeam_4003,
						GroupSecondTeamEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Wc2014LinkDescriptor> getIncomingFeatureModelFacetLinks_Match_Away_4004(
			Team target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Wc2014LinkDescriptor> result = new LinkedList<Wc2014LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == Wc2014Package.eINSTANCE
					.getMatch_Away()) {
				result.add(new Wc2014LinkDescriptor(setting.getEObject(),
						target, Wc2014ElementTypes.MatchAway_4004,
						MatchAwayEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Wc2014LinkDescriptor> getIncomingFeatureModelFacetLinks_Team_AtGroup_4005(
			Group target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Wc2014LinkDescriptor> result = new LinkedList<Wc2014LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == Wc2014Package.eINSTANCE
					.getTeam_AtGroup()) {
				result.add(new Wc2014LinkDescriptor(setting.getEObject(),
						target, Wc2014ElementTypes.TeamAtGroup_4005,
						TeamAtGroupEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Wc2014LinkDescriptor> getIncomingFeatureModelFacetLinks_EliminationMatch_Winner_4006(
			Team target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<Wc2014LinkDescriptor> result = new LinkedList<Wc2014LinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == Wc2014Package.eINSTANCE
					.getEliminationMatch_Winner()) {
				result.add(new Wc2014LinkDescriptor(setting.getEObject(),
						target, Wc2014ElementTypes.EliminationMatchWinner_4006,
						EliminationMatchWinnerEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Wc2014LinkDescriptor> getOutgoingFeatureModelFacetLinks_Group_FirstTeam_4001(
			Group source) {
		LinkedList<Wc2014LinkDescriptor> result = new LinkedList<Wc2014LinkDescriptor>();
		Team destination = source.getFirstTeam();
		if (destination == null) {
			return result;
		}
		result.add(new Wc2014LinkDescriptor(source, destination,
				Wc2014ElementTypes.GroupFirstTeam_4001,
				GroupFirstTeamEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Wc2014LinkDescriptor> getOutgoingFeatureModelFacetLinks_Match_Home_4002(
			Match source) {
		LinkedList<Wc2014LinkDescriptor> result = new LinkedList<Wc2014LinkDescriptor>();
		Team destination = source.getHome();
		if (destination == null) {
			return result;
		}
		result.add(new Wc2014LinkDescriptor(source, destination,
				Wc2014ElementTypes.MatchHome_4002, MatchHomeEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Wc2014LinkDescriptor> getOutgoingFeatureModelFacetLinks_Group_SecondTeam_4003(
			Group source) {
		LinkedList<Wc2014LinkDescriptor> result = new LinkedList<Wc2014LinkDescriptor>();
		Team destination = source.getSecondTeam();
		if (destination == null) {
			return result;
		}
		result.add(new Wc2014LinkDescriptor(source, destination,
				Wc2014ElementTypes.GroupSecondTeam_4003,
				GroupSecondTeamEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Wc2014LinkDescriptor> getOutgoingFeatureModelFacetLinks_Match_Away_4004(
			Match source) {
		LinkedList<Wc2014LinkDescriptor> result = new LinkedList<Wc2014LinkDescriptor>();
		Team destination = source.getAway();
		if (destination == null) {
			return result;
		}
		result.add(new Wc2014LinkDescriptor(source, destination,
				Wc2014ElementTypes.MatchAway_4004, MatchAwayEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Wc2014LinkDescriptor> getOutgoingFeatureModelFacetLinks_Team_AtGroup_4005(
			Team source) {
		LinkedList<Wc2014LinkDescriptor> result = new LinkedList<Wc2014LinkDescriptor>();
		Group destination = source.getAtGroup();
		if (destination == null) {
			return result;
		}
		result.add(new Wc2014LinkDescriptor(source, destination,
				Wc2014ElementTypes.TeamAtGroup_4005,
				TeamAtGroupEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<Wc2014LinkDescriptor> getOutgoingFeatureModelFacetLinks_EliminationMatch_Winner_4006(
			EliminationMatch source) {
		LinkedList<Wc2014LinkDescriptor> result = new LinkedList<Wc2014LinkDescriptor>();
		Team destination = source.getWinner();
		if (destination == null) {
			return result;
		}
		result.add(new Wc2014LinkDescriptor(source, destination,
				Wc2014ElementTypes.EliminationMatchWinner_4006,
				EliminationMatchWinnerEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<Wc2014NodeDescriptor> getSemanticChildren(View view) {
			return Wc2014DiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Wc2014LinkDescriptor> getContainedLinks(View view) {
			return Wc2014DiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Wc2014LinkDescriptor> getIncomingLinks(View view) {
			return Wc2014DiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<Wc2014LinkDescriptor> getOutgoingLinks(View view) {
			return Wc2014DiagramUpdater.getOutgoingLinks(view);
		}
	};

}
