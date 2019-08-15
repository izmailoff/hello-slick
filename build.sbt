name := "hello-slick"

scalaVersion := "2.12.8"

scalacOptions := Seq("-unchecked", "-deprecation")

mainClass in Compile := Some("HelloSlick")

libraryDependencies ++= List(
  "com.typesafe.slick" %% "slick" % "3.3.2",
  "org.slf4j" % "slf4j-nop" % "1.7.25",
  "com.h2database" % "h2" % "1.4.199",
  "org.scalatest" %% "scalatest" % "3.0.8" % "test"
)

fork in run := true
