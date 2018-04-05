package ean.taller

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class EdificioTest{

    @Test
    fun prueba1(){
        val e = Edificio(1,10,30)
        println(e)

        assertEquals(10, e.pisos)

        val b = Edificio(1,10,30)
        assertTrue(b == e)
        assertFalse(b === e)
    }

    @Test
    fun prueba2(){
        val conj = Conjunto("Las villas de doña juana")

        conj.construirEdificio(Edificio(1,10,20))
        conj.construirEdificio(Edificio(2,20,100))
        conj.construirEdificio(Edificio(3,15,300))
        conj.construirEdificio(Edificio(4,12,40))

        assertEquals(4,conj.numEdificios())
        val juancho = conj.masAlto()
        assertEquals(2,juancho!!.torre)

    }
}