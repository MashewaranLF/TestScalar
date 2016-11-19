
lazy val commonSettings = Seq(
  organization := "com.example",
  version := "1.0",
  scalaVersion := "2.12.0"
)


lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(
    name := "TestScalar"
  )