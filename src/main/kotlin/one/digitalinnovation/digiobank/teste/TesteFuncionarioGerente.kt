package one.digitalinnovation.digiobank.teste

import one.digitalinnovation.digiobank.Gerente

fun main(){
    val maria = Gerente(nome = "Maria Cencio da Silva", cpf = "458.125.365-75", salario = 5000.00, senha = "123")

    ImprimeRelatorioFuncao.imprime(maria)

    TesteAutenticacao().autentica(maria)
}