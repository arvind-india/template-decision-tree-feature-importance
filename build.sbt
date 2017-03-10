import AssemblyKeys._

assemblySettings

name := "template-scala-parallel-classification"

organization := "io.prediction"

libraryDependencies ++= Seq(
  "org.apache.predictionio" %% "apache-predictionio-core" % "0.10.0-incubating" % "provided",
  "org.apache.spark"        %% "spark-core"               % "1.3.1" % "provided",
  "org.apache.spark"        %% "spark-mllib"              % "1.3.1" % "provided",
  "io.spray" %% "spray-json" % "1.2.6")
