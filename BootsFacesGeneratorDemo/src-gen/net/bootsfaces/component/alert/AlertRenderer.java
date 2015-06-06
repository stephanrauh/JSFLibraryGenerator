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

package net.bootsfaces.component.alert;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:alert /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.alert.Alert")
public class AlertRenderer extends CoreRenderer {
	
	
	@Override
	public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		Alert alert = (Alert) component;
		Map<String, Object> attrs = alert.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = alert.getClientId();
		
		// put custom code here
	}
	
	@Override
	public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		Alert alert = (Alert) component;
		Map<String, Object> attrs = alert.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = alert.getClientId();
	
		// Simple demo widget that simply renders every attribute value
		rw.startElement("alert", alert);
		Tooltip.generateTooltip(context, attrs, rw);
		
	    rw.writeAttribute("binding", alert.getBinding(), "binding");
	    rw.writeAttribute("closable", String.valueOf(alert.isClosable()), "closable");
	    rw.writeAttribute("id", alert.getId(), "id");
	    rw.writeAttribute("rendered", String.valueOf(alert.isRendered()), "rendered");
	    rw.writeAttribute("severity", alert.getSeverity(), "severity");
	    rw.writeAttribute("title", alert.getTitle(), "title");
	    rw.writeAttribute("tooltip", alert.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", alert.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", alert.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", alert.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", alert.getTooltipPosition(), "tooltipPosition");
	    rw.writeText("Dummy content of b:Alert", null);
		rw.endElement("Alert");
	}
}
