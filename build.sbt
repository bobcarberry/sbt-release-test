ThisBuild / scalaVersion := "2.13.6"
ThisBuild / organization := "io.github.bobcarberry"
ThisBuild / version := "0.1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .settings(
    name := "sbt-release-test",
    publish / skip := true
  )
