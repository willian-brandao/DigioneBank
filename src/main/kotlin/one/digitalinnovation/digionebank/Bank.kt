package one.digitalinnovation.digionebank

data class Bank(
    val name: String,
    val id: Int
){
    fun info() = "$name - $id"
}
