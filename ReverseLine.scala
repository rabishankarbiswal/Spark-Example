object Hadoop6 {
  def main(args: Array[String]): Unit = {
    import io.Source
    val source = Source.fromFile("files.txt")
    val lines = source.getLines.toArray
    val revLines = lines.reverse
    val longWords = for(a <- io.Source.fromFile("chapter9.scala").mkString.split(' ') if a.length >= 10) yield a

    println(revLines)
    println(longWords)
  }

}