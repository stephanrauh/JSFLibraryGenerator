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

package net.bootsfaces.component.panelGrid;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:panelGrid /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.panelGrid.PanelGrid")
public class PanelGridRenderer extends CoreRenderer {
	
	/**
	 * This methods generates the HTML code of the current b:panelGrid.
	 * @param context the FacesContext.
	 * @param component the current b:panelGrid.
	 * @throws IOException thrown if something goes wrong when writing the HTML code.
	 */  
	@Override
	public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		PanelGrid panelGrid = (PanelGrid) component;
		ResponseWriter rw = context.getResponseWriter();
		String clientId = panelGrid.getClientId();
		
		// put custom code here
		// Simple demo widget that simply renders every attribute value
		rw.startElement("panelGrid", panelGrid);
		Tooltip.generateTooltip(context, panelGrid, rw);
		
	    rw.writeAttribute("colSpans", panelGrid.getColSpans(), "colSpans");
	    rw.writeAttribute("columnclasses", panelGrid.getColumnclasses(), "columnclasses");
	    rw.writeAttribute("id", panelGrid.getId(), "id");
	    rw.writeAttribute("size", panelGrid.getSize(), "size");
	    rw.writeAttribute("style", panelGrid.getStyle(), "style");
	    rw.writeAttribute("styleClass", panelGrid.getStyleClass(), "styleClass");
	    rw.writeAttribute("tooltip", panelGrid.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", panelGrid.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", panelGrid.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", panelGrid.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", panelGrid.getTooltipPosition(), "tooltipPosition");
		rw.writeText("Dummy content of b:panelGrid", null);
		rw.endElement("panelGrid");
		Tooltip.activateTooltips(context, panelGrid);
		
	}
	
	
}
