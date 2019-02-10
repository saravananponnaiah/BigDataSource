
class Circle(val radius:Int) {
  val pi = 3.14
  
  def showAreaOfCircle() : Unit = {
    var areaOfCircle = pi * radius
    println(s"AREA OF CIRCLE: $areaOfCircle")
  }
}

case class Employee(val empId:Int, val empName:String, val team:String)

object ScalaBasics {
  def main(args: Array[String]): Unit = {
    println("Start Scala Program")
    
    println("************************ \n LOOPING \n ************************")
    var count=15
    count = 20
    
    val countVal = 100
    //countVal = 200
    
    if (count == 15)
    {
      println("Value of count = " + count)      
    }
    else
    {
      println("Value of count variable = " + count)
    }
    
    for(i <- 1 to 5) {
      println("Iteration : " + i)
    }    
    
    println("\n************************ \n COLLECTIONS - MAP \n ************************")
    var mp:Map[String,Int] = Map()
    mp += ("Key1"->1)
    mp += ("Key2"->2)
    mp += ("Key3"->3)
    
    println("The keys in map are : " + mp.keys)
    println("The values in map are : " + mp.values)
    println("The value in map key Key2 is : " + mp("Key2"))
    
    println("COLLECTIONS - LIST \n *****************************")
    var lsWeek:List[String] = List("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")
    var lsDept = List("Sales","Marketing","Human Resource","Research","Manufacturing")
    println("Day 3 of a week : " + lsWeek(3))
    println("All Departments : " + lsDept)
    println("Department 3 in the list : " + lsDept(3))
    
    println("******************************* \n FUNCTIONS DEMONSTRATION \n *******************************")
    println("Demo 1 - Without return")
    def displayCompany(companyName:String) : Unit = {
      println(s"COMPANY NAME : $companyName")
    }
    displayCompany("ASPIRE SYSTEMS")    
    println("---------------")
    println("Demo 2 - With return")
    def isEligibleToVote(age:Int) : Boolean = {
      if(age > 18)
      {
        true
      }
      else {
        false
      }      
    }
    val citizenAge = 45
    var msg = "CITIZEN IS NOT ELIGIBLE TO VOTE"
    if (isEligibleToVote(citizenAge)) {
      msg = "CITIZEN IS ELIGIBLE TO VOTE"
    }
    println(s"CITIZEN AGE: $citizenAge \n VOTING ELIGIBILITY: $msg")
    println("---------------")
    println("Demo 3 - Anonymous Function")
    
    var farenheat = (celcius : Double) => celcius+32
    println("TEMPERATURE FARENHEAT: " + farenheat(36.5))
    
    println("******************************* \n CLASSES & OBJECTS \n *******************************")
    var circle = new Circle(20)
    circle.showAreaOfCircle()
    println("---------------")
    
    println("******************************* \n PATTERN MATCHING (SWITCH CASE) \n *******************************")
    val emp1 = new Employee(100,"Saravanan Ponnaiah","Development")
    val emp2 = new Employee(101,"Ramasubramaniyan Kalidoss","DBA")
    val emp3 = new Employee(102,"Vijay Lakshmanan","Mainframes")
    
    var lsEmployees:List[Employee] = List(emp1,emp2,emp3)
    for(employee <- lsEmployees) {
      employee match {
        case Employee(empId,empName,team) => println("Hello ! " + empName) 
      }
    }
    
  }
}