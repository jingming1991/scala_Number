import org.scalatest.FunSuite

class IncreaceAndDecreace extends FunSuite {

  /**
    * there is no ++ and -- in Scala
    * scala uses += and -=
    *
    * += these symbols aren't operators
    * they are methods
    */
  test("++ and --") {
    var a: Int = 1
    a += 1
    println(a)
    a -= 1
    println(a)

    a *= 2
    println(a)
    a /= 2
    println(a)


  }
}
