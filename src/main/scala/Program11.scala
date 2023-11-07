object Program11 {

  def main(args: Array[String]): Unit = {

    for (num <- 51 to 251) {
      if(num%2 != 0){
        println(s"All the odd numbers from 51 to 251 are: $num")
      }
    }

    }

}
