/**
  * Created by rabis on 12/23/2017.
  */
object Hadoop8 {
    def main(args: Array[String]): Unit = {

      def getMinAndMaxValues(array: Array[Int]) = {
        (array.min, array.max)
      }

      val arr = Array(1, 2, 2, 3, 4, 4, 4, 5, 5)
      println(getMinAndMaxValues(arr))

    }
    }


