fun fizzBuzz(n: Int): Array<String> {
    val arr = Array(n) {""}
    for (i in 1..n) {
        if (i % 3 == 0 && i % 5 == 0) {
            arr[i-1] = "FizzBuzz"
        } else if (i % 3 == 0) {
            arr[i-1] = "Fizz"
        } else if (i % 5 == 0) {
            arr[i-1] = "Buzz"
        } else {
            arr[i-1] = i.toString()
        }
    }
    return arr
}

fun main() {
    for (i in fizzBuzz(15)) {
        println(i)
    }
}
