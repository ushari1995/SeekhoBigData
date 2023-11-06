//program to print the boggest of 3 numbers
object Program3 {

  def main(args: Array[String]) : Unit = {

    var a = 10;
    var b = 20;
    var c= 30;

    var bignumber = List(a,b,c).max

    println(s"biggest number is $bignumber")
  }
}
