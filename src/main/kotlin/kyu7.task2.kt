fun getCount(str : String) : Int {
    return str.fold(0) { count, char: Char ->
        if (char in arrayOf('a', 'e', 'i', 'o', 'u')) {
            return@fold count + 1
        } else {
            return@fold count
        }
    }
}

fun main() {
    println(getCount("abcdef"))
}