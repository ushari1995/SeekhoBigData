object Program10 {

  def main(args: Array[String]): Unit ={

    for( num <- 700 to 900){
      if( num %2 == 0)
        println(s"All even numbers in range between 700 to 900 are $num")
    }
  }

}
