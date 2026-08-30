package y2026m08.m08d25DailyLeet3718SmallestMissingMultipleOfK

class Solution {
    fun missingMultiple(
        nums: IntArray,
        k: Int,
    ): Int {
        val hashSet = nums.toHashSet()
        var multiple = k

        while (multiple in hashSet) {
            multiple += k
        }
        
        return multiple
    }
}
