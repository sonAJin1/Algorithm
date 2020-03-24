package com.algorithm.factor

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test
import kotlin.test.assertNotNull

fun solution(n: Int): Int {
    return findingFactor(n).sum()
}

fun findingFactor(n: Int): List<Int> {
    val factor = ArrayList<Int>()
    (1..n).forEach {
        if (n % it == 0) factor.add(it)
    }
    return factor
}

class AppTest {
    @Test
    fun `sum of factor`() {
        assertThat(findingFactor(12)).isEqualTo(listOf(1, 2, 3, 4, 6, 12))
        assertThat(solution(12)).isEqualTo(28)
    }
}
