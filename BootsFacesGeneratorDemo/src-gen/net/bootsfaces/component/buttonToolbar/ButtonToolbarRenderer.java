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

package net.bootsfaces.component.buttonToolbar;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:buttonToolbar /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.buttonToolbar.ButtonToolbar")
public class ButtonToolbarRenderer extends CoreRenderer {
	
	
	@Override
	public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		ButtonToolbar buttonToolbar = (ButtonToolbar) component;
		Map<String, Object> attrs = buttonToolbar.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = buttonToolbar.getClientId();
		
		// put custom code here
	}
	
	@Override
	public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		ButtonToolbar buttonToolbar = (ButtonToolbar) component;
		Map<String, Object> attrs = buttonToolbar.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = buttonToolbar.getClientId();
	
		// Simple demo widget that simply renders every attribute value
		rw.startElement("buttonToolbar", buttonToolbar);
		Tooltip.generateTooltip(context, attrs, rw);
		
	    rw.writeAttribute("binding", buttonToolbar.getBinding(), "binding");
	    rw.writeAttribute("id", buttonToolbar.getId(), "id");
	    rw.writeAttribute("rendered", String.valueOf(buttonToolbar.isRendered()), "rendered");
	    rw.writeAttribute("tooltip", buttonToolbar.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", buttonToolbar.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", buttonToolbar.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", buttonToolbar.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", buttonToolbar.getTooltipPosition(), "tooltipPosition");
	    rw.writeText("Dummy content of b:ButtonToolbar", null);
		rw.endElement("ButtonToolbar");
	}
}
