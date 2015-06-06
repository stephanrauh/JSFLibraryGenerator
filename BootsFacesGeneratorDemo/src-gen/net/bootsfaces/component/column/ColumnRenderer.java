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

package net.bootsfaces.component.column;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:column /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.column.Column")
public class ColumnRenderer extends CoreRenderer {
	
	
	@Override
	public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		Column column = (Column) component;
		Map<String, Object> attrs = column.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = column.getClientId();
		
		// put custom code here
	}
	
	@Override
	public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		Column column = (Column) component;
		Map<String, Object> attrs = column.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = column.getClientId();
	
		// Simple demo widget that simply renders every attribute value
		rw.startElement("column", column);
		Tooltip.generateTooltip(context, attrs, rw);
		
	    rw.writeAttribute("colLg", column.getColLg(), "colLg");
	    rw.writeAttribute("colMd", column.getColMd(), "colMd");
	    rw.writeAttribute("colSm", column.getColSm(), "colSm");
	    rw.writeAttribute("colXs", column.getColXs(), "colXs");
	    rw.writeAttribute("id", column.getId(), "id");
	    rw.writeAttribute("offset", column.getOffset(), "offset");
	    rw.writeAttribute("offsetLg", column.getOffsetLg(), "offsetLg");
	    rw.writeAttribute("offsetSm", column.getOffsetSm(), "offsetSm");
	    rw.writeAttribute("offsetXs", column.getOffsetXs(), "offsetXs");
	    rw.writeAttribute("rendered", String.valueOf(column.isRendered()), "rendered");
	    rw.writeAttribute("span", column.getSpan(), "span");
	    rw.writeAttribute("style", column.getStyle(), "style");
	    rw.writeAttribute("styleClass", column.getStyleClass(), "styleClass");
	    rw.writeAttribute("tooltip", column.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", column.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", column.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", column.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", column.getTooltipPosition(), "tooltipPosition");
	    rw.writeText("Dummy content of b:Column", null);
		rw.endElement("Column");
	}
}
