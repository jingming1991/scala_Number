import org.scalatest.FunSuite

class FloatCompare extends FunSuite {
  /**
    * compare two floating-point numbers
    * using approximately equals
    *
    * - define an implicit conversion
    * - create a utilities Object
    */
  test("") {

    def ~=(x: Double, y: Double, precision: Double): Boolean = {
      if ((x - y).abs < precision) true else false
    }

    val a = 0.3
    val b = 0.1 + 0.2
    println(a == b)
    println(~=(a, b, 0.0001))
    println(~=(b, a, 0.0001))
    println(a.approximatelyEqual(b, 0.0001))
    println(DoubleUtils.equalWithinTolerance(a, b, 0.0001))

  }

  implicit class DoubleHelper(x: Double) {
    def approximatelyEqual(y: Double, precision: Double): Boolean = {
      if ((x - y).abs < precision) true else false
    }
  }

  object DoubleUtils {
    def equalWithinTolerance(x: Double, y: Double, precision: Double): Boolean = {
      if ((x - y).abs < precision) true else false
    }
  }


}
