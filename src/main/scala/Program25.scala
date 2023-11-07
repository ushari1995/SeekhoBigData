object Program25 {

  def main(args: Array[String]): Unit = {

    var num1 = 5
    //coding with pattern
    println("Pattern Value")
    for (res <- 4 to -12 by -1) {
      print(s"$num1 * $res")
      if(res!= -12){
        print(", ")
      }
    }
    println()
   //coding with multiplied value
    println("Multiplied Value")
    for (res <- 4 to -12 by -1) {
      println(s"${num1 * res}")
    }
  }
}