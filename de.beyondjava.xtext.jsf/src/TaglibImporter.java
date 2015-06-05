import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TaglibImporter {
	public static void main(String[] args) throws FileNotFoundException {
		String content = new Scanner(new File("taglib.xml")).useDelimiter("\\Z").next();
		content = content.replaceAll("(?s)<!--.*?-->", "");
		content = content.replace("<![CDATA[", "");
		content = content.replace("]]>", "");
		String[] tags = content.split("<tag>|</tag>");

		for (String tag : tags) {
			if (tag.contains("<tag-name>")) {
				analyseTag(tag);
				// break;
			}
		}
	}

	private static void analyseTag(String tag) {
		boolean firstAttribute = true;
		String parts[] = tag.split("</tag-name>|</component>|</attribute>");
		for (String part : parts) {
			part = part.trim();
			if (part.contains("<tag-name>")) {
				int pos = part.indexOf("<tag-name>");
				part = part.substring(pos);
				part = part.replace("<tag-name>", "");
				System.out.print("widget " + part);
			} else if (part.startsWith("<component>")) {
				String component = part.replace("<component>", "").trim();
				String cc[] = component.split("</component-type>|</renderer-type>");
				for (String c : cc) {
					c = c.trim();
					if (c.startsWith("<component-type>")) {
						c = c.replace("<component-type>", "").trim();
						System.out.print(" implemented_by " + c);
					} else if (c.startsWith("<renderer-type>")) {
						c = c.replace("<renderer-type>", "").trim();
						System.out.println(" rendered_by " + c);
					}

				}
			} else if (part.startsWith("<attribute>")) {
				if (firstAttribute)
					System.out.println(" {");
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
					}
					if (property.startsWith("<description>")) {
						description = name = property.replace("<description>", "");
						description = eliminateWhiteSpace(description);
						description=description.replace("\"", "\\\"");
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
				System.out.println("    " + fixedLength(name, 20) +  fixedLength(type, 40)  + fixedLength(required, 10)
						+ description);
			}

		}
		if (firstAttribute)
			System.out.print(" {");
		System.out.println("}");
		System.out.println();

	}

	private static String eliminateWhiteSpace(String description) {
		String[] dd = description.split("\r\n");
		String result="";
		for (String d:dd) {
			result += " " + d.trim();
		}
		return result.trim();
	}

	private static String fixedLength(String s, int length) {
		return (s + "                                              ").substring(0, length);
	}

}
