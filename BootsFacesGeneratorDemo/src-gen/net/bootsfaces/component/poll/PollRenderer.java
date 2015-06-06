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

package net.bootsfaces.component.poll;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:poll /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.poll.Poll")
public class PollRenderer extends CoreRenderer {
	@Override
	public void decode(FacesContext context, UIComponent component) {
	    Poll poll = (Poll) component;
	
	
	    decodeBehaviors(context, poll);
	
	    String clientId = poll.getClientId(context);
	    String submittedValue = (String) context.getExternalContext().getRequestParameterMap().get(poll);
	
	    if (submittedValue != null) {
	    	poll.setSubmittedValue(submittedValue);
	    }
	}
	
	
	
	@Override
	public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		Poll poll = (Poll) component;
		Map<String, Object> attrs = poll.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = poll.getClientId();
	
		// Simple demo widget that simply renders every attribute value
		rw.startElement("poll", poll);
		Tooltip.generateTooltip(context, attrs, rw);
		
	    rw.writeAttribute("action", poll.getAction(), "action");
	    rw.writeAttribute("actionListener", poll.getActionListener(), "actionListener");
	    rw.writeAttribute("execute", poll.getExecute(), "execute");
	    rw.writeAttribute("id", poll.getId(), "id");
	    rw.writeAttribute("interval", poll.getInterval(), "interval");
	    rw.writeAttribute("once", poll.getOnce(), "once");
	    rw.writeAttribute("rendered", String.valueOf(poll.isRendered()), "rendered");
	    rw.writeAttribute("update", poll.getUpdate(), "update");
	    rw.writeText("Dummy content of b:Poll", null);
		rw.endElement("Poll");
	}
}
