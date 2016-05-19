package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {

    //Relationship between c and r
    if(c < 0 || c > r) 0
    //base case
    else if(r == 0) 1

    else {
      // Number is sum of two numbers above it ie (  (c-1, r-1) + (c-1 r) )
      pascal(c-1, r - 1) + pascal(c, r - 1)
    }

  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    def isBalanced(chars: List[Char], balance: Int): Boolean = {

      if (balance < 0) false
      else
      {
        if (chars.isEmpty) true
        else
          chars.head match {
            case '(' => isBalanced(chars.tail, balance + 1)
            case ')' => isBalanced(chars.tail, balance - 1)
            case _ => isBalanced(chars.tail, balance)
          }
      }
    }
    isBalanced(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = ???
}
