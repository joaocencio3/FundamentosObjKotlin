package one.digitalinnovation.digiobank

import java.math.BigDecimal

abstract class Funcionario(
    nome:String,
    cpf:String,
    val salario:BigDecimal
):Pessoa(nome = nome, cpf = cpf){

    abstract fun calculoAuxilio():

}