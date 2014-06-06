package edu.thu.ggxx.hellobrazil.wc2014.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class Wc2014NavigatorItem extends Wc2014AbstractNavigatorItem {

	/**
	 * @generated
	 */
	static {
		final Class[] supportedTypes = new Class[] { View.class, EObject.class };
		Platform.getAdapterManager().registerAdapters(
				new IAdapterFactory() {

					public Object getAdapter(Object adaptableObject,
							Class adapterType) {
						if (adaptableObject instanceof edu.thu.ggxx.hellobrazil.wc2014.diagram.navigator.Wc2014NavigatorItem
								&& (adapterType == View.class || adapterType == EObject.class)) {
							return ((edu.thu.ggxx.hellobrazil.wc2014.diagram.navigator.Wc2014NavigatorItem) adaptableObject)
									.getView();
						}
						return null;
					}

					public Class[] getAdapterList() {
						return supportedTypes;
					}
				},
				edu.thu.ggxx.hellobrazil.wc2014.diagram.navigator.Wc2014NavigatorItem.class);
	}

	/**
	 * @generated
	 */
	private View myView;

	/**
	 * @generated
	 */
	private boolean myLeaf = false;

	/**
	 * @generated
	 */
	public Wc2014NavigatorItem(View view, Object parent, boolean isLeaf) {
		super(parent);
		myView = view;
		myLeaf = isLeaf;
	}

	/**
	 * @generated
	 */
	public View getView() {
		return myView;
	}

	/**
	 * @generated
	 */
	public boolean isLeaf() {
		return myLeaf;
	}

	/**
	 * @generated
	 */
	public boolean equals(Object obj) {
		if (obj instanceof edu.thu.ggxx.hellobrazil.wc2014.diagram.navigator.Wc2014NavigatorItem) {
			return EcoreUtil
					.getURI(getView())
					.equals(EcoreUtil
							.getURI(((edu.thu.ggxx.hellobrazil.wc2014.diagram.navigator.Wc2014NavigatorItem) obj)
									.getView()));
		}
		return super.equals(obj);
	}

	/**
	 * @generated
	 */
	public int hashCode() {
		return EcoreUtil.getURI(getView()).hashCode();
	}

}
