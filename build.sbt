organization := "com.kifi"

name := "franz"

version := "0.3.16"

crossScalaVersions := Seq("2.10.4", "2.11.5", "2.12.4", "2.13.1")

scalaVersion := "2.13.1"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

resolvers += "Typesafe Repo" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "com.amazonaws" % "aws-java-sdk-sqs" % "1.10.16"

libraryDependencies += "com.typesafe.play" %% "play-json" % "2.7.4"

libraryDependencies += "com.typesafe.play" %% "play-streams" % "2.7.3"

publishMavenStyle := true

publishTo := Some("S3 Artifacts" at "s3://homebay-artifacts/ext-releases-local")

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra := (
  <url>https://github.com/FortyTwoEng/franz</url>
  <licenses>
    <license>
      <name>MIT</name>
      <url>http://opensource.org/licenses/MIT</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>git@github.com:FortyTwoEng/franz.git</url>
    <connection>scm:git:git@github.com:FortyTwoEng/franz.git</connection>
  </scm>
  <developers>
    <developer>
      <id>stkem</id>
      <name>Stephen Kemmerling</name>
      <url>https://github.com/stkem</url>
    </developer>
  </developers>)
