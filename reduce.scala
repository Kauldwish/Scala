object reduce
{

  def main(args:Array[String])
  {
    // source collection
    val collection = List(1, 3, 2, 5, 4, 7, 6)
    // finding the maximum valued element
    val res = collection.reduce((x, y) => x max y)
    println(res)
  }
}