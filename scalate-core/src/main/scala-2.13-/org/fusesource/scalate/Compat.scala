package org.fusesource.scalate

private[scalate] object Compat {

  type JMapWrapper[A, B] = scala.collection.convert.Wrappers.JMapWrapper[A, B]

}
