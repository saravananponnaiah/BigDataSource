import java.io.FileReader
import java.io.FileNotFoundException
import java.io.PrintWriter
import scala.io.Source

object ScalaFileBasics {
  def main(args : Array[String]) : Unit = {
    try {
          // val file = new FileReader("input.txt")
          println("Start writing file: employees.csv...")
          val writer = new PrintWriter(raw"D:\employees.csv")
          println("Write object acquired...")
          writer.write("EmpId,FirstName,LastName,Company\n")
          writer.write("101,Saravanan,Ponnaiah,Aspire Systems\n")
          writer.write("102,Rama Subramaniyan,Kalidoss,TCS\n")
          println("Contents are written in to file...")
          writer.close()
          println("Write File object is closed...")
          
          println("Start reading file: employee.csv")
          Source.fromFile(raw"D:\employees.csv").foreach {
            print
          }
          println("Read & print file content completed successfully...")
    } catch {
      case ex : FileNotFoundException => {
        println("EXCEPTION: FILE NOT FOUND")
      }
      case ex : IndexOutOfBoundsException => {
        println("EXCEPTION: Index Out of Bound Exception")
      }
    }
  }
}