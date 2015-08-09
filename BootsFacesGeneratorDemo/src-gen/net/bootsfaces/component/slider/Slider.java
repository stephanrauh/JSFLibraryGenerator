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
import net.bootsfaces.render.Tooltip;


/** This class holds the attributes of &lt;b:slider /&gt;. */
@FacesComponent("net.bootsfaces.component.slider.Slider")
public class Slider extends HtmlInputText  implements net.bootsfaces.render.IHasTooltip  {
	
	public static final String COMPONENT_TYPE = "net.bootsfaces.component.slider.Slider";
	
	public static final String COMPONENT_FAMILY = "net.bootsfaces.component";
	
	public static final String DEFAULT_RENDERER = "net.bootsfaces.component.slider.Slider";
	
	public Slider() {
		
		
	Tooltip.addResourceFile();
		setRendererType(DEFAULT_RENDERER);
	}
	
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
	
	
    protected enum PropertyKeys {
binding,
handleShape,
handleSize,
id,
label,
max,
min,
mode,
orientation,
step,
tooltip,
tooltipDelay,
tooltipDelayHide,
tooltipDelayShow,
tooltipPosition
;

        String toString;

        PropertyKeys(String toString) {
            this.toString = toString;
        }

        PropertyKeys() {}

        public String toString() {
            return ((this.toString != null) ? this.toString : super.toString());
        }
    }
	

	/**
	 * An el expression referring to a server side UIComponent instance in a backing bean. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public javax.faces.component.UIComponent getBinding() {
		javax.faces.component.UIComponent value = (javax.faces.component.UIComponent)getStateHelper().eval(PropertyKeys.binding);
		return  value;
	}
	
	/**
	 * An el expression referring to a server side UIComponent instance in a backing bean. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setBinding(javax.faces.component.UIComponent _binding) {
	    getStateHelper().put(PropertyKeys.binding, _binding);
    }
	

	/**
	 * The default handle is squared. Specifing the "round" value for this attribute will turn the handle shape to a circle. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getHandleShape() {
		String value = (String)getStateHelper().eval(PropertyKeys.handleShape);
		return  value;
	}
	
	/**
	 * The default handle is squared. Specifing the "round" value for this attribute will turn the handle shape to a circle. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setHandleShape(String _handleShape) {
	    getStateHelper().put(PropertyKeys.handleShape, _handleShape);
    }
	

	/**
	 * In some situations (eg. mobile phones) the slider handle may be difficult to operate because of its size. Specifing the "md" or "lg" value for this attribute will change the handle size accordingly. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getHandleSize() {
		String value = (String)getStateHelper().eval(PropertyKeys.handleSize);
		return  value;
	}
	
	/**
	 * In some situations (eg. mobile phones) the slider handle may be difficult to operate because of its size. Specifing the "md" or "lg" value for this attribute will change the handle size accordingly. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setHandleSize(String _handleSize) {
	    getStateHelper().put(PropertyKeys.handleSize, _handleSize);
    }
	

	/**
	 * Unique identifier of the component in a namingContainer. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getId() {
		String value = (String)getStateHelper().eval(PropertyKeys.id);
		return  value;
	}
	
	/**
	 * Unique identifier of the component in a namingContainer. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setId(String _id) {
	    getStateHelper().put(PropertyKeys.id, _id);
    }
	

	/**
	 * Label for the widget field. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getLabel() {
		String value = (String)getStateHelper().eval(PropertyKeys.label);
		return  value;
	}
	
	/**
	 * Label for the widget field. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setLabel(String _label) {
	    getStateHelper().put(PropertyKeys.label, _label);
    }
	

	/**
	 * The maximum value of the slider. (default 100) <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getMax() {
		Integer value = (Integer)getStateHelper().eval(PropertyKeys.max, 0);
		return (int) value;
	}
	
	/**
	 * The maximum value of the slider. (default 100) <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setMax(int _max) {
	    getStateHelper().put(PropertyKeys.max, _max);
    }
	

	/**
	 * The minimum value of the slider. (default 0) <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getMin() {
		Integer value = (Integer)getStateHelper().eval(PropertyKeys.min, 0);
		return (int) value;
	}
	
	/**
	 * The minimum value of the slider. (default 0) <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setMin(int _min) {
	    getStateHelper().put(PropertyKeys.min, _min);
    }
	

	/**
	 * Mode of the Slider Widget.<br>There are three modes available : badge, edit and basic.<br> In <b>basic mode</b>, only the slider and the label(if present) will be shown and the slider value will be hidden.<br> In <b>badge mode</b>, the default, the slider value will be shown in a badge.<br> In <b>edit mode</b>, an editable input field showing the slider value will be shown; in this mode you can change the value by sliding or editing the value in the field. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getMode() {
		String value = (String)getStateHelper().eval(PropertyKeys.mode);
		return  value;
	}
	
	/**
	 * Mode of the Slider Widget.<br>There are three modes available : badge, edit and basic.<br> In <b>basic mode</b>, only the slider and the label(if present) will be shown and the slider value will be hidden.<br> In <b>badge mode</b>, the default, the slider value will be shown in a badge.<br> In <b>edit mode</b>, an editable input field showing the slider value will be shown; in this mode you can change the value by sliding or editing the value in the field. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setMode(String _mode) {
	    getStateHelper().put(PropertyKeys.mode, _mode);
    }
	

	/**
	 * Determines whether the slider handles move horizontally (min on left, max on right) or vertically (min on bottom, max on top).<br> Possible values: "horizontal"(default), "vertical", "vertical-bottom".<br> If <b>vertical</b> is specified, the Label is rendered on top, then the value and the slider on the bottom.<br> If <b>vertical-bottom</b> is specified, the slider is rendered on top, then the value and the Label on the bottom. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOrientation() {
		String value = (String)getStateHelper().eval(PropertyKeys.orientation);
		return  value;
	}
	
	/**
	 * Determines whether the slider handles move horizontally (min on left, max on right) or vertically (min on bottom, max on top).<br> Possible values: "horizontal"(default), "vertical", "vertical-bottom".<br> If <b>vertical</b> is specified, the Label is rendered on top, then the value and the slider on the bottom.<br> If <b>vertical-bottom</b> is specified, the slider is rendered on top, then the value and the Label on the bottom. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOrientation(String _orientation) {
	    getStateHelper().put(PropertyKeys.orientation, _orientation);
    }
	

	/**
	 * The step of the slider. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getStep() {
		Integer value = (Integer)getStateHelper().eval(PropertyKeys.step, 0);
		return (int) value;
	}
	
	/**
	 * The step of the slider. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setStep(int _step) {
	    getStateHelper().put(PropertyKeys.step, _step);
    }
	

	/**
	 * The text of the tooltip. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTooltip() {
		String value = (String)getStateHelper().eval(PropertyKeys.tooltip);
		return  value;
	}
	
	/**
	 * The text of the tooltip. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltip(String _tooltip) {
	    getStateHelper().put(PropertyKeys.tooltip, _tooltip);
    }
	

	/**
	 * The tooltip is shown and hidden with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getTooltipDelay() {
		Integer value = (Integer)getStateHelper().eval(PropertyKeys.tooltipDelay, 0);
		return (int) value;
	}
	
	/**
	 * The tooltip is shown and hidden with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltipDelay(int _tooltipDelay) {
	    getStateHelper().put(PropertyKeys.tooltipDelay, _tooltipDelay);
    }
	

	/**
	 * The tooltip is hidden with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getTooltipDelayHide() {
		Integer value = (Integer)getStateHelper().eval(PropertyKeys.tooltipDelayHide, 0);
		return (int) value;
	}
	
	/**
	 * The tooltip is hidden with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltipDelayHide(int _tooltipDelayHide) {
	    getStateHelper().put(PropertyKeys.tooltipDelayHide, _tooltipDelayHide);
    }
	

	/**
	 * The tooltip is shown with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getTooltipDelayShow() {
		Integer value = (Integer)getStateHelper().eval(PropertyKeys.tooltipDelayShow, 0);
		return (int) value;
	}
	
	/**
	 * The tooltip is shown with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltipDelayShow(int _tooltipDelayShow) {
	    getStateHelper().put(PropertyKeys.tooltipDelayShow, _tooltipDelayShow);
    }
	

	/**
	 * Where is the tooltip to be displayed? Possible values: "top", "bottom", "right", "left", "auto", "auto top", "auto bottom", "auto right" and "auto left". Default to "bottom". <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTooltipPosition() {
		String value = (String)getStateHelper().eval(PropertyKeys.tooltipPosition);
		return  value;
	}
	
	/**
	 * Where is the tooltip to be displayed? Possible values: "top", "bottom", "right", "left", "auto", "auto top", "auto bottom", "auto right" and "auto left". Default to "bottom". <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltipPosition(String _tooltipPosition) {
	    getStateHelper().put(PropertyKeys.tooltipPosition, _tooltipPosition);
    }
	
}

