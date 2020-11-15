# Fx-World
Java Fx is a popular software application platform for java swing because of it's GUI library for Java SE

This repository maintainns fx core application with examples.

# What Is JavaFX?
JavaFX is a set of graphics and media packages that enables developers to design, create, test, debug, and deploy rich client applications that operate consistently across diverse platforms.

# JavaFX Applications

"Availability"

"Key Features"

"What Can I Build with JavaFX?"

"How Do I Run a Sample Application?"

"How Do I Run a Sample in an IDE?"

"How Do I Create a JavaFX Application?"

"How Do I Deploy a JavaFX Application?"

# Resources

See the JavaFX Architecture document to learn about the JavaFX platform architecture and to get a brief description of the JavaFX APIs for media streaming, web rendering, and user interface styling.

JavaFX Applications
Written as a Java API, JavaFX application code can reference APIs from any Java library. For example, JavaFX applications can use Java API libraries to access native system capabilities and connect to server-based middleware applications.

The look and feel of JavaFX applications can be customized. Cascading Style Sheets (CSS) separate appearance and style from implementation so that developers can concentrate on coding. Graphic designers can easily customize the appearance and style of the application through the CSS. If you have a web design background, or if you would like to separate the user interface (UI) and the back-end logic, then you can develop the presentation aspects of the UI in the FXML scripting language and use Java code for the application logic. If you prefer to design UIs without writing code, then use JavaFX Scene Builder. As you design the UI, Scene Builder creates FXML markup that can be ported to an Integrated Development Environment (IDE) so that developers can add the business logic.

# Availability
JavaFX 2.2 and later releases are fully integrated with the Java SE 7 Runtime Environment (JRE) and the Java Development Kit (JDK). Because the JDK is available for all major desktop platforms (Windows, Mac OS X, and Linux), JavaFX applications compiled to JDK 7 and later also run on all the major desktop platforms. The cross-platform compatibility enables a consistent runtime experience for JavaFX applications developers and users. Oracle ensures synchronized releases and updates on all platforms and offers an extensive support program for companies that run mission-critical applications.

On the JDK download page, you can get a zip file of JavaFX sample applications. The sample applications provide many code samples and snippets that show by example how to write JavaFX applications. See "How Do I Run a Sample Application?" for more information.

# Key Features
JavaFX 2.2 and later releases have the following features:

Java APIs. JavaFX is a Java library that consists of classes and interfaces that are written in native Java code. The APIs are designed to be a friendly alternative to Java Virtual Machine (Java VM) languages, such as JRuby and Scala.

FXML and Scene Builder. FXML is an XML-based declarative markup language for constructing a JavaFX application user interface. A designer can code in FXML or use JavaFX Scene Builder to interactively design the graphical user interface (GUI). Scene Builder generates FXML markup that can be ported to an IDE where a developer can add the business logic.

WebView. A web component that uses WebKitHTML technology to make it possible to embed web pages within a JavaFX application. JavaScript running in WebView can call Java APIs, and Java APIs can call JavaScript running in WebView.

Swing interoperability. Existing Swing applications can be updated with new JavaFX features, such as rich graphics media playback and embedded Web content.

Built-in UI controls and CSS. JavaFX provides all the major UI controls required to develop a full-featured application. Components can be skinned with standard Web technologies such as CSS

Canvas API. The Canvas API enables drawing directly within an area of the JavaFX scene that consists of one graphical element (node).

Multitouch Support. JavaFX provides support for multitouch operations, based on the capabilities of the underlying platform.

Hardware-accelerated graphics pipeline. JavaFX graphics are based on the graphics rendering pipeline (Prism). JavaFX offers smooth graphics that render quickly through Prism when it is used with a supported graphics card or graphics processing unit (GPU). If a system does not feature one of the recommended GPUs supported by JavaFX, then Prism defaults to the Java 2D software stack.

High-performance media engine. The media pipeline supports the playback of web multimedia content. It provides a stable, low-latency media framework that is based on the GStreamer multimedia framework.

Self-contained application deployment model. Self-contained application packages have all of the application resources and a private copy of the Java and JavaFX runtimes. They are distributed as native installable packages and provide the same installation and launch experience as native applications for that operating system. See the Deploying JavaFX Applications document.

What Can I Build with JavaFX?
With JavaFX, you can build many types of applications. Typically, they are network-aware applications that are deployed across multiple platforms and display information in a high-performance modern user interface that features audio, video, graphics, and animation.
