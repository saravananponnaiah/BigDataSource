package com.hadoop.spark.demoproject
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object Assignment18 {
  def main(args : Array[String]) : Unit = {
      /*
       Given a list of numbers - List[Int] (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    		- find the sum of all numbers
    		- find the total elements in the list
    		- calculate the average of the numbers in the list
    		- find the sum of all the even numbers in the list
    		- find the total number of elements in the list divisible by both 5 and 3
       */
      val conf = new SparkConf().setAppName("HelloSpark").setMaster("local")
      val sc = new SparkContext(conf)
      
      val numbers : List[Int] = List(1,2,3,4,5,6,7,8,9,10)
      val distData = sc.parallelize(numbers)
       
      val sum = distData.reduce(_+_)                                                                                                        // Find sum of all numbers
      val elementCount = distData.count()                                                                                                // Find the total elements in the list
      val average = sum / elementCount                                                                                                  // Calculate the average of numbers in the list
      val evenElements = distData.filter(element => element % 2 == 0)                                                      // Filter the even number elements and creates new RDD "evenElements"
      val sumOfEvenElements = evenElements.reduce(_+_)                                                                         // Calculate the sum of even elements
      val divisibleElements = distData.filter(element => (element%5 == 0) && (element%3 == 0)).count()     // Find the total number of elements in the list divisible by both 5 and 3  
      
      println("----------------------------------------------------------------")
      println("SUM OF ALL NUMBERS : " + sum)
      println("TOTAL ELEMENTS IN THE LIST : " + elementCount)
      println("AVERAGE OF ELEMENTS IN THE LIST : " + average)
      println("SUM OF EVEN NUMBERS IN THE LIST : " + sumOfEvenElements)
      println("TOTAL ELEMENTS DIVISIBLE BY BOTH 5 AND 3 : " + divisibleElements)
      println("----------------------------------------------------------------")
      
      sc.stop()
  }
}