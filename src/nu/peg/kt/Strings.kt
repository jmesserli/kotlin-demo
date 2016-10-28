package nu.peg.kt

fun main(args: Array<String>) {
    // Raw strings can be multiline and contain any characters unescaped
    val multilineRawString = """
        for (i in "Hello World"){
            println(i)\;
        }
    """.trimMargin()
    println(multilineRawString)

    val int = 20

    // We can use variables in strings with the dollar sign
    val template = "int is $int"
    println(template)

    // We can use arbitrary expressions using the ${} syntax
    val complexTemplate = "int's length is ${int.toString().length}"
    println(complexTemplate)
}