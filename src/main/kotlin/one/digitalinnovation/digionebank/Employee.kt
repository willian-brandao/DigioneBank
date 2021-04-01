package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Employee(
    override val name: String,
    override val id: String,
    val salary : BigDecimal
) : Person(name, id) {

}