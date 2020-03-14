package com.algorithm.tower

import org.assertj.core.api.Assertions.assertThat
import java.util.*
import kotlin.test.Test
import kotlin.test.assertNotNull


fun solution1(heights: IntArray): IntArray {
    val result = mutableListOf<Int>()
    for (i in heights.size - 1 downTo 0) {
        result.add(
                0,
                heights.dropLast(heights.size - i).indexOfLast { it > heights[i] } + 1
        )
    }
    return result.toIntArray()
}

class AppTest {
    @Test
    fun `탑 높이 테스트`() {
         assertThat(solution1(intArrayOf(6, 9, 5, 7, 4))).isEqualTo(intArrayOf(0, 0, 2, 2, 4))
    }

}
