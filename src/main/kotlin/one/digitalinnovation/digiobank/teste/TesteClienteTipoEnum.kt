package one.digitalinnovation.digiobank.teste

import one.digitalinnovation.digiobank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach {
        elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")
    }

    val pf = ClienteTipo.PF
    val pj = ClienteTipo.PJ

    println(">> $pf - ${pf.descricao}")
    println(">> $pj - ${pj.descricao}")
}