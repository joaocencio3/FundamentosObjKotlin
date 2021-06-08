package one.digitalinnovation.digiobank.teste

import one.digitalinnovation.digiobank.Banco

fun main(){
    val digiOneBank = Banco(nome = "DigiOne", numero = 12)

    println(digiOneBank.nome)
    println(digiOneBank.numero)

    val digiOneBank2 = digiOneBank.copy()
    println(digiOneBank2.info())
}