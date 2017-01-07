package chapter2.exercise5

import scala.util.Try

object Calculator {
  def calculate(firstNumber: String, secondNumber: String): Unit = {
    val plusResultFormat = "%s + %s = %s"
    val minusResultFormat = "%s - %s = %s"
    val multiplyResultFormat = "%s * %s = %s"
    val divisionResultFormat = "%s / %s = %s"

    if (isNaturalNumber(firstNumber) && isNaturalNumber(secondNumber)) {
      val firstNumberToInt = firstNumber.toInt
      val secondNumberToInt = secondNumber.toInt

      println(plusResultFormat.format(firstNumber, secondNumber, firstNumberToInt + secondNumberToInt))
      println(minusResultFormat.format(firstNumber, secondNumber, firstNumberToInt - secondNumberToInt))
      println(multiplyResultFormat.format(firstNumber, secondNumber, firstNumberToInt * secondNumberToInt))
      println(divisionResultFormat.format(firstNumber, secondNumber, firstNumberToInt / secondNumberToInt))
    }
  }

  def isNaturalNumber(number: String) : Boolean = {
    if (Try(number.toInt).isFailure) {
      return false
    }

    val numberToInt = number.toInt

    if (Math.abs(numberToInt) != numberToInt) {
      return false
    }
    true
  }
}
