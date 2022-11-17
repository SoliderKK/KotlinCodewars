import kotlin.math.*

fun nbYear(pp0:Int, percent:Double, aug:Int, p:Int):Int {
    var year = 0
    var pop = pp0
    while (pop < p) {
        pop = floor(pop + pop * percent / 100 + aug).toInt()
        year++
    }
    return year
}

/*fun nbYear(pp0: Int, percent: Double, aug: Int, p: Int): Int =
    generateSequence(pp0.toDouble()) { it * (1 + percent / 100) + aug }.takeWhile { it < p }.count()*/

fun main() {
    println(nbYear(1500, 5.0, 100, 5000))
}