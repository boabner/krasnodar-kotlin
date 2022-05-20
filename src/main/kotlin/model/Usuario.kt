package model

class Usuario {

    // encapsulamento com private
    private var nome = ""

    // Exemplo de tipagem explicita
    var apelido: String  = ""

    //Exemplo de properties (redundante pois j� � o padr�o, a nao ser que vc precise implementar regras)
    private var cpf = ""
        private set(valor) { // <- exemplo de como encapsular somente um dos properties
            field = valor
        }
        get

    // public
    var sobrenome = ""
    var idade = 0

    // getter (n�o � uma boa pratica, apenas exemplificando)
    fun getNome(): String {
        return nome;
    }

    // setter (n�o � uma boa pratica, apenas exemplificando)
    fun setNome(nome: String) {
        this.nome = nome;
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


    // M�todo do tipo 'comportamento'
    usuario.alterarIdade(29)

    println("Nova idade do usuario: ${usuario.idade}")

    if (usuario.validaMaiorIdade()) {
        println("O usu�rio j� pode ser preso.")
    }

}