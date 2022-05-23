package model

open class Usuario(
    // Construtor primário
    private var nome: String,// Exemplo de tipagem explicita (:String)
    private var sobrenome: String
) {

    //Exemplos de properties
    var apelido: String  = ""
        private set // set private

    // encapsulamento com private
    private var cpf = ""
        private set(valor) { // <- exemplo de como encapsular somente um dos properties
            field = valor
        }
        get

    // public, sem get e set
    var idade = 0

    // getter (não é uma boa pratica, apenas exemplificando)
    fun getNome(): String {
        return nome;
    }

    fun getSobrenome(): String {
        return sobrenome;
    }

    fun getCpf(): String {
        return cpf;
    }

    // Apenas para exemplificar a tipagem por parametro em um método do tipo 'comportamento'
    open fun alterarIdade(idade: Int) {
        this.idade = idade
    }

    fun alterarApelido(apelido: String) {
        this.apelido = apelido
    }

    fun alterarCpf(cpf: String) {
        this.cpf = cpf;
    }

    // Exemplo de tipagem do comportamento/método
    fun validaMaiorIdade(): Boolean {
        return idade >= 18
    }
}

fun main() {
    println("Criando conta de usuario")

    // Criando nova instância
    //nome esta com label e sobrenome nao
    val usuario = Usuario(nome = "Abner", "Gonçalves")

    // Setando valores
    // private
    usuario.alterarCpf("000.000.000-00")

    // public
    usuario.idade = 28

    // Fazendo get nos valores
    // private
    println("Nome do usuario ${usuario.getNome()}")
    println("Sobrenome ${usuario.getSobrenome()}")
    println("CPF ${usuario.getCpf()}")

    // public
    println("Idade ${usuario.idade}")

    // Método do tipo 'comportamento'
    usuario.alterarIdade(29)
    usuario.alterarApelido("Bo")

    println("Nova idade do usuario: ${usuario.idade}")

    if (usuario.validaMaiorIdade()) {
        println("O usuario ja pode ser preso.")
    }

}