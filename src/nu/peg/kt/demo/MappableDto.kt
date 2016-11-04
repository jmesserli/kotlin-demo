package nu.peg.kt.demo

interface MappableDto<DtoType, EntityType> : Mappable<DtoType, EntityType> {
    fun toEntity(): EntityType
}