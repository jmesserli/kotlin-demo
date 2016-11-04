package nu.peg.kt.demo

import kotlin.reflect.KClass

var map: Map<String, KClass<out MappableDto<*, out OwnerVerifiable>>> = mapOf(Pair("example", ExampleDto::class))
fun parseObj(string: String): MappableDto<*, out OwnerVerifiable> = map[string]!!.java.newInstance()

fun main(args: Array<String>) {
    val dto = parseObj("example")
    println(dto.toEntity().verifyOwner("joel"))
}
