sealed class Handled {
  data class Yes(val result: Boolean) : Handled()
  object No : Handled()
}

fun getBla(): Boolean {
//  val output: Handled = Handled.Yes(true)
  val output: Handled = Handled.No

  when (output) {
    is Handled.Yes -> return output.result
    is Handled.No -> Unit
  }

  return false
}

fun main(args: Array<String>) {
  print(getBla())
}
