package scala.assignment15

object Task2_1 {
  def main(args : Array[String]) : Unit = {
    val position1 = 5
    val position2 = 10
    val position3 = 15
    val position4 = 23
    var previous : Int = 1
    var next : Int = 1
    var sum : Int = 0
    var currentNumber = 1
    print(previous)
    print(next)
    for( i <- 2 to position2-1) {
      sum = previous + next
      print(sum)
      previous = next
      next = sum
    }
  }
}