package com.axxes.sample.beans
open class Persoon {
    private var voornaam: String? = ""
    private var familienaam: String? = ""

    constructor(voornaam: String, familienaam: String) {
        this.voornaam = voornaam
        this.familienaam = familienaam
    }

    constructor()

    fun getFamilienaam(): String? {
        return familienaam
    }

    fun getVoornaam(): String? {
        return voornaam
    }

    fun setFamilienaam(familienaam: String) {
        this.familienaam = familienaam
    }

    fun setVoornaam(voornaam: String) {
        this.voornaam = voornaam
    }


    override fun toString(): String {
        return familienaam!!.toUpperCase() + " " + voornaam!!.toLowerCase()
    }
}
