package scala.assignment15

object Task2_2 {
  def main(args : Array[String]) : Unit = {
    var position1 : Int = 5
    var position2 : Int = 8
    var position3 : Int = 14
    
    fibonacci(position1,0,1)
    println
    fibonacci(position2,0,1)
    println
    fibonacci(position3,0,1)
    
  }
  // Recursive function to print fibonacci series of number upto nth number
  def fibonacci(n : Int, previous : Int=0, next : Int = 1) : Unit = {
    if(n == 0)
      return;
    print(next)
    fibonacci(n-1, next, (next+previous))
    }
  
}