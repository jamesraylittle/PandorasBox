import sbt._
import PandorasBox.Versions._

object Dependencies {

  val Python = Seq(
    "org.python" % "jython-standalone" % "2.7-b3"
  )

  val Graphics = Seq (
    "org.scalafx" %% "scalafx" % "8.0.40-R8"
  )

  val json = Seq (
    "org.json4s" %% "json4s-native" % "3.3.0.RC4"
  )
  def project = Python ++ Graphics ++ json
}