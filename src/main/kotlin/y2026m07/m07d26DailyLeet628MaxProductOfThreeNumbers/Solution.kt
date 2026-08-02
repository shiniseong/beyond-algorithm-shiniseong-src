package y2026m07.m07d26DailyLeet628MaxProductOfThreeNumbers

class Solution {
    fun maximumProduct(nums: IntArray): Int {
        nums.sort()
        val n = nums.size
        // 가장 큰 수의 세 곱
        val case1 = nums[n - 1] * nums[n - 2] * nums[n - 3]
        // 음수 두개와 양수 하나케이스를 고려한 곱
        val case2 = nums[0] * nums[1] * nums[n - 1]
        // 두 경우 중 최대값을 반환
        return maxOf(case1, case2)
    }
}
