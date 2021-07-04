object HelloWord {
  def main(args: Array[String]): Unit = {
    var x = 0
    while (x < 5) {
      println(s"x = $x")
      x += 1
    }
    do {
      println(s"new x = $x")
      x += 1
    } while (x < 10)
  }
}
