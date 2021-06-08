package one.digitalinnovation.digiobank.teste

import one.digitalinnovation.digiobank.Analista
import one.digitalinnovation.digiobank.Funcionario
import one.digitalinnovation.digiobank.Pessoa
import java.math.BigDecimal

fun main(){
    val maria = Analista("Maria Cencio da Silva", "458.125.365-75", 5000.00)
    imprimeRelatorioFuncao.imprime(maria)
}