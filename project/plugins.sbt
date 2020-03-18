resolvers ++= Seq(
  "homebay-s3-artifacts" at "s3://homebay-artifacts"
)

addSbtPlugin("com.frugalmechanic" % "fm-sbt-s3-resolver" % "0.19.0")
