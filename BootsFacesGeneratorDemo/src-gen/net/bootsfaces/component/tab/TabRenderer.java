/**
 *  Copyright 2014-15 by Riccardo Massera (TheCoder4.Eu) and Stephan Rauh (http://www.beyondjava.net).
 *  
 *  This file is part of BootsFaces.
 *  
 *  BootsFaces is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  BootsFaces is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with BootsFaces. If not, see <http://www.gnu.org/licenses/>.
 */

package net.bootsfaces.component.tab;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:tab /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.tab.Tab")
public class TabRenderer extends CoreRenderer {
	@Override
	public void decode(FacesContext context, UIComponent component) {
	    Tab tab = (Tab) component;
	
	
	    decodeBehaviors(context, tab);
	
	    String clientId = tab.getClientId(context);
	    String submittedValue = (String) context.getExternalContext().getRequestParameterMap().get(tab);
	
	    if (submittedValue != null) {
	    	tab.setSubmittedValue(submittedValue);
	    }
	}
	
	
	
	@Override
	public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		Tab tab = (Tab) component;
		Map<String, Object> attrs = tab.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = tab.getClientId();
	
		// Simple demo widget that simply renders every attribute value
		rw.startElement("tab", tab);
		Tooltip.generateTooltip(context, attrs, rw);
		
	    rw.writeAttribute("id", tab.getId(), "id");
	    rw.writeAttribute("styleClass", tab.getStyleClass(), "styleClass");
	    rw.writeAttribute("title", tab.getTitle(), "title");
	    rw.writeAttribute("tooltip", tab.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", tab.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", tab.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", tab.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", tab.getTooltipPosition(), "tooltipPosition");
	    rw.writeText("Dummy content of b:Tab", null);
		rw.endElement("Tab");
	}
}
