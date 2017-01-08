package chapter2

import chapter2.exercise4.SentenceComponent
import chapter2.exercise5.Calculator
import chapter2.exercise6.Retirement

object Chapter2 extends App {
  new SentenceComponent("dog", "walk", "blue", "quickly").printSentence()
  Calculator.calculate("-1", "1")
  Calculator.calculate("1", "-1")
  Calculator.calculate("abc", "111abc")
  Calculator.calculate("10", "5")
  new Retirement("25", "65").calculateYearOfRetirement()

}
