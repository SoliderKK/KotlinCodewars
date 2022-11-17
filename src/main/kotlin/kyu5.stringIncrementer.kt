import kotlin.math.*

fun incrementString(str: String) : String {
    val regex = """\d+$""".toRegex()
    val match = regex.find(str)
    val num = match?.value ?: "0"
    val newNum = (num.toInt() + 1)
    val numLength = max(num.length, newNum.toString().length)
    val index = match?.range?.first ?: str.length


    return String.format("%s%0${numLength}d", str.subSequence(0, index), newNum)
}



fun main() {
    println(incrementString("foo00123"))
}