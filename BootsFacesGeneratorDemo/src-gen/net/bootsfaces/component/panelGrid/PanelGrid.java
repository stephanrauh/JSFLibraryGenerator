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

package net.bootsfaces.component.panelGrid;

import javax.faces.component.*;
import net.bootsfaces.render.Tooltip;


/** This class holds the attributes of &lt;b:panelGrid /&gt;. */
@FacesComponent("net.bootsfaces.component.panelGrid.PanelGrid")
public class PanelGrid extends UIOutput  implements net.bootsfaces.render.IHasTooltip  {
	
	public static final String COMPONENT_TYPE = "net.bootsfaces.component.panelGrid.PanelGrid";
	
	public static final String COMPONENT_FAMILY = "net.bootsfaces.component";
	
	public static final String DEFAULT_RENDERER = "net.bootsfaces.component.panelGrid.PanelGrid";
	
	public PanelGrid() {
		
		
	Tooltip.addResourceFile();
		setRendererType(DEFAULT_RENDERER);
	}
	
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
	
	
    protected enum PropertyKeys {
colSpans,
columnclasses,
id,
size,
style,
styleClass,
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
	 * Comma-separated list of the column spans <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getColSpans() {
		String value = (String)getStateHelper().eval(PropertyKeys.colSpans);
		return  value;
	}
	
	/**
	 * Comma-separated list of the column spans <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setColSpans(String _colSpans) {
	    getStateHelper().put(PropertyKeys.colSpans, _colSpans);
    }
	

	/**
	 * Comma-separated list of the CSS classes assigned to each colum. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getColumnclasses() {
		String value = (String)getStateHelper().eval(PropertyKeys.columnclasses);
		return  value;
	}
	
	/**
	 * Comma-separated list of the CSS classes assigned to each colum. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setColumnclasses(String _columnclasses) {
	    getStateHelper().put(PropertyKeys.columnclasses, _columnclasses);
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
	 * Optional. Legal values are lg, md, sm and xs. Default is lg. Influences the grid size. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getSize() {
		String value = (String)getStateHelper().eval(PropertyKeys.size);
		return  value;
	}
	
	/**
	 * Optional. Legal values are lg, md, sm and xs. Default is lg. Influences the grid size. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setSize(String _size) {
	    getStateHelper().put(PropertyKeys.size, _size);
    }
	

	/**
	 * CSS inline style of the div surrounding the panel grid. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getStyle() {
		String value = (String)getStateHelper().eval(PropertyKeys.style);
		return  value;
	}
	
	/**
	 * CSS inline style of the div surrounding the panel grid. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setStyle(String _style) {
	    getStateHelper().put(PropertyKeys.style, _style);
    }
	

	/**
	 * Style class of the div surrounding the panel grid. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getStyleClass() {
		String value = (String)getStateHelper().eval(PropertyKeys.styleClass);
		return  value;
	}
	
	/**
	 * Style class of the div surrounding the panel grid. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setStyleClass(String _styleClass) {
	    getStateHelper().put(PropertyKeys.styleClass, _styleClass);
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

