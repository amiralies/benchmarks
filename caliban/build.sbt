name := "caliban"

ThisBuild / scalaVersion := "2.13.10"

scalacOptions ++= Seq("-Ywarn-unused", "-deprecation")

ThisBuild / assemblyMergeStrategy := {
  case PathList("META-INF", _*) => MergeStrategy.discard
  case x =>
    val oldStrategy = (ThisBuild / assemblyMergeStrategy).value
    oldStrategy(x)
}

assembly / mainClass := Some("CalibanServer")

libraryDependencies ++= Seq(
  "com.github.ghostdogpr" %% "caliban" % "2.1.0",
  "com.github.ghostdogpr" %% "caliban-zio-http" % "2.1.0",
  "com.softwaremill.sttp.tapir" %% "tapir-json-zio" % "1.2.11"
)
