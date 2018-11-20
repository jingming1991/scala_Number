import java.util.{Currency, Locale}

import org.scalatest.FunSuite

class ForamtAndCurrency extends FunSuite {

  /**
    * using f String interpolator
    *
    * - java.text.NumberFormat.getIntegerInstance
    * - java.text.NumberFormat.getInstance
    * - Currency.getInstance(new Locale("de","DE"))
    */
  test("format number") {
    val pi = scala.math.Pi
    println(f"$pi%1.5f")
    println(f"$pi%1.2f")
    println(f"$pi%06.2f")
    println("%06.2f".format(pi))

    val formatter = java.text.NumberFormat.getIntegerInstance
    println(formatter.format(1.1))
    println(formatter.format(100000))
    println(formatter.format(1000000000))

    val ger = new Locale("de", "DE")
    val formatter_GE = java.text.NumberFormat.getIntegerInstance(ger)
    println(formatter.format(1.1))
    println(formatter_GE.format(100000))
    println(formatter_GE.format(1000000000))
  }

  /**
    * format Currency
    * java.text.NumberFormat.getCurrencyInstance
    *
    * - Joda Money libray
    *
    */
  test("format Currency") {

    val f_currency = java.text.NumberFormat.getCurrencyInstance
    println(f_currency.format(12.34))

    val de = Currency.getInstance(new Locale("de", "DE"))
    f_currency.setCurrency(de)
    println(f_currency.format(12.34))


  }
}

