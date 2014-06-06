package edu.thu.ggxx.hellobrazil.wc2014.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import edu.thu.ggxx.hellobrazil.wc2014.WorldCup;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.EliminationMatchEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.EliminationMatchIdEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.EliminationMatchWinnerEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.GroupEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.GroupFirstTeamEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.GroupGroupNameEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.GroupMatchEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.GroupMatchIdEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.GroupSecondTeamEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.MatchAwayEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.MatchHomeEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.TeamAtGroupEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.TeamCountryEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.TeamEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.parts.WorldCupEditPart;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.part.Wc2014DiagramEditorPlugin;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.part.Wc2014VisualIDRegistry;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.providers.Wc2014ElementTypes;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.providers.Wc2014ParserProvider;

/**
 * @generated
 */
public class Wc2014NavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		Wc2014DiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		Wc2014DiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof Wc2014NavigatorItem
				&& !isOwnView(((Wc2014NavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof Wc2014NavigatorGroup) {
			Wc2014NavigatorGroup group = (Wc2014NavigatorGroup) element;
			return Wc2014DiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof Wc2014NavigatorItem) {
			Wc2014NavigatorItem navigatorItem = (Wc2014NavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (Wc2014VisualIDRegistry.getVisualID(view)) {
		case WorldCupEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://edu.thu.ggxx.hellobrazil.wc2014/1.0?WorldCup", Wc2014ElementTypes.WorldCup_1000); //$NON-NLS-1$
		case EliminationMatchEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://edu.thu.ggxx.hellobrazil.wc2014/1.0?EliminationMatch", Wc2014ElementTypes.EliminationMatch_2001); //$NON-NLS-1$
		case TeamEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://edu.thu.ggxx.hellobrazil.wc2014/1.0?Team", Wc2014ElementTypes.Team_2002); //$NON-NLS-1$
		case GroupEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://edu.thu.ggxx.hellobrazil.wc2014/1.0?Group", Wc2014ElementTypes.Group_2003); //$NON-NLS-1$
		case GroupMatchEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://edu.thu.ggxx.hellobrazil.wc2014/1.0?GroupMatch", Wc2014ElementTypes.GroupMatch_2004); //$NON-NLS-1$
		case GroupFirstTeamEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://edu.thu.ggxx.hellobrazil.wc2014/1.0?Group?FirstTeam", Wc2014ElementTypes.GroupFirstTeam_4001); //$NON-NLS-1$
		case MatchHomeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://edu.thu.ggxx.hellobrazil.wc2014/1.0?Match?Home", Wc2014ElementTypes.MatchHome_4002); //$NON-NLS-1$
		case GroupSecondTeamEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://edu.thu.ggxx.hellobrazil.wc2014/1.0?Group?SecondTeam", Wc2014ElementTypes.GroupSecondTeam_4003); //$NON-NLS-1$
		case MatchAwayEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://edu.thu.ggxx.hellobrazil.wc2014/1.0?Match?Away", Wc2014ElementTypes.MatchAway_4004); //$NON-NLS-1$
		case TeamAtGroupEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://edu.thu.ggxx.hellobrazil.wc2014/1.0?Team?AtGroup", Wc2014ElementTypes.TeamAtGroup_4005); //$NON-NLS-1$
		case EliminationMatchWinnerEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://edu.thu.ggxx.hellobrazil.wc2014/1.0?EliminationMatch?Winner", Wc2014ElementTypes.EliminationMatchWinner_4006); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = Wc2014DiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& Wc2014ElementTypes.isKnownElementType(elementType)) {
			image = Wc2014ElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof Wc2014NavigatorGroup) {
			Wc2014NavigatorGroup group = (Wc2014NavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof Wc2014NavigatorItem) {
			Wc2014NavigatorItem navigatorItem = (Wc2014NavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (Wc2014VisualIDRegistry.getVisualID(view)) {
		case WorldCupEditPart.VISUAL_ID:
			return getWorldCup_1000Text(view);
		case EliminationMatchEditPart.VISUAL_ID:
			return getEliminationMatch_2001Text(view);
		case TeamEditPart.VISUAL_ID:
			return getTeam_2002Text(view);
		case GroupEditPart.VISUAL_ID:
			return getGroup_2003Text(view);
		case GroupMatchEditPart.VISUAL_ID:
			return getGroupMatch_2004Text(view);
		case GroupFirstTeamEditPart.VISUAL_ID:
			return getGroupFirstTeam_4001Text(view);
		case MatchHomeEditPart.VISUAL_ID:
			return getMatchHome_4002Text(view);
		case GroupSecondTeamEditPart.VISUAL_ID:
			return getGroupSecondTeam_4003Text(view);
		case MatchAwayEditPart.VISUAL_ID:
			return getMatchAway_4004Text(view);
		case TeamAtGroupEditPart.VISUAL_ID:
			return getTeamAtGroup_4005Text(view);
		case EliminationMatchWinnerEditPart.VISUAL_ID:
			return getEliminationMatchWinner_4006Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getWorldCup_1000Text(View view) {
		WorldCup domainModelElement = (WorldCup) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getYear());
		} else {
			Wc2014DiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getEliminationMatch_2001Text(View view) {
		IParser parser = Wc2014ParserProvider.getParser(
				Wc2014ElementTypes.EliminationMatch_2001,
				view.getElement() != null ? view.getElement() : view,
				Wc2014VisualIDRegistry
						.getType(EliminationMatchIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Wc2014DiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTeam_2002Text(View view) {
		IParser parser = Wc2014ParserProvider.getParser(
				Wc2014ElementTypes.Team_2002,
				view.getElement() != null ? view.getElement() : view,
				Wc2014VisualIDRegistry.getType(TeamCountryEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Wc2014DiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGroup_2003Text(View view) {
		IParser parser = Wc2014ParserProvider.getParser(
				Wc2014ElementTypes.Group_2003,
				view.getElement() != null ? view.getElement() : view,
				Wc2014VisualIDRegistry
						.getType(GroupGroupNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Wc2014DiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGroupMatch_2004Text(View view) {
		IParser parser = Wc2014ParserProvider.getParser(
				Wc2014ElementTypes.GroupMatch_2004,
				view.getElement() != null ? view.getElement() : view,
				Wc2014VisualIDRegistry.getType(GroupMatchIdEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			Wc2014DiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getGroupFirstTeam_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMatchHome_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getGroupSecondTeam_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getMatchAway_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTeamAtGroup_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getEliminationMatchWinner_4006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return WorldCupEditPart.MODEL_ID.equals(Wc2014VisualIDRegistry
				.getModelID(view));
	}

}
