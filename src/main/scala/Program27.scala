object Program27 {

  def main(args: Array[String]):Unit = {
    for( i<-1 to 23){
      if(i%3==0){
        println("factor of three")
      }else{
        println(s"$i,")
      }
    }
  }

}
