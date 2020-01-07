fun intWithRemainderZero(arr: IntArray, divisor: Int): IntArray {
    return ArrayList<Int>().apply {
        arr.forEach { if (it % divisor == 0) add(it) }
        sort()
        if (size == 0) add(-1)
    }.toIntArray()
}