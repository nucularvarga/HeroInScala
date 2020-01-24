name          := "Heroes"
organization  := "de.htwg.se"
version       := "0.2.0"
scalaVersion  := "2.12.7"

scalacOptions := Seq("-unchecked", "-feature", "-deprecation", "-encoding", "utf8")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"

libraryDependencies += "junit" % "junit" % "4.8" % "test"

libraryDependencies += "org.scala-lang.modules" % "scala-swing_2.12" % "2.0.1"

libraryDependencies += "net.codingwell" %% "scala-guice" % "4.1.0"

libraryDependencies += "com.google.inject" % "guice" % "4.1.0"

libraryDependencies += "com.google.inject.extensions" % "guice-assistedinject" % "4.1.0"

libraryDependencies += "com.typesafe.play" %% "play-json" % "2.6.6"

libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.1.7"

libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.1.0"