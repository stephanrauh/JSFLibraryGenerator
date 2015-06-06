import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TaglibImporter {
	private static Map<String, String> inheritedAttributes = new HashMap<String, String>() {
		{
			put("rendered", null);
			put("value", null);
			put("converter", null);
		}
	};

	private static Map<String, String> derivedFrom = new HashMap<String, String>() {
		{
			put("alert", "UIComponentBase");
			put("badge", "UIComponentBase");
			put("button", "HtmlOutcomeTargetButton");
			put("buttonGroup", "net.bootsfaces.component.GenContainerDiv");
			put("buttonToolbar", "net.bootsfaces.component.GenContainerDiv");
			put("commandButton", "HtmlCommandButton");
			put("datePicker", "HtmlInputText");
			put("dropButton", "UIComponentBase");
			put("dropMenu", "UIComponentBase");
			put("fetchBeanInfos", "UIComponentBase");
			put("icon", "UIComponentBase");
			put("iconAwesome", "UIComponentBase");
			put("inputSecret", "net.bootsfaces.component.InputText");
			put("inputText", "HtmlInputText");
			put("label", "UIComponentBase");
			put("listLinks", "net.bootsfaces.component.LinksContainer");
			put("messages", "UIMessages");
			put("modal", "UIComponentBase");
			put("navBar", "UIComponentBase");
			put("navBarLinks", "net.bootsfaces.component.LinksContainer");
			put("navCommandLink", "UICommand");
			put("navLink", "HtmlOutcomeTargetLink");
			put("poll", "HtmlCommandButton");
			put("selectBooleanCheckbox", "HtmlInputText");
			put("selectOneMenu", "HtmlInputText");
			put("slider", "HtmlInputText");
			put("tab", "UIOutput");
			put("tabView", "UIOutput");
			put("thumbnail", "UIComponentBase");
		}
	};

	private static Map<String, String> hasChildren = new HashMap<String, String>() {
		{
			put("alert", null);
			put("buttonGroup", null);
			put("buttonToolbar", null);
			put("column", null);
			put("container", null);
			put("dropButton", null);
			put("dropMenu", null);
			put("jumbotron", null);
			put("listLinks", null);
			put("modal", null);
			put("navBar", null);
			put("navBarLinks", null);
			put("panel", null);
			put("pillLinks", null);
			put("row", null);
			put("tabLinks", null);
			put("thumbnail", null);
			put("well", null);
		}
	};

	private static Map<String, String> inputWidgets = new HashMap<String, String>() {
		{
			put("commandButton", null);
			put("datePicker", null);
			put("inputText", null);
			put("navCommandLink", null);
			put("panel", null);
			put("poll", null);
			put("selectBooleanCheckbox", null);
			put("slider", null);
			put("tab", null);
			put("tabView", null);
		}
	};

	public static void main(String[] args) throws FileNotFoundException {
		String content = new Scanner(new File("taglib.xml")).useDelimiter("\\Z").next();
		content = content.replaceAll("(?s)<!--.*?-->", "");
		content = content.replace("<![CDATA[", "");
		content = content.replace("]]>", "");
		String[] tags = content.split("<tag>|</tag>");

		List<String> dsl = new ArrayList<>();
		for (String tag : tags) {
			if (tag.contains("<tag-name>")) {
				dsl.add(analyseTag(tag));
				// break;
			}
		}
		Collections.sort(dsl);
		for (String s : dsl)
			System.out.println(s);
	}

	private static String analyseTag(String tag) {
		String result = "";
		String tagname = "";
		List<String> attributeDSL = new ArrayList<>();
		boolean firstAttribute = true;
		boolean hasTooltip = false;
		String parts[] = tag.split("</tag-name>|</component>|</attribute>");
		for (String part : parts) {
			part = part.trim();
			if (part.contains("<tag-name>")) {
				int pos = part.indexOf("<tag-name>");
				part = part.substring(pos);
				part = part.replace("<tag-name>", "");
				tagname = part;
				result += ("widget " + tagname);
			} else if (part.startsWith("<component>")) {
				String component = part.replace("<component>", "").trim();
				String cc[] = component.split("</component-type>|</renderer-type>");
				for (String c : cc) {
					c = c.trim();
					if (c.startsWith("<component-type>")) {
						c = c.replace("<component-type>", "").trim();
						result += ("\r\n       implemented_by " + c);
					} else if (c.startsWith("<renderer-type>")) {
						c = c.replace("<renderer-type>", "").trim();
						result += "\r\n       rendered_by " + c;
					}

				}
			} else if (part.startsWith("<attribute>")) {
				firstAttribute = false;
				String attribute = part.replace("<attribute>", "").trim();
				String[] properties = attribute.split("</description>|</name>|</required>|</type>");
				String name = "";
				String required = "";
				String type = "";
				String description = "";
				String inherited = "";
				for (String property : properties) {
					property = property.trim();
					if (property.startsWith("<name>")) {
						name = property.replace("<name>", "");
						String[] nn = name.split("-");
						name = nn[0];
						for (int i = 1; i < nn.length; i++) {
							String n = nn[i];
							name += n.substring(0, 1).toUpperCase() + n.substring(1);
						}
						if (name.startsWith("tooltip"))
							hasTooltip = true;
						if (inheritedAttributes.containsKey(name))
							inherited = "inherited";
					}
					if (property.startsWith("<description>")) {
						description = name = property.replace("<description>", "");
						description = eliminateWhiteSpace(description);
						description = description.replace("\"", "\\\"");
						description = " \"" + description + "\"";
					}
					if (property.startsWith("<required>")) {
						property = property.replace("<required>", "").trim();
						if ("true".equals(property)) {
							required = " mandatory";
						}
					}
					if (property.startsWith("<type>")) {
						property = property.replace("<type>", "").trim();
						if (!"java.lang.String".equals(property)) {
							type = property.replace("java.lang.", "");
						}
					}
				}
				attributeDSL.add("    " + fixedLength(name, 20)
						+ fixedLength(type + " " + required + " " + inherited, 50) + description);
			}

		}
		if (inputWidgets.containsKey(tagname)) {
			result += "\r\n       processes_input";
		}
		if (derivedFrom.containsKey(tagname)) {
			result += "\r\n       extends " + derivedFrom.get(tagname);
		}
		if (hasChildren.containsKey(tagname)) {
			result += "\r\n       has_children";
		}
		result += "\r\n";
		result += (" {");
		if (!firstAttribute)
			result += "\r\n";
		Collections.sort(attributeDSL);
		for (String a : attributeDSL) {
			result += a + "\r\n";
		}
		result += "}\r\n";
		result += "\r\n";
		return result;
	}

	private static String eliminateWhiteSpace(String description) {
		String[] dd = description.split("\r\n");
		String result = "";
		for (String d : dd) {
			result += " " + d.trim();
		}
		return result.trim();
	}

	private static String fixedLength(String s, int length) {
		return (s + "                                                            ").substring(0, length);
	}

}
