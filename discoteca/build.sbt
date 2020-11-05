name := """discoteca"""
organization := "com.tumiaru"
version := "0.1"

lazy val root = (project in file(".")).enablePlugins(PlayJava,PlayEbean)

scalaVersion := "2.13.3"

libraryDependencies ++= Seq(guice, 
	evolutions, 
	jdbc,
	"com.h2database" % "h2" % "1.4.192",
	// To provide an implementation of JAXB-API, which is required by Ebean.
    "javax.xml.bind" % "jaxb-api" % "2.3.1",
    "javax.activation" % "activation" % "1.1.1",
    "org.glassfish.jaxb" % "jaxb-runtime" % "2.3.2"
	)