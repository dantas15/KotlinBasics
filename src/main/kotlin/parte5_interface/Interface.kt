package parte5_interface


interface Presidente {
    fun ganharEleicao()
}

interface Pai {
    fun temFilho()
}

open class Cidadao {
    fun direitosDeveres() {
        println("Todo cidadão tem direitos e deveres")
    }
}

class Obama : Cidadao(), Presidente, Pai {
    override fun ganharEleicao() {
        println("Ganhar Eleição nos Eua")
    }

    override fun temFilho() {
        println("Tem filho!")
    }
}

class Gustavo : Cidadao(), Presidente {
    override fun ganharEleicao() {
        println("Ganhar Eleição nos Eua")
    }
}

fun main() {

    val gustavo = Gustavo()
    gustavo.direitosDeveres()

    val obama = Obama()
    obama.direitosDeveres()
}