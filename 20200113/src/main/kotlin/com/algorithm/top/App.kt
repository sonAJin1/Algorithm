fun solution(heights: IntArray): IntArray {
    val copyHeight = heights

    return heights.mapIndexed { index, _ ->
        val sender = copyHeight[copyHeight.size - 1 - index]
        val receivers = copyHeight.dropLast(index).toIntArray()
        getTowerIdx(sender, receivers)
    }.reversed().toIntArray()
}

fun getTowerIdx(senderHeight: Int, receiverHeights: IntArray): Int {
    return receiverHeights.indexOfLast { senderHeight < it } + 1
}


