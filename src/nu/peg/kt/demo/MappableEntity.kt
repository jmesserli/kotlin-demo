package nu.peg.kt.demo

interface MappableEntity<DtoType, EntityType> : Mappable<DtoType, EntityType> {
    fun toDto(): DtoType
}