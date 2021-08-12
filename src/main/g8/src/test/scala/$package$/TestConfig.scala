package $package$

import $package$.common.utils.Test

class TestConfig extends Test {

  behavior of "config"

  it should "be accessible" in {
    val configured = $class$()
    val message = configured.getArgString("$Class$.message", None)

    println(message)
  }
}
