package scala.assignment15

object Task3 {
  def main(args : Array[String]) : Unit = {
   var number : Double = 556677.9922
   var i : Double = 1
   var nearRoot : Double = 1
   
   var x : Double = 0.0
   var y : Double = 1.0
   var squareRoot : Double = 0.0
   
   // Find the closest square root for approximation
   while (number >= (i * i)) {
     nearRoot = i
     i += 1
   }
   
   x = nearRoot
   squareRoot = (x + (number/x)) / 2
   print("Square root of " + number + " : " + squareRoot)
   
  }  
}