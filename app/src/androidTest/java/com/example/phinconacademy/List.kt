package com.example.phinconacademy
fun main(){
    val listDayOfWeek = mutableListOf("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY")
    println(listDayOfWeek)

    listDayOfWeek[6] = "Holiday"
    println(listDayOfWeek)

    listDayOfWeek.remove("MONDAY")
    println(listDayOfWeek)
}

