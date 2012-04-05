name := $name$

organization := $artifactId$

version := $version$

scalaVersion := $scalaVersion$

resolvers += Resolver.mavenLocal

publishTo := Some(Resolver.file("localMaven",Path.userHome / ".m2" / "repository"))

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.8.2" % "test",
  "junit" % "junit" % "4.7" % "test"
)