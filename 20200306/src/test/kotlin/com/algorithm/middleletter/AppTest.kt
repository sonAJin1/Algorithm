package com.algorithm.middleletter

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test

fun solution(s: String): String {
    val middleIdx = s.length / 2

    if (s.length % 2 != 0) {
        return s[middleIdx].toString()
    }

    return s[(middleIdx - 0.5).toInt()] + s[(middleIdx + 0.5).toInt()].toString()
}

class AppTest {

    @Test
    fun `get middle letter test`() {
        assertThat(solution("abcde")).isEqualTo("c")
        assertThat(solution("qwer")).isEqualTo("we")
    }
}
