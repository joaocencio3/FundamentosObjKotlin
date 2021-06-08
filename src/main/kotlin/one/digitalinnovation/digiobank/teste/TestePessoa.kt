package one.digitalinnovation.digiobank.teste

import one.digitalinnovation.digiobank.Pessoa

fun main(){
    val jether = Pessoa(nome = "João Victor", cpf = "465.696.598-71")
    println(jether.nome)
    println(jether.cpf)
}