package model

class Usuario {

    // encapsulamento com private
    private var nome = ""

    // Exemplo de tipagem explicita
    var apelido: String  = ""

    //Exemplo de properties (redundante pois já é o padrão, a nao ser que vc precise implementar regras)
    private var cpf = ""
        private set(valor) { // <- exemplo de como encapsular somente um dos properties
            field = valor
        }
        get

    // public
    var sobrenome = ""
    var idade = 0

    // getter (não é uma boa pratica, apenas exemplificando)
    fun getNome(): String {
        return nome;
    }

    // setter (não é uma boa pratica, apenas exemplificando)
    fun setNome(nome: String) {
        this.nome = nome;
    }

    fun getCpf(): String {
        return cpf;
    }

    // Apenas para exemplificar a tipagem por parametro em um método do tipo 'comportamento'
    fun alterarIdade(idade: Int) {
        this.idade = idade
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
    println("Criando conta de usuário")

    // Criando nova instância
    val usuario = Usuario()

    // Setando valores

    // private
    usuario.setNome("Abner")
    usuario.sobrenome = "Goncalves"
    usuario.alterarCpf("000.000.000-00")
    // public
    usuario.idade = 28

    // properties
    usuario.apelido = "Bo"

    // Fazendo get nos valores

    // private
    println("Nome do usuario ${usuario.getNome()}")
    println("Sobrenome ${usuario.sobrenome}")
    println("CPF ${usuario.getCpf()}")

    // public
    println("Idade ${usuario.idade}")


    // Método do tipo 'comportamento'
    usuario.alterarIdade(29)

    println("Nova idade do usuario: ${usuario.idade}")

    if (usuario.validaMaiorIdade()) {
        println("O usuário já pode ser preso.")
    }

}