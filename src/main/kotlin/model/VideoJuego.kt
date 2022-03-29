package model

class VideoJuego: Entregable {

    var titulo: String = ""
        get() = field
        set(value) {
            field = value
        }
    var horasEstimadas: Int = 10
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
    var compannia: String = ""
        get() = field
        set(value) {
            field = value
        }

    constructor()

    constructor(titulo: String, horasEstimadas: Int) {
        this.titulo = titulo
        this.horasEstimadas = horasEstimadas
    }

    constructor(titulo: String, horasEstimadas: Int, genero: String, compannia: String) {
        this.titulo = titulo
        this.horasEstimadas = horasEstimadas
        this.genero = genero
        this.compannia = compannia
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