package scala.assignment16

class Rational(num1:Int, denom1:Int, num2:Int, denom2:Int) {
  
  // Arbitrary Constructor to handle whole numbers
  def this(num1:Int,num2:Int) {
    this(num1,1,num2,1)    // Call to primary constructor
  }
  
  // Addition of 2 rational numbers
  def addRational() : Float = {
    var gcdDenom : Float = gcd(denom1,denom2)
    var sumNum : Float = num1 + num2
    return (sumNum / gcdDenom)
  }
  
  // Subtraction of 2 rational numbers
  def subtractRational() : Float = {
    var gcdDenom : Float = gcd(denom1,denom2)
    var diffNum : Float = num1 - num2
    return (diffNum / gcdDenom)
  }
  
  // Multiplication of 2 rational numbers
  def multiplyRational() : Float = {
    var multiplyNum : Float = num1 * num2
    var multiplyDenom : Float = denom1 * denom2
    return (multiplyNum/multiplyDenom)
  }
  
  // Division of 2 rational numbers
  def divideRational() : Float = {
    var divisibleNum : Float = num1 * denom2
    var divisibleDenom : Float = num2 * denom1
    return (divisibleNum/divisibleDenom)
  }
  
  // Get the GCD of two numbers
  def gcd(a : Int, b : Int) : Int = {
    if (a == 0) {
      return b
    }
    return gcd(b%a, a)
  }
}

object Training {
  def main(args : Array[String]) : Unit = {
    
    var numerator1 : Int = 5
    var denominator1 : Int = 2 
    var numerator2 : Int = 3
    var denominator2 : Int = 4 
    
    var rational1 = new Rational(numerator1,denominator1,numerator2,denominator2)
    var addResult : Float = rational1.addRational()
    var subtractResult : Float = rational1.subtractRational()
    var multiplyResult : Float = rational1.multiplyRational()
    var divideResult : Float = rational1.divideRational()
    
    println("INPUT\n---------------")
    println(numerator1 + "/" + denominator1 + " and " + numerator2 + "/" + denominator2)
    
    println("\nRESULT: \n----------------")
    println("Addition of Rational Numbers : " + addResult)
    println("Subtraction of Rational Numbers : " + subtractResult)
    println("Multiplication of  Rational Numbers : " + multiplyResult)
    println("Division of Rational Numbers : " + divideResult)
  }  
}