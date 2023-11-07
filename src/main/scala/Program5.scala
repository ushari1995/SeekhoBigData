object Program5 {

  def main(args: Array[String]):Unit = {
    var num = 70
    if(num >=0 && num <=100){
      if(num >= 80 && num <= 90 ){
        println("Super smart")
      }else if(num >= 70 && num < 80){
        println("Smart Enough")
      }else if(num >= 60 && num < 70){
        println("Just Smart")
      }else if(num >= 35 && num < 60){
        println("not smart")
      }else if(num >= 0 && num < 35){
        println("Dump")
      }
      }
    else {
      println("not a valid input")
    }
  }

}
