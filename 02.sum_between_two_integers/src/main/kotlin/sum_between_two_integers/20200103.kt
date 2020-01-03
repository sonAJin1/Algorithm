package sum_between_two_integers

fun sumBetweenTwoInteger03(a: Int, b: Int): Long {

    if (a == b) return a.toLong()
    val min = Integer.min(a, b)
    val max = Integer.max(a, b)

    return (min.toLong()..max.toLong()).sum()

}