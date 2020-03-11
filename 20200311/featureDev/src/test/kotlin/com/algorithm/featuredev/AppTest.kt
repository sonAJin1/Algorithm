package com.algorithm.featuredev

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test
import kotlin.test.assertNotNull

fun solution(progresses: IntArray, speeds: IntArray): IntArray {
    val progresses = progresses
    val speeds = speeds
    countCompleteDate(progresses,speeds)
    return intArrayOf(2)
}

fun countCompleteDate(progresses: IntArray, speeds: IntArray) {



    progresses.mapIndexed { index, progress ->
        //        (100 - progress) - (speeds[index] * n) < 0
//        speeds[index] * n < 100 - progress
//        println((100 - progress).div(speeds[index]))


        0 > (100 - progress) / speeds[index]

    }
}

class AppTest {
    @Test
    fun `기능 개발 테스트`() {
        assertThat(solution(intArrayOf(93, 30, 5), intArrayOf(1, 30, 5))).isEqualTo(intArrayOf(2, 1))
    }
}
