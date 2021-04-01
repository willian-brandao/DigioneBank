package one.digitalinnovation.digionebank

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