package $package$.apps

import $package$.utils.$class$App

object HelloWorldApp extends $class$App {
  val message = getArgString("apps.HelloWorldApp.message", Some("Message not found!"))

  logger.info(message)
}
