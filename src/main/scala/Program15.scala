object Program15 {

  def main(args: Array[String]): Unit = {
    println("Multiplication Way")
    for (num <- 2 to 16) {
      print(s"${num * (num + 1)}")
      if (num != 16) {
        print(", ")
      }
    }
println()
    println("Pattern Matching")
    for (num <- 2 to 16) {
      print(s"$num * ${num + 1}")
      if (num != 16) {
        print(", ")
      }
    }
  }
}
