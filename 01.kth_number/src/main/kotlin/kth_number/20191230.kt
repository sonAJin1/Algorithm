package kth_number

fun getKthNumber(array: IntArray, commands: Array<IntArray>): IntArray {
    return commands.map { (i, j, k) -> array.slice(i - 1 until j).sorted()[k - 1] }.toIntArray()
}