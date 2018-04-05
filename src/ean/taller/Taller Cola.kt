package ean.taller

import ean.collections.ArrayQueue
import ean.collections.IQueue

data class Edificio(var torre: Int, var pisos: Int, var aptos: Int)

class Conjunto{
    var nombre = ""
    val torres: IQueue<Edificio> = ArrayQueue()
    constructor()
    constructor(nom: String){
        nombre = nom
    }
    //Construir una torre: Recibe una edificio y lo agrega al final de la cola
    fun construirEdificio(edificio: Edificio){
        torres.enqueue(edificio)
    }

    //Determinar el numero de edificios que tiene el conjunto
    fun numEdificios(): Int {
        val copia = torres.copy()
        var c = 0
        while (!copia.isEmpty){
            c++
            copia.dequeue()
        }
        return c
    }

    //Determine el edificio mas alto del conjunto. Retorne null si no hay
    fun masAlto():Edificio?{
        if(torres.isEmpty){
            return null
        }
        // Saco el primero
        var e = torres.front
        val copy = torres.copy()

        while (!copy.isEmpty){
            val edif = copy.front
            if(edif.pisos > e.pisos){
                e = edif
            }
            // para avanzar en el recorrido
            copy.dequeue()
        }
        return e
    }

    // Numero total de aptos que hay en el conjunto
    fun numAptos():Int{
        TODO()
    }
}

// Funcion externa que determina el numero promedio de aptos por torre de un conjunto
fun numPromedio(conjunto: Conjunto):Double{
    TODO()
}
