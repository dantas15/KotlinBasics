package parte2_poo.classes

// Utilizando construtor primário podemos:
// - Declarar as propriedades
// - atribuir os valores às propriedades
class CasaComConstrutores (var cor: String, var vagasGaragem: Int) {

    /* Utilizando construtor secundário temos que:
    // - Declarar as propriedades
    // - Criar os construtores separadamento

    // Propriedades
    var cor: String = ""
    var vagasGaragem: Int = 0

    // Construtor secundário 1
    constructor(cor: String, vagasGaragem:Int) {
        this.cor = cor
        this.vagasGaragem = vagasGaragem
    }

    // Construtor secundário 2
    init {
        this.cor = cor
        this.vagasGaragem = vagasGaragem
    }
    */

    // Métodos
    fun detalhesCasa() {
        println("A casa tem a cor: $cor, vagas: $vagasGaragem")
    }


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