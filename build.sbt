organization := "a8"

name := "a8-box"

version := "3.1.0"

scalaVersion := "2.12.3"

publishTo := Some("a8-repo-publish" at "https://accur8.artifactoryonline.com/accur8/libs-releases-local/")

credentials += Credentials(Path.userHome / ".sbt" / "credentials")
