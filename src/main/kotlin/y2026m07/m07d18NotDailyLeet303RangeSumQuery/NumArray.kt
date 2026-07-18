package y2026m07.m07d18NotDailyLeet303RangeSumQuery

class NumArray(nums: IntArray) {
    private val prefixSum = IntArray(nums.size + 1)

    init {
        prefixSum[0] = 0
        for (idx in 1..nums.size) {
            prefixSum[idx] = prefixSum[idx - 1] + nums[idx - 1]
        }
    }

    fun sumRange(
        left: Int,
        right: Int,
    ): Int = prefixSum[right + 1] - prefixSum[left]
}
