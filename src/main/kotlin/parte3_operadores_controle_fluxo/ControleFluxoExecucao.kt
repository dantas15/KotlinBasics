package parte3_operadores_controle_fluxo

fun main(){
    /*
    Controle de fluxo de execução
    if ( CONDICAO ) {
        // caso a condição seja satisfeita
    }
     */

    val num1 = 5
    val num2 = 6

    if( num1 < num2 || (num1 - num2) == -1 ) {
        println("Verdadeiro")
    } else {
        println("False")
    }

    println("--------")

    val idade = 10
    if( idade < 14 ) {
        println("Criança")
    } else if (idade > 14 && idade < 18) {
        println("Adolescente")
    } else if (idade >= 18 && idade < 30) {
        println("Adulto")
    }

    println("--------")

    val media = 6
    val resultado = if (media >=6 ) "Aprovado" else "Reprovado"

    println( resultado )
}