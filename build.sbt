lazy val box = (crossProject in file("."))
  .settings(
    organization := "a8",
    name := "a8-box",
    version := "3.1.1",
    scalaVersion := "2.12.3",
    publishTo := Some("a8-repo-publish" at "https://accur8.artifactoryonline.com/accur8/libs-releases-local/"),
    credentials += Credentials(Path.userHome / ".sbt" / "credentials")
  )

lazy val boxJVM = box.jvm
lazy val boxJS = box.js

lazy val root =
  (project in file("."))
    .settings(
      publish := {}
    )
    .aggregate(boxJVM, boxJS)
