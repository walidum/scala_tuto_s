object HelloWord {
  def main(args: Array[String]): Unit ={
    val  name = "Scala"
    val age = 3.2
    println(name + " for (scalable languge) " +  age )
    println(s"$name for (scalable languge) $age")
    println(f"$name%s for (scalable languge) $age%f")
     if (age == 0) {
       println(2131321)
     }
    else {
       println(212)
     }
    var i =0 ;
    while (i <= 2 ){
      println(i)
      i+=1
    }

    val isOk = if(i > 3)  true else false
    println(isOk)
  }

}
