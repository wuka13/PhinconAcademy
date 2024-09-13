package com.example.phinconacademy

fun main(){
    val listProduct = listOf(
        Product("Televisi", 800000, "Elektronik"),
        Product("Kulkas", 500000, "Elektronik"),
        Product("Speaker", 200000, "Elektronik"),
        Product("Baju", 99000, "Pakaian"),
        Product("Celana", 300000, "Pakaian"),
        Product("Bakso", 20000, "Makanan"),
        Product("Naspad", 25000, "Makanan")
    )
    println(listProduct.sortedByDescending { it.price })
    println(listProduct.sortedBy { it.price }.take(5))
    println(listProduct.take(5).sortedBy { it.price })

}
data class Product(val name: String, val price: Int, val category: String)