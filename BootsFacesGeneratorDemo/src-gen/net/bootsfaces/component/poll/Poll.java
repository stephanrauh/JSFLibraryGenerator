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

package net.bootsfaces.component.poll;

import javax.faces.component.*;

/** This class holds the attributes of &lt;b:poll /&gt;. */
@FacesComponent("net.bootsfaces.component.poll.Poll")
public class Poll extends HtmlCommandButton {
	
	public static final String COMPONENT_TYPE = "net.bootsfaces.component.poll.Poll";
	
	public static final String COMPONENT_FAMILY = "net.bootsfaces.component";
	
	public static final String DEFAULT_RENDERER = "net.bootsfaces.component.poll.Poll";
	
	public Poll() {
		setRendererType(DEFAULT_RENDERER);
	}
	
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
	
	
    protected enum PropertyKeys {
action,
actionListener,
execute,
id,
interval,
once,
update
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
	 * Which input fields are to be sent? Default value: @none <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getExecute() {
		String value = (String)getStateHelper().eval(PropertyKeys.execute);
		return  value;
	}
	
	/**
	 * Which input fields are to be sent? Default value: @none <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setExecute(String _execute) {
	    getStateHelper().put(PropertyKeys.execute, _execute);
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
	 * How often is the poll action to be called? Denotes the number of milliseconds between polls. Default value is 1000. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getInterval() {
		String value = (String)getStateHelper().eval(PropertyKeys.interval);
		return  value;
	}
	
	/**
	 * How often is the poll action to be called? Denotes the number of milliseconds between polls. Default value is 1000. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setInterval(String _interval) {
	    getStateHelper().put(PropertyKeys.interval, _interval);
    }
	

	/**
	 * If true, the poll is called only once. Default value: false. <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getOnce() {
		String value = (String)getStateHelper().eval(PropertyKeys.once);
		return  value;
	}
	
	/**
	 * If true, the poll is called only once. Default value: false. <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setOnce(String _once) {
	    getStateHelper().put(PropertyKeys.once, _once);
    }
	

	/**
	 * Which region of the screen is to be updated? Default value: @form <br />
	 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
	 */
	public String getUpdate() {
		String value = (String)getStateHelper().eval(PropertyKeys.update);
		return  value;
	}
	
	/**
	 * Which region of the screen is to be updated? Default value: @form <br />
	 * Usually this method is called internally by the JSF engine.
	 */
	public void setUpdate(String _update) {
	    getStateHelper().put(PropertyKeys.update, _update);
    }
	
}

