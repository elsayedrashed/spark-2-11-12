name := "spark-2-11-12"

version := "0.1"

scalaVersion := "2.11.12"

val sparkVersion = "2.4.5"
val ScalaTestVersion = "3.1.1"
val typeSafeVersion = "1.4.0"

resolvers ++= Seq(
  "apache-snapshots" at "http://repository.apache.org/snapshots/"
)

// Apache Spark
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion % "provided" withSources(),
  "org.apache.spark" %% "spark-sql" % sparkVersion % "provided" withSources()
)

// Library
libraryDependencies ++= Seq(
  "com.typesafe" % "config" % typeSafeVersion
)

// Test Framework
logBuffered in Test := false
libraryDependencies ++= Seq(
  "org.scalactic" %% "scalactic" % ScalaTestVersion,
  "org.scalatest" %% "scalatest" % ScalaTestVersion % "test"
)
