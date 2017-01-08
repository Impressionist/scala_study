package chapter3.exercise7

class Area(val length: Double, val width: Double) {

  val FeetToMetersConstant = 0.09290304

  def calculationFeet(): Double = {
    length * width
  }

  def calculationMeters() : Double = {
    calculationFeet() * FeetToMetersConstant
  }
}
