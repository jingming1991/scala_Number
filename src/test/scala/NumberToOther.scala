import org.scalatest.FunSuite

class NumberToOther extends FunSuite {

  /**
    * convert from numeric type to another
    * method: to*
    */
  test("number to other type") {
    println(14.95.toInt)
    println(14.toFloat)
    println(14.toShort)
    println(14.toDouble)
    println(14.toLong)
  }

  /**
    * if you want to avoid potential conversion errors
    * when casting from number to others
    * using related method "isValid" before casting
    */
  test("valid convert") {
    val a = 10000L
    if (a.isValidByte) println(a.toByte) else println("no byte")
    if (a.isValidInt) println(a.toInt)
  }

}
