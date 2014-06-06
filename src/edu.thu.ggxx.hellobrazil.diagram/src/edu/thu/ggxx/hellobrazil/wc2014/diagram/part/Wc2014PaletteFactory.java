package edu.thu.ggxx.hellobrazil.wc2014.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import edu.thu.ggxx.hellobrazil.wc2014.diagram.providers.Wc2014ElementTypes;

/**
 * @generated
 */
public class Wc2014PaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createWc20141Group());
	}

	/**
	 * Creates "wc2014" palette tool group
	 * @generated
	 */
	private PaletteContainer createWc20141Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Wc20141Group_title);
		paletteContainer.setId("createWc20141Group"); //$NON-NLS-1$
		paletteContainer.add(createTeam1CreationTool());
		paletteContainer.add(createTeamAtGroup2CreationTool());
		paletteContainer.add(createMatchHome3CreationTool());
		paletteContainer.add(createMatchAway4CreationTool());
		paletteContainer.add(createGroupMatch5CreationTool());
		paletteContainer.add(createEliminationMatch6CreationTool());
		paletteContainer.add(createEliminationMatchWinner7CreationTool());
		paletteContainer.add(createGroup8CreationTool());
		paletteContainer.add(createGroupFirstTeam9CreationTool());
		paletteContainer.add(createGroupSecondTeam10CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTeam1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Team1CreationTool_title,
				Messages.Team1CreationTool_desc,
				Collections.singletonList(Wc2014ElementTypes.Team_2002));
		entry.setId("createTeam1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Wc2014ElementTypes
				.getImageDescriptor(Wc2014ElementTypes.Team_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTeamAtGroup2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.TeamAtGroup2CreationTool_title,
				Messages.TeamAtGroup2CreationTool_desc,
				Collections.singletonList(Wc2014ElementTypes.TeamAtGroup_4005));
		entry.setId("createTeamAtGroup2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Wc2014ElementTypes
				.getImageDescriptor(Wc2014ElementTypes.TeamAtGroup_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMatchHome3CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.MatchHome3CreationTool_title,
				Messages.MatchHome3CreationTool_desc,
				Collections.singletonList(Wc2014ElementTypes.MatchHome_4002));
		entry.setId("createMatchHome3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Wc2014ElementTypes
				.getImageDescriptor(Wc2014ElementTypes.MatchHome_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMatchAway4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.MatchAway4CreationTool_title,
				Messages.MatchAway4CreationTool_desc,
				Collections.singletonList(Wc2014ElementTypes.MatchAway_4004));
		entry.setId("createMatchAway4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Wc2014ElementTypes
				.getImageDescriptor(Wc2014ElementTypes.MatchAway_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGroupMatch5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.GroupMatch5CreationTool_title,
				Messages.GroupMatch5CreationTool_desc,
				Collections.singletonList(Wc2014ElementTypes.GroupMatch_2004));
		entry.setId("createGroupMatch5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Wc2014ElementTypes
				.getImageDescriptor(Wc2014ElementTypes.GroupMatch_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEliminationMatch6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.EliminationMatch6CreationTool_title,
				Messages.EliminationMatch6CreationTool_desc,
				Collections
						.singletonList(Wc2014ElementTypes.EliminationMatch_2001));
		entry.setId("createEliminationMatch6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Wc2014ElementTypes
				.getImageDescriptor(Wc2014ElementTypes.EliminationMatch_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEliminationMatchWinner7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.EliminationMatchWinner7CreationTool_title,
				Messages.EliminationMatchWinner7CreationTool_desc,
				Collections
						.singletonList(Wc2014ElementTypes.EliminationMatchWinner_4006));
		entry.setId("createEliminationMatchWinner7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Wc2014ElementTypes
				.getImageDescriptor(Wc2014ElementTypes.EliminationMatchWinner_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGroup8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Group8CreationTool_title,
				Messages.Group8CreationTool_desc,
				Collections.singletonList(Wc2014ElementTypes.Group_2003));
		entry.setId("createGroup8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Wc2014ElementTypes
				.getImageDescriptor(Wc2014ElementTypes.Group_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGroupFirstTeam9CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.GroupFirstTeam9CreationTool_title,
				Messages.GroupFirstTeam9CreationTool_desc,
				Collections
						.singletonList(Wc2014ElementTypes.GroupFirstTeam_4001));
		entry.setId("createGroupFirstTeam9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Wc2014ElementTypes
				.getImageDescriptor(Wc2014ElementTypes.GroupFirstTeam_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGroupSecondTeam10CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.GroupSecondTeam10CreationTool_title,
				Messages.GroupSecondTeam10CreationTool_desc,
				Collections
						.singletonList(Wc2014ElementTypes.GroupSecondTeam_4003));
		entry.setId("createGroupSecondTeam10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(Wc2014ElementTypes
				.getImageDescriptor(Wc2014ElementTypes.GroupSecondTeam_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
