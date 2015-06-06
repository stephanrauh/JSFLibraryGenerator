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

package net.bootsfaces.component.dropButton;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:dropButton /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.dropButton.DropButton")
public class DropButtonRenderer extends CoreRenderer {
	
	
	@Override
	public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		DropButton dropButton = (DropButton) component;
		Map<String, Object> attrs = dropButton.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = dropButton.getClientId();
		
		// put custom code here
	}
	
	@Override
	public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		DropButton dropButton = (DropButton) component;
		Map<String, Object> attrs = dropButton.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = dropButton.getClientId();
	
		// Simple demo widget that simply renders every attribute value
		rw.startElement("dropButton", dropButton);
		Tooltip.generateTooltip(context, attrs, rw);
		
	    rw.writeAttribute("binding", dropButton.getBinding(), "binding");
	    rw.writeAttribute("drop", dropButton.getDrop(), "drop");
	    rw.writeAttribute("id", dropButton.getId(), "id");
	    rw.writeAttribute("look", dropButton.getLook(), "look");
	    rw.writeAttribute("rendered", String.valueOf(dropButton.isRendered()), "rendered");
	    rw.writeAttribute("size", dropButton.getSize(), "size");
	    rw.writeAttribute("tooltip", dropButton.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", dropButton.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", dropButton.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", dropButton.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", dropButton.getTooltipPosition(), "tooltipPosition");
	    rw.writeAttribute("value", dropButton.getValue(), "value");
	    rw.writeText("Dummy content of b:DropButton", null);
		rw.endElement("DropButton");
	}
}
