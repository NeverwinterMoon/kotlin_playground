fun main(args: Array<String>) {
  val test: String by lazy {
    val output = "some value"
    println("I AM LAAAAZY 1")
    output
  }

  val test02: Handled by lazy {
    val output = Handled.No
    println("I AM LAAAAZY 2")
    output
  }

  println("bla")
//  println(test02)

  when {
    test == "some value 2" -> print("hit test")
    test02 == Handled.No -> print("hit test02")
  }
}
