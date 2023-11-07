object Program30 {

  def main(args: Array[String]): Unit = {
    var i = 100

    while (i > 10) {
      for (num <- i to 100 by 10) {
        println(i)
      }
    }
  }
}