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

package net.bootsfaces.component.navCommandLink;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:navCommandLink /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.navCommandLink.NavCommandLink")
public class NavCommandLinkRenderer extends CoreRenderer {
	/**
	 * This methods receives and processes input made by the user. More specifically, it ckecks whether the
	 * user has interacted with the current b:navCommandLink. The default implementation simply stores
	 * the input value in the list of submitted values. If the validation checks are passed,
	 * the values in the <code>submittedValues</code> list are store in the backend bean.
	 * @param context the FacesContext.
	 * @param component the current b:navCommandLink.
	 */  
	@Override
	public void decode(FacesContext context, UIComponent component) {
	    NavCommandLink navCommandLink = (NavCommandLink) component;
	
	
	    decodeBehaviors(context, navCommandLink);
	
	    String clientId = navCommandLink.getClientId(context);
	    String submittedValue = (String) context.getExternalContext().getRequestParameterMap().get(clientId);
	
	    if (submittedValue != null) {
	    	navCommandLink.setSubmittedValue(submittedValue);
	    }
	}
	
	/**
	 * This methods generates the HTML code of the current b:navCommandLink.
	 * @param context the FacesContext.
	 * @param component the current b:navCommandLink.
	 * @throws IOException thrown if something goes wrong when writing the HTML code.
	 */  
	@Override
	public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		NavCommandLink navCommandLink = (NavCommandLink) component;
		ResponseWriter rw = context.getResponseWriter();
		String clientId = navCommandLink.getClientId();
		
		// put custom code here
		// Simple demo widget that simply renders every attribute value
		rw.startElement("navCommandLink", navCommandLink);
		Tooltip.generateTooltip(context, navCommandLink, rw);
		
	    rw.writeAttribute("action", navCommandLink.getAction(), "action");
	    rw.writeAttribute("actionListener", navCommandLink.getActionListener(), "actionListener");
	    rw.writeAttribute("active", String.valueOf(navCommandLink.isActive()), "active");
	    rw.writeAttribute("binding", navCommandLink.getBinding(), "binding");
	    rw.writeAttribute("fragment", navCommandLink.getFragment(), "fragment");
	    rw.writeAttribute("header", navCommandLink.getHeader(), "header");
	    rw.writeAttribute("href", navCommandLink.getHref(), "href");
	    rw.writeAttribute("icon", navCommandLink.getIcon(), "icon");
	    rw.writeAttribute("iconAlign", navCommandLink.getIconAlign(), "iconAlign");
	    rw.writeAttribute("iconAwesome", navCommandLink.getIconAwesome(), "iconAwesome");
	    rw.writeAttribute("id", navCommandLink.getId(), "id");
	    rw.writeAttribute("onblur", navCommandLink.getOnblur(), "onblur");
	    rw.writeAttribute("onclick", navCommandLink.getOnclick(), "onclick");
	    rw.writeAttribute("onmouseover", navCommandLink.getOnmouseover(), "onmouseover");
	    rw.writeAttribute("outcome", navCommandLink.getOutcome(), "outcome");
	    rw.writeAttribute("rendered", String.valueOf(navCommandLink.isRendered()), "rendered");
	    rw.writeAttribute("tooltip", navCommandLink.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", navCommandLink.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", navCommandLink.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", navCommandLink.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", navCommandLink.getTooltipPosition(), "tooltipPosition");
	    rw.writeAttribute("value", navCommandLink.getValue(), "value");
		rw.writeText("Dummy content of b:navCommandLink", null);
		rw.endElement("navCommandLink");
		Tooltip.activateTooltips(context, navCommandLink);
		
	}
	
	
}
