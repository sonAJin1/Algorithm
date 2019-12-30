package sum_between_two_integers

fun sumBetweenTwoInteger(a: Int, b: Int): Long {
    var answer:Long = 0
    when {
        a <= b -> for (i in a .. b) answer += i
        a > b -> for (i in a downTo b) answer += i
    }
    return answer
}

