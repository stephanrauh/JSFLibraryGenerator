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

package net.bootsfaces.component.container;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:container /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.container.Container")
public class ContainerRenderer extends CoreRenderer {
	
	
	@Override
	public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		Container container = (Container) component;
		Map<String, Object> attrs = container.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = container.getClientId();
		
		// put custom code here
	}
	
	@Override
	public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		Container container = (Container) component;
		Map<String, Object> attrs = container.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = container.getClientId();
	
		// Simple demo widget that simply renders every attribute value
		rw.startElement("container", container);
		Tooltip.generateTooltip(context, attrs, rw);
		
	    rw.writeAttribute("fluid", String.valueOf(container.isFluid()), "fluid");
	    rw.writeAttribute("id", container.getId(), "id");
	    rw.writeAttribute("rendered", String.valueOf(container.isRendered()), "rendered");
	    rw.writeAttribute("style", container.getStyle(), "style");
	    rw.writeAttribute("styleClass", container.getStyleClass(), "styleClass");
	    rw.writeAttribute("tooltip", container.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", container.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", container.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", container.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", container.getTooltipPosition(), "tooltipPosition");
	    rw.writeText("Dummy content of b:Container", null);
		rw.endElement("Container");
	}
}
