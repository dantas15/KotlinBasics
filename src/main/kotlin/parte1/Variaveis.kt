package parte1

fun main(args: Array<String>) {

    // var -> Variável mutável
    var usuario = "Gustavo"
    usuario = "João"

    // val -> Variável imutável (constante)
    val pi = 3.14

    var salario = 100
    var bonus = 30

    var total = salario * bonus

    println("O salário é $total")
}