package parte2_poo.classes

open class AnimalMod {

    //private, protected, public e internal (menos usado)
    protected var nome = "Marley"

    open fun dormir(){
        print("Dormir ")
    }

    fun correr(){
        print("Correr ")
    }
}