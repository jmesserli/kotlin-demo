package nu.peg.kt

fun main(args: Array<String>) {
    val time = Time(10, 20)

    // Data classes support destructuring by default
    var (hour, minute) = time

    println(hour) // prints 10

    println("${time.hour}:${time.minute}")

    // Automatically generated hashCode
    println(time.hashCode() == Time(10, 20).hashCode())

    println(time.component2()) // this is the 'minute' component (because it is the second one in the constructor), so 20
}

// This generates properties, equals, hashCode and componentX methods automatically
data class Time(var hour: Int, var minute: Int) {
}