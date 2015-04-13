
object Exercise_p30 {

  val isSortedList = Array(1,2,3,4,5)
  val notSortedList = Array(2,0,3,4,5)
  
  def inSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def loop(n: Int): Boolean = {
      if(n >= as.length) {
        true
      }
      //else if (ordered(as(n+1),as(n)) {
        //loop(n+1)
      //} 
      else {
        false
      }
    }

    loop(0)        
  }

  def ordered(x: Int, y: Int): Boolean = {
    if(x >= y) true
    else false
  }

  private def format_p30(list: Array[Int]) : String = {
    if (inSorted(list, Exercise_p30.ordered(Int,Int))) "is Sorted List"
    else "not Sorted List"
  }


  def main(args: Array[String]): Unit = {
    println(format_p30(isSortedList))
    println(format_p30(notSortedList))
  }
}




