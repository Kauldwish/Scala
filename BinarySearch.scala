// Scala code for Iterative Binary Search
// Creating object
object BinarySearch{
  // Creating Binary Search function
  // Accepting the passed array and
  // element to be searched
  def IterativeBinarySearch(arr: Array[Int],
                            Element_to_Search: Int): Int =
  {
    // Creating start variable to
    // point to the first value
    var low = 0
    // Creating end variable to
    // point to the last value
    var high = arr.length - 1
    // Finding the value in the
    // array iteratively
    while (low <= high)
    {
      // Getting middle element
      var middle = low + (high - low) / 2
      // If element found in the middle index
      if (arr(middle) == Element_to_Search)
        return middle
      // Searching in the first half
      else if (arr(middle) > Element_to_Search)
        high = middle - 1
      // Searching in the second half
      else
        low = middle + 1
    }
    // If value not found in the
    // entire array , return -1
    -1
  }
  // Creating main function
  def main(args: Array[String])
  {
    // Calling the binary search function and
    // storing its result in index variable
    var index = IterativeBinarySearch(Array(1, 2, 3, 4, 55,
      65, 75), 65);
    // If value not found
    if(index == -1)
      print("Not Found")
    // Else print the index where
    // the value is found
    else
      print("Element found at Index " + index)
  }
}
