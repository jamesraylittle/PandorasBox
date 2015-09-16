
import sbt._
import sbt.Keys._


object PandorasBox extends Build {
  import Resolvers._
  import Versions._

  val Organization = "org.jameslittle"

  lazy val main = {
    val projectName = "pandoras-box"

    val projectSettings = baseSettings ++
      Seq(
        name := projectName,
        libraryDependencies ++= Dependencies.project
      )
    Project(projectName, file("."), settings = projectSettings)
  }



  val baseSettings = Seq(
    mainClass in (Compile, run) := Some("org.jameslittle.Main"),
    organization := Organization,
    scalaVersion := ScalaVersion,
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
    val ScalaVersion = "2.11.4"
  }

}



