package parte2_poo

fun main() {
    var texto: String? = null
    //texto = "Gustavo"

    // // Com erros (trava)
    //println(texto.length)

    // Sem erros (retorna nulo, mas não trava)
    println(texto?.length)

    // Retorna um NullPointerException
    println(texto!!.length)
}