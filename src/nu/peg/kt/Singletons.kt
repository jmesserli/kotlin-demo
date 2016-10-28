package nu.peg.kt

import nu.peg.kt.toSwaggerCase

// Singletons in Kotlin are `Objects`
object Singleton {
    val someVal = "SomeVal"

    fun singletonMethod() = someVal.toSwaggerCase()
}

fun main(args: Array<String>) {
    // no need to call getInstance or similar, use it like static / companion methods
    println(Singleton.singletonMethod())
}