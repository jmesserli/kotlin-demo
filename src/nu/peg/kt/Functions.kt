package nu.peg.kt

// This is the syntax for main functions, basically the same as in Java
fun main(args: Array<String>) {
    "Joel" welcome "World"
}

// This is the general function syntax
fun verbose(arg: String): String {
    return arg + ": Hello!"
}

// void is called `Unit` in Kotlin...
fun voidFun(): Unit {
}

// ...and it can be omitted
fun otherVoidFun() {
}

// If the function has a single return statement as it's body, you may use this syntax:
fun simpleFun(name: String) = "Hello " + name

// There are infix functions that you can use like the example in #main()
infix fun String.welcome(target: String) {
    println("${this} welcomes $target!")
}

fun function(): String {
    // Functions can be inside of other functions. This can be used for e.g. helpers
    fun functionInFunction() = "Hello"

    return functionInFunction()
}