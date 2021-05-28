package parte3_operadores_controle_fluxo

fun main(){

    val opcao = 2

    when( opcao ) {
        1,2-> {
            println("Café puro")
            println("Leite separado")
        }
        3 -> println("Chocolate quente")
        else -> {
            println("Nenhuma opção selecionada")
            println("Selecione uma opção:")
        }
    }

    println("-----------------")

    val opc = 4
    val resultado = when( opc ) {
        1 -> "Café Puro"
        2 -> "Chocolate quente"
        3 -> "Café com leite"
        else -> "Nenhuma opção selecionada"
    }

    println(resultado)
}