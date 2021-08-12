import org.clulab.sbt.BuildUtils
import org.clulab.sbt.Resolvers

name := "$name$"
description := "The $name$ project implements the $package$ package including the $class$ class."

val scala11 = "2.11.12" // up to 2.11.12
val scala12 = "2.12.13" // up to 2.12.13
val scala13 = "2.13.5"  // up to 2.13.5

// scala13 is skipped here.
ThisBuild / crossScalaVersions := Seq(scala12, scala11)
ThisBuild / scalaVersion := crossScalaVersions.value.head

resolvers ++= Seq(
//  Resolvers.localResolver,  // Reserve for Two Six.
//  Resolvers.clulabResolver, // glove
//  Resolvers.jitpackResolver // Ontologies
)

libraryDependencies ++= {
  Seq(
    // Add dependencies here, for example
    // "com.typesafe.play" %% "play-json" % playVersion
  )
}

lazy val core = (project in file("."))
  .enablePlugins(BuildInfoPlugin)
  .disablePlugins(PlayScala, JavaAppPackaging, SbtNativePackager)
  .dependsOn(common % "compile -> compile; test -> test")
  .aggregate(common)
  .settings(
    assembly / aggregate := false,
    assembly / mainClass := Some("$package$.apps.HelloWorldApp")
  )

lazy val common = project
