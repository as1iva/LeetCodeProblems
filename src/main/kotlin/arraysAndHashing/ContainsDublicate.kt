package arraysAndHashing

class ContainsDublicate {
    fun containsDuplicate(nums: IntArray): Boolean {
        val hashMap = HashMap<Int, Int>()
        val value = 1
        for (num in nums) {
            if (num in hashMap)
                return true
            else
                hashMap[num] = value
        }
        return false
    }
}

fun main() {
    println(ContainsDublicate().containsDuplicate(intArrayOf(1, 2, 2, 3)))
}