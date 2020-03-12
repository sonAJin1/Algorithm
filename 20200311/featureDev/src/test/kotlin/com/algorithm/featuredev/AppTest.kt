package com.algorithm.featuredev

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test
import kotlin.test.assertNotNull

fun solution(progresses: IntArray, speeds: IntArray): IntArray {
    val progresses = progresses
    val speeds = speeds
    val countCompleteDates = countCompleteDate(progresses, speeds)
    val distributionCount = ArrayList<Int>()
    var bigValue = 0

    for ((index, value) in countCompleteDates.withIndex()) {
        when {
            index == 0 -> { // 맨 처음 값일 경우
                distributionCount.add(1)
                bigValue = value
            }
            index > 0 && bigValue >= value -> { // 앞의 값이 더 크거나 같은 경우
                distributionCount[distributionCount.size - 1] = distributionCount.last() + 1
            }
            else -> { // 뒤에 값이 더 큰경우
                distributionCount.add(1)
                bigValue = value
            }
        }
    }
    return distributionCount.toIntArray()
}

fun countCompleteDate(progresses: IntArray, speeds: IntArray): IntArray {
    return progresses.mapIndexed { index, progress ->
        val value = (100 - progress).div(speeds[index])
        if ((100 - progress) - (speeds[index] * value) <= 0) {
            value
        } else {
            value + 1
        }
    }.toIntArray()
}


class AppTest {
    @Test
    fun `기능 개발 테스트`() {
        assertThat(solution(intArrayOf(93, 30, 55), intArrayOf(1, 30, 5))).isEqualTo(intArrayOf(2, 1))
        assertThat(countCompleteDate(intArrayOf(93, 30, 55), intArrayOf(1, 30, 5))).isEqualTo(intArrayOf(7, 3, 9))
        assertThat(countCompleteDate(intArrayOf(40, 93, 30, 55, 60, 65), intArrayOf(60, 1, 30, 5, 10, 7))).isEqualTo(intArrayOf(1, 7, 3, 9, 4, 5))
        assertThat(solution(intArrayOf(40, 93, 30, 55, 60, 65), intArrayOf(60, 1, 30, 5, 10, 7))).isEqualTo(intArrayOf(1, 2, 3))
        assertThat(countCompleteDate(intArrayOf(93, 30, 55, 60, 40, 65), intArrayOf(1, 30, 5 , 10, 60, 7))).isEqualTo(intArrayOf(7, 3, 9, 4, 1, 5))
        assertThat(solution(intArrayOf(93, 30, 55, 60, 40, 65), intArrayOf(1, 30, 5 , 10, 60, 7))).isEqualTo(intArrayOf(2,4))
        assertThat(countCompleteDate(intArrayOf(5, 5, 5), intArrayOf(21, 25, 20))).isEqualTo(intArrayOf(5, 4, 5))
        assertThat(solution(intArrayOf(5, 5, 5), intArrayOf(21, 25, 20))).isEqualTo(intArrayOf(3))

    }
}
