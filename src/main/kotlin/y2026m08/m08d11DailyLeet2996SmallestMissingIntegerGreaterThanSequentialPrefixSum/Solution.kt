package y2026m08.m08d11DailyLeet2996SmallestMissingIntegerGreaterThanSequentialPrefixSum

class Solution {
    fun missingInteger(nums: IntArray): Int {
        var sum = nums[0]

        for (i in (1..<nums.size)) {
            if (nums[i] != nums[i - 1] + 1) break
            sum += nums[i]
        }

        val set = nums.toSet()

        while (sum in set) {
            sum++
        }
        return sum
    }
}
