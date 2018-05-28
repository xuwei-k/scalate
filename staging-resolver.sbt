resolvers in ThisBuild ++= PartialFunction.condOpt(CrossVersion.partialVersion(scalaVersion.value)) {
  case Some((2, 13)) =>
    // TODO remove when parser-combinators available maven central https://github.com/scala/scala-parser-combinators/issues/151
    "staging" at "https://oss.sonatype.org/content/repositories/staging"
}.toList
