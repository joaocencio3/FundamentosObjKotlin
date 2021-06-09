package one.digitalinnovation.digiobank

class Gerente(
    nome:String,
    cpf:String,
    salario:Double,
    senha:String):
    Funcionario(nome = nome, cpf = cpf, salario = salario) {
    override fun calculoAuxilio(): Double = salario * 0.4

}