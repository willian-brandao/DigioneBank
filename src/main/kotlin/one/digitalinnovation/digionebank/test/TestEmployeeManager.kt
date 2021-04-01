package one.digitalinnovation.digionebank.test



import one.digitalinnovation.digionebank.Manager
import one.digitalinnovation.digionebank.PrintReport


fun main() {
    val m = Manager("Oswaldo Santos", "456.678.904-12", 10000.0)
    PrintReport.printing(m)
}

