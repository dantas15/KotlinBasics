package parte4_estruturas_repeticao

fun main() {

    var numWhile = 1
    while (numWhile < 5 ){
        //códigos a serem executados
        println("Executado: $numWhile")
        numWhile++
    }

    for( numFor in 1..5){
        println("Executado: $numFor")
    }

    val postagens = arrayOf (
        "Descoberto novo método para tratamento do COVID!",
        "Novo curso de Android lançado!",
        "Bolsa de valores opera em alta de 2%",
        "Descoberto novo método para tratamento do COVID!",
    )

    for( (indice, postagem) in postagens.withIndex() ) {
        println("${indice+1} - $postagem")
    }
}