package chapter2.exercise6

import chapter2.exercise5.Calculator
import org.joda.time.DateTime

class Retirement(val currentAge: String, val retireAge: String) {
  def calculateYearOfRetirement(): Unit = {
    if (Calculator.isNaturalNumber(currentAge) && Calculator.isNaturalNumber(retireAge)) {
      val remainingAge = retireAge.toInt - currentAge.toInt
      if (remainingAge > 0) {
        println("You have %s years left until you can retire.".format(remainingAge))
        println("It's %s, so you can retire in %s"
          .format(DateTime.now().toString("YYYY"), DateTime.now().plusYears(remainingAge).toString("YYYY"))
        )
      }
    }
  }
}
