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

package net.bootsfaces.component.tabView;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:tabView /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.tabView.TabView")
public class TabViewRenderer extends CoreRenderer {
	/**
	 * This methods receives and processes input made by the user. More specifically, it ckecks whether the
	 * user has interacted with the current b:tabView. The default implementation simply stores
	 * the input value in the list of submitted values. If the validation checks are passed,
	 * the values in the <code>submittedValues</code> list are store in the backend bean.
	 * @param context the FacesContext.
	 * @param component the current b:tabView.
	 */  
	@Override
	public void decode(FacesContext context, UIComponent component) {
	    TabView tabView = (TabView) component;
	
	
	    decodeBehaviors(context, tabView);
	
	    String clientId = tabView.getClientId(context);
	    String submittedValue = (String) context.getExternalContext().getRequestParameterMap().get(clientId);
	
	    if (submittedValue != null) {
	    	tabView.setSubmittedValue(submittedValue);
	    }
	}
	
	/**
	 * This methods generates the HTML code of the current b:tabView.
	 * @param context the FacesContext.
	 * @param component the current b:tabView.
	 * @throws IOException thrown if something goes wrong when writing the HTML code.
	 */  
	@Override
	public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		TabView tabView = (TabView) component;
		ResponseWriter rw = context.getResponseWriter();
		String clientId = tabView.getClientId();
		
		// put custom code here
		// Simple demo widget that simply renders every attribute value
		rw.startElement("tabView", tabView);
		Tooltip.generateTooltip(context, tabView, rw);
		
	    rw.writeAttribute("activeIndex", tabView.getActiveIndex(), "activeIndex");
	    rw.writeAttribute("contentClass", tabView.getContentClass(), "contentClass");
	    rw.writeAttribute("contentStyle", tabView.getContentStyle(), "contentStyle");
	    rw.writeAttribute("id", tabView.getId(), "id");
	    rw.writeAttribute("styleClass", tabView.getStyleClass(), "styleClass");
	    rw.writeAttribute("tooltip", tabView.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", tabView.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", tabView.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", tabView.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", tabView.getTooltipPosition(), "tooltipPosition");
		rw.writeText("Dummy content of b:tabView", null);
		rw.endElement("tabView");
		Tooltip.activateTooltips(fc, c.getAttributes(), c);
		
	}
	
	
}
