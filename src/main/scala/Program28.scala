object Program28 {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 23) {
      if (i % 2 != 0) {
        if (i % 5 == 0) {
          println("divisible by five")
        } else {
          println(i)
        }
      }
    }
  }
}
