object Program20 {

  def main(args: Array[String]): Unit = {

    val num = 100

    for (i <- 1 to num) {
      if (i % 2 == 1) {
        print("A")
      } else {
        print("B")
      }
    }

  }
}
