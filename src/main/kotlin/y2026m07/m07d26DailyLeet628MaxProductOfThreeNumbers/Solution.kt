package y2026m07.m07d26DailyLeet628MaxProductOfThreeNumbers

class Solution {
    fun maximumProduct(nums: IntArray): Int {
        nums.sort()
        val n = nums.size
        val maxProduct = nums[n - 1] * nums[n - 2] * nums[n - 3]
        val minProduct = nums[0] * nums[1] * nums[n - 1]
        return maxOf(maxProduct, minProduct)
    }
}
