fun printString01(a: String = "default", b: String) {
  println(a)
}

fun main(args: Array<String>) {
  printString01(b = "1")
  printString01(b = "2", a = "asdf")
}
