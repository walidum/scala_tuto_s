object HelloWord {
  def FirstFunction(x: Int, y: Int): Int = {
    return x + y
  }

  object Math {
    def add(x: Int = 0, y: Int = 0): Int = x + y

    def *(x: Int) = x * x

    def print(s: String): Unit = println(s)
  }

  def main(args: Array[String]): Unit = {
    var add = (x: Int, y: Int) => x * y
    println(Math.add(2))
    println(Math.*(2))
    Math.print("ME ")
  }
}
