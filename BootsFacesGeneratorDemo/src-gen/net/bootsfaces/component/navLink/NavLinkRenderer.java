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

package net.bootsfaces.component.navLink;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:navLink /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.navLink.NavLink")
public class NavLinkRenderer extends CoreRenderer {
	
	
	
	@Override
	public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		NavLink navLink = (NavLink) component;
		Map<String, Object> attrs = navLink.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = navLink.getClientId();
	
		// Simple demo widget that simply renders every attribute value
		rw.startElement("navLink", navLink);
		Tooltip.generateTooltip(context, attrs, rw);
		
	    rw.writeAttribute("active", String.valueOf(navLink.isActive()), "active");
	    rw.writeAttribute("binding", navLink.getBinding(), "binding");
	    rw.writeAttribute("fragment", navLink.getFragment(), "fragment");
	    rw.writeAttribute("header", navLink.getHeader(), "header");
	    rw.writeAttribute("href", navLink.getHref(), "href");
	    rw.writeAttribute("icon", navLink.getIcon(), "icon");
	    rw.writeAttribute("iconAlign", navLink.getIconAlign(), "iconAlign");
	    rw.writeAttribute("iconAwesome", navLink.getIconAwesome(), "iconAwesome");
	    rw.writeAttribute("id", navLink.getId(), "id");
	    rw.writeAttribute("onblur", navLink.getOnblur(), "onblur");
	    rw.writeAttribute("onclick", navLink.getOnclick(), "onclick");
	    rw.writeAttribute("onmouseover", navLink.getOnmouseover(), "onmouseover");
	    rw.writeAttribute("outcome", navLink.getOutcome(), "outcome");
	    rw.writeAttribute("rendered", String.valueOf(navLink.isRendered()), "rendered");
	    rw.writeAttribute("tooltip", navLink.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", navLink.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", navLink.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", navLink.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", navLink.getTooltipPosition(), "tooltipPosition");
	    rw.writeAttribute("value", navLink.getValue(), "value");
	    rw.writeText("Dummy content of b:NavLink", null);
		rw.endElement("NavLink");
	}
}
