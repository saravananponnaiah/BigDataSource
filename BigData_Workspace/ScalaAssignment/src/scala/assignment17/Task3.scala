package scala.assignment17

object Task3 {
  def main(args : Array[String]) : Unit = {
    // A partial function that accepts 2 numbers as input and return the sum
    val performAddition : PartialFunction[(Int, Int), Int] = {
      case (a, b) => a + b + 100
    }
    
    // Method to calculate the square value and return the result
    def calculateSquare(value:Int) : Int = {
      return (value * value)
    }
    
    println("OUTPUT:\n-------------------")
    println("40 + 60 + 100 : " + performAddition(40, 60))
    println("Square value : " + calculateSquare(performAddition(40, 60)))
    println("------------------------")
  }
}