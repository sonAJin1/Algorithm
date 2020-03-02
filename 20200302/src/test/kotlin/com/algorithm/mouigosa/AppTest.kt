package com.algorithm.mouigosa

import org.assertj.core.api.Assertions.assertThat
import org.w3c.dom.ranges.Range
import kotlin.test.Test
import kotlin.test.assertNotNull

fun solution(answers: IntArray): IntArray {
    val answerSize = answers.size
    makePersonAnswerArray(1, intArrayOf(1, 2, 3, 4, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1))

    //어떤 값을 갖고 싶은가?


    return intArrayOf(1)
}

fun makePersonAnswerArray(type: Int, answer: IntArray) {
    when (type) {
        1 -> {
            val firstArray = intArrayOf(1, 2, 3, 4, 5)
            val loopNumber = answer.size / firstArray.size
            val lastIdx = answer.size % firstArray.size
            var sliceCount = 0


            //answer size 만큼 for문 돌아서 1번 수포자를 돌려서 배열을 만들어 비교하기


            for (i in 1..loopNumber) {
                val sliceAnswer = answer.slice(sliceCount..sliceCount + 4)

                var newArray = sliceAnswer.forEach { value ->
                    println("sliceAnswer: $value")
                    firstArray.forEach {
                        println("firstArray: $it")
                        if (it == value) {
                            println("equal: $it")
                        }
                    }
                }

                println("equals: " + sliceAnswer.toIntArray().contentEquals(firstArray))


                sliceCount += 5
            }
        }
        2 -> {
            val secondArray = intArrayOf(2, 1, 2, 3, 2, 4, 2, 5)
        }
        3 -> {
            val thirdArray = intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        }
    }


}

class AppTest {
    @Test
    fun `mouigosa Test`() {
        assertThat(solution(intArrayOf(1, 2, 3, 4))).isEqualTo(intArrayOf(1))
    }
}
