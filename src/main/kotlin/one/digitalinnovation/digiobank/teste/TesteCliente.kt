package one.digitalinnovation.digiobank.teste

import one.digitalinnovation.digiobank.Cliente
import one.digitalinnovation.digiobank.ClienteTipo

fun main (){
    val jose = Cliente(
        nome = "José da Silva",
        cpf = "123.456.654-12",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)
    TesteAutenticacao().autentica(jose)

}