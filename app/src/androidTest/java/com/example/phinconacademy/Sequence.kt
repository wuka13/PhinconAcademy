package com.example.phinconacademy

fun main(){
    val numbers = (5..15).asSequence()

    numbers.forEach {
        println(it)
    }

    println("===============")

    val skip1Numbers = generateSequence (5){ it + 2 }
        skip1Numbers.take(3).forEach { println(it) }
    }



