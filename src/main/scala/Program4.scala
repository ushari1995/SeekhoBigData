//Check even or odd
object Program4 {

  def main(args: Array[String]):Unit = {

    val num = 399

    //checking whether the range falls between 100-100

    if(num >100 && num <1000){

      //check whether the number is even or odd
      if(num%2 == 0){
        var evenremainder = num/3
        println(s"remainder is $evenremainder")
      }else{
        println(s"the number $num is Odd number")
        var oddremainder = num/2
        println(s"the remainder is $oddremainder")
      }
    }else{
      println("The entered number is wrong number")
    }
  }

}
