/*
    Enum ( Enumeração) -> é um tipo de dado que consiste
    em um conjunto de constantes
 */

enum class StatusPedido {
    PROCESSANDO, APROVADO, REPROVADO
}

class Pedido {
    var status: StatusPedido = StatusPedido.PROCESSANDO
}

fun main() {
    val pedido = Pedido()
    pedido.status = StatusPedido.REPROVADO

    if (pedido.status == StatusPedido.PROCESSANDO){
        println("Pedido está sendo processado")
    } else if (pedido.status == StatusPedido.APROVADO) {
        println("Pedido está aprovado")
    } else if (pedido.status == StatusPedido.REPROVADO) {
        println("Pedido foi reprovado")
    }
}