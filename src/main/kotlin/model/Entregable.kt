package model

interface Entregable {
    fun Entregar()
    fun Devolver()
    fun isEntregado(): Boolean
}