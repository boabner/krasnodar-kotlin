

fun main() {

    val valor1 = 100.00;

    //if
    if (valor1 > 0.0) {
        println("Valor positivo")
    }
    else if (valor1 == 100.0) {
        println("Valor não alterado")
    }
    else {
        println("Conta negativa")
    }

    //when
    when {
        valor1 > 0.0 -> println("Valor positivo")
        valor1 == 0.0 -> println("Valor não alterado")
        else -> println("Conta negativa")
    }

}