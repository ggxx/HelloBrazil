package edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.commands.EliminationMatchCreateCommand;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.commands.GroupCreateCommand;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.commands.GroupMatchCreateCommand;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.edit.commands.TeamCreateCommand;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.providers.Wc2014ElementTypes;

/**
 * @generated
 */
public class WorldCupItemSemanticEditPolicy extends
		Wc2014BaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public WorldCupItemSemanticEditPolicy() {
		super(Wc2014ElementTypes.WorldCup_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (Wc2014ElementTypes.EliminationMatch_2001 == req.getElementType()) {
			return getGEFWrapper(new EliminationMatchCreateCommand(req));
		}
		if (Wc2014ElementTypes.Team_2002 == req.getElementType()) {
			return getGEFWrapper(new TeamCreateCommand(req));
		}
		if (Wc2014ElementTypes.Group_2003 == req.getElementType()) {
			return getGEFWrapper(new GroupCreateCommand(req));
		}
		if (Wc2014ElementTypes.GroupMatch_2004 == req.getElementType()) {
			return getGEFWrapper(new GroupMatchCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
