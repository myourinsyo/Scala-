
object Exercise_p26 {

  def exercise_p26(n: Int): Int = {
    @annotation.tailrec
    val d_x: Int = 0
    val d_y: Int = 1
    //val start_count: Int = 0

    def go(x: Int, y: Int, n: Int): Int =
      if (n <= 0) y
      else go(y, x + y, n - 1)  

    go(d_x, d_y, n)
  }

  private def format_p26(n: Int): String = {
    val msg_p26 = "P26 value is %d"
    msg_p26.format(exercise_p26(n))
  }

  def main(args: Array[String]): Unit = 
    println(format_p26(10))
    println(format_p26(6))

}



