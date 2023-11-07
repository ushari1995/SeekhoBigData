object Program19 {

  def main(args: Array[String]): Unit = {

    var sum = 0.0

    for(num<-5 to 102){
      sum += Math.sqrt(num)

      println(s"$sum")
    }


  }

}
