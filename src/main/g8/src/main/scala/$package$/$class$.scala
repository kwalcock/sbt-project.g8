package $package$

import com.typesafe.config.Config
import com.typesafe.config.ConfigFactory
import $package$.common.utils.Configured

trait $class$Configured extends Configured {
  // This line doesn't work if there is a leading / in the resource name.  I tried.
  lazy val config = ConfigFactory.parseResourcesAnySyntax("$class$")

  override def getConf: Config = config
}

class $class$() extends $class$Configured {

}

object $class$ {

  def apply(): $class$ = new $class$()
}
