import scala.io.StdIn.readInt

object Arithop
  {

    def main(args: Array[String])
    {
      // variables
      println("Enter value of a")
      var a = readInt()
      println("Enter value of b")
      var b = readInt()

      // Addition
      println("Addition of a + b = " + (a + b));

      // Subtraction
      println("Subtraction of a - b = " + (a - b));

      // Multiplication
      println("Multiplication of a * b = " + (a * b));

      // Division
      println("Division of a / b = " + (a / b));

      // Modulus
      println("Modulus of a % b = " + (a % b));

    }
  }