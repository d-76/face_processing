name := "face_processing"

version := "0.1"

scalaVersion := "2.13.0"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

resolvers += Resolver.jcenterRepo

resolvers += Resolver.bintrayRepo("unibas-gravis", "maven")

resolvers += Opts.resolver.sonatypeSnapshots
