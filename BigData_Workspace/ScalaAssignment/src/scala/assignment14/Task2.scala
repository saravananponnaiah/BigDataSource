package scala.assignment14

object Task2 {
  def main(args:Array[String]) : Unit = {
    val lsTuplesData = List((1,"alpha"),(2,"beta"),(3,"gamma"),(4,"zeta"),(5,"omega"))
    println("INPUT DATA: \n----------------------\n" + lsTuplesData)
    
    // For the above list, print the numbers where the corresponding string length is 4
    var counter1 : Int = 0
    for(tuple <- lsTuplesData if tuple._2.length() == 4) {
      counter1 += 1
    }
    println("a. For the above list, print the numbers where the corresponding string length is 4")
    println("OUTPUT: " + counter1)
    
    //find the average of all numbers, where the corresponding string contains alphabet ‘m’ or alphabet ‘z’.
    var avgResult : Int = 0
    var sumTupleIndex : Int = 0
    for(tuple <- lsTuplesData if (tuple._2.contains('m') || tuple._2.contains('z'))) {
      sumTupleIndex += tuple._1
    }
    avgResult = sumTupleIndex / lsTuplesData.length
    println("b. find the average of all numbers, where the corresponding string contains alphabet \'m\' or alphabet \'z\'")
    println("OUTPUT: " + avgResult)
    
  }
}