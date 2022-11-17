import kotlin.math.*

fun geometricSequenceElements(a: Int, r: Int, n: Int): String {
    return generateSequence(a) {it * r}
        .take(n)
        .fold("") {acc, elem ->
            "$acc, ${elem.toString()}"
        }.substring(2)
}


fun main() {
    println(geometricSequenceElements(2, 3, 5))
}