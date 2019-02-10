package scala.assignment17

object Task4 {
  def main(args : Array[String]) : Unit = {
    var course : String = readLine("Enter the course name : ")
    
    println("COURSE FEE : " + getCourseFee(course))
    
    def getCourseFee(courseName : String) : String = courseName match {
      case "Android App Development" => "14,999 INR"
      case "Data Science" => "49,999 INR"
      case "Big Data Hadoop & Spark Developer" => "24,999 INR"
      case "Blockchain Certification" => "49,999 INR"
      case _ => "Course not available"
    }
    
  }  
}