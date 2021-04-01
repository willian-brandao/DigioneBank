package one.digitalinnovation.digionebank

class Person {
    var name: String = "Willian"
    var id: String = "123.123.123-11"
    private set

    constructor()
    fun personInfo() = "$name , $id"
}

fun main() {
    val p = Person()
    println(p.personInfo())

}