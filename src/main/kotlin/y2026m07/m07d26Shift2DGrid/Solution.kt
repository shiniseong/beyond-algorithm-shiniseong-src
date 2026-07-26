package y2026m07.m07d26Shift2DGrid

class Solution {
    fun shiftGrid(
        grid: Array<IntArray>,
        k: Int,
    ): List<List<Int>> {
        val m = grid.size
        val n = grid.first().size
        val total = m * n

        val shiftCount = k % total

        val result = Array(m) {
            IntArray(n)
        }

        (0..<m).forEach { y ->
            (0..<n).forEach { x ->
                val currIdx = (y * n) + x
                val shiftedIdx = (currIdx + shiftCount) % total

                val shiftedY = shiftedIdx / n
                val shiftedX = shiftedIdx % n

                result[shiftedY][shiftedX] = grid[y][x]
            }
        }

        return result.map { row ->
            row.toList()
        }
    }
}
