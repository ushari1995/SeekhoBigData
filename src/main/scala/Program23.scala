object Program23 {
  def main(args: Array[String]): Unit = {
    for (num <- 5 to 25 by 2) {
      val square = num * num
      print(square)
     if (num != 25) {
        print(", ")
     }
    }
  }
}
