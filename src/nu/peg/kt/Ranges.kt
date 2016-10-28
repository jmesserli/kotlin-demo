package nu.peg.kt

fun main(args: Array<String>) {
    // Ranges in kotlin are inclusive (1-10)
    for (i in 1..10) {
        print(i.toString() + " ")
    }
    println()

    // For reverse ranges, use `downTo` (infix function)
    for (i in 10 downTo 1) {
        print(i.toString() + " ")
    }
    println()

    // Or you could use `reversed`
    for (i in (1..10).reversed()) {
        print(i.toString() + " ")
    }
    println()

    // You can also specify a 'step'
    for (i in 1..10 step 2) {
        // 1, 3, 4, 7, 9
        print(i.toString() + " ")
    }
    println()

    // This works for chars too
    for (c in 'a'..'z') {
        print(c + " ")
    }
    println()
}