import java.util.*

fun main(args: Array<String>) {
//  val checkInStartDateTime = "2018-04-11T16:46"
//  val checkInEndDateTime = "2018-04-12T16:15"
//
//  val isoFormat = "yyyy-MM-dd'T'HH:mm"  // 2017-02-20T18:30
//  val format = SimpleDateFormat(isoFormat, Locale.getDefault()).apply {
//    timeZone = TimeZone.getTimeZone("UTC")
//  }
//
//  println(format.parse(checkInStartDateTime))


  val nowInEstonia = Calendar.getInstance(TimeZone.getTimeZone("GMT+3"))
  println("Current time in Estonia (summer time): [${nowInEstonia.time}]")

//  println(TimeZone.getTimeZone("GMT+3").getOffset(nowInEstonia.timeInMillis) / 1000 / 3600)
//  println(TimeZone.getTimeZone("GMT+2").getOffset(nowInEstonia.timeInMillis) / 1000 / 3600)
//  println(TimeZone.getTimeZone("UTC").getOffset(nowInEstonia.timeInMillis) / 1000 / 3600)

  println("Current time in Estonia adjustd to UTC: [${Date(Date().time - 1000 * 3600 * 3)}]")
}
