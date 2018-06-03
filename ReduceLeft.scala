/**
  * Created by rabis on 12/23/2017.
  */

object Hadoop5 {
  def main(args: Array[String]): Unit = {

    val a = Array(1,2,3,4,5,6,7,8,9,10)
   val largestNumber = a.reduceLeft(_ max _)
   val factorial = a.reduceLeft(_ * _)

    println(largestNumber)
    println(factorial)
  }

}

