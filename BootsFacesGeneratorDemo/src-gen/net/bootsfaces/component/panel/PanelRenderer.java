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

package net.bootsfaces.component.panel;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:panel /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.panel.Panel")
public class PanelRenderer extends CoreRenderer {
	@Override
	public void decode(FacesContext context, UIComponent component) {
	    Panel panel = (Panel) component;
	
	
	    decodeBehaviors(context, panel);
	
	    String clientId = panel.getClientId(context);
	    String submittedValue = (String) context.getExternalContext().getRequestParameterMap().get(panel);
	
	    if (submittedValue != null) {
	    	panel.setSubmittedValue(submittedValue);
	    }
	}
	
	
	@Override
	public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		Panel panel = (Panel) component;
		Map<String, Object> attrs = panel.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = panel.getClientId();
		
		// put custom code here
	}
	
	@Override
	public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		Panel panel = (Panel) component;
		Map<String, Object> attrs = panel.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = panel.getClientId();
	
		// Simple demo widget that simply renders every attribute value
		rw.startElement("panel", panel);
		Tooltip.generateTooltip(context, attrs, rw);
		
	    rw.writeAttribute("binding", panel.getBinding(), "binding");
	    rw.writeAttribute("collapsed", String.valueOf(panel.isCollapsed()), "collapsed");
	    rw.writeAttribute("collapsible", String.valueOf(panel.isCollapsible()), "collapsible");
	    rw.writeAttribute("contentClass", panel.getContentClass(), "contentClass");
	    rw.writeAttribute("contentStyle", panel.getContentStyle(), "contentStyle");
	    rw.writeAttribute("id", panel.getId(), "id");
	    rw.writeAttribute("look", panel.getLook(), "look");
	    rw.writeAttribute("rendered", String.valueOf(panel.isRendered()), "rendered");
	    rw.writeAttribute("style", panel.getStyle(), "style");
	    rw.writeAttribute("styleClass", panel.getStyleClass(), "styleClass");
	    rw.writeAttribute("title", panel.getTitle(), "title");
	    rw.writeAttribute("titleClass", panel.getTitleClass(), "titleClass");
	    rw.writeAttribute("titleStyle", panel.getTitleStyle(), "titleStyle");
	    rw.writeAttribute("tooltip", panel.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", panel.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", panel.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", panel.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", panel.getTooltipPosition(), "tooltipPosition");
	    rw.writeText("Dummy content of b:Panel", null);
		rw.endElement("Panel");
	}
}
