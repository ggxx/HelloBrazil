package edu.thu.ggxx.hellobrazil.wc2014.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import edu.thu.ggxx.hellobrazil.wc2014.diagram.providers.Wc2014ElementTypes;
import edu.thu.ggxx.hellobrazil.wc2014.diagram.providers.Wc2014ModelingAssistantProvider;

/**
 * @generated
 */
public class Wc2014ModelingAssistantProviderOfWorldCupEditPart extends
		Wc2014ModelingAssistantProvider {

	/**
	 * @generated
	 */
	@Override
	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(Wc2014ElementTypes.EliminationMatch_2001);
		types.add(Wc2014ElementTypes.Team_2002);
		types.add(Wc2014ElementTypes.Group_2003);
		types.add(Wc2014ElementTypes.GroupMatch_2004);
		return types;
	}

}
