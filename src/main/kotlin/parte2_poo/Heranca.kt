package parte2_poo

import parte2_poo.classes.Cao
import parte2_poo.classes.Passaro

fun main(args: Array<String>) {

    val cao = Cao()
    cao.dormir()
    cao.correr()
    cao.latir()

    val passaro = Passaro()
    passaro.dormir()
    passaro.correr()

}