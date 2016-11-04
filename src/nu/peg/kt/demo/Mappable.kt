package nu.peg.kt.demo

interface Mappable<DtoType, EntityType> {
    fun getMapper(): Mapper<DtoType, EntityType>
}