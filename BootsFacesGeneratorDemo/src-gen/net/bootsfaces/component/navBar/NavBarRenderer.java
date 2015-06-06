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

package net.bootsfaces.component.navBar;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:navBar /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.navBar.NavBar")
public class NavBarRenderer extends CoreRenderer {
	
	
	@Override
	public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		NavBar navBar = (NavBar) component;
		Map<String, Object> attrs = navBar.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = navBar.getClientId();
		
		// put custom code here
	}
	
	@Override
	public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		NavBar navBar = (NavBar) component;
		Map<String, Object> attrs = navBar.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = navBar.getClientId();
	
		// Simple demo widget that simply renders every attribute value
		rw.startElement("navBar", navBar);
		Tooltip.generateTooltip(context, attrs, rw);
		
	    rw.writeAttribute("binding", navBar.getBinding(), "binding");
	    rw.writeAttribute("brand", navBar.getBrand(), "brand");
	    rw.writeAttribute("brandAlign", navBar.getBrandAlign(), "brandAlign");
	    rw.writeAttribute("brandHref", navBar.getBrandHref(), "brandHref");
	    rw.writeAttribute("brandImg", navBar.getBrandImg(), "brandImg");
	    rw.writeAttribute("fixed", navBar.getFixed(), "fixed");
	    rw.writeAttribute("fluid", String.valueOf(navBar.isFluid()), "fluid");
	    rw.writeAttribute("id", navBar.getId(), "id");
	    rw.writeAttribute("inverse", String.valueOf(navBar.isInverse()), "inverse");
	    rw.writeAttribute("rendered", String.valueOf(navBar.isRendered()), "rendered");
	    rw.writeAttribute("static", String.valueOf(navBar.isStatic()), "static");
	    rw.writeAttribute("tooltip", navBar.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", navBar.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", navBar.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", navBar.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", navBar.getTooltipPosition(), "tooltipPosition");
	    rw.writeText("Dummy content of b:NavBar", null);
		rw.endElement("NavBar");
	}
}
