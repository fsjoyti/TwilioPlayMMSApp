name := """Fahmida_experiment"""
organization := "twio_project"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.11"

libraryDependencies ++=  Seq(
  filters,
  javaJdbc,
  javaWs,
  "com.twilio.sdk" % "twilio" % "7.11.0"
)

