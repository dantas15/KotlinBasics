package parte2_poo.classes

class Casa {

    // Propriedades (ou atributos)
    var cor: String = ""

    // Métodos
    fun abrirJanela(){
        println("Abrir janelas")
    }

    fun abrirPorta(){
        println("Abrir Porta")
    }

    fun abrirCasa(){
        this.abrirJanela()
        this.abrirPorta()
    }

}