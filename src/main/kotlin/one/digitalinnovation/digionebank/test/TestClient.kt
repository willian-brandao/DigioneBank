package one.digitalinnovation.digionebank.test
import one.digitalinnovation.digionebank.Client
import one.digitalinnovation.digionebank.TypeClient
fun main(){
    val c = Client(
        name = "Willian Brandão",
        id = "456.678.234-98",
        client = TypeClient.PP,
        password = "2323"
    )
    println(c)
    TestValidate().validate(c)

}
