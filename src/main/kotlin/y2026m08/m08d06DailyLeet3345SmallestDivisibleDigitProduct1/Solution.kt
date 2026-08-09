package y2026m08.m08d06DailyLeet3345SmallestDivisibleDigitProduct1

class Solution {
    fun smallestNumber(
        n: Int,
        t: Int,
    ): Int {
        var num = n
        if ('0' in num.toString()) return n
        while (true) {
            val product = num.toString().fold(1) { acc, c -> acc * c.digitToInt() }
            if (product % t == 0) return num
            num++
        }
    }
}
