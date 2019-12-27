package kth_number

fun getKthNumberToArray(array: IntArray, commands: Array<IntArray>): IntArray =
        commands.map { (i, j, k) -> getKthNumber(array, i, j, k) }.toIntArray()


fun getKthNumber(array: IntArray, fromIdx: Int, toIdx: Int, K: Int): Int =
        array.toList().subList(fromIdx - 1, toIdx).sorted()[K - 1]


