import kotlin.math.*

object TwoSum {
    fun twoSum(numbers: IntArray, target: Int): Pair<Int,Int> {
        for (i in numbers.indices)
            for (j in i+1 until numbers.size)
                if (numbers[i] + numbers[j] == target)
                    return Pair(i, j)
        return Pair(0, 0)
    }
}


fun main() {
    println(TwoSum.twoSum(intArrayOf(1, 2, 3), 4))
}