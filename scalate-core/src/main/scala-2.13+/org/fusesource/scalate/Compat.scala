package org.fusesource.scalate

private[scalate] object Compat {

  type JMapWrapper[A, B] = scala.collection.convert.JavaCollectionWrappers.JMapWrapper[A, B]

}
