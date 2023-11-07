object Program12 {
  def main(args: Array[String]): Unit = {
    var count = 0

    for (num <- 2 to 250) {
      if (num % 2 == 0) {
        count += 1
      }
    }
    println(s"Count of even numbers is $count")
  }
}
