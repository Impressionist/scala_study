package chapter3.exercise8

class Pizza(val pieces: Int) {
  def calculateNumberOfPiecesPerPerson(pizzaCount: Int, manCount: Int): Unit = {
    if (pieces % 2 == 0) {
      val allPieces = pizzaCount * pieces
      val picesPerPerson = allPieces / manCount
      val leftOverPeces = allPieces % manCount
      println("Each person gets %s pieces of pizza".format(picesPerPerson))
      println("There are %s leftover pieces".format(leftOverPeces))
    }
  }
}
