name := """logSample"""

version := "1.0"

scalaVersion := "2.11.7"

// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
	"ch.qos.logback" % "logback-core" % "1.1.5",
	"ch.qos.logback" % "logback-classic" % "1.1.5",
	"org.slf4j" % "slf4j-api" % "1.7.16",
	"org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

