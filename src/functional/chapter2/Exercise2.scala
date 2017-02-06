package functional.chapter2

object Exercise2 extends App{

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    def go(n: Int) : Boolean = {
      if (n >= as.length - 1) true
      else if (ordered(as(n), as(n + 1))) false
      else go(n + 1)
    }
    go(0)
  }

  def intOrdered(x: Int, y: Int): Boolean = {
    Ordering.Int.compare(x, y) == 1
  }

  println(isSorted(Array[Int](5,1,3,7,2), intOrdered))
  println(isSorted(Array[Int](1,2,3,4,5), intOrdered))
}
