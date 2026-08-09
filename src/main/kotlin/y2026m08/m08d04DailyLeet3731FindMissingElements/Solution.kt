package y2026m08.m08d04DailyLeet3731FindMissingElements

class Solution {
    fun findMissingElements(
        nums: IntArray,
    ): List<Int> {
        val min = nums.minOrNull() ?: return emptyList()
        val max = nums.maxOrNull() ?: return emptyList()

        return (min..max).mapNotNull { num ->
            if (num !in nums) num else null
        }
    }
}
