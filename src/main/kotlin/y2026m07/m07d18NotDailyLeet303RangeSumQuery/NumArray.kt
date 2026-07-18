package y2026m07.m07d18NotDailyLeet303RangeSumQuery

class NumArray(private val nums: IntArray) {
    fun sumRange(
        left: Int,
        right: Int,
    ): Int = nums
        .slice(left..right)
        .sum()
}
