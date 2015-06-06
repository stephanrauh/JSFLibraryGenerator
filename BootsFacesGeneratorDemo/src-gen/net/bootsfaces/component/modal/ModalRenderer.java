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

package net.bootsfaces.component.modal;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:modal /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.modal.Modal")
public class ModalRenderer extends CoreRenderer {
	
	
	@Override
	public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		Modal modal = (Modal) component;
		Map<String, Object> attrs = modal.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = modal.getClientId();
		
		// put custom code here
	}
	
	@Override
	public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		Modal modal = (Modal) component;
		Map<String, Object> attrs = modal.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = modal.getClientId();
	
		// Simple demo widget that simply renders every attribute value
		rw.startElement("modal", modal);
		Tooltip.generateTooltip(context, attrs, rw);
		
	    rw.writeAttribute("backdrop", String.valueOf(modal.isBackdrop()), "backdrop");
	    rw.writeAttribute("closeOnEscape", String.valueOf(modal.isCloseOnEscape()), "closeOnEscape");
	    rw.writeAttribute("id", modal.getId(), "id");
	    rw.writeAttribute("rendered", String.valueOf(modal.isRendered()), "rendered");
	    rw.writeAttribute("rendered", String.valueOf(modal.isRendered()), "rendered");
	    rw.writeAttribute("size", modal.getSize(), "size");
	    rw.writeAttribute("styleClass", modal.getStyleClass(), "styleClass");
	    rw.writeAttribute("title", modal.getTitle(), "title");
	    rw.writeText("Dummy content of b:Modal", null);
		rw.endElement("Modal");
	}
}
