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

package net.bootsfaces.component.buttonGroup;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:buttonGroup /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.buttonGroup.ButtonGroup")
public class ButtonGroupRenderer extends CoreRenderer {
	
	
	@Override
	public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		ButtonGroup buttonGroup = (ButtonGroup) component;
		Map<String, Object> attrs = buttonGroup.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = buttonGroup.getClientId();
		
		// put custom code here
	}
	
	@Override
	public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		ButtonGroup buttonGroup = (ButtonGroup) component;
		Map<String, Object> attrs = buttonGroup.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = buttonGroup.getClientId();
	
		// Simple demo widget that simply renders every attribute value
		rw.startElement("buttonGroup", buttonGroup);
		Tooltip.generateTooltip(context, attrs, rw);
		
	    rw.writeAttribute("binding", buttonGroup.getBinding(), "binding");
	    rw.writeAttribute("id", buttonGroup.getId(), "id");
	    rw.writeAttribute("orientation", buttonGroup.getOrientation(), "orientation");
	    rw.writeAttribute("rendered", String.valueOf(buttonGroup.isRendered()), "rendered");
	    rw.writeAttribute("size", buttonGroup.getSize(), "size");
	    rw.writeAttribute("tooltip", buttonGroup.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", buttonGroup.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", buttonGroup.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", buttonGroup.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", buttonGroup.getTooltipPosition(), "tooltipPosition");
	    rw.writeText("Dummy content of b:ButtonGroup", null);
		rw.endElement("ButtonGroup");
	}
}
