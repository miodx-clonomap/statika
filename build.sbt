name          := "statika"
organization  := "com.miodx.common"
description   := "Managing dependencies"
version       := "3.0.0"

bucketSuffix := "era7.com"

crossScalaVersions := Seq("2.11.11", "2.12.8")
scalaVersion  := "2.11.11"

libraryDependencies ++= Seq (
  "org.scalatest" %% "scalatest" % "3.0.4" % Test
)

testOptions       in Test += Tests.Argument("-oD")
parallelExecution in Test := false
