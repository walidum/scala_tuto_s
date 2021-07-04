import java.util.Date

object HelloWord {
  val aoo = () => 12
  val el = Array(12, 1321, 1, 3, 132, 1, 31, 3).filter(e => e == 0)

  var num = 30
  val add = (x: Int) => x + num

  def add2(x: Int) = (y: Int) => x + y

  object Math {
    def add(x: Int = 0, y: Int = 0): Int = x + y

    def *(x: Int) = x * x

    def print(s: String): Unit = println(s)

    def math(x: Double, y: Double, f: (Double, Double) => Double): Double = f(x, y)
  }

  object Log {
    def log(date: Date, message: String) = {
      println(s"$date $message")
    }
  }

  object Arrays {
    val tab: Array[Int] = new Array[Int](5)

    def printArray = () => {
      for (i <- 0 until tab.length) {
        println(tab(i))
      }
    }
  }

  object Lists {
    var list: List[Int] = List(456456, 4, 654, 654, 4, 65)

    def printList = () => {
      list = 12 :: list
      list = list :+ 50
      list.foreach(e => println(e))
    }
  }

  def main(args: Array[String]): Unit = {
    Lists.printList()
  }
}
