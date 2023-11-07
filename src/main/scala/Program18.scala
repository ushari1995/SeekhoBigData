object Program18 {

  def main(args: Array[String]): Unit ={

    var sum = 0
    var count = 0

    for(num<-24 to 100){
      sum += num
      count += 1
      var  average = sum.toDouble/count
      println(s"average of the number $num is $average")

    }
  }

}
