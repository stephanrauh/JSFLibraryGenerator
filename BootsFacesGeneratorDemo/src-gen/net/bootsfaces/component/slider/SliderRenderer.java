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

package net.bootsfaces.component.slider;

import javax.faces.component.*;
import java.io.IOException;
import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.FacesRenderer;

import net.bootsfaces.render.CoreRenderer;
import net.bootsfaces.render.Tooltip;


/** This class generates the HTML code of &lt;b:slider /&gt;. */
@FacesRenderer(componentFamily = "net.bootsfaces.component", rendererType = "net.bootsfaces.component.slider.Slider")
public class SliderRenderer extends CoreRenderer {
	@Override
	public void decode(FacesContext context, UIComponent component) {
	    Slider slider = (Slider) component;
	
	
	    decodeBehaviors(context, slider);
	
	    String clientId = slider.getClientId(context);
	    String submittedValue = (String) context.getExternalContext().getRequestParameterMap().get(slider);
	
	    if (submittedValue != null) {
	    	slider.setSubmittedValue(submittedValue);
	    }
	}
	
	
	
	@Override
	public void encodeEnd(FacesContext context, UIComponent component) throws IOException {
	    if (!component.isRendered()) {
	        return;
	    }
		Slider slider = (Slider) component;
		Map<String, Object> attrs = slider.getAttributes();
		ResponseWriter rw = context.getResponseWriter();
		String clientId = slider.getClientId();
	
		// Simple demo widget that simply renders every attribute value
		rw.startElement("slider", slider);
		Tooltip.generateTooltip(context, attrs, rw);
		
	    rw.writeAttribute("binding", slider.getBinding(), "binding");
	    rw.writeAttribute("handleShape", slider.getHandleShape(), "handleShape");
	    rw.writeAttribute("handleSize", slider.getHandleSize(), "handleSize");
	    rw.writeAttribute("id", slider.getId(), "id");
	    rw.writeAttribute("label", slider.getLabel(), "label");
	    rw.writeAttribute("max", slider.getMax(), "max");
	    rw.writeAttribute("min", slider.getMin(), "min");
	    rw.writeAttribute("mode", slider.getMode(), "mode");
	    rw.writeAttribute("orientation", slider.getOrientation(), "orientation");
	    rw.writeAttribute("rendered", String.valueOf(slider.isRendered()), "rendered");
	    rw.writeAttribute("step", slider.getStep(), "step");
	    rw.writeAttribute("tooltip", slider.getTooltip(), "tooltip");
	    rw.writeAttribute("tooltipDelay", slider.getTooltipDelay(), "tooltipDelay");
	    rw.writeAttribute("tooltipDelayHide", slider.getTooltipDelayHide(), "tooltipDelayHide");
	    rw.writeAttribute("tooltipDelayShow", slider.getTooltipDelayShow(), "tooltipDelayShow");
	    rw.writeAttribute("tooltipPosition", slider.getTooltipPosition(), "tooltipPosition");
	    rw.writeAttribute("value", slider.getValue(), "value");
	    rw.writeText("Dummy content of b:Slider", null);
		rw.endElement("Slider");
	}
}
