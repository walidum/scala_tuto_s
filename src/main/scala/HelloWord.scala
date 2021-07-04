object HelloWord {
  def main(args: Array[String]): Unit = {
    val age = 100
    val res = age match {
      case 20 => 20
      case ___ => -1
    }

    println(res)
  }
}
