object Program16 {

  def main(args: Array[String]): Unit = {

    var sum = 0

    for(num <- 382 to 582){
      if(num %2 == 0){
        sum += num
      }
    }
println(s"Sum of the even numbers is: $sum ")
  }

}
