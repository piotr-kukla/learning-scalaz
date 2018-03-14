name := "learning-scalaz"

version := "1.0"

scalaVersion := "2.12.4"

val scalazVersion = "7.2.20"


libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % scalazVersion
)

scalacOptions += "-feature"

initialCommands in console := "import scalaz._, Scalaz._"
    