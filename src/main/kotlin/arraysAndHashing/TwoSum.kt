package arraysAndHashing

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in IntRange(0, nums.size-1))
            for (j in IntRange(i + 1, nums.size-1))
                if (nums[i] + nums[j] == target) {
                    return intArrayOf(i, j)
                } else
                    continue
        return intArrayOf()
    }
}

fun main() {
    println(Solution().twoSum(intArrayOf(1, 2, 3, 4, 5), 9))
}
