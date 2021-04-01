package one.digitalinnovation.digionebank.test

import one.digitalinnovation.digionebank.Employee

class PrintReport {
    //static method that we can summon up by class
    companion object {
        fun printing(employee: Employee) {
           println(
               employee.toString()
           )
        }
    }
}