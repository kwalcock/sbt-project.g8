package $package$

class TestConfig extends Test {

  behavior of "config"

  it should "be accessible" in {
    val configured = $name$()
    val message = configured.getArgString("$name$.message")

    println(message)
  }
}
