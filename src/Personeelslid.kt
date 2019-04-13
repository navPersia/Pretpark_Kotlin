package src
class Personeelslid : Persoon {
    constructor(voornaam: String, familienaam: String) : super(voornaam, familienaam)

    override fun toString(): String {
        return "Personeelslid " + super.toString()
    }
}