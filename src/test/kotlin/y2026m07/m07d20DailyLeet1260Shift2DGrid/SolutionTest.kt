package y2026m07.m07d20DailyLeet1260Shift2DGrid

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SolutionTest {
    private val solution = Solution()

    @Test
    fun example1() {
        // given
        val grid = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(4, 5, 6),
            intArrayOf(7, 8, 9),
        )
        val k = 1

        // when
        val actual = solution.shiftGrid(
            grid = grid,
            k = k,
        )

        // then
        val expected = listOf(
            listOf(9, 1, 2),
            listOf(3, 4, 5),
            listOf(6, 7, 8),
        )
        assertEquals(expected = expected, actual = actual)
    }
}