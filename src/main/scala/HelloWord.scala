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

  def main(args: Array[String]): Unit = {
    val sum = (a: Int, b: Int, c: Int) => a + b + c
    val f = sum(10, 30, _: Int)
    println(f(100))

    val date = new Date
    val newLog = Log.log(date, _: String);
    newLog("Message 01 ")
    newLog("Message 02")
    newLog("Message 03 ")
  }
}
