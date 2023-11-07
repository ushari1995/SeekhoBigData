object Program17 {

  def main(args: Array[String]): Unit = {

    var alphabet = 'A'

    while(alphabet <= 'Z'){
      println(s"$alphabet")
      alphabet= (alphabet+1).toChar
    }
  }
}
