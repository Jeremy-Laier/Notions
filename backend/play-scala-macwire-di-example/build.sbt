lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """play-scala-macwire-di-example""",
    version := "2.8.x",
    scalaVersion := "2.12.11",
    libraryDependencies ++= Seq(
      "com.softwaremill.macwire" %% "macros" % "2.3.3" % "provided",
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test,
      "org.reactivemongo" %% "play2-reactivemongo" % "0.20.3-play27",
      javaWs
    ),

    scalacOptions ++= Seq(
      "-feature"
    )
  )
