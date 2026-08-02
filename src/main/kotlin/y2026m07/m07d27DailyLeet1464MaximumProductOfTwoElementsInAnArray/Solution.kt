package y2026m07.m07d27DailyLeet1464MaximumProductOfTwoElementsInAnArray

class Solution {
    fun maxProduct(nums: IntArray): Int {
        nums.sort()
        val n = nums.size
        return (nums[n - 1] - 1) * (nums[n - 2] - 1)
    }
}
