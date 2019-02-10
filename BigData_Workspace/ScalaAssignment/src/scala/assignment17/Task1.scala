package scala.assignment17

class Car {
  var tyreCount : Int = 4
}

class Honda(color:String, model:String, yearOfMake:Int) extends Car {
    
  def showDetails() : Unit = {
    println("Car Color : " + color)
    println("Car Model : " + model)
    println("Year of Make : " + yearOfMake)
    println("Number of Tyres : " + tyreCount)
  }
}

object Task1 {
  def main(args : Array[String]) : Unit = {
   var honda : Honda = new Honda("Red", "IVTec", 2009)
   honda.showDetails()
  }  
}