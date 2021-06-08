package one.digitalinnovation.digiobank.teste

import one.digitalinnovation.digiobank.Funcionario
import one.digitalinnovation.digiobank.Pessoa
import java.math.BigDecimal

fun main(){
    val jether = Pessoa(nome = "Alexandre", cpf = "123.456.789-01")
    println(jether.nome)
    println(jether.cpf)

    val joao = Funcionario(nome = "João Victor", cpf = "465.696.598-71", BigDecimal.valueOf(1000.00))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)

}