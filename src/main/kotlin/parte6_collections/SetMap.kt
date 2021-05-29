package parte6_collections

/*
    Set -> não permite elementos duplicados, é mais rápido que o ArrayList,
    não mantém a ordem dos elementos
    Map -> É uma implementação chave/valor
 */

fun main() {
    println("*** SET ***")
//    var itens = hashSetOf<String>("a", "b", "c", "c")
    var itens = hashSetOf<Int>(10, 20, 30, 50, 70)

    for (item in itens) {
        println(item)
    }

    println(itens)

    println("------------------")
    println("*** MAP ***")

    var map = hashMapOf(
        "urso" to "Animal que Hiberna",
        "cao" to "Melhor amigo do homem"
    )

    map.put("passaro", "Gosta de voar")
//    map.remove("passaro")

    for (item in map) {
        println("Chave: ${item.key} | Valor: ${item.value}")
    }

}