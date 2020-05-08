// Assembly Merge Strategy
assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}

// Excluding Scala library JARs
assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)

// Default Main Class
mainClass in assembly := Some("application.Main")

// File name of assembled jar
assemblyJarName in assembly := { s"${name.value}_${scalaVersion.value}-${version.value}-assembly.jar" }
