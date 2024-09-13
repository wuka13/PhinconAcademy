package com.example.phinconacademy

fun main() {
    val mapData = mutableMapOf(
        "Jambu" to 5000,
        "Mangga" to 10000,
        "Anggur" to 15000
    )
    println(mapData)
    println(mapData["Jambu"])
    mapData["Markisa"] = 2000
    mapData["Pisang"] = 1000
    print(mapData)
    mapData["Jambu"] = 10000
    print(mapData)

    mapData.remove("Anggur")
    println(mapData)
}