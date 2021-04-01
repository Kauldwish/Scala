object Anonymous2 {
    def main(args: Array[String])
    {
      // Creating anonymous functions
      // without parameter
      var a = () => {"Welcome to XenonStack"}
      println(a())

      // A function which contain anonymous
      // function as a parameter
      def myfunction(fun:(String, String)=> String) =
      {
        fun("Dog", "Cat")
      }

      // Explicit type declaration of anonymous
      // function in another function
      val f1 = myfunction((str1: String,
                           str2: String) => str1 + str2)

      // Shorthand declaration using wildcard
      val f2 = myfunction(_ + _)
      println(f1)
      println(f2)
    }

}
