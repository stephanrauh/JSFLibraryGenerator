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

package net.bootsfaces.component.badge;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:badge /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.badge.Badge")
public class BadgeRenderer extends CoreRenderer {
	
	/**
	 * This methods generates the HTML code of the current b:badge.
	 * @param context the FacesContext.
	 * @param component the current b:badge.
	 * @throws IOException thrown if something goes wrong when writing the HTML code.
	 */  
	@Override
	public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		Badge badge = (Badge) component;
		ResponseWriter rw = context.getResponseWriter();
		String clientId = badge.getClientId();
		
		// put custom code here
		// Simple demo widget that simply renders every attribute value
		rw.startElement("badge", badge);
		
	    rw.writeAttribute("binding", badge.getBinding(), "binding");
	    rw.writeAttribute("id", badge.getId(), "id");
	    rw.writeAttribute("rendered", String.valueOf(badge.isRendered()), "rendered");
	    rw.writeAttribute("severity", badge.getSeverity(), "severity");
	    rw.writeAttribute("value", badge.getValue(), "value");
		rw.writeText("Dummy content of b:badge", null);
		rw.endElement("badge");
		Tooltip.activateTooltips(fc, c.getAttributes(), c);
		
	}
	
	
}
