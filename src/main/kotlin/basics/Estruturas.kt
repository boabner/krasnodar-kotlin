
fun main () {
    whileFun();
}

fun whileFun() {

    var x = 20;

    //Default while
    while(x > 10) {
        println(x)
        x--;
    }

    //Do while
    do {
        println(x)
        x--;
    } while (x > 0)

}

fun loopFun() {

    //For loop range ASC
    for (i in 1..5) {
        println(i)
    }

    //For loop range downTo (DESC)
    for (i in 5 downTo 1) {
        println(i)
    }

    //For loop range downTo with step (DESC), para pular os numeros de acordo com o definido no step, nesse ex. o for irá pular de 2 em 2
    for (i in 5 downTo 1 step 2) {
        println(i)
    }

    //Break
    for (i in 5 downTo 1) {
        if (i == 2) {
            break;
        }
        println(i)
    }

}