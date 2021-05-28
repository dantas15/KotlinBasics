package parte1

fun exibirMensagem( nome: String, idade: Int) {
    println("Alerta, $nome, você não preencheu os dados! Sua idade é: $idade")
}

fun somar(num1 : Int, num2: Int):  Int {
    var total = num1 + num2
    return total
}

fun main(args: Array<String>) {

    exibirMensagem("Gustavo", 28)

    var first: Int = 5
    var second: Int = 11

    var result = somar(first, second)

    println("$first + $second = $result")
}