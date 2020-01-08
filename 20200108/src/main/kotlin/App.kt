import java.time.DayOfWeek

fun get2016DayOfTheWeek(a: Int, b: Int): String {
    val monthOfDay = intArrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    val dayOfTheWeek = arrayOf("FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU")

    val dayOfTheWeekIdx = (monthOfDay.filterIndexed { index, _ -> index < a - 1 }.sum() + b) % 7

    if (dayOfTheWeekIdx == 0) return dayOfTheWeek[6]
    return dayOfTheWeek[dayOfTheWeekIdx - 1]
}