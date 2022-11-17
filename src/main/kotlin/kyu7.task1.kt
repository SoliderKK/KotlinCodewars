fun fizzBuzz(n: Int): Array<String> {
    val arr = Array(n) {""}
    for (i in 1..n) {
        arr[i - 1] = when {
            (i % 3 == 0 && i % 5 == 0) -> "FizzBuzz"
            (i % 3 == 0) -> "Fizz"
            (i % 5 == 0) -> "Buzz"
            else -> i.toString()
        }
    }
    return arr
}

fun main() {
    for (i in fizzBuzz(15)) {
        println(i)
    }
}
