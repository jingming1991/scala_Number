import org.scalatest.FunSuite

class ScalaNumber extends FunSuite {

  /**
    * var/val [name]:[type] = [initial value]
    * hex value by "0x" or "0X"
    * using underscore _ as a placeHolder when giving an initial value
    *
    * default values _ works in creating class variables
    * _ doesn't work in other places (like inside a method)
    */
  test("default value") {
    val ad = 1d
    val af = 1f
    val ab = 0: Byte
    val a = 0: Int
    val a16 = 0x20
    val a16Long = 0x20L


    val ming = new Ming
    println(ming.a)
    println(ming.b)
  }

  class Ming {
    var a: Short = _
    var b: String = null.asInstanceOf[String]
  }

  /**
    * Parsing String to Number
    * method: to*
    * throw NumberFormatException
    */
  test("String to Numbers") {
    val i = "100".toInt
    val d = "100".toDouble
    val f = "100".toFloat
    val l = "100".toLong
    val s = "100".toShort
    val b = "1".toByte
    val bi = BigInt("1")
    val bd = BigDecimal("1.1")
  }

  /**
    * Use bases other than 10
    * 进制转换
    */
  test("base and radix") {
    println(Integer.parseInt("10", 2))
    println(Integer.parseInt("10", 8))
    println("10".toIntWithRadix(16))

    println("x".toIntOwn.getOrElse("format wrong"))

    "1".toIntOwn match {
      case Some(value) => println(value)
      case None => println("format wrong")
    }
  }

  /**
    * -benefit of implicit conversion
    * -Exception Handle
    * -@throws annotation
    */
  implicit class StringToInt(s: String) {
    def toIntWithRadix(radix: Int): Int = Integer.parseInt(s, radix)

    @throws(classOf[NumberFormatException])
    def toIntOwn: Option[Int] = {
      try {
        Some(s.toInt)
      } catch {
        case e: NumberFormatException => None
      }
    }
  }

}
