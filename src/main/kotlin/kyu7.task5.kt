import kotlin.math.*

fun gps(s:Int, x:DoubleArray):Int {
    if (x.size <= 1)
        return 0
    return Array(x.size - 1) {
        (3600 * (x[it + 1] - x[it])) / s
    }.maxOrNull()?.let {floor(it).toInt()} ?: 0
}


fun main() {
    println(gps(15, doubleArrayOf(0.0, 0.19, 0.5, 0.75, 1.0, 1.25, 1.5, 1.75, 2.0, 2.25)))
}