package arraysAndHashing

class ValidAnagram {
    fun isAnagram(s: String, t: String): Boolean {

        val first = s.toCharArray()
        val second = t.toCharArray()

        if (s.length != t.length) return false

        first.sort()
        second.sort()


        return (first.contentEquals(second))
    }
}

fun main() {
    println(ValidAnagram().isAnagram("anagram", "nagaram"))
}