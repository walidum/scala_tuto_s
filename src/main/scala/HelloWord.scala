import java.util.Date

object HelloWord {
  val aoo = () => 12

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

  var num = 30
  val add = (x: Int) => x + num

  def main(args: Array[String]): Unit = {
    num = 200
    println(add(2))
  }
}
