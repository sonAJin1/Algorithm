package com.algorithm.arangeMyWay

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test
import kotlin.test.assertNotNull

fun solution(strings: Array<String>, n: Int) =
        strings.sortedWith(Comparator { str1, str2 ->
            val s1 = str1[n]
            val s2 = str2[n]
            when {
                s1 > s2 -> 1
                s1 < s2 -> -1
                else -> when {
                    str1 > str2 -> 1
                    str1 < str2 -> -1
                    else -> 0
                }
            }

        }).toTypedArray()


class AppTest {

    @Test
    fun `내 마음대로 정렬하기 테스트`() {
        assertThat(solution(arrayOf("sun", "bed", "car"), 1)).isEqualTo(arrayOf("car", "bed", "sun"))
        assertThat(solution(arrayOf("abce", "abcd", "cdx"), 2)).isEqualTo(arrayOf("abcd", "abce", "cdx"))
    }
}
