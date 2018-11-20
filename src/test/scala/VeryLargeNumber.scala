import org.scalatest.FunSuite

class VeryLargeNumber extends FunSuite {

  /**
    * Very large integer or decimal numbers
    * BigInt based on Java BigInteger
    * BigDecimal based on Java BigDecimal
    *
    * both support numeric operators
    * += ; to* ; isValid*
    *
    */
  test("Big Data") {
    var bi = BigInt(1234567890)
    val bg = BigDecimal(1234567890.12345)
    println(bi + bi)
    println(bg * bg)
    bi += 1
    println(bi.toInt)
    if (bg.isValidInt) println(bg.toInt)

  }
}
