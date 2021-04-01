object Anonymous
{
  def main(args: Array[String])
  {
    // Creating anonymous functions
    // anonymous functions to variables
    var a = (str1:String, str2:String) => str1 + str2
    // An anonymous function is created
    // variable name because str1 and
    // str2 variable appear only once
    var b = (_:String) + (_:String)
    // Here, the variable invoke like a function call
    println(a("Xenon", "12Xenon"))
    println(b("Xenon", "Stacks"))
  }
}