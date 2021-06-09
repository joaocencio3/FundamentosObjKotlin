package one.digitalinnovation.digiobank.teste

import one.digitalinnovation.digiobank.Analista

fun main(){
    val joao = Analista("João Victor Cencio da Silva", "465.696.598-71", 1000.00)
    ImprimeRelatorioFuncao.imprime(joao)
}