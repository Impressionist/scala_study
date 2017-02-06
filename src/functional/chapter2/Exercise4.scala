package functional.chapter2

object Exercise4 extends App {
  def uncurry[A, B, C](f: A => B => C) : (A, B) => C = {
    (a, b) => f(a)(b)
  }
}
