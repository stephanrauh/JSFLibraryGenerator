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

package net.bootsfaces.component.row;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:row /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.row.Row")
public class RowRenderer extends CoreRenderer {
	
	
	@Override
	public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		Row row = (Row) component;
		Map<String, Object> attrs = row.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = row.getClientId();
		
		// put custom code here
	}
	
	@Override
	public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		Row row = (Row) component;
		Map<String, Object> attrs = row.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = row.getClientId();
	
		// Simple demo widget that simply renders every attribute value
		rw.startElement("row", row);
		Tooltip.generateTooltip(context, attrs, rw);
		
	    rw.writeAttribute("id", row.getId(), "id");
	    rw.writeAttribute("rendered", String.valueOf(row.isRendered()), "rendered");
	    rw.writeAttribute("style", row.getStyle(), "style");
	    rw.writeAttribute("styleClass", row.getStyleClass(), "styleClass");
	    rw.writeAttribute("tooltip", row.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", row.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", row.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", row.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", row.getTooltipPosition(), "tooltipPosition");
	    rw.writeText("Dummy content of b:Row", null);
		rw.endElement("Row");
	}
}
