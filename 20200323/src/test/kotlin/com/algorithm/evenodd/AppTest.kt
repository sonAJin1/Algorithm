package com.algorithm.evenodd

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test
import kotlin.test.assertNotNull

fun solution(num: Int): String =
        when (num % 2) {
            0 -> "Even"
            else -> "Odd"
        }


class AppTest {
    @Test
    fun `even and odd`() {
        assertThat(solution(3)).isEqualTo("Odd")
        assertThat(solution(4)).isEqualTo("Even")
        assertThat(solution(0)).isEqualTo("Even")
    }
}
