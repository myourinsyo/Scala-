
object Exercise {

  def exercise_p26(n: Int): Int = {
    @annotation.tailrec
    val d_x: Int = 0
    val d_y: Int = 1
    val start_count: Int = 0

    def go(x: Int, y: Int, count: Int): Int =
      if (count >= n) y
      else go(y, x + y, count + 1)  

    go(d_x, d_y, start_count)
  }

  private def format_p26(n: Int): String = {
    val msg_p26 = "P26 value is %d"
    msg_p26.format(exercise_p26(n))
  }

  def main(args: Array[String]): Unit = 
    println(format_p26(10))


}



