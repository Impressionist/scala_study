package chapter3.exercise9

class Paint {
  val CoverPerLiter = 9

  def calculateNeedPaintAmount(meters: Double): Unit = {
    val liters = meters / 9
    print("You wiil need to purchase %s liters of paint to cover %s square meters".format(Math.ceil(liters).toInt, meters))
  }
}
