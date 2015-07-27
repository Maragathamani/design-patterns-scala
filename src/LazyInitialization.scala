/**
 * Created by manny on 26/07/15.
 */
object LazyInitialization {

  var normalVal = {println("---->>>   Initializing normal val    <<<----");
    "This is the normal val"
  }
  lazy val lazyVal={println("---->>>   Initializing lazy val   <<<----");
    "This is the lazy val"
  }


  def main(args: Array[String]) {
    println("\n\nno references have been made yet\n\n")
    println("Accessing normal val : ")
    println(normalVal)
    println("\n\nAccessing lazy val : ")
    println(lazyVal)
    println("\n\nAccessing lazy val a second time, there should be no initialization now: ")
    println(lazyVal)
  }

}
