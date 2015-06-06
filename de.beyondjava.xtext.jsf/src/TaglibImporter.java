import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TaglibImporter {
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
		for (String s:dsl) System.out.println(s);
	}

	private static String analyseTag(String tag) {
		String result = "";
		List<String> attributeDSL = new ArrayList<>();
		boolean firstAttribute = true;
		String parts[] = tag.split("</tag-name>|</component>|</attribute>");
		for (String part : parts) {
			part = part.trim();
			if (part.contains("<tag-name>")) {
				int pos = part.indexOf("<tag-name>");
				part = part.substring(pos);
				part = part.replace("<tag-name>", "");
				result += ("widget " + part);
			} else if (part.startsWith("<component>")) {
				String component = part.replace("<component>", "").trim();
				String cc[] = component.split("</component-type>|</renderer-type>");
				for (String c : cc) {
					c = c.trim();
					if (c.startsWith("<component-type>")) {
						c = c.replace("<component-type>", "").trim();
						result += (" implemented_by " + c);
					} else if (c.startsWith("<renderer-type>")) {
						c = c.replace("<renderer-type>", "").trim();
						result += " rendered_by " + c;
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
				attributeDSL.add("    " + fixedLength(name, 20) + fixedLength(type, 40) + fixedLength(required, 10)
						+ description);
			}

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
		return (s + "                                              ").substring(0, length);
	}

}
