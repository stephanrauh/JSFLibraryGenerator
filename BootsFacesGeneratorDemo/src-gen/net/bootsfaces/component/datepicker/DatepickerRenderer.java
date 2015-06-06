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

package net.bootsfaces.component.datepicker;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:datepicker /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.datepicker.Datepicker")
public class DatepickerRenderer extends CoreRenderer {
	
	
	
	@Override
	public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		Datepicker datepicker = (Datepicker) component;
		Map<String, Object> attrs = datepicker.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = datepicker.getClientId();
	
		// Simple demo widget that simply renders every attribute value
		rw.startElement("datepicker", datepicker);
		Tooltip.generateTooltip(context, attrs, rw);
		
	    rw.writeAttribute("binding", datepicker.getBinding(), "binding");
	    rw.writeAttribute("changeMonth", String.valueOf(datepicker.isChangeMonth()), "changeMonth");
	    rw.writeAttribute("changeYear", String.valueOf(datepicker.isChangeYear()), "changeYear");
	    rw.writeAttribute("firstDay", datepicker.getFirstDay(), "firstDay");
	    rw.writeAttribute("id", datepicker.getId(), "id");
	    rw.writeAttribute("lang", datepicker.getLang(), "lang");
	    rw.writeAttribute("mode", datepicker.getMode(), "mode");
	    rw.writeAttribute("numberOfMonths", datepicker.getNumberOfMonths(), "numberOfMonths");
	    rw.writeAttribute("placeholder", datepicker.getPlaceholder(), "placeholder");
	    rw.writeAttribute("rendered", String.valueOf(datepicker.isRendered()), "rendered");
	    rw.writeAttribute("showButtonPanel", String.valueOf(datepicker.isShowButtonPanel()), "showButtonPanel");
	    rw.writeAttribute("showWeek", String.valueOf(datepicker.isShowWeek()), "showWeek");
	    rw.writeAttribute("tooltip", datepicker.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", datepicker.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", datepicker.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", datepicker.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", datepicker.getTooltipPosition(), "tooltipPosition");
	    rw.writeAttribute("value", datepicker.getValue(), "value");
	    rw.writeText("Dummy content of b:Datepicker", null);
		rw.endElement("Datepicker");
	}
}
