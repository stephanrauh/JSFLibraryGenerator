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

package net.bootsfaces.component.internalIE8CompatibilityLink;

import javax.faces.component.*;


/** This class holds the attributes of &lt;b:internalIE8CompatibilityLink /&gt;. */
@FacesComponent("net.bootsfaces.component.internalIE8CompatibilityLink.InternalIE8CompatibilityLink")
public class InternalIE8CompatibilityLink extends UIOutput  {
	
	public static final String COMPONENT_TYPE = "net.bootsfaces.component.internalIE8CompatibilityLink.InternalIE8CompatibilityLink";
	
	public static final String COMPONENT_FAMILY = "net.bootsfaces.component";
	
	public static final String DEFAULT_RENDERER = "net.bootsfaces.component.internalIE8CompatibilityLink.InternalIE8CompatibilityLink";
	
	public InternalIE8CompatibilityLink() {
		
		
		setRendererType(DEFAULT_RENDERER);
	}
	
	public String getFamily() {
		return COMPONENT_FAMILY;
	}
	
	
    protected enum PropertyKeys {


        String toString;

        PropertyKeys(String toString) {
            this.toString = toString;
        }

        PropertyKeys() {}

        public String toString() {
            return ((this.toString != null) ? this.toString : super.toString());
        }
    }
	
}

