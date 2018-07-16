fun main(args: Array<String>) {
  val candidates = sequenceOf(Sequences::getResult, Sequences::getDifferentResult, Sequences::getUnhandled)
  val first = candidates.map { it() }.first { it is Sequences.Handled.Yes }
  Sequences.printResult(first)

  print(Bla.bla)
}

object Sequences {
  fun printResult(input: Handled) {
//    when (input) {
//      is Handled.Yes -> println(input.result)
//      is Handled.Maybe -> println(input.result)
//      is Handled.No -> println(input)
//      else -> println("not handled still")
//    }


//    when (input) {
//      is Handled.Yes -> println(input.result)
//      is Handled.Maybe -> println(input.result)
//      is Handled.No -> println(input)
////      else -> println("not handled still")
//    }

    val result01: Handled by lazy {
      Sequences.getResult()
    }
    val result02: Handled by lazy {
      getDifferentResult()
    }

    when("") {
      is String -> Unit
    }

    when {
      result01 is Handled.Yes -> result01.result
      result02 is Handled.Yes -> result02.result
      "" == "" -> Unit
    }
  }


  sealed class Handled {
    data class Yes(val result: Boolean) : Handled()
    data class Maybe(val result: String) : Handled()
    object No : Handled()
  }

  fun getResult(): Handled {
    println("called getResult")
    return Handled.Yes(true)
  }

  fun getDifferentResult(): Handled {
    println("called getDifferentResult")
    return Handled.Yes(false)
  }

  fun getUnhandled(): Handled {
    println("called getUnhandled")
    return Handled.No
  }
}


object Bla {
  val bla = "A"
}

