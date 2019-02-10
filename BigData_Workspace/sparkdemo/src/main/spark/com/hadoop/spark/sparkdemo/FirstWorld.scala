package com.hadoop.spark.sparkdemo

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object FirstWorld {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("HelloSpark").setMaster("local")
    val sc = new SparkContext(conf)
    
    val arrData = Array(10,20,30,40)
    val distData = sc.parallelize(arrData)
    println(distData.collect().mkString(","))
  }
}