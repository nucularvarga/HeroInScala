name := "HeroInScala"
 
version := "1.2"
      
lazy val `heroinscala` = (project in file(".")).enablePlugins(PlayScala)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "https://repo.akka.io/snapshots/"
      
scalaVersion := "2.12.2"

libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice )

libraryDependencies += "com.h2database" % "h2" % "1.4.196"

libraryDependencies ++= Seq(
  cache,
  "com.pauldijou" %% "jwt-play-json" % "0.12.0",
  "org.webjars.npm" % "vue" % "2.1.10",
  "org.webjars.npm" % "vue-resource" % "1.2.0",
  "org.webjars" %% "webjars-play" % "2.6.1",
  "org.webjars" % "bootstrap" % "3.3.7-1" exclude("org.webjars", "jquery"),
  "org.webjars" % "jquery" % "3.2.1",
  "net.codingwell" %% "scala-guice" % "4.1.0",
  "com.iheart" %% "ficus" % "1.4.1",
  "com.adrianhurt" %% "play-bootstrap" % "1.2-P26-B3",
  specs2 % Test,
  ehcache,
  guice,
  filters
)

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )
