package model

class Usuario {

    // encapsulamento

    private var nome = ""
    private var sobrenome = ""
    // Exemplo de tipagem explicita
    private var cpf: String  = ""

    // public
    var apelido = ""
    var idade = 0

    // getter
    fun getNome(): String {
        return nome;
    }

    // setter (n�o � uma boa pratica, apenas exemplificando)
    fun setNome(nome: String) {
        this.nome = nome;
    }

    fun getSobrenome(): String {
        return sobrenome;
    }

    fun setSobrenome(sobrenome: String) {
        this.sobrenome = sobrenome;
    }

    fun getCpf(): String {
        return cpf;
    }

    // Apenas para exemplificar a tipagem por parametro em um m�todo do tipo 'comportamento'
    fun alterarIdade(idade: Int) {
        this.idade = idade
    }

    fun alterarCpf(cpf: String) {
        this.cpf = cpf;
    }

    // Exemplo de tipagem do comportamento/m�todo
    fun validaMaiorIdade(): Boolean {
        return idade >= 18
    }
}

fun main() {
    println("Criando conta de usu�rio")

    // Criando nova inst�ncia
    val usuario = Usuario()

    // Setando valores

    // private
    usuario.setNome("Abner")
    usuario.setSobrenome("Goncalves")
    usuario.alterarCpf("000.000.000-00")
    // public
    usuario.apelido = "Bo"
    usuario.idade = 28

    // Fazendo get nos valores

    // private
    println("Nome do usuario ${usuario.getNome()}")
    println("Sobrenome ${usuario.getSobrenome()}")
    println("CPF ${usuario.getCpf()}")

    // public
    println("Idade ${usuario.idade}")


    // M�todo do tipo 'comportamento'
    usuario.alterarIdade(29)

    println("Nova idade do usuario: ${usuario.idade}")

    if (usuario.validaMaiorIdade()) {
        println("O usu�rio j� pode ser preso.")
    }

}