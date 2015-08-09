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

package net.bootsfaces.component.iconAwesome;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:iconAwesome /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.iconAwesome.IconAwesome")
public class IconAwesomeRenderer extends CoreRenderer {
	
	/**
	 * This methods generates the HTML code of the current b:iconAwesome.
	 * @param context the FacesContext.
	 * @param component the current b:iconAwesome.
	 * @throws IOException thrown if something goes wrong when writing the HTML code.
	 */  
	@Override
	public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		IconAwesome iconAwesome = (IconAwesome) component;
		ResponseWriter rw = context.getResponseWriter();
		String clientId = iconAwesome.getClientId();
		
		// put custom code here
		// Simple demo widget that simply renders every attribute value
		rw.startElement("iconAwesome", iconAwesome);
		Tooltip.generateTooltip(context, iconAwesome, rw);
		
	    rw.writeAttribute("addon", String.valueOf(iconAwesome.isAddon()), "addon");
	    rw.writeAttribute("binding", iconAwesome.getBinding(), "binding");
	    rw.writeAttribute("flip", iconAwesome.getFlip(), "flip");
	    rw.writeAttribute("id", iconAwesome.getId(), "id");
	    rw.writeAttribute("name", iconAwesome.getName(), "name");
	    rw.writeAttribute("rendered", String.valueOf(iconAwesome.isRendered()), "rendered");
	    rw.writeAttribute("rotate", iconAwesome.getRotate(), "rotate");
	    rw.writeAttribute("size", iconAwesome.getSize(), "size");
	    rw.writeAttribute("spin", String.valueOf(iconAwesome.isSpin()), "spin");
	    rw.writeAttribute("tooltip", iconAwesome.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", iconAwesome.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", iconAwesome.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", iconAwesome.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", iconAwesome.getTooltipPosition(), "tooltipPosition");
		rw.writeText("Dummy content of b:iconAwesome", null);
		rw.endElement("iconAwesome");
		Tooltip.activateTooltips(context, iconAwesome);
		
	}
	
	
}
