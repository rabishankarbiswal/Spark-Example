/**
  * Created by rabis on 12/23/2017.
  */
object Hadoop7 {
  def main(args: Array[String]): Unit = {
    val dirty = List("a", "b", "a", "c").distinct
    val items = Map("Toy" -> 100, "Bottle" -> 200)
    val discount = for ((g, p) <- items) yield (g, p - p * 0.1)

    println(dirty)
    println(discount)
  }
}
