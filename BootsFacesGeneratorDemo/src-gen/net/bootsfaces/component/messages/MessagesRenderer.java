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

package net.bootsfaces.component.messages;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:messages /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.messages.Messages")
public class MessagesRenderer extends CoreRenderer {
	
	/**
	 * This methods generates the HTML code of the current b:messages.
	 * @param context the FacesContext.
	 * @param component the current b:messages.
	 * @throws IOException thrown if something goes wrong when writing the HTML code.
	 */  
	@Override
	public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		Messages messages = (Messages) component;
		ResponseWriter rw = context.getResponseWriter();
		String clientId = messages.getClientId();
		
		// put custom code here
		// Simple demo widget that simply renders every attribute value
		rw.startElement("messages", messages);
		Tooltip.generateTooltip(context, messages, rw);
		
	    rw.writeAttribute("dir", messages.getDir(), "dir");
	    rw.writeAttribute("errorClass", messages.getErrorClass(), "errorClass");
	    rw.writeAttribute("errorStyle", messages.getErrorStyle(), "errorStyle");
	    rw.writeAttribute("fatalClass", messages.getFatalClass(), "fatalClass");
	    rw.writeAttribute("fatalStyle", messages.getFatalStyle(), "fatalStyle");
	    rw.writeAttribute("for", messages.getFor(), "for");
	    rw.writeAttribute("globalOnly", String.valueOf(messages.isGlobalOnly()), "globalOnly");
	    rw.writeAttribute("id", messages.getId(), "id");
	    rw.writeAttribute("infoClass", messages.getInfoClass(), "infoClass");
	    rw.writeAttribute("infoStyle", messages.getInfoStyle(), "infoStyle");
	    rw.writeAttribute("rendered", String.valueOf(messages.isRendered()), "rendered");
	    rw.writeAttribute("showDetail", String.valueOf(messages.isShowDetail()), "showDetail");
	    rw.writeAttribute("showSummary", messages.getShowSummary(), "showSummary");
	    rw.writeAttribute("style", messages.getStyle(), "style");
	    rw.writeAttribute("styleClass", messages.getStyleClass(), "styleClass");
	    rw.writeAttribute("tooltip", messages.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltip", messages.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", messages.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", messages.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", messages.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", messages.getTooltipPosition(), "tooltipPosition");
	    rw.writeAttribute("warnClass", messages.getWarnClass(), "warnClass");
	    rw.writeAttribute("warnStyle", messages.getWarnStyle(), "warnStyle");
		rw.writeText("Dummy content of b:messages", null);
		rw.endElement("messages");
		Tooltip.activateTooltips(context, messages);
		
	}
	
	
}
