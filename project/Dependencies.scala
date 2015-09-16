import sbt._
import PandorasBox.Versions._

object Dependencies {

  val Python = Seq(
    "org.python" % "jython-standalone" % "2.7-b3"
  )

  def project = Python
}