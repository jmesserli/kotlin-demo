package nu.peg.kt.extensions

fun main(args: Array<String>) {
    // Extension functions can be used like a instance method
    println("This is swagger-cased".toSwaggerCase())
}

// We can define extension functions that are callable like they were defined in the base class
fun String.toSwaggerCase(): String {
    var sb = StringBuilder()
    // `this` is the object this function is called on, like if this were a function in the type's class
    for (i in 0..this.length - 1) {
        sb.append(if (i % 2 == 0) this[i].toUpperCase() else this[i].toLowerCase())
    }
    return sb.toString()
}