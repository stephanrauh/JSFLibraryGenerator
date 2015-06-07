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

package net.bootsfaces.component.button;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:button /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.button.Button")
public class ButtonRenderer extends CoreRenderer {
	
	/**
	 * This methods generates the HTML code of the current b:button.
	 * @param context the FacesContext.
	 * @param component the current b:button.
	 * @throws IOException thrown if something goes wrong when writing the HTML code.
	 */  
	@Override
	public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		Button button = (Button) component;
		ResponseWriter rw = context.getResponseWriter();
		String clientId = button.getClientId();
		
		// put custom code here
		// Simple demo widget that simply renders every attribute value
		rw.startElement("button", button);
		Tooltip.generateTooltip(context, button, rw);
		
	    rw.writeAttribute("accesskey", button.getAccesskey(), "accesskey");
	    rw.writeAttribute("binding", button.getBinding(), "binding");
	    rw.writeAttribute("dir", button.getDir(), "dir");
	    rw.writeAttribute("disabled", String.valueOf(button.isDisabled()), "disabled");
	    rw.writeAttribute("dismiss", button.getDismiss(), "dismiss");
	    rw.writeAttribute("fragment", button.getFragment(), "fragment");
	    rw.writeAttribute("icon", button.getIcon(), "icon");
	    rw.writeAttribute("iconAlign", button.getIconAlign(), "iconAlign");
	    rw.writeAttribute("iconAwesome", button.getIconAwesome(), "iconAwesome");
	    rw.writeAttribute("id", button.getId(), "id");
	    rw.writeAttribute("immediate", String.valueOf(button.isImmediate()), "immediate");
	    rw.writeAttribute("lang", button.getLang(), "lang");
	    rw.writeAttribute("look", button.getLook(), "look");
	    rw.writeAttribute("onblur", button.getOnblur(), "onblur");
	    rw.writeAttribute("onchange", button.getOnchange(), "onchange");
	    rw.writeAttribute("onclick", button.getOnclick(), "onclick");
	    rw.writeAttribute("ondblclick", button.getOndblclick(), "ondblclick");
	    rw.writeAttribute("onfocus", button.getOnfocus(), "onfocus");
	    rw.writeAttribute("onkeydown", button.getOnkeydown(), "onkeydown");
	    rw.writeAttribute("onkeypress", button.getOnkeypress(), "onkeypress");
	    rw.writeAttribute("onkeyup", button.getOnkeyup(), "onkeyup");
	    rw.writeAttribute("onmousedown", button.getOnmousedown(), "onmousedown");
	    rw.writeAttribute("onmousemove", button.getOnmousemove(), "onmousemove");
	    rw.writeAttribute("onmouseout", button.getOnmouseout(), "onmouseout");
	    rw.writeAttribute("onmouseover", button.getOnmouseover(), "onmouseover");
	    rw.writeAttribute("onmouseup", button.getOnmouseup(), "onmouseup");
	    rw.writeAttribute("onselect", button.getOnselect(), "onselect");
	    rw.writeAttribute("outcome", button.getOutcome(), "outcome");
	    rw.writeAttribute("rendered", String.valueOf(button.isRendered()), "rendered");
	    rw.writeAttribute("size", button.getSize(), "size");
	    rw.writeAttribute("style", button.getStyle(), "style");
	    rw.writeAttribute("styleClass", button.getStyleClass(), "styleClass");
	    rw.writeAttribute("tabindex", button.getTabindex(), "tabindex");
	    rw.writeAttribute("title", button.getTitle(), "title");
	    rw.writeAttribute("tooltip", button.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", button.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", button.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", button.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", button.getTooltipPosition(), "tooltipPosition");
	    rw.writeAttribute("value", button.getValue(), "value");
		rw.writeText("Dummy content of b:button", null);
		rw.endElement("button");
		Tooltip.activateTooltips(fc, c.getAttributes(), c);
		
	}
	
	
}
