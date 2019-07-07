name          := "statika"
organization  := "com.miodx.common"
description   := "Managing dependencies"
version       := "3.1.0-SNAPSHOT"

bucketSuffix := "era7.com"

crossScalaVersions := Seq("2.11.11", "2.12.8")
scalaVersion  := "2.11.11"

libraryDependencies ++= Seq (
  "org.slf4j"      % "slf4j-api" % "1.7.25",
  "org.scalatest" %% "scalatest" % "3.0.4" % Test
)

testOptions       in Test += Tests.Argument("-oD")
parallelExecution in Test := false
