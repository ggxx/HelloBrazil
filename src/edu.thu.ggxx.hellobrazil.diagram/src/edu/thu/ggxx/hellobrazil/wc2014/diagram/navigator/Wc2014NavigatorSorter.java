package edu.thu.ggxx.hellobrazil.wc2014.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import edu.thu.ggxx.hellobrazil.wc2014.diagram.part.Wc2014VisualIDRegistry;

/**
 * @generated
 */
public class Wc2014NavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4008;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof Wc2014NavigatorItem) {
			Wc2014NavigatorItem item = (Wc2014NavigatorItem) element;
			return Wc2014VisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
