package parte2_poo

import parte2_poo.classes.Casa

fun main(args: Array<String>) {

    val casa = Casa()
    casa.cor = "Amarelo"
    casa.abrirJanela()

    val casa2 = Casa()
    casa2.cor = "Vermelho"

    println(casa.cor)
    println(casa2.cor)
}