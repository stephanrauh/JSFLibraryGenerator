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

package net.bootsfaces.component.selectMultiMenu;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:selectMultiMenu /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.selectMultiMenu.SelectMultiMenu")
public class SelectMultiMenuRenderer extends CoreRenderer {
	
	/**
	 * This methods generates the HTML code of the current b:selectMultiMenu.
	 * @param context the FacesContext.
	 * @param component the current b:selectMultiMenu.
	 * @throws IOException thrown if something goes wrong when writing the HTML code.
	 */  
	@Override
	public void encodeBegin(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		SelectMultiMenu selectMultiMenu = (SelectMultiMenu) component;
		ResponseWriter rw = context.getResponseWriter();
		String clientId = selectMultiMenu.getClientId();
		
		// put custom code here
		// Simple demo widget that simply renders every attribute value
		rw.startElement("selectMultiMenu", selectMultiMenu);
		Tooltip.generateTooltip(context, selectMultiMenu, rw);
		
	    rw.writeAttribute("accesskey", selectMultiMenu.getAccesskey(), "accesskey");
	    rw.writeAttribute("alt", selectMultiMenu.getAlt(), "alt");
	    rw.writeAttribute("binding", selectMultiMenu.getBinding(), "binding");
	    rw.writeAttribute("dir", selectMultiMenu.getDir(), "dir");
	    rw.writeAttribute("disabled", String.valueOf(selectMultiMenu.isDisabled()), "disabled");
	    rw.writeAttribute("fieldSize", selectMultiMenu.getFieldSize(), "fieldSize");
	    rw.writeAttribute("id", selectMultiMenu.getId(), "id");
	    rw.writeAttribute("immediate", String.valueOf(selectMultiMenu.isImmediate()), "immediate");
	    rw.writeAttribute("label", selectMultiMenu.getLabel(), "label");
	    rw.writeAttribute("lang", selectMultiMenu.getLang(), "lang");
	    rw.writeAttribute("maxHeight", selectMultiMenu.getMaxHeight(), "maxHeight");
	    rw.writeAttribute("nonSelectedText", selectMultiMenu.getNonSelectedText(), "nonSelectedText");
	    rw.writeAttribute("nSelectedText", selectMultiMenu.getNSelectedText(), "nSelectedText");
	    rw.writeAttribute("allSelectedText", selectMultiMenu.getAllSelectedText(), "allSelectedText");
	    rw.writeAttribute("numberDisplayed", selectMultiMenu.getNumberDisplayed(), "numberDisplayed");
	    rw.writeAttribute("includeSelectAllOption", String.valueOf(selectMultiMenu.isIncludeSelectAllOption()), "includeSelectAllOption");
	    rw.writeAttribute("selectAllText", selectMultiMenu.getSelectAllText(), "selectAllText");
	    rw.writeAttribute("enableFiltering", String.valueOf(selectMultiMenu.isEnableFiltering()), "enableFiltering");
	    rw.writeAttribute("filterPlaceholder", selectMultiMenu.getFilterPlaceholder(), "filterPlaceholder");
	    rw.writeAttribute("radiobuttons", String.valueOf(selectMultiMenu.isRadiobuttons()), "radiobuttons");
	    rw.writeAttribute("disableIfEmpty", String.valueOf(selectMultiMenu.isDisableIfEmpty()), "disableIfEmpty");
	    rw.writeAttribute("dropRight", String.valueOf(selectMultiMenu.isDropRight()), "dropRight");
	    rw.writeAttribute("onchange", selectMultiMenu.getOnchange(), "onchange");
	    rw.writeAttribute("ondropdownshow", selectMultiMenu.getOndropdownshow(), "ondropdownshow");
	    rw.writeAttribute("ondropdownhide", selectMultiMenu.getOndropdownhide(), "ondropdownhide");
	    rw.writeAttribute("buttonClass", selectMultiMenu.getButtonClass(), "buttonClass");
	    rw.writeAttribute("styleClass", selectMultiMenu.getStyleClass(), "styleClass");
	    rw.writeAttribute("buttonWidth", selectMultiMenu.getButtonWidth(), "buttonWidth");
	    rw.writeAttribute("enableCaseInsensitiveFiltering", String.valueOf(selectMultiMenu.isEnableCaseInsensitiveFiltering()), "enableCaseInsensitiveFiltering");
	    rw.writeAttribute("placeholder", selectMultiMenu.getPlaceholder(), "placeholder");
	    rw.writeAttribute("readonly", String.valueOf(selectMultiMenu.isReadonly()), "readonly");
	    rw.writeAttribute("renderLabel", String.valueOf(selectMultiMenu.isRenderLabel()), "renderLabel");
	    rw.writeAttribute("rendered", String.valueOf(selectMultiMenu.isRendered()), "rendered");
	    rw.writeAttribute("required", String.valueOf(selectMultiMenu.isRequired()), "required");
	    rw.writeAttribute("requiredMessage", selectMultiMenu.getRequiredMessage(), "requiredMessage");
	    rw.writeAttribute("size", selectMultiMenu.getSize(), "size");
	    rw.writeAttribute("span", selectMultiMenu.getSpan(), "span");
	    rw.writeAttribute("style", selectMultiMenu.getStyle(), "style");
	    rw.writeAttribute("tabindex", selectMultiMenu.getTabindex(), "tabindex");
	    rw.writeAttribute("title", selectMultiMenu.getTitle(), "title");
	    rw.writeAttribute("tooltip", selectMultiMenu.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", selectMultiMenu.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", selectMultiMenu.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", selectMultiMenu.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", selectMultiMenu.getTooltipPosition(), "tooltipPosition");
	    rw.writeAttribute("value", selectMultiMenu.getValue(), "value");
		rw.writeText("Dummy content of b:selectMultiMenu", null);
		rw.endElement("selectMultiMenu");
		Tooltip.activateTooltips(context, selectMultiMenu);
		
	}
	
	
}
