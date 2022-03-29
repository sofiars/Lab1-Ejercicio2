import model.Serie
import model.VideoJuego

fun main(args: Array<String>) {
    var series = arrayOf<Serie>()
    var videoJuegos = arrayOf<VideoJuego>()

    var serie1 = Serie("Dark", 3, "Suspenso", "Allan")
    var serie2 = Serie("The office", 5, "Drama", "Rodrigo")
    var serie3 = Serie("Bridgerton", 2, "Drama", "Sofia")
    var serie4 = Serie("Yo soy Betty la fea", 1, "Comedia", "Fernando Gaitan")
    var serie5 = Serie("Cafe con aroma de mujer", 2, "Romanticismo", "William Levy")

    serie1.Entregar()
    serie2.Entregar()
    serie5.Entregar()

    series = series.plus(serie1)
    series = series.plus(serie2)
    series = series.plus(serie3)
    series = series.plus(serie4)
    series = series.plus(serie5)

    var videoJuego1 =  VideoJuego("GTA San Andres", 5,"Violencia","RockStar")
    var videoJuego2 =  VideoJuego("Clash Royal", 5,"Casual","SuperCell")
    var videoJuego3 =  VideoJuego("Fortnite", 105,"Bad and royal","Epic Games")
    var videoJuego4 =  VideoJuego("Sonic", 205,"Aventura","Sega")
    var videoJuego5 =  VideoJuego("Minecraft", 400,"Exploracion","Microsoft")

    videoJuego1.Entregar()
    videoJuego3.Entregar()
    videoJuego4.Entregar()

    videoJuegos = videoJuegos.plus(videoJuego1)
    videoJuegos = videoJuegos.plus(videoJuego2)
    videoJuegos = videoJuegos.plus(videoJuego3)
    videoJuegos = videoJuegos.plus(videoJuego4)
    videoJuegos = videoJuegos.plus(videoJuego5)

    var contador1 = 0
    for(i in series.indices) {
        if(series.get(i).isEntregado()){
            contador1 ++
            series.get(i).Devolver()
        }
    }

    println("Series entregadas: " + contador1)
    var contador2 = 0
    for(i in videoJuegos.indices) {
        if(videoJuegos.get(i).isEntregado()){
            contador2 ++
            videoJuegos.get(i).Devolver()
        }
    }

    println("Video juegos entregados: " + contador2)



}