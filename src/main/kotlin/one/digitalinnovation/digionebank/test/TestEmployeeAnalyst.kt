package one.digitalinnovation.digionebank.test

import one.digitalinnovation.digionebank.Analyst

fun main() {
    val a = Analyst("Olivier Santos", "122.098.456-46", 2000.0)
    PrintReport.printing(a)
}
//instance os subtype that implement a abstract class
//fun printReport(employee: Employee) = println(employee.toString())
