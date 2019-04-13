package src
class Attractie {
    private var naam: String? = ""
    private var duur: Long = 0
    private var foto: String? = ""
    private var verantwoordelijke: Personeelslid? = null

    constructor()

    constructor(naam: String){this.naam = naam}

    constructor(naam: String, duur: Long){
        this.naam = naam
        this.duur = duur
    }

    fun getNaam(): String? {
        return naam
    }

    fun setNaam(naam: String) {
        this.naam = naam
    }

    fun getDuur(): Long {
        return duur
    }

    fun setDuur(duur: Long) {
        this.duur = duur
    }

    fun getFoto(): String? {
        return foto
    }

    fun setFoto(foto: String) {
        this.foto = foto
    }

    fun getVerantwoordelijke(): Personeelslid? {
        return verantwoordelijke
    }

    fun setVerantwoordelijke(verantwoordelijke: Personeelslid) {
        this.verantwoordelijke = verantwoordelijke
    }
}