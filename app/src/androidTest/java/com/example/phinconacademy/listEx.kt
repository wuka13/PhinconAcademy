package com.example.phinconacademy

fun main() {
    val listOrang = listOf(
        Orang("Anas", 28, "Lenteng"),
        Orang("Bagas", 25, "Pamulang"),
        Orang("Oka", 26, "Pamulang"),
        Orang("Rakha", 24, "Depok"),
        Orang("Ansari", 27, "Pasming")
    )
    println(listOrang.sortedByDescending { it.umur })
    println(listOrang.sortedBy { it.umur }.take(3))
    println(listOrang.take(3).sortedBy { it.umur })

}

data class Orang(val nama: String, val umur: Int, val alamat: String)
