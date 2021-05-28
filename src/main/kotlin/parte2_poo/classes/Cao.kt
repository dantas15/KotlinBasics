package parte2_poo.classes

class Cao : Animal(){

    override fun dormir(){
        super.dormir()
        println("como um cão")
    }

    fun latir(){
        println("Latir")
    }
}