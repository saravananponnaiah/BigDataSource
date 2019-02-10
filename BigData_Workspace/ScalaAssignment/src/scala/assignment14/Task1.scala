package scala.assignment14
import scala.collection.mutable.ListBuffer

object Task1 {
  
  def main(args:Array[String]) : Unit = {
    var lsData:List[String] = List("alpha","gamma","omega","zeta","beta")
    println("INPUT DATA: \n------------------ \n" + lsData)
    println("\nOUTPUT \n--------------------")
    // Find count of all strings with length 4
    var strCount : Int = 0
    for(data <- lsData if data.length() == 4) {
      strCount+=1
    }
    println("a. Find count of all strings with length 4")
    println("Number of strings that has length as 4 : " + strCount)
    
    // Convert the list of string to a list of integers, where each string is mapped to its corresponding length
    var lsBfrLength = new ListBuffer[Int]()
    for(data <- lsData) {
      lsBfrLength += data.length()
    }
    val lsLength = lsBfrLength.toList
    println("b. Convert the list of string to a list of integers, where each string is mapped to its corresponding length")
    for(len <- lsLength) println(len)
    
    // Find count of all strings which contain alphabet ‘m’
    var cntCharString : Int = 0
    for(data <- lsData if data.contains('m')) {
      cntCharString += 1
    }
    println("c. Find count of all strings which contain alphabet \'m\'")
    println("Number of strings that contain character \'m\' : " + cntCharString)  
    
    //Find the count of all strings which start with the alphabet ‘a’
    var cntStart : Int = 0
    for(data <- lsData if data.startsWith("a")) {
      cntStart += 1
    }
    println("d. Find the count of all strings which start with the alphabet \'a\'")
    println("Number of strings that start with character \'a\' : " + cntStart)
    
  }
}