name := "$name$"

organization := "$groupId$"

version := "$version$"

scalaVersion := "$scalaVersion$"

resolvers += Resolver.mavenLocal

publishTo := Some(Resolver.file("localMaven",Path.userHome / ".m2" / "repository"))

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.12.3" % "test",
  "junit" % "junit" % "4.11" % "test",
  "org.mockito" % "mockito-all" % "1.9.0" % "test"
)
)