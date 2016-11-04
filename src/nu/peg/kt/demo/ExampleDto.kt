package nu.peg.kt.demo

/**
* dev @ 04.11.16
*/
class ExampleDto : MappableDto<ExampleDto, ExampleEntity> {
    override fun toEntity(): ExampleEntity = getMapper().fromDto(this)

    override fun getMapper(): Mapper<ExampleDto, ExampleEntity> = ExampleMapper()
}