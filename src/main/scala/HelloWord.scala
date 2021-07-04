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
      for (one <- list) {

      }
    }
  }

  object Maps {
    var map: Map[Int, String] = Map(121 -> "text", 122 -> "dfdsfsd", 545 -> "dfdsfsd")
    val map2: Map[Int, String] = Map(23 -> "text", 11 -> "dfdsfsd", 58 -> "dfdsfsd")

    def print = () => {
      map = map + (585 -> "dsdsd")
      println(map.isEmpty)
      println(map(121))
      println(map.size)
      println(map ++ map2)
      println(map)
    }
  }

  object Tuples {
    val tuple1 = (1221, "sdsd", true)
    val tuple3 = new Tuple3(1, (232, false), true)

    def print = () => {
      tuple3.productIterator.foreach(e => println(e))
      println(tuple1)
    }
  }

  def main(args: Array[String]): Unit = {
    Tuples.print()
  }
}
