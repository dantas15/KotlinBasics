package parte6_collections

/*
    Collections ou coleções -> São implementações de estruturas de dados
        - List -> Imutável, tamanho fixo, apenas para leitura
        - ArrayList -> Mutável, sem tamanho fixo, pode adicionar ou remover
 */

fun main() {

    var listaItens = arrayListOf<String>("SP", "RJ", "MG")
    listaItens.add("BA")
//    listaItens.remove("SP")
//    listaItens.removeAt(0)

    println(listaItens.size)
    println(listaItens.isEmpty())
}