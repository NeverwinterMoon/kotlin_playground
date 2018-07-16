fun main(args: Array<String>) {
  val a: String = "A"
  val b: Int = 1
  val c: String? = null

  when {
    a is String -> print("a is string")
    b == 1 -> print("b equals 1")
    c == null -> print("c is null")
    getResult() == 3 -> print("not  solazy")
  }
}


fun getResult(): Int {
  println("getResult")

  return 3
}
