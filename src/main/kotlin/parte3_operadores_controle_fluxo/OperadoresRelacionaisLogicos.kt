package parte3_operadores_controle_fluxo

fun main() {
    /*
    Relacionais
        == igual a
        != diferente
        > maior que
        < menor que
        >= maior ou igual
        <= menor ou igual
    Lógicos
        && e
        || ou
     */
    /*

    println(5 == 5) // true
    println(5 == 6) // false
    println(5 != 6) // true
    println(5 != 5) // false
    println(2 > 1) // true
    println(2 > 8) // false
    println(2 > 2) // false

    println(true && true) // true
    println(false && true) // false
    println(true || true) // true
    println(true || false) // true
    println(false || false) // false

     */

    var notaProfessor = 7 // 0-10
    var notaProvaGeral = 5 // 0-10

    println( notaProfessor > 6 && notaProvaGeral >= 5 ) // true
}