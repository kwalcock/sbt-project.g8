package $package$

trait $name$Configured extends Configured {
  // This line doesn't work if there is a leading / in the resource name.  I tried.
  lazy val config = ConfigFactory.parseResourcesAnySyntax("$package$/$name$")

  override def getConf: Config = config
}

class $name$ extends $name$Configured {

}

object $name$ {

  def apply: $name$ = new $name()
}
