package br.com.peri.LocalGames.modelo

class Jogo(val titulo:String,
           val capa:String) {
    var descricao: String? = null

    override fun toString(): String {
        return "Meu br.com.peri.LocalGames.modelo.Jogo: \n" +
                "Título: $titulo \n" +
                "Capa: $capa \n" +
                "Descricao: $descricao"
    }
}