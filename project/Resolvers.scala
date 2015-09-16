import sbt._

object Resolvers {
  val maven2 =              "Java.net Maven2 Repo"   at "http://download.java.net/maven/2/"
  val mavenLocal =          "Local Maven"            at Path.userHome.asFile.toURI.toURL + ".m2/repository"
  val sonatypeSnapshots =   "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

}
