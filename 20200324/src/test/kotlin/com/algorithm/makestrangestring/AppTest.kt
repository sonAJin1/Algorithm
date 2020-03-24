package com.algorithm.makestrangestring

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test
import kotlin.test.assertNotNull

fun solution(s: String): String =
        s.split(" ").joinToString(" ") {
            it.mapIndexed { index, c ->
                when (index % 2) {
                    0 -> c.toUpperCase()
                    else -> c.toLowerCase()
                }
            }.joinToString("")
        }



class AppTest {
    @Test
    fun `make strange string`() {
        assertThat(solution("try hello world")).isEqualTo("TrY HeLlO WoRlD")
    }
}
