package one.digitalinnovation.digionebank.test

import one.digitalinnovation.digionebank.Bank

fun main(){
    val digioneBank = Bank(name="Digione", id=1978)
    //use a function of bank to print properties
    println(digioneBank.info())

    //copy attributes of the first instance because we can't to change the values when use val
    val bank2 = digioneBank.copy(name = "DigitalBank")
    println(bank2.info())

}