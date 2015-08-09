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

package net.bootsfaces.component.selectOneMenu;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:selectOneMenu /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.selectOneMenu.SelectOneMenu")
public class SelectOneMenuRenderer extends CoreRenderer {
	
	/**
	 * This methods generates the HTML code of the current b:selectOneMenu.
	 * @param context the FacesContext.
	 * @param component the current b:selectOneMenu.
	 * @throws IOException thrown if something goes wrong when writing the HTML code.
	 */  
	@Override
	public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		SelectOneMenu selectOneMenu = (SelectOneMenu) component;
		ResponseWriter rw = context.getResponseWriter();
		String clientId = selectOneMenu.getClientId();
		
		// put custom code here
		// Simple demo widget that simply renders every attribute value
		rw.startElement("selectOneMenu", selectOneMenu);
		Tooltip.generateTooltip(context, selectOneMenu, rw);
		
	    rw.writeAttribute("accesskey", selectOneMenu.getAccesskey(), "accesskey");
	    rw.writeAttribute("alt", selectOneMenu.getAlt(), "alt");
	    rw.writeAttribute("binding", selectOneMenu.getBinding(), "binding");
	    rw.writeAttribute("dir", selectOneMenu.getDir(), "dir");
	    rw.writeAttribute("disabled", String.valueOf(selectOneMenu.isDisabled()), "disabled");
	    rw.writeAttribute("fieldSize", selectOneMenu.getFieldSize(), "fieldSize");
	    rw.writeAttribute("id", selectOneMenu.getId(), "id");
	    rw.writeAttribute("immediate", String.valueOf(selectOneMenu.isImmediate()), "immediate");
	    rw.writeAttribute("label", selectOneMenu.getLabel(), "label");
	    rw.writeAttribute("lang", selectOneMenu.getLang(), "lang");
	    rw.writeAttribute("onblur", selectOneMenu.getOnblur(), "onblur");
	    rw.writeAttribute("onchange", selectOneMenu.getOnchange(), "onchange");
	    rw.writeAttribute("onclick", selectOneMenu.getOnclick(), "onclick");
	    rw.writeAttribute("ondblclick", selectOneMenu.getOndblclick(), "ondblclick");
	    rw.writeAttribute("onfocus", selectOneMenu.getOnfocus(), "onfocus");
	    rw.writeAttribute("onkeydown", selectOneMenu.getOnkeydown(), "onkeydown");
	    rw.writeAttribute("onkeypress", selectOneMenu.getOnkeypress(), "onkeypress");
	    rw.writeAttribute("onkeyup", selectOneMenu.getOnkeyup(), "onkeyup");
	    rw.writeAttribute("onmousedown", selectOneMenu.getOnmousedown(), "onmousedown");
	    rw.writeAttribute("onmousemove", selectOneMenu.getOnmousemove(), "onmousemove");
	    rw.writeAttribute("onmouseout", selectOneMenu.getOnmouseout(), "onmouseout");
	    rw.writeAttribute("onmouseover", selectOneMenu.getOnmouseover(), "onmouseover");
	    rw.writeAttribute("onmouseup", selectOneMenu.getOnmouseup(), "onmouseup");
	    rw.writeAttribute("onselect", selectOneMenu.getOnselect(), "onselect");
	    rw.writeAttribute("placeholder", selectOneMenu.getPlaceholder(), "placeholder");
	    rw.writeAttribute("readonly", String.valueOf(selectOneMenu.isReadonly()), "readonly");
	    rw.writeAttribute("renderLabel", String.valueOf(selectOneMenu.isRenderLabel()), "renderLabel");
	    rw.writeAttribute("rendered", String.valueOf(selectOneMenu.isRendered()), "rendered");
	    rw.writeAttribute("required", String.valueOf(selectOneMenu.isRequired()), "required");
	    rw.writeAttribute("requiredMessage", selectOneMenu.getRequiredMessage(), "requiredMessage");
	    rw.writeAttribute("size", selectOneMenu.getSize(), "size");
	    rw.writeAttribute("span", selectOneMenu.getSpan(), "span");
	    rw.writeAttribute("style", selectOneMenu.getStyle(), "style");
	    rw.writeAttribute("styleClass", selectOneMenu.getStyleClass(), "styleClass");
	    rw.writeAttribute("tabindex", selectOneMenu.getTabindex(), "tabindex");
	    rw.writeAttribute("title", selectOneMenu.getTitle(), "title");
	    rw.writeAttribute("tooltip", selectOneMenu.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", selectOneMenu.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", selectOneMenu.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", selectOneMenu.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", selectOneMenu.getTooltipPosition(), "tooltipPosition");
	    rw.writeAttribute("value", selectOneMenu.getValue(), "value");
		rw.writeText("Dummy content of b:selectOneMenu", null);
		rw.endElement("selectOneMenu");
		Tooltip.activateTooltips(context, selectOneMenu);
		
	}
	
	
}
