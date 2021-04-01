package one.digitalinnovation.digionebank.test

import one.digitalinnovation.digionebank.TypeClient
fun main(){

    //use the resources of kotlin to iterate of elements of type client
    TypeClient.values().forEach { element ->
        println("${element.name} - ${element.description}")
    }
    //another form to represent this
    TypeClient.values().forEach {
        println("${it.name} - ${it.description}")
    }

    val pp = TypeClient.PP
    println("${pp.name} -${pp.description}")

    val lp = TypeClient.LP
    println("${lp.name} -${lp.description}")
}