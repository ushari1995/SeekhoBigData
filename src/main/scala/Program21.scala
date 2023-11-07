object Program21 {
  def main(args: Array[String]): Unit = {
    var num1 = 10
    var num2 = 9

    while (num1 >= -5 && num2 >= -6) {
      print(s"$num1@$num2")
      if (num1 > -5 && num2 > -6) {
        print(", ")
      }
      num1 -= 1
      num2 -= 1
    }
  }
}
