/*

 * generated by Xtext
 */
package de.beyondjava.xtext.jsf.generator

import de.beyondjava.xtext.jsf.componentLanguage.Component
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

/**
 * Generates code from your model files on save.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ComponentListGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		var content = resource.compile();
		System.out.println(content);
		fsa.generateFile("../src/main/java/net/bootsfaces/component/ComponentsEnum.java", content);
	}

	def compile(Resource resource) '''
		package net.bootsfaces.component;

		public enum ComponentsEnum {
			«FOR e : resource.allContents.toIterable.filter(Component) SEPARATOR ","»
			  	«e.compile»
		    «ENDFOR»
		    ;
		    private String tag;

		    private String tagname;

		    ComponentsEnum(String tag, String tagname) {
		        this.tag = tag;
		        this.tagname = tagname;
		    }

		    public String tag() {
		        return tag;
		    }

		    public String tagname() {
		    	return tagname;
		    }
		}
		'''

	def compile(Component widget) {
	    var lower = widget.name.toFirstLower;
	    var name = lower;
	    if (lower.equals("switch")) {
	    	name="switchComponent";
	    }
		var line = name + "(\"<b:" + lower + "\", \"" + lower + "\")";
		return line;
	}
}