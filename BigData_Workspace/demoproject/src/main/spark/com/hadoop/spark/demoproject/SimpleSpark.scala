package com.hadoop.spark.demoproject

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object SimpleSpark {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("HelloSpark").setMaster("local")
    val sc = new SparkContext(conf)
    
    val arrData = Array(10,20,30,40)
    val distData = sc.parallelize(arrData)
    println(distData.collect().mkString(","))
  }
  
}