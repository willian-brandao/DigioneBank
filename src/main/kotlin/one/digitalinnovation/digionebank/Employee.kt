package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Employee(
    name: String,
    id: String,
    val salary : BigDecimal
) : Person(name, id) {
    abstract fun bonusCalculation();
}