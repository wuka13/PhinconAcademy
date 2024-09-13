package com.example.phinconacademy

fun main(){
    val setAngka = mutableSetOf(1,2,3,4,5,)
    println(setAngka)

    setAngka.add(3)
    setAngka.add(6)
    println(setAngka)

    setAngka.remove(1)
    println(setAngka)
    println(setAngka.contains(1))
}
