import org.glassfish.hk2.utilities.cache.Cache
//program to convert Celsius to Farenheit
object Program2 {

  def main(args: Array[String]): Unit = {

    var cetemperature = 80.0
    var Farenheitemp = (cetemperature *9/5) + 32

    println("Temperature after converting from C to F is:" +Farenheitemp+"F")
  }

}
