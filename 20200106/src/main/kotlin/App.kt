fun intWithRemainderZero(arr: IntArray, divisor: Int): IntArray {

    var answer = arr.filter { it % divisor == 0 }.sorted()
    if (answer.isEmpty()) return intArrayOf(-1)

    return answer.toIntArray()

}
