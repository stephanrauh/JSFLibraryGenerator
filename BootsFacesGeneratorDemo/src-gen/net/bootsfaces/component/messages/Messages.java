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

package net.bootsfaces.component.messages;

import javax.faces.component.*;
import net.bootsfaces.render.Tooltip;


/** This class holds the attributes of &lt;b:messages /&gt;. */
@FacesComponent("net.bootsfaces.component.messages.Messages")
public class Messages extends UIMessages  implements net.bootsfaces.render.IHasTooltip  {
	
	public static final String COMPONENT_TYPE = "net.bootsfaces.component.messages.Messages";
	
	public static final String COMPONENT_FAMILY = "net.bootsfaces.component";
	
	public static final String DEFAULT_RENDERER = "net.bootsfaces.component.messages.Messages";
	
	public Messages() {
		
		
	Tooltip.addResourceFile();
		setRendererType(DEFAULT_RENDERER);
	}
	
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
	
	
    protected enum PropertyKeys {
dir,
errorClass,
errorStyle,
fatalClass,
fatalStyle,
for,
globalOnly,
id,
infoClass,
infoStyle,
showDetail,
showSummary,
style,
styleClass,
tooltip,
tooltip,
tooltipDelay,
tooltipDelayHide,
tooltipDelayShow,
tooltipPosition,
warnClass,
warnStyle
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
	 * HTML: The direction of text display, either 'ltr' (left-to-right) or 'rtl' (right-to-left). <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getDir() {
		String value = (String)getStateHelper().eval(PropertyKeys.dir);
		return  value;
	}
	
	/**
	 * HTML: The direction of text display, either 'ltr' (left-to-right) or 'rtl' (right-to-left). <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setDir(String _dir) {
	    getStateHelper().put(PropertyKeys.dir, _dir);
    }
	

	/**
	 * CSS class to be used for messages with severity "ERROR". <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getErrorClass() {
		String value = (String)getStateHelper().eval(PropertyKeys.errorClass);
		return  value;
	}
	
	/**
	 * CSS class to be used for messages with severity "ERROR". <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setErrorClass(String _errorClass) {
	    getStateHelper().put(PropertyKeys.errorClass, _errorClass);
    }
	

	/**
	 * CSS style to be used for messages with severity "ERROR". <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getErrorStyle() {
		String value = (String)getStateHelper().eval(PropertyKeys.errorStyle);
		return  value;
	}
	
	/**
	 * CSS style to be used for messages with severity "ERROR". <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setErrorStyle(String _errorStyle) {
	    getStateHelper().put(PropertyKeys.errorStyle, _errorStyle);
    }
	

	/**
	 * CSS class to be used for messages with severity "FATAL". <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getFatalClass() {
		String value = (String)getStateHelper().eval(PropertyKeys.fatalClass);
		return  value;
	}
	
	/**
	 * CSS class to be used for messages with severity "FATAL". <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setFatalClass(String _fatalClass) {
	    getStateHelper().put(PropertyKeys.fatalClass, _fatalClass);
    }
	

	/**
	 * CSS style to be used for messages with severity "FATAL". <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getFatalStyle() {
		String value = (String)getStateHelper().eval(PropertyKeys.fatalStyle);
		return  value;
	}
	
	/**
	 * CSS style to be used for messages with severity "FATAL". <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setFatalStyle(String _fatalStyle) {
	    getStateHelper().put(PropertyKeys.fatalStyle, _fatalStyle);
    }
	

	/**
	 * The ID of the component whose attached FacesMessage object (if present) should be diplayed by this component. It takes precedence over globalOnly. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getFor() {
		String value = (String)getStateHelper().eval(PropertyKeys.for);
		return  value;
	}
	
	/**
	 * The ID of the component whose attached FacesMessage object (if present) should be diplayed by this component. It takes precedence over globalOnly. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setFor(String _for) {
	    getStateHelper().put(PropertyKeys.for, _for);
    }
	

	/**
	 * Specifies whether only messages (FacesMessage objects) not associated with a specific component should be displayed, ie whether messages should be ignored if they are attached to a particular component. Defaults to false. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public boolean isGlobalOnly() {
		Boolean value = (Boolean)getStateHelper().eval(PropertyKeys.globalOnly, false);
		return (boolean) value;
	}
	
	/**
	 * Specifies whether only messages (FacesMessage objects) not associated with a specific component should be displayed, ie whether messages should be ignored if they are attached to a particular component. Defaults to false. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setGlobalOnly(boolean _globalOnly) {
	    getStateHelper().put(PropertyKeys.globalOnly, _globalOnly);
    }
	

	/**
	 * Get a string which uniquely identifies this UIComponent within the scope of the nearest ancestor NamingContainer component. The id is not necessarily unique across all components in the current view. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getId() {
		String value = (String)getStateHelper().eval(PropertyKeys.id);
		return  value;
	}
	
	/**
	 * Get a string which uniquely identifies this UIComponent within the scope of the nearest ancestor NamingContainer component. The id is not necessarily unique across all components in the current view. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setId(String _id) {
	    getStateHelper().put(PropertyKeys.id, _id);
    }
	

	/**
	 * CSS class to be used for messages with severity "INFO". <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getInfoClass() {
		String value = (String)getStateHelper().eval(PropertyKeys.infoClass);
		return  value;
	}
	
	/**
	 * CSS class to be used for messages with severity "INFO". <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setInfoClass(String _infoClass) {
	    getStateHelper().put(PropertyKeys.infoClass, _infoClass);
    }
	

	/**
	 * CSS style to be used for messages with severity "INFO". <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getInfoStyle() {
		String value = (String)getStateHelper().eval(PropertyKeys.infoStyle);
		return  value;
	}
	
	/**
	 * CSS style to be used for messages with severity "INFO". <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setInfoStyle(String _infoStyle) {
	    getStateHelper().put(PropertyKeys.infoStyle, _infoStyle);
    }
	

	/**
	 * Specifies whether the detailed information from the message should be shown. Default to false. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public boolean isShowDetail() {
		Boolean value = (Boolean)getStateHelper().eval(PropertyKeys.showDetail, false);
		return (boolean) value;
	}
	
	/**
	 * Specifies whether the detailed information from the message should be shown. Default to false. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setShowDetail(boolean _showDetail) {
	    getStateHelper().put(PropertyKeys.showDetail, _showDetail);
    }
	

	/**
	 * Specifies whether the summary information from the message should be shown. Defaults to true. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getShowSummary() {
		String value = (String)getStateHelper().eval(PropertyKeys.showSummary);
		return  value;
	}
	
	/**
	 * Specifies whether the summary information from the message should be shown. Defaults to true. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setShowSummary(String _showSummary) {
	    getStateHelper().put(PropertyKeys.showSummary, _showSummary);
    }
	

	/**
	 * HTML: CSS styling instructions. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getStyle() {
		String value = (String)getStateHelper().eval(PropertyKeys.style);
		return  value;
	}
	
	/**
	 * HTML: CSS styling instructions. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setStyle(String _style) {
	    getStateHelper().put(PropertyKeys.style, _style);
    }
	

	/**
	 * The CSS class for this element.  Corresponds to the HTML 'class' attribute. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getStyleClass() {
		String value = (String)getStateHelper().eval(PropertyKeys.styleClass);
		return  value;
	}
	
	/**
	 * The CSS class for this element.  Corresponds to the HTML 'class' attribute. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setStyleClass(String _styleClass) {
	    getStateHelper().put(PropertyKeys.styleClass, _styleClass);
    }
	

	/**
	 * If true, the message summary will be rendered as a tooltip (i.e. HTML title attribute). <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTooltip() {
		String value = (String)getStateHelper().eval(PropertyKeys.tooltip);
		return  value;
	}
	
	/**
	 * If true, the message summary will be rendered as a tooltip (i.e. HTML title attribute). <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltip(String _tooltip) {
	    getStateHelper().put(PropertyKeys.tooltip, _tooltip);
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
	public String getTooltipDelay() {
		String value = (String)getStateHelper().eval(PropertyKeys.tooltipDelay);
		return  value;
	}
	
	/**
	 * The tooltip is shown and hidden with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltipDelay(String _tooltipDelay) {
	    getStateHelper().put(PropertyKeys.tooltipDelay, _tooltipDelay);
    }
	

	/**
	 * The tooltip is hidden with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTooltipDelayHide() {
		String value = (String)getStateHelper().eval(PropertyKeys.tooltipDelayHide);
		return  value;
	}
	
	/**
	 * The tooltip is hidden with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltipDelayHide(String _tooltipDelayHide) {
	    getStateHelper().put(PropertyKeys.tooltipDelayHide, _tooltipDelayHide);
    }
	

	/**
	 * The tooltip is shown with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getTooltipDelayShow() {
		String value = (String)getStateHelper().eval(PropertyKeys.tooltipDelayShow);
		return  value;
	}
	
	/**
	 * The tooltip is shown with a delay. This value is the delay in milliseconds. Defaults to 0 (no delay). <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setTooltipDelayShow(String _tooltipDelayShow) {
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
	

	/**
	 * CSS class to be used for messages with severity "WARN". <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getWarnClass() {
		String value = (String)getStateHelper().eval(PropertyKeys.warnClass);
		return  value;
	}
	
	/**
	 * CSS class to be used for messages with severity "WARN". <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setWarnClass(String _warnClass) {
	    getStateHelper().put(PropertyKeys.warnClass, _warnClass);
    }
	

	/**
	 * CSS style to be used for messages with severity "WARN". <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getWarnStyle() {
		String value = (String)getStateHelper().eval(PropertyKeys.warnStyle);
		return  value;
	}
	
	/**
	 * CSS style to be used for messages with severity "WARN". <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setWarnStyle(String _warnStyle) {
	    getStateHelper().put(PropertyKeys.warnStyle, _warnStyle);
    }
	
}

