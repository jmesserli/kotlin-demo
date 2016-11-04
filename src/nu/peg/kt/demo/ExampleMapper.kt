package nu.peg.kt.demo

class ExampleMapper : Mapper<ExampleDto, ExampleEntity> {
    override fun toDto(entity: ExampleEntity): ExampleDto = ExampleDto()
    override fun fromDto(dto: ExampleDto): ExampleEntity = ExampleEntity()
}