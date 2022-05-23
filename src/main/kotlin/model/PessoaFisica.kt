package model

class PessoaFisica(
    nome: String,
    sobrenome: String,
    cpf: String
): Usuario(nome = nome, sobrenome = sobrenome) {

    //Exemplo de override, ver em Usuario que alteraIdade recebeu o 'open' em frente do metodo
    override fun alterarIdade(idade: Int) {
        super.alterarIdade(idade+2)
    }
}