object HelloWord {
  def main(args: Array[String]): Unit = {
    for (a <- 1 to 10) {
      println(s" value of a  = $a")
    }
    for (a <- 1 until 10) {
      println(s" value of a  = $a")
    }

    val list = List(1, 2, 454, 4787, 78, 7, 787, 87, 87, 8, 7, 8)
    val res = for {ele <- list; if ele > 10} yield {
      ele * 2
    }

    println(res)


  }
}
