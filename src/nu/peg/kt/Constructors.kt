package nu.peg.kt

import kotlin.reflect.jvm.internal.impl.javax.inject.Inject

fun main(args: Array<String>) {
    // Note that we don't use `new` to create instances
    val sc = SomeClass(arrayOf("Name1", "Name2"))
    val simpC = SimpleClass("Name3")
}

// The classes primary constructor directly follows the class name
// all primary constructor parameters are automatically turned into properties
class SomeClass @Inject constructor(var name: String, val age : Int = 0) {

    // This is a secondary constructor, it has to call the primary constructor
    constructor(names: Array<String>) : this(names[0]) {
        println("Secondary constructor called")
    }
}

// If you don't need to annotate the primary constructor, you may omit the `constructor`
class SimpleClass(var name: String)