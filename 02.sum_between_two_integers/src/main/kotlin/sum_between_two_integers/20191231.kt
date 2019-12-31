package sum_between_two_integers

fun sumBetweenTwoInteger01(a: Int, b: Int): Long =
        when {
            a <= b -> (a.toLong()..b.toLong()).sum()
            else -> (a.toLong() downTo b.toLong()).sum()
        }