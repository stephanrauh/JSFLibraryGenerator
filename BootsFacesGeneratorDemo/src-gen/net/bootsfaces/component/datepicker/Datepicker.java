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

package net.bootsfaces.component.datepicker;

import javax.faces.component.*;

/** This class holds the attributes of &lt;b:datepicker /&gt;. */
@FacesComponent("net.bootsfaces.component.datepicker.Datepicker")
public class Datepicker extends UIOutput {
	
	public static final String COMPONENT_TYPE = "net.bootsfaces.component.datepicker.Datepicker";
	
	public static final String COMPONENT_FAMILY = "net.bootsfaces.component";
	
	public static final String DEFAULT_RENDERER = "net.bootsfaces.component.datepicker.Datepicker";
	
	public Datepicker() {
		setRendererType(DEFAULT_RENDERER);
	}
	
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
	
	
    protected enum PropertyKeys {
binding,
changeMonth,
changeYear,
firstDay,
id,
lang,
mode,
numberOfMonths,
placeholder,
showButtonPanel,
showWeek,
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
	 * Boolean value to specify if month selector should be shown. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public boolean isChangeMonth() {
		Boolean value = (Boolean)getStateHelper().eval(PropertyKeys.changeMonth, false);
		return (boolean) value;
	}
	
	/**
	 * Boolean value to specify if month selector should be shown. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setChangeMonth(boolean _changeMonth) {
	    getStateHelper().put(PropertyKeys.changeMonth, _changeMonth);
    }
	

	/**
	 * Boolean value to specify if year selector should be shown. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public boolean isChangeYear() {
		Boolean value = (Boolean)getStateHelper().eval(PropertyKeys.changeYear, false);
		return (boolean) value;
	}
	
	/**
	 * Boolean value to specify if year selector should be shown. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setChangeYear(boolean _changeYear) {
	    getStateHelper().put(PropertyKeys.changeYear, _changeYear);
    }
	

	/**
	 * Set the first day of the week: Sunday is 0, Monday is 1, etc. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getFirstDay() {
		Integer value = (Integer)getStateHelper().eval(PropertyKeys.firstDay, 0);
		return (int) value;
	}
	
	/**
	 * Set the first day of the week: Sunday is 0, Monday is 1, etc. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setFirstDay(int _firstDay) {
	    getStateHelper().put(PropertyKeys.firstDay, _firstDay);
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
	 * This option allows you to localize the DatePicker, specifying the language code (eg. it, fr, es, nl). The datepicker uses the ISO 639-1 language codes eventually followed by ISO 3166-1 country codes. The Datepicker is localized with the language specified by the ViewRoot Locale. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getLang() {
		String value = (String)getStateHelper().eval(PropertyKeys.lang);
		return  value;
	}
	
	/**
	 * This option allows you to localize the DatePicker, specifying the language code (eg. it, fr, es, nl). The datepicker uses the ISO 639-1 language codes eventually followed by ISO 3166-1 country codes. The Datepicker is localized with the language specified by the ViewRoot Locale. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setLang(String _lang) {
	    getStateHelper().put(PropertyKeys.lang, _lang);
    }
	

	/**
	 * Controls how the Calendar is showed, can be inline or popup. Default is popup. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getMode() {
		String value = (String)getStateHelper().eval(PropertyKeys.mode);
		return  value;
	}
	
	/**
	 * Controls how the Calendar is showed, can be inline or popup. Default is popup. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setMode(String _mode) {
	    getStateHelper().put(PropertyKeys.mode, _mode);
    }
	

	/**
	 * Number of months to show. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public int getNumberOfMonths() {
		Integer value = (Integer)getStateHelper().eval(PropertyKeys.numberOfMonths, 0);
		return (int) value;
	}
	
	/**
	 * Number of months to show. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setNumberOfMonths(int _numberOfMonths) {
	    getStateHelper().put(PropertyKeys.numberOfMonths, _numberOfMonths);
    }
	

	/**
	 * The placeholder attribute shows text in a field until the field is focused upon, then hides the text. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getPlaceholder() {
		String value = (String)getStateHelper().eval(PropertyKeys.placeholder);
		return  value;
	}
	
	/**
	 * The placeholder attribute shows text in a field until the field is focused upon, then hides the text. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setPlaceholder(String _placeholder) {
	    getStateHelper().put(PropertyKeys.placeholder, _placeholder);
    }
	

	/**
	 * Boolean value to specify if row Buttons to the bottom of calendar should be shown. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public boolean isShowButtonPanel() {
		Boolean value = (Boolean)getStateHelper().eval(PropertyKeys.showButtonPanel, false);
		return (boolean) value;
	}
	
	/**
	 * Boolean value to specify if row Buttons to the bottom of calendar should be shown. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setShowButtonPanel(boolean _showButtonPanel) {
	    getStateHelper().put(PropertyKeys.showButtonPanel, _showButtonPanel);
    }
	

	/**
	 * Boolean value to specify if Week number should be shown. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public boolean isShowWeek() {
		Boolean value = (Boolean)getStateHelper().eval(PropertyKeys.showWeek, false);
		return (boolean) value;
	}
	
	/**
	 * Boolean value to specify if Week number should be shown. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setShowWeek(boolean _showWeek) {
	    getStateHelper().put(PropertyKeys.showWeek, _showWeek);
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

