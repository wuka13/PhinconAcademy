package com.example.phinconacademy

fun main() {
    val listHewan = listOf("Ayam", "Anjing", "Angsa", "Babi", "Badak", "Cicak", "Komodo")
    val keyword = "A"
    val resultListHewan = listHewan.filter { it.startsWith(keyword, ignoreCase = true) }
    println(resultListHewan)

    if (resultListHewan.isEmpty()){
        println(resultListHewan)
    }
    else {
        println("tidak ada nama hewan dengan huruf x")
    }
}


