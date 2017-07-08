name := """Fahmida_experiment"""
organization := "twio_project"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.11"

libraryDependencies ++=  Seq(
  filters,
  javaJdbc,
  javaJdbc,
  javaWs,
  "com.twilio.sdk" % "twilio" % "7.11.0",
  "org.slf4j" % "slf4j-simple" % "1.8.0-alpha2" % "test"
)

