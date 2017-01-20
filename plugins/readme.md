# Installation
Simply drop the two jar files into the plugins folder of Eclipse.

# Compatibility
The plugin is developed with the most current Eclipse version on Mac OSX. At the time of writing, that was Eclipse Neon. The plugin may also work with other versions of Eclipse, and it probably also works on other operation system, but there's no guarantee. Use at own risk.

# How to use: preparations
Checkout the projects https://github.com/TheCoder4eu/BootsFaces-OSP and https://github.com/TheCoder4eu/BootsFacesWeb into a common folder. The correct folder structure is important, because the plugin modifies files in both projects. It generates both skeletons of the source code and skeletons of the documentation.

cd (your folder of choice)
mkdir developmenent
cd development
git clone https://github.com/TheCoder4eu/BootsFacesWeb.git
git clone https://github.com/TheCoder4eu/BootsFaces-OSP.git

After that, you can import both project into Eclipse. The easiest way is to import them as Maven projects, but you can also import them as Gradle projects.

# How to use: developing components
Now you can open the file xtext/BootsFaces.jsfdsl in the BootsFaces-OSP project. The package explorer has a new context menu which is visible for jsfdsl files. Click "generate JSF components". The sourcecode and (in most cases) the attribute list in the BootsFacesWeb project are now updated. Otherwise, you find the generated files in the folder src-gen. Copy the files to the appropriate folders. Suppose you're creating a widget called "MyWidget". The target folders of the files are:

* Put MyWidget.java, MyWidgetCore.java, MyWidgetRenderer.java and MyWidgetBeanInfo.java into BootsFaces-OSP/src/main/java/net/bootsfaces/components/myWidget.
* Put MyWidget.xhtml and MyWidgetAttributes.xhtml into BootsFacesWeb/src/main/webapp/forms. You may also choose one the neighbar folder, if your widget is about the layout, if it's a Bootstrap component, if it focuses on mobile targets or if it is built on jQueryUI.
* Add a menu entry pointing to the new documentation file MyWidget.xhtml in BootsFacesWeb/src/main/webapp/appLayout/NavBarTop.xhtml.
* Ignore the file MyWidget.taglib.xml. The widget is added to the taglib automatically. The partial taglib file was needed in earlier versions.
* Ignore the file MyWidgetTest.java. This file will (hopefully) play an important role in future versions. Currently, it's not needed.

Now you can deploy BootsFacesWeb to a Tomcat and open your new documentation page (http://127.0.0.1/BootsFacesWeb/forms/MyWidget.xhtml). If you add the widget to the page, it already generates code. You won't see it unless you inspect the HTML source code of the page because the default renderer simply generates a pseudo HTML widget called <MyWidget> and generates every attribute. However, that should be a good starting point to implement useful HTML code.
