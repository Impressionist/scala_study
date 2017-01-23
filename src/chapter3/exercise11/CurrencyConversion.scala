package chapter3.exercise11

object CurrencyConversion {

  val exchangeRateMap : collection.mutable.Map[String, ExchangeRate] = collection.mutable.HashMap()

  def amountTo(amountFrom: Double, rateFrom: Double, rateTo: Double) : Double = {
    amountFrom * rateFrom / rateTo
  }

  def printExchangeRateResult() : Unit = {
    print("Input your country : ")
    val country : String  = readLine()
    val exchangeRateOption = exchangeRateMap.get(country)
    exchangeRateOption.->()
  }
}
