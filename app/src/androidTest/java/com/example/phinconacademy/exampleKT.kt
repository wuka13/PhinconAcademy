package com.example.phinconacademy

import kotlin.Int

fun main() {

    val Persegi = Persegi(4.0)
    val Lingkaran = Lingkaran(2.0)
    val Segitiga = Segitiga(5.0, 10.0, 2.0)
    println(Persegi.hitungLuas())
    println(Persegi.hitungKeliling())
}

open class BentukGeometri() {
    open fun hitungLuas(): Double {
        return 0.0
    }

    open fun hitungKeliling(): Double {
        return 0.0
    }
}


class Persegi(val sisi: Double) : BentukGeometri() {
    override fun hitungLuas(): Double {
        return sisi * sisi
    }

    override fun hitungKeliling(): Double {
        return 4 * sisi
    }
}

class Lingkaran(val jariJari: Double) : BentukGeometri() {
    override fun hitungLuas(): Double {
        return Math.PI * jariJari * jariJari
    }

    override fun hitungKeliling(): Double {
        return 2 * Math.PI * jariJari
    }
}


class Segitiga(val alas: Double, val tinggi: Double, val sisi: Double) : BentukGeometri() {
    override fun hitungLuas(): Double {
        return alas * tinggi
    }

    override fun hitungKeliling(): Double {
        val keliling = alas + sisi
        return keliling.toDouble()
    }

}

