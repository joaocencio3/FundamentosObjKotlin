package one.digitalinnovation.digiobank.teste

import one.digitalinnovation.digiobank.Funcionario

class ImprimeRelatorioFuncao {

    companion object{
        fun imprime(funcionario:Funcionario){
            println(funcionario.toString())
        }
    }
}