
import sbt._
import sbt.Keys._


object PandorasBox extends Build {
  import Resolvers._
  import Versions._

  val Organization = "org.jameslittle"

  lazy val main = {
    val projectName = "pandoras-box"
    val version = Versions.AppVersion
    val jarName = s"$projectName-$version.jar"
    val projectSettings = baseSettings ++
      Seq(
        name := projectName,
        libraryDependencies ++= Dependencies.project
      )
    Project(projectName, file("."), settings = projectSettings)
  }



  val baseSettings = Seq(
    mainClass in (Compile, run) := Some("org.jameslittle.Main"),
    ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) },
    organization := Organization,
    scalaVersion := ScalaVersion,
    fork := true,
    credentials += Credentials(Path.userHome / ".ivy2" / ".credentials"),
    resolvers ++= Seq(Classpaths.typesafeReleases, mavenLocal, maven2),
    scalacOptions ++= Seq(
      "-language:experimental.macros",
      "-language:implicitConversions",
      "-language:reflectiveCalls",
      "-language:existentials",
      "-language:higherKinds",
      "-language:postfixOps",
      "-feature",
      "-deprecation",
      "-unchecked"
    )
  )


  object Versions {
    val AppVersion = "0.0.1"
    val ScalaVersion = "2.11.4"
  }

}



