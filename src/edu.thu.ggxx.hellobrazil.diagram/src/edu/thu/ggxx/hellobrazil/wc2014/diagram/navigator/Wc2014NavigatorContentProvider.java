package edu.thu.ggxx.hellobrazil.wc2014.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

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
import edu.thu.ggxx.hellobrazil.wc2014.diagram.part.Messages;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.part.Wc2014VisualIDRegistry;

/**
 * @generated
 */
public class Wc2014NavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public Wc2014NavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<Wc2014NavigatorItem> result = new ArrayList<Wc2014NavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, WorldCupEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof Wc2014NavigatorGroup) {
			Wc2014NavigatorGroup group = (Wc2014NavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof Wc2014NavigatorItem) {
			Wc2014NavigatorItem navigatorItem = (Wc2014NavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (Wc2014VisualIDRegistry.getVisualID(view)) {

		case WorldCupEditPart.VISUAL_ID: {
			LinkedList<Wc2014AbstractNavigatorItem> result = new LinkedList<Wc2014AbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			Wc2014NavigatorGroup links = new Wc2014NavigatorGroup(
					Messages.NavigatorGroupName_WorldCup_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry
							.getType(EliminationMatchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry.getType(TeamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry.getType(GroupEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry
							.getType(GroupMatchEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry
							.getType(GroupFirstTeamEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry.getType(MatchHomeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry
							.getType(GroupSecondTeamEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry.getType(MatchAwayEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry
							.getType(TeamAtGroupEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry
							.getType(EliminationMatchWinnerEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case EliminationMatchEditPart.VISUAL_ID: {
			LinkedList<Wc2014AbstractNavigatorItem> result = new LinkedList<Wc2014AbstractNavigatorItem>();
			Node sv = (Node) view;
			Wc2014NavigatorGroup outgoinglinks = new Wc2014NavigatorGroup(
					Messages.NavigatorGroupName_EliminationMatch_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry.getType(MatchHomeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry.getType(MatchAwayEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry
							.getType(EliminationMatchWinnerEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case TeamEditPart.VISUAL_ID: {
			LinkedList<Wc2014AbstractNavigatorItem> result = new LinkedList<Wc2014AbstractNavigatorItem>();
			Node sv = (Node) view;
			Wc2014NavigatorGroup incominglinks = new Wc2014NavigatorGroup(
					Messages.NavigatorGroupName_Team_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Wc2014NavigatorGroup outgoinglinks = new Wc2014NavigatorGroup(
					Messages.NavigatorGroupName_Team_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry
							.getType(GroupFirstTeamEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry.getType(MatchHomeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry
							.getType(GroupSecondTeamEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry.getType(MatchAwayEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry
							.getType(TeamAtGroupEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry
							.getType(EliminationMatchWinnerEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case GroupEditPart.VISUAL_ID: {
			LinkedList<Wc2014AbstractNavigatorItem> result = new LinkedList<Wc2014AbstractNavigatorItem>();
			Node sv = (Node) view;
			Wc2014NavigatorGroup outgoinglinks = new Wc2014NavigatorGroup(
					Messages.NavigatorGroupName_Group_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Wc2014NavigatorGroup incominglinks = new Wc2014NavigatorGroup(
					Messages.NavigatorGroupName_Group_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry
							.getType(GroupFirstTeamEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry
							.getType(GroupSecondTeamEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry
							.getType(TeamAtGroupEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case GroupMatchEditPart.VISUAL_ID: {
			LinkedList<Wc2014AbstractNavigatorItem> result = new LinkedList<Wc2014AbstractNavigatorItem>();
			Node sv = (Node) view;
			Wc2014NavigatorGroup outgoinglinks = new Wc2014NavigatorGroup(
					Messages.NavigatorGroupName_GroupMatch_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry.getType(MatchHomeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry.getType(MatchAwayEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case GroupFirstTeamEditPart.VISUAL_ID: {
			LinkedList<Wc2014AbstractNavigatorItem> result = new LinkedList<Wc2014AbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Wc2014NavigatorGroup target = new Wc2014NavigatorGroup(
					Messages.NavigatorGroupName_GroupFirstTeam_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Wc2014NavigatorGroup source = new Wc2014NavigatorGroup(
					Messages.NavigatorGroupName_GroupFirstTeam_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry.getType(TeamEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry.getType(GroupEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case MatchHomeEditPart.VISUAL_ID: {
			LinkedList<Wc2014AbstractNavigatorItem> result = new LinkedList<Wc2014AbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Wc2014NavigatorGroup target = new Wc2014NavigatorGroup(
					Messages.NavigatorGroupName_MatchHome_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Wc2014NavigatorGroup source = new Wc2014NavigatorGroup(
					Messages.NavigatorGroupName_MatchHome_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry.getType(TeamEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry
							.getType(EliminationMatchEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry
							.getType(GroupMatchEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case GroupSecondTeamEditPart.VISUAL_ID: {
			LinkedList<Wc2014AbstractNavigatorItem> result = new LinkedList<Wc2014AbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Wc2014NavigatorGroup target = new Wc2014NavigatorGroup(
					Messages.NavigatorGroupName_GroupSecondTeam_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Wc2014NavigatorGroup source = new Wc2014NavigatorGroup(
					Messages.NavigatorGroupName_GroupSecondTeam_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry.getType(TeamEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry.getType(GroupEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case MatchAwayEditPart.VISUAL_ID: {
			LinkedList<Wc2014AbstractNavigatorItem> result = new LinkedList<Wc2014AbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Wc2014NavigatorGroup target = new Wc2014NavigatorGroup(
					Messages.NavigatorGroupName_MatchAway_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Wc2014NavigatorGroup source = new Wc2014NavigatorGroup(
					Messages.NavigatorGroupName_MatchAway_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry.getType(TeamEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry
							.getType(EliminationMatchEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry
							.getType(GroupMatchEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case TeamAtGroupEditPart.VISUAL_ID: {
			LinkedList<Wc2014AbstractNavigatorItem> result = new LinkedList<Wc2014AbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Wc2014NavigatorGroup target = new Wc2014NavigatorGroup(
					Messages.NavigatorGroupName_TeamAtGroup_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Wc2014NavigatorGroup source = new Wc2014NavigatorGroup(
					Messages.NavigatorGroupName_TeamAtGroup_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry.getType(GroupEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry.getType(TeamEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case EliminationMatchWinnerEditPart.VISUAL_ID: {
			LinkedList<Wc2014AbstractNavigatorItem> result = new LinkedList<Wc2014AbstractNavigatorItem>();
			Edge sv = (Edge) view;
			Wc2014NavigatorGroup target = new Wc2014NavigatorGroup(
					Messages.NavigatorGroupName_EliminationMatchWinner_4006_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Wc2014NavigatorGroup source = new Wc2014NavigatorGroup(
					Messages.NavigatorGroupName_EliminationMatchWinner_4006_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry.getType(TeamEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					Wc2014VisualIDRegistry
							.getType(EliminationMatchEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return WorldCupEditPart.MODEL_ID.equals(Wc2014VisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<Wc2014NavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<Wc2014NavigatorItem> result = new ArrayList<Wc2014NavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new Wc2014NavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof Wc2014AbstractNavigatorItem) {
			Wc2014AbstractNavigatorItem abstractNavigatorItem = (Wc2014AbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
