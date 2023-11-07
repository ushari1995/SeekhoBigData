object Program29 {
  def main(args: Array[String]): Unit = {
    var num = 0.5

    while (num <= 5.1) {
      val square = num * num
      println(square)
      num += 0.2
    }
  }
}
