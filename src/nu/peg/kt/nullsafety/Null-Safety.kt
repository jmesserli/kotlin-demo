package nu.peg.kt.nullsafety

fun main(args: Array<String>) {
    // The compiler ensures that variables will never be null, essentially eliminating NullPointerExceptions
    val string: String = ""

    // Variables can still be null if we really want them to be by using a question mark after the type:
    val integer: Int? = null

    // however, we can't call anything on that variable if we don't prove that it is non-null:
//    integer.toDouble() -- does not compile

    // one way to do that is to use the ?. syntax:
    integer?.toDouble() // this will only call toDouble if integer is non-null

    // another way is to use null-assertion (!!):
    integer!!.toDouble() // this will throw a NullPointer!

    // after you used !! once, you can use it like any non-nullable variable
    integer.toDouble()

    // the last way is by using "Smart Casts":
    if (integer is Int) { // or if (integer != null)
        // integer is automatically cast to Int in here
        integer.toDouble()
    }
}