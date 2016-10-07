package tutorial.webapp

import utest._
import org.scalajs.jquery.jQuery

/**
  * Created by mesfinmebrate on 07/10/2016.
  */

object TutorialTest extends TestSuite {

  TutorialApp.setupUI()

  def tests = TestSuite {
    'HelloWorld {
      assert(jQuery("p:contains('Hello World')").length == 1)
    }

    'ButtonClick {
      def messageCount = jQuery("p:contains('You clicked the button!')").length

      val button = jQuery("button:contains('Click me!')")
      assert(button.length == 1)
      assert(messageCount == 0)

      for (count <- 1 to 5) {
        button.click()
        assert(messageCount == count)
      }
    }
  }
}