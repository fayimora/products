name := "products"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "org.webjars" %% "webjars-play" % "2.2.0",
  "org.webjars" % "bootstrap" % "2.3.2",
  "net.sf.barcode4j" % "barcode4j" % "2.0"
)

play.Project.playScalaSettings
