name := "ScalaCasaDoCodigo"

version := "1.0"

scalaVersion := "2.12.2"

scalacOptions in Test ++= Seq("-Yrangepos")

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.9.2",
  "org.scala-lang.modules" % "scala-xml_2.12" % "1.0.6"
)