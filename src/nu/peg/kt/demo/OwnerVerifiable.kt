package nu.peg.kt.demo

interface OwnerVerifiable {
    fun verifyOwner(owner: String): Boolean
}