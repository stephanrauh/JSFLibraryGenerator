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

package net.bootsfaces.component.navbarLinks;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:navbarLinks /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.navbarLinks.NavbarLinks")
public class NavbarLinksRenderer extends CoreRenderer {
	
	/**
	 * This methods generates the HTML code of the current b:navbarLinks.
	 * @param context the FacesContext.
	 * @param component the current b:navbarLinks.
	 * @throws IOException thrown if something goes wrong when writing the HTML code.
	 */  
	@Override
	public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		NavbarLinks navbarLinks = (NavbarLinks) component;
		ResponseWriter rw = context.getResponseWriter();
		String clientId = navbarLinks.getClientId();
		
		// put custom code here
		// Simple demo widget that simply renders every attribute value
		rw.startElement("navbarLinks", navbarLinks);
		Tooltip.generateTooltip(context, navbarLinks, rw);
		
	    rw.writeAttribute("binding", navbarLinks.getBinding(), "binding");
	    rw.writeAttribute("id", navbarLinks.getId(), "id");
	    rw.writeAttribute("pull", navbarLinks.getPull(), "pull");
	    rw.writeAttribute("rendered", String.valueOf(navbarLinks.isRendered()), "rendered");
	    rw.writeAttribute("tooltip", navbarLinks.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", navbarLinks.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", navbarLinks.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", navbarLinks.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", navbarLinks.getTooltipPosition(), "tooltipPosition");
		rw.writeText("Dummy content of b:navbarLinks", null);
		rw.endElement("navbarLinks");
		Tooltip.activateTooltips(fc, c.getAttributes(), c);
		
	}
	
	
}
