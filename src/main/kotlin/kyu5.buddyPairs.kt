import kotlin.math.*

fun buddy(start: Long, limit: Long): String {
    for (i in start..limit) {
        val s = i.listOfDivisorsSum()
        if (s - 1 > start && (s - 1).listOfDivisorsSum() == i + 1) {
            return "($i ${s - 1})"
        }
    }
    return "Nothing"
}

fun Long.listOfDivisorsSum(): Long{
    val divisors = mutableListOf<Long>(1)
    for (i in 2..sqrt(this.toDouble()).roundToInt()) {
        if (this.toDouble() % i == 0.0) {
            val div = (this.toDouble() / i).toInt()
            divisors.add(i.toLong())
            if (i != div)
                divisors.add(div.toLong())
        }
    }
    return divisors.sum()
}



fun main() {
    println(buddy(381, 4318))
}