package nu.peg.kt.demo

interface Mapper<DtoType, EntityType> {
    fun toDto(entity: EntityType): DtoType
    fun fromDto(dto: DtoType): EntityType
}