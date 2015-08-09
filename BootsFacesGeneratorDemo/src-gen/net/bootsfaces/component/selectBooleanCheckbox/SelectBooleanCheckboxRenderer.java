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

package net.bootsfaces.component.selectBooleanCheckbox;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:selectBooleanCheckbox /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.selectBooleanCheckbox.SelectBooleanCheckbox")
public class SelectBooleanCheckboxRenderer extends CoreRenderer {
	/**
	 * This methods receives and processes input made by the user. More specifically, it ckecks whether the
	 * user has interacted with the current b:selectBooleanCheckbox. The default implementation simply stores
	 * the input value in the list of submitted values. If the validation checks are passed,
	 * the values in the <code>submittedValues</code> list are store in the backend bean.
	 * @param context the FacesContext.
	 * @param component the current b:selectBooleanCheckbox.
	 */  
	@Override
	public void decode(FacesContext context, UIComponent component) {
	    SelectBooleanCheckbox selectBooleanCheckbox = (SelectBooleanCheckbox) component;
	
		if (selectBooleanCheckbox.isDisabled() || selectBooleanCheckbox.isReadonly()) {
		    return;
		}
	
	    decodeBehaviors(context, selectBooleanCheckbox);
	
	    String clientId = selectBooleanCheckbox.getClientId(context);
	    String submittedValue = (String) context.getExternalContext().getRequestParameterMap().get(clientId);
	
	    if (submittedValue != null) {
	    	selectBooleanCheckbox.setSubmittedValue(submittedValue);
	    }
	}
	
	/**
	 * This methods generates the HTML code of the current b:selectBooleanCheckbox.
	 * @param context the FacesContext.
	 * @param component the current b:selectBooleanCheckbox.
	 * @throws IOException thrown if something goes wrong when writing the HTML code.
	 */  
	@Override
	public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		SelectBooleanCheckbox selectBooleanCheckbox = (SelectBooleanCheckbox) component;
		ResponseWriter rw = context.getResponseWriter();
		String clientId = selectBooleanCheckbox.getClientId();
		
		// put custom code here
		// Simple demo widget that simply renders every attribute value
		rw.startElement("selectBooleanCheckbox", selectBooleanCheckbox);
		Tooltip.generateTooltip(context, selectBooleanCheckbox, rw);
		
	    rw.writeAttribute("accesskey", selectBooleanCheckbox.getAccesskey(), "accesskey");
	    rw.writeAttribute("alt", selectBooleanCheckbox.getAlt(), "alt");
	    rw.writeAttribute("binding", selectBooleanCheckbox.getBinding(), "binding");
	    rw.writeAttribute("caption", selectBooleanCheckbox.getCaption(), "caption");
	    rw.writeAttribute("converter", selectBooleanCheckbox.getConverter(), "converter");
	    rw.writeAttribute("converterMessage", selectBooleanCheckbox.getConverterMessage(), "converterMessage");
	    rw.writeAttribute("dir", selectBooleanCheckbox.getDir(), "dir");
	    rw.writeAttribute("disabled", String.valueOf(selectBooleanCheckbox.isDisabled()), "disabled");
	    rw.writeAttribute("fieldSize", selectBooleanCheckbox.getFieldSize(), "fieldSize");
	    rw.writeAttribute("id", selectBooleanCheckbox.getId(), "id");
	    rw.writeAttribute("immediate", String.valueOf(selectBooleanCheckbox.isImmediate()), "immediate");
	    rw.writeAttribute("label", selectBooleanCheckbox.getLabel(), "label");
	    rw.writeAttribute("lang", selectBooleanCheckbox.getLang(), "lang");
	    rw.writeAttribute("onblur", selectBooleanCheckbox.getOnblur(), "onblur");
	    rw.writeAttribute("onchange", selectBooleanCheckbox.getOnchange(), "onchange");
	    rw.writeAttribute("onclick", selectBooleanCheckbox.getOnclick(), "onclick");
	    rw.writeAttribute("ondblclick", selectBooleanCheckbox.getOndblclick(), "ondblclick");
	    rw.writeAttribute("onfocus", selectBooleanCheckbox.getOnfocus(), "onfocus");
	    rw.writeAttribute("onkeydown", selectBooleanCheckbox.getOnkeydown(), "onkeydown");
	    rw.writeAttribute("onkeypress", selectBooleanCheckbox.getOnkeypress(), "onkeypress");
	    rw.writeAttribute("onkeyup", selectBooleanCheckbox.getOnkeyup(), "onkeyup");
	    rw.writeAttribute("onmousedown", selectBooleanCheckbox.getOnmousedown(), "onmousedown");
	    rw.writeAttribute("onmousemove", selectBooleanCheckbox.getOnmousemove(), "onmousemove");
	    rw.writeAttribute("onmouseout", selectBooleanCheckbox.getOnmouseout(), "onmouseout");
	    rw.writeAttribute("onmouseover", selectBooleanCheckbox.getOnmouseover(), "onmouseover");
	    rw.writeAttribute("onmouseup", selectBooleanCheckbox.getOnmouseup(), "onmouseup");
	    rw.writeAttribute("onselect", selectBooleanCheckbox.getOnselect(), "onselect");
	    rw.writeAttribute("readonly", String.valueOf(selectBooleanCheckbox.isReadonly()), "readonly");
	    rw.writeAttribute("renderLabel", String.valueOf(selectBooleanCheckbox.isRenderLabel()), "renderLabel");
	    rw.writeAttribute("rendered", String.valueOf(selectBooleanCheckbox.isRendered()), "rendered");
	    rw.writeAttribute("span", selectBooleanCheckbox.getSpan(), "span");
	    rw.writeAttribute("style", selectBooleanCheckbox.getStyle(), "style");
	    rw.writeAttribute("styleClass", selectBooleanCheckbox.getStyleClass(), "styleClass");
	    rw.writeAttribute("tabindex", selectBooleanCheckbox.getTabindex(), "tabindex");
	    rw.writeAttribute("title", selectBooleanCheckbox.getTitle(), "title");
	    rw.writeAttribute("tooltip", selectBooleanCheckbox.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", selectBooleanCheckbox.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", selectBooleanCheckbox.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", selectBooleanCheckbox.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", selectBooleanCheckbox.getTooltipPosition(), "tooltipPosition");
	    rw.writeAttribute("value", selectBooleanCheckbox.getValue(), "value");
	    rw.writeAttribute("valueChangeListener", selectBooleanCheckbox.getValueChangeListener(), "valueChangeListener");
		rw.writeText("Dummy content of b:selectBooleanCheckbox", null);
		rw.endElement("selectBooleanCheckbox");
		Tooltip.activateTooltips(context, selectBooleanCheckbox);
		
	}
	
	
}
