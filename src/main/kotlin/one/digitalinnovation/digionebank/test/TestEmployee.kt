package one.digitalinnovation.digionebank.test
import one.digitalinnovation.digionebank.Employee
import one.digitalinnovation.digionebank.Person
import java.math.BigDecimal

fun main() {
    val p = Person(name = "Willian ", id = "123.456.678.90")
    println(p.name)
    println(p.id)

    val E = Employee( "Willian Brandão","2365", BigDecimal.valueOf(10000))
    println(E.name)
    println(E.id)
    println(E.salary)
}