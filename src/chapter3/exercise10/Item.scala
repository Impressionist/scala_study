package chapter3.exercise10

class Item(price: Int, quantity: Int) {
  def totalPrice(): Double = {
    price * quantity
  }
}
