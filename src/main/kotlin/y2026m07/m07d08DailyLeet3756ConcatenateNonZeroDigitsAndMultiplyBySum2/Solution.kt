package y2026m07.m07d08DailyLeet3756ConcatenateNonZeroDigitsAndMultiplyBySum2

class Solution {
    fun sumAndMultiply(
        s: String,
        queries: Array<IntArray>,
    ): IntArray = queries.map { query ->
        val start = query[0]
        val end = query[1] + 1

        val substring = s.substring(start, end)
        sumAndMultiPlyNonZero(substring)
    }
        .toTypedArray()
        .toIntArray()

    private fun sumAndMultiPlyNonZero(nString: String): Int {
        val nonZeroDigits = nString
            .filter { it != '0' }

        var sum = 0L
        nonZeroDigits.forEach { ch ->
            sum = (sum + ch.digitToInt().toLong()) % MOD
        }

        val xSource = nonZeroDigits
            .ifEmpty { "0" }

        var x = 0.toLong()
        xSource.forEach { ch ->
            x = (x * 10.toLong()) % MOD
            x += ch.digitToInt().toLong() * sum
            x %= MOD
        }

        return (x % MOD).toInt()
    }

    companion object {
        private const val MOD = (1_000_000_000 + 7).toLong()
    }
}
