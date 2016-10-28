package nu.peg.kt.lambdas

fun main(args: Array<String>) {
    // This is as verbose as it gets
    takesFunction({ string -> println(string) })

    // ...but we can omit the parentheses if the lambda is the only parameter
    takesFunction { string -> println(string) }

    // ...and we can also let out the parameters if it's just one
    takesFunction { println(it) }

    // ...last, we can also just pass a function that matches the types if that's the only thing we're calling anyways
    takesFunction(::println)

    // we can chain calls without the parentheses
    arrayOf(1, 2, 3, 4).filter { it > 2 }.map { it + 2 }.forEach(::println)
}

// We can ask for a specific function, not just a function that matches a SAM interface like in Java
fun takesFunction(function: (String) -> Unit) {
    function("Hello world!")
}