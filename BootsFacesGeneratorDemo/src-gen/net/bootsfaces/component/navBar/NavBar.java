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

package net.bootsfaces.component.navBar;

import javax.faces.component.*;
import net.bootsfaces.render.Tooltip;


/** This class holds the attributes of &lt;b:navBar /&gt;. */
@FacesComponent("net.bootsfaces.component.navBar.NavBar")
public class NavBar extends UIComponentBase  implements net.bootsfaces.render.IHasTooltip  {
	
	public static final String COMPONENT_TYPE = "net.bootsfaces.component.navBar.NavBar";
	
	public static final String COMPONENT_FAMILY = "net.bootsfaces.component";
	
	public static final String DEFAULT_RENDERER = "net.bootsfaces.component.navBar.NavBar";
	
	public NavBar() {
		
		
	Tooltip.addResourceFile();
		setRendererType(DEFAULT_RENDERER);
	}
	
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
	
	
    protected enum PropertyKeys {
binding,
brand,
brandAlign,
brandHref,
brandImg,
fixed,
fluid,
id,
inverse,
static,
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
	 * Brand for the Navbar. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getBrand() {
		String value = (String)getStateHelper().eval(PropertyKeys.brand);
		return  value;
	}
	
	/**
	 * Brand for the Navbar. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setBrand(String _brand) {
	    getStateHelper().put(PropertyKeys.brand, _brand);
    }
	

	/**
	 * Brand alignment, can be right or left. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getBrandAlign() {
		String value = (String)getStateHelper().eval(PropertyKeys.brandAlign);
		return  value;
	}
	
	/**
	 * Brand alignment, can be right or left. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setBrandAlign(String _brandAlign) {
	    getStateHelper().put(PropertyKeys.brandAlign, _brandAlign);
    }
	

	/**
	 * Link URL for the Navbar Brand. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getBrandHref() {
		String value = (String)getStateHelper().eval(PropertyKeys.brandHref);
		return  value;
	}
	
	/**
	 * Link URL for the Navbar Brand. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setBrandHref(String _brandHref) {
	    getStateHelper().put(PropertyKeys.brandHref, _brandHref);
    }
	

	/**
	 * Brand image. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getBrandImg() {
		String value = (String)getStateHelper().eval(PropertyKeys.brandImg);
		return  value;
	}
	
	/**
	 * Brand image. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setBrandImg(String _brandImg) {
	    getStateHelper().put(PropertyKeys.brandImg, _brandImg);
    }
	

	/**
	 * If specified, the Fixed Bar will be rendered on top or bottom of the page. Can be bottom or top. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getFixed() {
		String value = (String)getStateHelper().eval(PropertyKeys.fixed);
		return  value;
	}
	
	/**
	 * If specified, the Fixed Bar will be rendered on top or bottom of the page. Can be bottom or top. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setFixed(String _fixed) {
	    getStateHelper().put(PropertyKeys.fixed, _fixed);
    }
	

	/**
	 * Boolean value default is false; when set to true the navbar container will be "fluid": a full width container, spanning the entire width of the viewport. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public boolean isFluid() {
		Boolean value = (Boolean)getStateHelper().eval(PropertyKeys.fluid, false);
		return (boolean) value;
	}
	
	/**
	 * Boolean value default is false; when set to true the navbar container will be "fluid": a full width container, spanning the entire width of the viewport. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setFluid(boolean _fluid) {
	    getStateHelper().put(PropertyKeys.fluid, _fluid);
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
	 * Boolean value to specify if Navbar should use inverse color scheme. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public boolean isInverse() {
		Boolean value = (Boolean)getStateHelper().eval(PropertyKeys.inverse, false);
		return (boolean) value;
	}
	
	/**
	 * Boolean value to specify if Navbar should use inverse color scheme. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setInverse(boolean _inverse) {
	    getStateHelper().put(PropertyKeys.inverse, _inverse);
    }
	

	/**
	 * If true, a full-width navbar that scrolls away with the page will be rendered. Can be true or false, default false. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public boolean isStatic() {
		Boolean value = (Boolean)getStateHelper().eval(PropertyKeys.static, false);
		return (boolean) value;
	}
	
	/**
	 * If true, a full-width navbar that scrolls away with the page will be rendered. Can be true or false, default false. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setStatic(boolean _static) {
	    getStateHelper().put(PropertyKeys.static, _static);
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

