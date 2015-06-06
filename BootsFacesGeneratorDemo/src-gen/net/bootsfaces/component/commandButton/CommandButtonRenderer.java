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

package net.bootsfaces.component.commandButton;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:commandButton /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.commandButton.CommandButton")
public class CommandButtonRenderer extends CoreRenderer {
	@Override
	public void decode(FacesContext context, UIComponent component) {
	    CommandButton commandButton = (CommandButton) component;
	
		if (commandButton.isDisabled() || commandButton.isReadonly()) {
		    return;
		}
	
	    decodeBehaviors(context, commandButton);
	
	    String clientId = commandButton.getClientId(context);
	    String submittedValue = (String) context.getExternalContext().getRequestParameterMap().get(commandButton);
	
	    if (submittedValue != null) {
	    	commandButton.setSubmittedValue(submittedValue);
	    }
	}
	
	
	
	@Override
	public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		CommandButton commandButton = (CommandButton) component;
		Map<String, Object> attrs = commandButton.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = commandButton.getClientId();
	
		// Simple demo widget that simply renders every attribute value
		rw.startElement("commandButton", commandButton);
		Tooltip.generateTooltip(context, attrs, rw);
		
	    rw.writeAttribute("accesskey", commandButton.getAccesskey(), "accesskey");
	    rw.writeAttribute("action", commandButton.getAction(), "action");
	    rw.writeAttribute("actionListener", commandButton.getActionListener(), "actionListener");
	    rw.writeAttribute("ajax", String.valueOf(commandButton.isAjax()), "ajax");
	    rw.writeAttribute("binding", commandButton.getBinding(), "binding");
	    rw.writeAttribute("dir", commandButton.getDir(), "dir");
	    rw.writeAttribute("disabled", String.valueOf(commandButton.isDisabled()), "disabled");
	    rw.writeAttribute("icon", commandButton.getIcon(), "icon");
	    rw.writeAttribute("iconAlign", commandButton.getIconAlign(), "iconAlign");
	    rw.writeAttribute("iconAwesome", commandButton.getIconAwesome(), "iconAwesome");
	    rw.writeAttribute("id", commandButton.getId(), "id");
	    rw.writeAttribute("immediate", String.valueOf(commandButton.isImmediate()), "immediate");
	    rw.writeAttribute("lang", commandButton.getLang(), "lang");
	    rw.writeAttribute("look", commandButton.getLook(), "look");
	    rw.writeAttribute("onblur", commandButton.getOnblur(), "onblur");
	    rw.writeAttribute("onchange", commandButton.getOnchange(), "onchange");
	    rw.writeAttribute("onclick", commandButton.getOnclick(), "onclick");
	    rw.writeAttribute("oncomplete", commandButton.getOncomplete(), "oncomplete");
	    rw.writeAttribute("ondblclick", commandButton.getOndblclick(), "ondblclick");
	    rw.writeAttribute("onfocus", commandButton.getOnfocus(), "onfocus");
	    rw.writeAttribute("onkeydown", commandButton.getOnkeydown(), "onkeydown");
	    rw.writeAttribute("onkeypress", commandButton.getOnkeypress(), "onkeypress");
	    rw.writeAttribute("onkeyup", commandButton.getOnkeyup(), "onkeyup");
	    rw.writeAttribute("onmousedown", commandButton.getOnmousedown(), "onmousedown");
	    rw.writeAttribute("onmousemove", commandButton.getOnmousemove(), "onmousemove");
	    rw.writeAttribute("onmouseout", commandButton.getOnmouseout(), "onmouseout");
	    rw.writeAttribute("onmouseover", commandButton.getOnmouseover(), "onmouseover");
	    rw.writeAttribute("onmouseup", commandButton.getOnmouseup(), "onmouseup");
	    rw.writeAttribute("onselect", commandButton.getOnselect(), "onselect");
	    rw.writeAttribute("rendered", String.valueOf(commandButton.isRendered()), "rendered");
	    rw.writeAttribute("size", commandButton.getSize(), "size");
	    rw.writeAttribute("style", commandButton.getStyle(), "style");
	    rw.writeAttribute("styleClass", commandButton.getStyleClass(), "styleClass");
	    rw.writeAttribute("tabindex", commandButton.getTabindex(), "tabindex");
	    rw.writeAttribute("title", commandButton.getTitle(), "title");
	    rw.writeAttribute("tooltip", commandButton.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", commandButton.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", commandButton.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", commandButton.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", commandButton.getTooltipPosition(), "tooltipPosition");
	    rw.writeAttribute("type", commandButton.getType(), "type");
	    rw.writeAttribute("update", commandButton.getUpdate(), "update");
	    rw.writeAttribute("value", commandButton.getValue(), "value");
	    rw.writeText("Dummy content of b:CommandButton", null);
		rw.endElement("CommandButton");
	}
}
