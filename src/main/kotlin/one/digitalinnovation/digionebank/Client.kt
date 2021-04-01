package one.digitalinnovation.digionebank

class Client(
    name:String,
    id:String,
    val client: TypeClient,
    val password: String
):Person(name, id), Logged {
    override fun login(): Boolean = "2323" == password

    override fun toString(): String = """
        Name:   $name
        Id:     $id
        Salary: ${client.description}
    """.trimIndent()
}