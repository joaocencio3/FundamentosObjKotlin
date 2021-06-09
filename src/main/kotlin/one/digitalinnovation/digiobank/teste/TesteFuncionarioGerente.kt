package one.digitalinnovation.digiobank.teste

import one.digitalinnovation.digiobank.Analista
import one.digitalinnovation.digiobank.Funcionario
import one.digitalinnovation.digiobank.Gerente
import one.digitalinnovation.digiobank.Pessoa
import java.math.BigDecimal

fun main(){
    val maria = Gerente(nome = "Maria Cencio da Silva", cpf = "458.125.365-75", salario = 5000.00, senha = "123")

    imprimeRelatorioFuncao.imprime(maria)
}