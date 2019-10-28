```

```

# XsdVi

XsdVi is a "Java application [...] to transform W3C XML Schema instances into interactive diagrams in SVG format" (see the [XsdVi SourceForge project page](https://sourceforge.net/projects/xsdvi/)).

This repository is an *unmaintained* fork of the original XsdVi source code; it contains some minor improvements to the build process.

Please refer to the [XsdVi SourceForge project page](https://sourceforge.net/projects/xsdvi/) and the [XsdVi website](http://xsdvi.sourceforge.net/) for more information on XsdVi.

# Quickstart

## Build-time dependencies

-   Java Development Kit (JDK) 6 or newer. Tested with
    [OpenJDK](http://openjdk.java.net/) 8. Will probably work with
    [OracleJDK](http://www.oracle.com/technetwork/java/javase/downloads/index.html),
    too.
-   [gradle](https://gradle.org/) to [build](https://services.gradle.org/distributions/gradle-5.6.2-bin.zip) the project.

## Run-time dependencies

-   Java Runtime Environment (JRE) 6 or newer. A complete JDK (see above) will work, too.

## Quickstart

To obtain a list of build targets, run the following command in the directory that contains this README file:

```
gradlew distrib
```

The default target is `dist`, so you can just run the following command to build XsDvi:

```
gradlew show
```

Now you can run XsDvi, e. g.:

```
java -jar build/libs/xsdvi-1.1.1-SNAPSHOT.jar res/examples/xsd/faktura.xsd
firefox faktura.svg
```

For a short help message, just run XsDvi without any arguments:

```
java -jar build/libs/xsdvi-1.1.1-SNAPSHOT.jar
```



# Copyright

See the file [COPYING](./COPYING) in this repository for details.
