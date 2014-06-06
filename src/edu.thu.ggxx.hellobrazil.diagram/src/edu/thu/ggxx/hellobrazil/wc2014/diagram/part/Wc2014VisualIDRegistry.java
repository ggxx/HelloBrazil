package edu.thu.ggxx.hellobrazil.wc2014.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import edu.thu.ggxx.hellobrazil.wc2014.Wc2014Package;
import edu.thu.ggxx.hellobrazil.wc2014.WorldCup;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.EliminationMatchEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.EliminationMatchIdEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.GroupEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.GroupGroupNameEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.GroupMatchEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.GroupMatchIdEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.TeamCountryEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.TeamEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.WorldCupEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class Wc2014VisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "edu.thu.ggxx.hellobrazil.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (WorldCupEditPart.MODEL_ID.equals(view.getType())) {
				return WorldCupEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return edu.thu.ggxx.hellobrazil.wc2014.diagram.part.Wc2014VisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				Wc2014DiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (Wc2014Package.eINSTANCE.getWorldCup().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((WorldCup) domainElement)) {
			return WorldCupEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = edu.thu.ggxx.hellobrazil.wc2014.diagram.part.Wc2014VisualIDRegistry
				.getModelID(containerView);
		if (!WorldCupEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (WorldCupEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = edu.thu.ggxx.hellobrazil.wc2014.diagram.part.Wc2014VisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WorldCupEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case WorldCupEditPart.VISUAL_ID:
			if (Wc2014Package.eINSTANCE.getEliminationMatch().isSuperTypeOf(
					domainElement.eClass())) {
				return EliminationMatchEditPart.VISUAL_ID;
			}
			if (Wc2014Package.eINSTANCE.getTeam().isSuperTypeOf(
					domainElement.eClass())) {
				return TeamEditPart.VISUAL_ID;
			}
			if (Wc2014Package.eINSTANCE.getGroup().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupEditPart.VISUAL_ID;
			}
			if (Wc2014Package.eINSTANCE.getGroupMatch().isSuperTypeOf(
					domainElement.eClass())) {
				return GroupMatchEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = edu.thu.ggxx.hellobrazil.wc2014.diagram.part.Wc2014VisualIDRegistry
				.getModelID(containerView);
		if (!WorldCupEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (WorldCupEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = edu.thu.ggxx.hellobrazil.wc2014.diagram.part.Wc2014VisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = WorldCupEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case WorldCupEditPart.VISUAL_ID:
			if (EliminationMatchEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TeamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (GroupMatchEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case EliminationMatchEditPart.VISUAL_ID:
			if (EliminationMatchIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TeamEditPart.VISUAL_ID:
			if (TeamCountryEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupEditPart.VISUAL_ID:
			if (GroupGroupNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case GroupMatchEditPart.VISUAL_ID:
			if (GroupMatchIdEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(WorldCup element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case WorldCupEditPart.VISUAL_ID:
			return false;
		case EliminationMatchEditPart.VISUAL_ID:
		case TeamEditPart.VISUAL_ID:
		case GroupEditPart.VISUAL_ID:
		case GroupMatchEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return edu.thu.ggxx.hellobrazil.wc2014.diagram.part.Wc2014VisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return edu.thu.ggxx.hellobrazil.wc2014.diagram.part.Wc2014VisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return edu.thu.ggxx.hellobrazil.wc2014.diagram.part.Wc2014VisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return edu.thu.ggxx.hellobrazil.wc2014.diagram.part.Wc2014VisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return edu.thu.ggxx.hellobrazil.wc2014.diagram.part.Wc2014VisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return edu.thu.ggxx.hellobrazil.wc2014.diagram.part.Wc2014VisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
