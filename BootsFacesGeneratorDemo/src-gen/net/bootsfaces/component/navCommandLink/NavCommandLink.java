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

package net.bootsfaces.component.navCommandLink;

import javax.faces.component.*;

/** This class holds the attributes of &lt;b:navCommandLink /&gt;. */
@FacesComponent("net.bootsfaces.component.navCommandLink.NavCommandLink")
public class NavCommandLink extends UICommand {
	
	public static final String COMPONENT_TYPE = "net.bootsfaces.component.navCommandLink.NavCommandLink";
	
	public static final String COMPONENT_FAMILY = "net.bootsfaces.component";
	
	public static final String DEFAULT_RENDERER = "net.bootsfaces.component.navCommandLink.NavCommandLink";
	
	public NavCommandLink() {
		setRendererType(DEFAULT_RENDERER);
	}
	
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
	
	
    protected enum PropertyKeys {
action,
actionListener,
active,
binding,
fragment,
header,
href,
icon,
iconAlign,
iconAwesome,
id,
onblur,
onclick,
onmouseover,
outcome,
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
	 * The button action, this can be method expression or a string outcome. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public javax.el.MethodExpression getAction() {
		javax.el.MethodExpression value = (javax.el.MethodExpression)getStateHelper().eval(PropertyKeys.action);
		return  value;
	}
	
	/**
	 * The button action, this can be method expression or a string outcome. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setAction(javax.el.MethodExpression _action) {
	    getStateHelper().put(PropertyKeys.action, _action);
    }
	

	/**
	 * A method expression that refers to a method with this signature: void methodName(Action-Event). <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public javax.faces.event.ActionListener getActionListener() {
		javax.faces.event.ActionListener value = (javax.faces.event.ActionListener)getStateHelper().eval(PropertyKeys.actionListener);
		return  value;
	}
	
	/**
	 * A method expression that refers to a method with this signature: void methodName(Action-Event). <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setActionListener(javax.faces.event.ActionListener _actionListener) {
	    getStateHelper().put(PropertyKeys.actionListener, _actionListener);
    }
	

	/**
	 * Adds the active state to the link. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public boolean isActive() {
		Boolean value = (Boolean)getStateHelper().eval(PropertyKeys.active, false);
		return (boolean) value;
	}
	
	/**
	 * Adds the active state to the link. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setActive(boolean _active) {
	    getStateHelper().put(PropertyKeys.active, _active);
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
	 * The fragment  that is to be appended to the target URL. The # separator is applied automatically and needs not be included. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getFragment() {
		String value = (String)getStateHelper().eval(PropertyKeys.fragment);
		return  value;
	}
	
	/**
	 * The fragment  that is to be appended to the target URL. The # separator is applied automatically and needs not be included. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setFragment(String _fragment) {
	    getStateHelper().put(PropertyKeys.fragment, _fragment);
    }
	

	/**
	 * If present, this element is rendered as Header in a menu with the text specifide by this attribute value: all other attributes will be ignored. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getHeader() {
		String value = (String)getStateHelper().eval(PropertyKeys.header);
		return  value;
	}
	
	/**
	 * If present, this element is rendered as Header in a menu with the text specifide by this attribute value: all other attributes will be ignored. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setHeader(String _header) {
	    getStateHelper().put(PropertyKeys.header, _header);
    }
	

	/**
	 * URL to link directly to implement anchor behavior. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getHref() {
		String value = (String)getStateHelper().eval(PropertyKeys.href);
		return  value;
	}
	
	/**
	 * URL to link directly to implement anchor behavior. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setHref(String _href) {
	    getStateHelper().put(PropertyKeys.href, _href);
    }
	

	/**
	 * Navigation Link Icon, can be one of the Bootstrap's Glyphicons icon names. Alignment can be specified with the iconAlign attribute. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getIcon() {
		String value = (String)getStateHelper().eval(PropertyKeys.icon);
		return  value;
	}
	
	/**
	 * Navigation Link Icon, can be one of the Bootstrap's Glyphicons icon names. Alignment can be specified with the iconAlign attribute. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setIcon(String _icon) {
	    getStateHelper().put(PropertyKeys.icon, _icon);
    }
	

	/**
	 * Alignment can right or left. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getIconAlign() {
		String value = (String)getStateHelper().eval(PropertyKeys.iconAlign);
		return  value;
	}
	
	/**
	 * Alignment can right or left. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setIconAlign(String _iconAlign) {
	    getStateHelper().put(PropertyKeys.iconAlign, _iconAlign);
    }
	

	/**
	 * Navigation Link Font Awesome Icon, can be one of the Font Awesome icon names. Alignment can be specified with the iconAlign attribute. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getIconAwesome() {
		String value = (String)getStateHelper().eval(PropertyKeys.iconAwesome);
		return  value;
	}
	
	/**
	 * Navigation Link Font Awesome Icon, can be one of the Font Awesome icon names. Alignment can be specified with the iconAlign attribute. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setIconAwesome(String _iconAwesome) {
	    getStateHelper().put(PropertyKeys.iconAwesome, _iconAwesome);
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
	 * JavaScript function which is called when the widget looses the focus. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnblur() {
		String value = (String)getStateHelper().eval(PropertyKeys.onblur);
		return  value;
	}
	
	/**
	 * JavaScript function which is called when the widget looses the focus. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnblur(String _onblur) {
	    getStateHelper().put(PropertyKeys.onblur, _onblur);
    }
	

	/**
	 * JavaScript function which is called when the widget is clicked. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnclick() {
		String value = (String)getStateHelper().eval(PropertyKeys.onclick);
		return  value;
	}
	
	/**
	 * JavaScript function which is called when the widget is clicked. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnclick(String _onclick) {
	    getStateHelper().put(PropertyKeys.onclick, _onclick);
    }
	

	/**
	 * JavaScript function which is called when the mouse hovers over the widget. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnmouseover() {
		String value = (String)getStateHelper().eval(PropertyKeys.onmouseover);
		return  value;
	}
	
	/**
	 * JavaScript function which is called when the mouse hovers over the widget. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnmouseover(String _onmouseover) {
	    getStateHelper().put(PropertyKeys.onmouseover, _onmouseover);
    }
	

	/**
	 * The outcome to navigate to. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOutcome() {
		String value = (String)getStateHelper().eval(PropertyKeys.outcome);
		return  value;
	}
	
	/**
	 * The outcome to navigate to. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOutcome(String _outcome) {
	    getStateHelper().put(PropertyKeys.outcome, _outcome);
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
	
}

