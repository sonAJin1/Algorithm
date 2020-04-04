package com.algorithm.average

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test
import kotlin.test.assertNotNull

fun solution(arr: IntArray): Double = arr.fold(0, { total, next -> total + next }) / arr.size.toDouble()
fun solution02(arr: IntArray): Double = arr.average()


class AppTest {
    @Test
    fun `find average`() {
        assertThat(solution(intArrayOf(1, 2, 3, 4))).isEqualTo(2.5)
        assertThat(solution02(intArrayOf(1, 2, 3, 4))).isEqualTo(2.5)
        assertThat(solution(intArrayOf(5, 5))).isEqualTo(5.0)
        assertThat(solution02(intArrayOf(5, 5))).isEqualTo(5.0)
    }
}
