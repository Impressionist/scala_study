package chapter3.exercise10

import chapter2.exercise5.Calculator

object SelfCounter {

  var count : Int = 1
  var results : scala.collection.mutable.ListBuffer[Item] = scala.collection.mutable.ListBuffer()

  def inputPrice(): Unit = {
    print(s"Price of item $count: ")
    val price = readLine()
    if (!price.isEmpty && Calculator.isNaturalNumber(price)) {
      print(s"Quantity of item $count: ")
      val quantity : String = readLine()
      if (!quantity.isEmpty && Calculator.isNaturalNumber(quantity)) {
        results += new Item(price.toInt, quantity.toInt)
        count += 1
        inputPrice()
      }
    }
  }

  def printReceipt(): Unit = {
    inputPrice()
    val subTotal : Double = results.map(item => item.totalPrice()).sum
    println("Subtotal: $%s".format(subTotal))
    println("Tax: $%s".format(subTotal * 0.055))
    println("Total: $%s".format(subTotal + subTotal * 0.055))
  }
}
