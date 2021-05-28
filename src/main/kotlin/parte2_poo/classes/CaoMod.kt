package parte2_poo.classes

class CaoMod : AnimalMod(){


    fun exibeNome(){
        println("Método exibe nome: $nome")
    }

    override fun dormir(){
        super.dormir()
        println("como um cão")
    }

    fun latir(){
        println("Latir")
    }
}