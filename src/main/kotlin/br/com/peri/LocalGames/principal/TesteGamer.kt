import br.com.peri.LocalGames.modelo.Gamer

fun main() {
    val gamer1 = Gamer("jaque", "Jacque@email.com")

    val gamer2 = Gamer("Jani",
        "jeni@email.com",
        "19/09/1992",
        "jenilibido")

    gamer1.let {
    it.dataNascimento = "18/09/2000"
        it.usuario = "jacwwwww"
        it.idInterno = "jacwwwww"
    }
    println(gamer1)

}