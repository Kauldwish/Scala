// print average
// using map() and reduce()
object mapred
{

  // Main method
  def main(args:Array[String])
  {
    // source collection
    val collection = List(1, 5, 7, 8)
    // converting every element to a pair of the form (x,1)
    // 1 is initial frequency of all elements
    val new_collection = collection.map(x => (x,1))
    /*
    List((1, 1), (5, 1), (7, 1), (8, 1))
    */
    // adding elements at correspnding positions
    val res = new_collection.reduce( (a,b) => ( a._1 + b._1,
      a._2 + b._2 ) )
    /*
    (21, 4)
    */
    println(res)
    println("Average="+ res._1/res._2.toFloat)
  }
}

