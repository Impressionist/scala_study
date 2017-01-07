package chapter2.exercise4

class SentenceComponent(val noun: String, val verb: String, val adjective: String, val adverb: String) {
  def printSentence(): Unit = {
    println("Do you %s your %s %s %s? That's hilarious!".format(verb, adjective, noun, adverb))
  }
}
