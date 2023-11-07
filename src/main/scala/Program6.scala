object Program6 {

  def main(args: Array[String]): Unit = {
    var a = 20
    var b = 30

    println("Enter the operator (+,-,*,/):")
    val operator = scala.io.StdIn.readLine()
    val result = operator match{

case "+" =>a+b
case "-" => a-b
case "*" => a*b
case "/" => a/b
case _ => println("Invalid number")
    }
    println("The result of the operation is "+result)
  }

}
