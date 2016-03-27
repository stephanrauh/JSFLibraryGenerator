/*
 * generated by Xtext
 */
package de.beyondjava.xtext.jsf.generator

import de.beyondjava.xtext.jsf.componentLanguage.Attribute
import de.beyondjava.xtext.jsf.componentLanguage.Component
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ComponentGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for (e : resource.allContents.toIterable.filter(Component)) {
			fsa.generateFile("net/bootsfaces/component/"+e.name.toFirstLower + "/" +e.name.toFirstUpper + ".java", e.compile)
		}
	}

	def compile(Component e) '''
		«e.generateCopyrightHeader» 
		package net.bootsfaces.component.«e.name.toFirstLower»;
		
		import javax.el.ValueExpression;
		import javax.faces.application.ResourceDependencies;
		import javax.faces.application.ResourceDependency;
		import javax.faces.component.*;
		«IF e.hasTooltip!=null»
			import net.bootsfaces.render.Tooltip;
		«ENDIF»
		import net.bootsfaces.utils.BsfUtils;
		
		
		/** This class holds the attributes of &lt;b:«e.name» /&gt;. */
		@FacesComponent("net.bootsfaces.component.«e.name.toFirstLower».«e.name.toFirstUpper»")
		public class «e.name.toFirstUpper» extends «parentClass(e)» «IF e.hasTooltip!=null» implements net.bootsfaces.render.IHasTooltip «ENDIF» {
			
			«e.generateMetadata»
			
		«e.generateProperties» 
			
		  «FOR f : e.attributes»
		    «IF f.inherited==null» 
			  	«f.generateAccessors»
		  	«ENDIF»
		  «ENDFOR»
		}
		
	'''
	
	def parentClass(Component component) {
		if (component.extends!=null) {
			return component.extends;
		}
		if (component.processesInput != null) {
			return "UIInput";
		}
		return "UIOutput";
	}

	def generateAccessors(Attribute e) '''
	
		/**
		 * «e.desc» <P>
		 * @return Returns the value of the attribute, or null, if it hasn't been set by the JSF file.
		 */
		public «e.attributeType» «e.getter» {
			«e.objectType» value = («e.objectType»)getStateHelper().eval(PropertyKeys.«e.name.toCamelCase»«e.defaultValueTerm»);
			return «optionalTypeCast(e)» value;
		}
		
		/**
		 * «e.desc» <P>
		 * Usually this method is called internally by the JSF engine.
		 */
		public void set«e.name.toCamelCase.toFirstUpper»(«e.attributeType» _«e.name.toCamelCase») {
		    getStateHelper().put(PropertyKeys.«e.name.toCamelCase», _«e.name.toCamelCase»);
	    }
		
	'''
	
	def getDefaultValueTerm(Attribute a) {
		if (a.defaultValue!=null && a.type == null) ', "' + a.defaultValue + '"'
		else if (a.defaultValue!=null) ', ' + a.defaultValue
		else if ("Integer".equals(a.type)) ', 0'
		else if ("Boolean".equals(a.type)) ', false'
		else ''
	}
	
	
	def optionalTypeCast(Attribute e) {
		if (e.objectType!=e.attributeType) '('+e.attributeType+')'
		else ''
	}
	
	def getGetter(Attribute f)
	{ 
		if ("Boolean".equals(f.type)) {
			'''is«f.name.toCamelCase.toFirstUpper»()'''
		}
		else {
			'''get«f.name.toCamelCase.toFirstUpper»()'''
		}
	}

	def getObjectType(Attribute a) { 
		if (null==a.type) "String"
		else a.type;
	}

	
	def getAttributeType(Attribute a) { 
		if (null==a.type) "String"
		else if ("Boolean".equals(a.type)) "boolean"
		else if ("Integer".equals(a.type)) "int"
		else a.type;
	}
	
	def generateMetadata(Component e) ''' 
		public static final String COMPONENT_TYPE = "net.bootsfaces.component.«e.name.toFirstLower».«e.name.toFirstUpper»";
		
		public static final String COMPONENT_FAMILY = "net.bootsfaces.component";
		
		public static final String DEFAULT_RENDERER = "net.bootsfaces.component.«e.name.toFirstLower».«e.name.toFirstUpper»";
		
		public «e.name.toFirstUpper»() {
			
			
		«IF e.hasTooltip!=null»
			Tooltip.addResourceFile();
		«ENDIF»
			setRendererType(DEFAULT_RENDERER);
		}
		
		public String getFamily() {
			return COMPONENT_FAMILY;
		}
		
		public void setValueExpression(String name, ValueExpression binding) {
			name = BsfUtils.snakeCaseToCamelCase(name);
			super.setValueExpression(name, binding);
		}		
	'''

	def generateCopyrightHeader(Component e) '''
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

    	'''
	
	def List<Attribute> notInherited(List<Attribute> elements) {
		val result = newArrayList()
		elements.forEach[a | if (a.inherited==null) result.add(a)]
		result
		
//		var result = new ArrayList<Attribute>();
//		
//		FOR a: elements
//			result.add(a)
//		ENDFOR
//   	 	elements.get(0)
  	}
	
	def generateProperties(Component e) '''
		    protected enum PropertyKeys {
		«FOR f : e.attributes.notInherited SEPARATOR ',' AFTER ';' »
		    «IF f.inherited==null» 
		    	«f.name.toCamelCase»
		    «ENDIF»
		«ENDFOR»
		
		
		        String toString;
		
		        PropertyKeys(String toString) {
		            this.toString = toString;
		        }
		
		        PropertyKeys() {}
		
		        public String toString() {
		            return ((this.toString != null) ? this.toString : super.toString());
		        }
		    }
	'''
	
		def toCamelCase(String s) {
		var pos = 0 as int
		var cc = s
		while (cc.contains('-')) {
			pos = cc.indexOf('-');
			cc = cc.substring(0, pos) + cc.substring(pos+1, pos+2).toUpperCase() + cc.substring(pos+2);
		}
		return cc
	}
	
}
