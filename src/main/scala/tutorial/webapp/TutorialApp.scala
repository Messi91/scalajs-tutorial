package tutorial.webapp

import org.scalajs.jquery.jQuery
import scala.scalajs.js.JSApp

/**
  * Created by mesfinmebrate on 07/10/2016.
  */

object TutorialApp extends JSApp {

  def main(): Unit = {
    jQuery(setupUI _)
  }

  def setupUI(): Unit = {
    jQuery("""<button type="button">Click me!</button>""").click(addClickedMessage _).appendTo(jQuery("body"))
    jQuery("body").append("<p>Hello World!</p>")
  }

  def addClickedMessage(): Unit = {
    jQuery("body").append("<p>You clicked the button!</p>")
  }
}