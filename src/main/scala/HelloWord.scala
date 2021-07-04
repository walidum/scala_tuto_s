object HelloWord {
  val aoo = () => 12

  object Math {
    def add(x: Int = 0, y: Int = 0): Int = x + y

    def *(x: Int) = x * x

    def print(s: String): Unit = println(s)

    def mmm(x: Double, y: Double, f: (Double, Double) => Double): Double = f(x, y)
  }

  def main(args: Array[String]): Unit = {
    val res = Math.mmm(20, 30, _ min _)
    var add = (x: Int, y: Int) => x * y
    println(Math.add(2))
    println(Math.*(2))
    Math.print("ME ")
    val i = aoo
  }
}
