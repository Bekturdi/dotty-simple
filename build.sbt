val dottyVersion = "3.0.0-M3"

lazy val root = project
  .in(file("."))
  .settings(
    name := "dotty-simple",
    version := "0.1.0",

    scalaVersion := dottyVersion,

    libraryDependencies ++=
      Seq(
        "com.novocode" % "junit-interface" % "0.11" % "test",
        "org.typelevel" %% "cats-effect" % "3.0.0"
      )
  )
