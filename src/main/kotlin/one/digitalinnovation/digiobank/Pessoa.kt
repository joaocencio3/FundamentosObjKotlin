package one.digitalinnovation.digiobank

class Pessoa {
    var nome:String = "Jether"
    var cpf:String = "123.123.123-12"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main(){
    val jether = Pessoa()
    println(jether.pessoaInfo())
}