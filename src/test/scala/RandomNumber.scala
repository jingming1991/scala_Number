import org.scalatest.FunSuite

import scala.util.Random

class RandomNumber extends FunSuite {

  /**
    * create random number
    * Scala.util.Random
    */
  test("random number") {
    val r = scala.util.Random
    println(r.nextInt)
    println(r.nextInt)
    val r1 = new scala.util.Random(100)
    println(r1.nextBoolean)

    // 0 ~ 10
    println(r1.nextInt(10))

    println(r.nextPrintableChar)
    println(r1.nextPrintableChar)
  }

  /**
    * create a random-length range of numbers
    * - create a sequence of known length, filled with random numbers
    * - create a random-length ranges of different types
    */
  test("random range") {
    val random = scala.util.Random
    val range = 0 to random.nextInt(10)
    val range1 = 0 to random.nextInt(10)
    val a = for (i <- range) yield i * 2
    val b = for (i <- range1) yield random.nextPrintableChar
    val c = for (i <- range1) yield i * random.nextFloat
    val d = for (i <- 1 to 5) yield random.nextInt(100)
    a.foreach(i => print(i + " "))
    println()
    b.foreach(i => print(i + " "))
    println()
    c.foreach(i => print(i + " "))
    println()
    d.foreach(i => print(i + " "))
  }

  /**
    * set step with the "by" method
    * convert a Range to other Sequences "Array"/"List" ...
    */
  test("create range using by") {
    val range = 1 to 5
    range.foreach(i => print(i + " "))
    println()

    val range1 = 1 to 5 by 3
    range1.foreach(i => print(i + " "))
    println()

    val range2 = 1 until 5
    range2.foreach(i => print(i + " "))
    println()

    val range3 = 0 to Random.nextInt(10)

    val arr = range.toArray
    val list = range2.toList
    val set = range3.toSet
    println(arr.length)
    println(list.length)
    println(set.size)


  }
}
