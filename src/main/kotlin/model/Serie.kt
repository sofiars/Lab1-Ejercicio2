package model

class Serie: Entregable{

    var titulo: String = ""
        get() = field
        set(value) {
            field = value
        }
    var numeroTemporadas: Int = 3
        get() = field
        set(value) {
            field = value
        }
    var entregado: Boolean = false
        get() = field
        set(value) {
            field = value
        }
    var genero: String = ""
        get() = field
        set(value) {
            field = value
        }
    var creador: String = ""
        get() = field
        set(value) {
            field = value
        }

    constructor(titulo: String, creador: String) {
        this.titulo = titulo
        this.creador = creador
    }

    constructor()

    constructor(titulo: String, numeroTemporadas: Int, genero: String, creador: String) {
        this.titulo = titulo
        this.numeroTemporadas = numeroTemporadas
        this.genero = genero
        this.creador = creador
    }

    override fun Entregar() {
        this.entregado = true
    }

    override fun Devolver() {
        this.entregado = false
    }

    override fun isEntregado(): Boolean {
        return this.entregado
    }


}