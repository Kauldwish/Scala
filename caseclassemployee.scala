case class employee (name:String, age:Int)
object Main
{
  def main(args: Array[String])
  {
    var c = employee("Nidhi", 23)

    println("Name of the employee is " + c.name);
    println("Age of the employee is " + c.age);
  }
}