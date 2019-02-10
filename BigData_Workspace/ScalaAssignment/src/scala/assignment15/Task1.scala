package scala.assignment15

object Task1 {
  def main(args : Array[String]) : Unit = {
    
    println("-------------------------------\nOUTPUT\n-------------------------------")
    println("GCD of 10 & 45 : " + gcd(10, 45))
    println("GCD of 27 & 88 : " + gcd(27, 88))
    println("GCD of 2345 & 7643 : " + gcd(2345, 7643))
    println("GCD of 762 & 848 : " + gcd(762, 848))
    println("-------------------------------")
    
  }
  // Recursive method to find GCD of 2 numbers
  def gcd(a : Int, b : Int) : Int = {
    if (a == 0) {
      return b
    }
    return gcd(b%a, a)
  }
}