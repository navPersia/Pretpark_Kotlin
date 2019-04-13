package src
import java.util.ArrayList

class Pretpark {
    private var naam: String? = ""
    private var aantalBezoekers: Int = 0
    private val attracties = ArrayList<Attractie>()

    constructor(naam: String){
        this.naam = naam
    }

    fun getNaam(): String? {
        return naam
    }

    fun setNaam(naam: String) {
        this.naam = naam
    }

    fun getAttracties(): ArrayList<Attractie> {
        return attracties
    }


    fun getAantalAttracties(): Int {
        return attracties.size
    }

    fun voegAttractieToe(attractie: Attractie) {
        this.attracties.add(attractie)
    }

    fun zoekAttractieOpNaam(naam: String): Attractie? {
        for (i in this.attracties.indices) {
            if (this.attracties[i].getNaam().equals(naam)) {
                return this.attracties[i]
            }

        }
        return null
    }

    fun registreerBezoeker(bezoeker: Bezoeker) {
        this.aantalBezoekers++
        bezoeker.setPretparkcode(this.aantalBezoekers)

    }
}