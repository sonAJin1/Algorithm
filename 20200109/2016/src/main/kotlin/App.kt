fun get2016DayOfWeek(a: Int, b: Int): String {
    val monthOfDay = intArrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)

    val sumMonthOfDay = monthOfDay.filterIndexed { month, _ -> month < a - 1 }.sum() + b - 1
    return getDayOfTheWeek(sumMonthOfDay)
}

fun getDayOfTheWeek(sumValue: Int): String {
    val dayOfTheWeek = arrayOf("SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT")

    val startDayOfWeekIdx2016 = 5
    return dayOfTheWeek[(sumValue + startDayOfWeekIdx2016) % 7]
}