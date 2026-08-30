package y2026m08.m08d30NotDailyLeet9PalindromeNumber

class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        val str = x.toString()
        if (str.endsWith("0") && str != "0") return false
        return str == str.reversed()
    }
}
