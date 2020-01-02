package sum_between_two_integers

fun sumBetweenTwoInteger02(a: Int, b: Int): Long {
    var big = 0L
    var small = 0L

    if (a <= b) {
        big = a.toLong(); small = b.toLong()
    } else if (a > b) {
        big = b.toLong(); small = a.toLong()
    }

    return (big..small).sum()
}