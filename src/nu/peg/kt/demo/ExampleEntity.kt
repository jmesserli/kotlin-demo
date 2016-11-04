package nu.peg.kt.demo

/**
* dev @ 04.11.16
*/
class ExampleEntity : OwnerVerifiable, MappableEntity<ExampleDto, ExampleEntity> {
    override fun getMapper(): Mapper<ExampleDto, ExampleEntity> = ExampleMapper()

    override fun toDto(): ExampleDto = getMapper().toDto(this)

    override fun verifyOwner(owner: String): Boolean = owner == "joel"
}