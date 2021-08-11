package $package$.app

object HelloWorldApp extends $name$App {
  val message = getArgString("apps.HelloWorldApp", Some("Message not found!"))

  logger.info(message)
}
