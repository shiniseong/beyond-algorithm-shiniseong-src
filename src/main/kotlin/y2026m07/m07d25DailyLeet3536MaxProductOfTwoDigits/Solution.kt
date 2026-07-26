package y2026m07.m07d25DailyLeet3536MaxProductOfTwoDigits

class Solution {
    fun maxProduct(n: Int): Int {
        val nums = n.toString()
            .map { it.digitToInt() }
            .sortedDescending()
            .toMutableList()

        val max1 = nums.first()
        nums.removeFirst()
        val max2 = nums.first()

        return max1 * max2
    }
}
