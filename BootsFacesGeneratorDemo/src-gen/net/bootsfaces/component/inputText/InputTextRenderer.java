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

package net.bootsfaces.component.inputText;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:inputText /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.inputText.InputText")
public class InputTextRenderer extends CoreRenderer {
	@Override
	public void decode(FacesContext context, UIComponent component) {
	    InputText inputText = (InputText) component;
	
		if (inputText.isDisabled() || inputText.isReadonly()) {
		    return;
		}
	
	    decodeBehaviors(context, inputText);
	
	    String clientId = inputText.getClientId(context);
	    String submittedValue = (String) context.getExternalContext().getRequestParameterMap().get(inputText);
	
	    if (submittedValue != null) {
	    	inputText.setSubmittedValue(submittedValue);
	    }
	}
	
	
	
	@Override
	public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		InputText inputText = (InputText) component;
		Map<String, Object> attrs = inputText.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = inputText.getClientId();
	
		// Simple demo widget that simply renders every attribute value
		rw.startElement("inputText", inputText);
		Tooltip.generateTooltip(context, attrs, rw);
		
	    rw.writeAttribute("accesskey", inputText.getAccesskey(), "accesskey");
	    rw.writeAttribute("alt", inputText.getAlt(), "alt");
	    rw.writeAttribute("autocomplete", inputText.getAutocomplete(), "autocomplete");
	    rw.writeAttribute("binding", inputText.getBinding(), "binding");
	    rw.writeAttribute("converter", inputText.getConverter(), "converter");
	    rw.writeAttribute("converterMessage", inputText.getConverterMessage(), "converterMessage");
	    rw.writeAttribute("dir", inputText.getDir(), "dir");
	    rw.writeAttribute("disabled", String.valueOf(inputText.isDisabled()), "disabled");
	    rw.writeAttribute("fieldSize", inputText.getFieldSize(), "fieldSize");
	    rw.writeAttribute("id", inputText.getId(), "id");
	    rw.writeAttribute("immediate", String.valueOf(inputText.isImmediate()), "immediate");
	    rw.writeAttribute("label", inputText.getLabel(), "label");
	    rw.writeAttribute("lang", inputText.getLang(), "lang");
	    rw.writeAttribute("maxlength", inputText.getMaxlength(), "maxlength");
	    rw.writeAttribute("onblur", inputText.getOnblur(), "onblur");
	    rw.writeAttribute("onchange", inputText.getOnchange(), "onchange");
	    rw.writeAttribute("onclick", inputText.getOnclick(), "onclick");
	    rw.writeAttribute("ondblclick", inputText.getOndblclick(), "ondblclick");
	    rw.writeAttribute("onfocus", inputText.getOnfocus(), "onfocus");
	    rw.writeAttribute("onkeydown", inputText.getOnkeydown(), "onkeydown");
	    rw.writeAttribute("onkeypress", inputText.getOnkeypress(), "onkeypress");
	    rw.writeAttribute("onkeyup", inputText.getOnkeyup(), "onkeyup");
	    rw.writeAttribute("onmousedown", inputText.getOnmousedown(), "onmousedown");
	    rw.writeAttribute("onmousemove", inputText.getOnmousemove(), "onmousemove");
	    rw.writeAttribute("onmouseout", inputText.getOnmouseout(), "onmouseout");
	    rw.writeAttribute("onmouseover", inputText.getOnmouseover(), "onmouseover");
	    rw.writeAttribute("onmouseup", inputText.getOnmouseup(), "onmouseup");
	    rw.writeAttribute("onselect", inputText.getOnselect(), "onselect");
	    rw.writeAttribute("placeholder", inputText.getPlaceholder(), "placeholder");
	    rw.writeAttribute("readonly", String.valueOf(inputText.isReadonly()), "readonly");
	    rw.writeAttribute("renderLabel", inputText.getRenderLabel(), "renderLabel");
	    rw.writeAttribute("rendered", String.valueOf(inputText.isRendered()), "rendered");
	    rw.writeAttribute("required", String.valueOf(inputText.isRequired()), "required");
	    rw.writeAttribute("requiredMessage", inputText.getRequiredMessage(), "requiredMessage");
	    rw.writeAttribute("size", inputText.getSize(), "size");
	    rw.writeAttribute("span", inputText.getSpan(), "span");
	    rw.writeAttribute("style", inputText.getStyle(), "style");
	    rw.writeAttribute("styleClass", inputText.getStyleClass(), "styleClass");
	    rw.writeAttribute("tabindex", inputText.getTabindex(), "tabindex");
	    rw.writeAttribute("title", inputText.getTitle(), "title");
	    rw.writeAttribute("tooltip", inputText.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", inputText.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", inputText.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", inputText.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", inputText.getTooltipPosition(), "tooltipPosition");
	    rw.writeAttribute("type", inputText.getType(), "type");
	    rw.writeAttribute("validator", inputText.getValidator(), "validator");
	    rw.writeAttribute("validatorMessage", inputText.getValidatorMessage(), "validatorMessage");
	    rw.writeAttribute("value", inputText.getValue(), "value");
	    rw.writeAttribute("valueChangeListener", inputText.getValueChangeListener(), "valueChangeListener");
	    rw.writeText("Dummy content of b:InputText", null);
		rw.endElement("InputText");
	}
}
