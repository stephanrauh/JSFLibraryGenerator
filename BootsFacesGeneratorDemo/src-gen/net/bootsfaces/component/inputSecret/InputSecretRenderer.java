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

package net.bootsfaces.component.inputSecret;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:inputSecret /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.inputSecret.InputSecret")
public class InputSecretRenderer extends CoreRenderer {
	
	
	
	@Override
	public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		InputSecret inputSecret = (InputSecret) component;
		Map<String, Object> attrs = inputSecret.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = inputSecret.getClientId();
	
		// Simple demo widget that simply renders every attribute value
		rw.startElement("inputSecret", inputSecret);
		Tooltip.generateTooltip(context, attrs, rw);
		
	    rw.writeAttribute("accesskey", inputSecret.getAccesskey(), "accesskey");
	    rw.writeAttribute("alt", inputSecret.getAlt(), "alt");
	    rw.writeAttribute("autocomplete", inputSecret.getAutocomplete(), "autocomplete");
	    rw.writeAttribute("binding", inputSecret.getBinding(), "binding");
	    rw.writeAttribute("converter", inputSecret.getConverter(), "converter");
	    rw.writeAttribute("converterMessage", inputSecret.getConverterMessage(), "converterMessage");
	    rw.writeAttribute("dir", inputSecret.getDir(), "dir");
	    rw.writeAttribute("disabled", String.valueOf(inputSecret.isDisabled()), "disabled");
	    rw.writeAttribute("fieldSize", inputSecret.getFieldSize(), "fieldSize");
	    rw.writeAttribute("id", inputSecret.getId(), "id");
	    rw.writeAttribute("immediate", String.valueOf(inputSecret.isImmediate()), "immediate");
	    rw.writeAttribute("label", inputSecret.getLabel(), "label");
	    rw.writeAttribute("lang", inputSecret.getLang(), "lang");
	    rw.writeAttribute("maxlength", inputSecret.getMaxlength(), "maxlength");
	    rw.writeAttribute("onblur", inputSecret.getOnblur(), "onblur");
	    rw.writeAttribute("onchange", inputSecret.getOnchange(), "onchange");
	    rw.writeAttribute("onclick", inputSecret.getOnclick(), "onclick");
	    rw.writeAttribute("ondblclick", inputSecret.getOndblclick(), "ondblclick");
	    rw.writeAttribute("onfocus", inputSecret.getOnfocus(), "onfocus");
	    rw.writeAttribute("onkeydown", inputSecret.getOnkeydown(), "onkeydown");
	    rw.writeAttribute("onkeypress", inputSecret.getOnkeypress(), "onkeypress");
	    rw.writeAttribute("onkeyup", inputSecret.getOnkeyup(), "onkeyup");
	    rw.writeAttribute("onmousedown", inputSecret.getOnmousedown(), "onmousedown");
	    rw.writeAttribute("onmousemove", inputSecret.getOnmousemove(), "onmousemove");
	    rw.writeAttribute("onmouseout", inputSecret.getOnmouseout(), "onmouseout");
	    rw.writeAttribute("onmouseover", inputSecret.getOnmouseover(), "onmouseover");
	    rw.writeAttribute("onmouseup", inputSecret.getOnmouseup(), "onmouseup");
	    rw.writeAttribute("onselect", inputSecret.getOnselect(), "onselect");
	    rw.writeAttribute("placeholder", inputSecret.getPlaceholder(), "placeholder");
	    rw.writeAttribute("readonly", String.valueOf(inputSecret.isReadonly()), "readonly");
	    rw.writeAttribute("renderLabel", inputSecret.getRenderLabel(), "renderLabel");
	    rw.writeAttribute("rendered", String.valueOf(inputSecret.isRendered()), "rendered");
	    rw.writeAttribute("required", String.valueOf(inputSecret.isRequired()), "required");
	    rw.writeAttribute("requiredMessage", inputSecret.getRequiredMessage(), "requiredMessage");
	    rw.writeAttribute("size", inputSecret.getSize(), "size");
	    rw.writeAttribute("span", inputSecret.getSpan(), "span");
	    rw.writeAttribute("style", inputSecret.getStyle(), "style");
	    rw.writeAttribute("styleClass", inputSecret.getStyleClass(), "styleClass");
	    rw.writeAttribute("tabindex", inputSecret.getTabindex(), "tabindex");
	    rw.writeAttribute("title", inputSecret.getTitle(), "title");
	    rw.writeAttribute("tooltip", inputSecret.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", inputSecret.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", inputSecret.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", inputSecret.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", inputSecret.getTooltipPosition(), "tooltipPosition");
	    rw.writeAttribute("type", inputSecret.getType(), "type");
	    rw.writeAttribute("validator", inputSecret.getValidator(), "validator");
	    rw.writeAttribute("validatorMessage", inputSecret.getValidatorMessage(), "validatorMessage");
	    rw.writeAttribute("value", inputSecret.getValue(), "value");
	    rw.writeAttribute("valueChangeListener", inputSecret.getValueChangeListener(), "valueChangeListener");
	    rw.writeText("Dummy content of b:InputSecret", null);
		rw.endElement("InputSecret");
	}
}
