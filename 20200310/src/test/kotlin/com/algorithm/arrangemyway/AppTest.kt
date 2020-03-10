package com.algorithm.arrangemyway

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test
import kotlin.test.assertNotNull

fun solution01(strings: Array<String>, n: Int) =
        strings.sortedWith(Comparator { str1, str2 ->
            when {
                str1[n] > str2[n] -> 1
                str1[n] < str2[n] -> -1
                else -> compareValues(str1, str2)
            }

        }).toTypedArray()


fun solution02(strings: Array<String>, n: Int) =
        strings.sortedWith(compareBy({ it[n] }, { it })).toTypedArray()


class AppTest {
    @Test
    fun `내 마음대로 정렬하기`() {
        assertThat(solution01(arrayOf("sun", "bed", "car"), 1)).isEqualTo(arrayOf("car", "bed", "sun"))
        assertThat(solution01(arrayOf("abce", "abcd", "cdx"), 1)).isEqualTo(arrayOf("abcd", "abce", "cdx"))
        assertThat(solution02(arrayOf("sun", "bed", "car"), 1)).isEqualTo(arrayOf("car", "bed", "sun"))
        assertThat(solution02(arrayOf("abce", "abcd", "cdx"), 1)).isEqualTo(arrayOf("abcd", "abce", "cdx"))
    }
}