package kth_number

fun getKthNumber1(array: IntArray, commands: Array<IntArray>): IntArray {
    return commands.map { (i, j, k) ->
        array.slice(IntRange(i - 1, j - 1)).sorted()[k - 1]
    }.toIntArray()

}