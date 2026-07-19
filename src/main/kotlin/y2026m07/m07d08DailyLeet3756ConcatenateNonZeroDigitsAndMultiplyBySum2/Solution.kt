package y2026m07.m07d08DailyLeet3756ConcatenateNonZeroDigitsAndMultiplyBySum2

class Solution {
    fun sumAndMultiply(
        s: String,
        queries: Array<IntArray>,
    ): IntArray {
        val length = s.length
        val nonZeroCount = IntArray(length + 1)
        val digitSum = LongArray(length + 1)
        val prefixX = LongArray(length + 1)
        val powerOfTen = LongArray(length + 1)
        powerOfTen[0] = 1L

        s.forEachIndexed { idx, ch ->
            val digit = ch.digitToInt()
            digitSum[idx + 1] = digitSum[idx] + digit
            powerOfTen[idx + 1] = powerOfTen[idx] * 10L % MOD

            if (digit == 0) {
                nonZeroCount[idx + 1] = nonZeroCount[idx]
                prefixX[idx + 1] = prefixX[idx]
            } else {
                nonZeroCount[idx + 1] = nonZeroCount[idx] + 1
                prefixX[idx + 1] = (prefixX[idx] * 10L + digit) % MOD
            }
        }

        return queries.map { query ->
            val left = query[0]
            val right = query[1]

            val gapNonZeroCount = nonZeroCount[right + 1] - nonZeroCount[left]
            val xLeftPart = prefixX[left] * powerOfTen[gapNonZeroCount] % MOD
            val x = (prefixX[right + 1] - xLeftPart + MOD) % MOD
            val sum = digitSum[right + 1] - digitSum[left]

            (x * sum % MOD).toInt()
        }.toIntArray()
    }

    companion object {
        private const val MOD = 1_000_000_007L
    }
}
