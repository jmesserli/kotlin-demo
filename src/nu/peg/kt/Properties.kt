package nu.peg.kt

fun main(args: Array<String>) {
    val me = Person()

    // this is calling the setter for name
    me.name = "Joel"

    // this is calling the getter for name
    println(me.name)
}

class Person {
    // Type inference at work: we can omit ` : String` if it's obvious
    private var _name = ""

    // This is the syntax for defining getters and setters
    // Variables / Properties are public by default
    var name: String
        get() {
            println("Giving you _name's value ($_name)")
            return _name
        }
        set(value) {
            println("Setting name ($_name) -> $value")
            _name = value
        }
}