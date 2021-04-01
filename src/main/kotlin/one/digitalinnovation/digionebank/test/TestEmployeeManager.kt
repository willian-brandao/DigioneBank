package one.digitalinnovation.digionebank.test

import one.digitalinnovation.digionebank.Manager

fun main() {
    val m = Manager("Oswaldo Santos", "456.678.904-12", 10000.0, "password123")
    PrintReport.printing(m)

    TestValidate().validate(m)
}

