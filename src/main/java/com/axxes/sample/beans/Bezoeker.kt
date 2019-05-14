package com.axxes.sample.beans
import java.util.ArrayList

class Bezoeker : Persoon {
    private var pretparkcode: Int = 0
    private val wishlist = ArrayList<String>()
    constructor(voornaam: String, familienaam: String): super(voornaam, familienaam){
        this.pretparkcode = -1
    }

    fun getPretparkcode(): Int {
        return pretparkcode
    }

    fun getWishlist(): ArrayList<String> {
        return wishlist
    }


    fun setPretparkcode(pretparkcode: Int) {
        this.pretparkcode = pretparkcode
    }

    fun voegToeAanWishlist(attractienaam: String): Boolean {
        if (wishlist.size < 5) {
            wishlist.add(attractienaam)
            return true
        } else {
            return false
        }

    }

    fun getAantalOpWishlist(): Int {
        return this.wishlist.size
    }

    override fun toString(): String {
        return "Bezoeker " + super.toString() + " met pretparkcode " + pretparkcode
    }


}