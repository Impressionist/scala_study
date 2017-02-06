package functional.chapter2

object Exercise1 extends App {
  def fib(n: Int) : Int = {
    def go(n1: Int, n2: Int, count: Int) : Int = {
      if (count > 1) go(n2, n1+ n2, count - 1)
      else n2
    }

    go(0, 1, n)
  }

  print(fib(5))
}
