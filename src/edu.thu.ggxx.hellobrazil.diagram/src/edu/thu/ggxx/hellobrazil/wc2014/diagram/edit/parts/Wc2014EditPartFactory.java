package edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import edu.thu.ggxx.hellobrazil.wc2014.diagram.part.Wc2014VisualIDRegistry;

/**
 * @generated
 */
public class Wc2014EditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (Wc2014VisualIDRegistry.getVisualID(view)) {

			case WorldCupEditPart.VISUAL_ID:
				return new WorldCupEditPart(view);

			case EliminationMatchEditPart.VISUAL_ID:
				return new EliminationMatchEditPart(view);

			case EliminationMatchIdEditPart.VISUAL_ID:
				return new EliminationMatchIdEditPart(view);

			case TeamEditPart.VISUAL_ID:
				return new TeamEditPart(view);

			case TeamCountryEditPart.VISUAL_ID:
				return new TeamCountryEditPart(view);

			case GroupEditPart.VISUAL_ID:
				return new GroupEditPart(view);

			case GroupGroupNameEditPart.VISUAL_ID:
				return new GroupGroupNameEditPart(view);

			case GroupMatchEditPart.VISUAL_ID:
				return new GroupMatchEditPart(view);

			case GroupMatchIdEditPart.VISUAL_ID:
				return new GroupMatchIdEditPart(view);

			case GroupFirstTeamEditPart.VISUAL_ID:
				return new GroupFirstTeamEditPart(view);

			case MatchHomeEditPart.VISUAL_ID:
				return new MatchHomeEditPart(view);

			case GroupSecondTeamEditPart.VISUAL_ID:
				return new GroupSecondTeamEditPart(view);

			case MatchAwayEditPart.VISUAL_ID:
				return new MatchAwayEditPart(view);

			case TeamAtGroupEditPart.VISUAL_ID:
				return new TeamAtGroupEditPart(view);

			case EliminationMatchWinnerEditPart.VISUAL_ID:
				return new EliminationMatchWinnerEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
