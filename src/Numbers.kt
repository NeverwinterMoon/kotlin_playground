fun main(args: Array<String>) {
  val numberAsHex = "3061d3"
  println(numberAsHex.toInt(16))

  val numberAsHex02 = "29fe4"
  println(numberAsHex02.toInt(16))

  val intAsString = "1234"
  println(intAsString.toInt())

  val intAsStringInvalid = "undefined"
  println(try {
    intAsStringInvalid.toInt()
  } catch (e: NumberFormatException) {
    -1
  })
  println(intAsStringInvalid.toIntOrNull())
}
