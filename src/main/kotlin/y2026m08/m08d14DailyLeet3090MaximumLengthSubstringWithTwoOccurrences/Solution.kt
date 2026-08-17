package y2026m08.m08d14DailyLeet3090MaximumLengthSubstringWithTwoOccurrences

class Solution {
    fun maximumLengthSubstring(
        s: String,
    ): Int {
        val counts = IntArray(26)
        var left = 0
        var maxLength = 0

        for (right in s.indices) {
            val chIdx = s[right] - 'a'
            counts[chIdx]++

            while (counts[chIdx] > 2) {
                val leftChIdx = s[left] - 'a'
                counts[leftChIdx]--
                left++
            }

            maxLength = maxOf(maxLength, right - left + 1)
        }

        return maxLength
    }
}
