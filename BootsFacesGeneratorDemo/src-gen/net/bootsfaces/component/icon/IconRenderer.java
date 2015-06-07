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

package net.bootsfaces.component.icon;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:icon /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.icon.Icon")
public class IconRenderer extends CoreRenderer {
	
	/**
	 * This methods generates the HTML code of the current b:icon.
	 * @param context the FacesContext.
	 * @param component the current b:icon.
	 * @throws IOException thrown if something goes wrong when writing the HTML code.
	 */  
	@Override
	public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		Icon icon = (Icon) component;
		ResponseWriter rw = context.getResponseWriter();
		String clientId = icon.getClientId();
		
		// put custom code here
		// Simple demo widget that simply renders every attribute value
		rw.startElement("icon", icon);
		Tooltip.generateTooltip(context, icon, rw);
		
	    rw.writeAttribute("addon", String.valueOf(icon.isAddon()), "addon");
	    rw.writeAttribute("binding", icon.getBinding(), "binding");
	    rw.writeAttribute("flip", icon.getFlip(), "flip");
	    rw.writeAttribute("id", icon.getId(), "id");
	    rw.writeAttribute("name", icon.getName(), "name");
	    rw.writeAttribute("rendered", String.valueOf(icon.isRendered()), "rendered");
	    rw.writeAttribute("rotate", icon.getRotate(), "rotate");
	    rw.writeAttribute("size", icon.getSize(), "size");
	    rw.writeAttribute("spin", String.valueOf(icon.isSpin()), "spin");
	    rw.writeAttribute("tooltip", icon.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", icon.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", icon.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", icon.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", icon.getTooltipPosition(), "tooltipPosition");
		rw.writeText("Dummy content of b:icon", null);
		rw.endElement("icon");
		Tooltip.activateTooltips(fc, c.getAttributes(), c);
		
	}
	
	
}
