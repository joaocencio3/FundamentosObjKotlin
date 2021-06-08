package one.digitalinnovation.digiobank.teste

import one.digitalinnovation.digiobank.Analista
import one.digitalinnovation.digiobank.Funcionario
import one.digitalinnovation.digiobank.Pessoa
import java.math.BigDecimal

fun main(){
    val joao = Analista("João Victor Cencio da Silva", "465.696.598-71", 1000.00)
    imprimeRelatorioFuncao.imprime(joao)
}