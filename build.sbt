name := "Thunder"

version := "1.0"

scalaVersion := "2.9.3"

ivyXML := <dependency org="org.eclipse.jetty.orbit" name="javax.servlet" rev="3.0.0.v201112011016"><artifact name="javax.servlet" type="orbit" ext="jar"/></dependency>

libraryDependencies += "org.spark-project" %% "spark-core" % "0.7.3"

libraryDependencies += "io.spray" %%  "spray-json" % "1.2.5"

libraryDependencies += "org.spark-project" %% "spark-streaming" % "0.7.3"

resolvers += "spray" at "http://repo.spray.io/"

resolvers ++= Seq(
  "Akka Repository" at "http://repo.akka.io/releases/",
  "Spray Repository" at "http://repo.spray.cc/")

