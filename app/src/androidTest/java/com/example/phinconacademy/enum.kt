package com.example.phinconacademy

fun main() {
    val hariIni = NamaHari.RABU
    when(hariIni){
        NamaHari.SENIN -> "Upacara"
        NamaHari.SELASA -> "Meeting"
        NamaHari.RABU -> "Meeting"
        NamaHari.KAMIS -> "Batik"
        NamaHari.JUMAT -> "Jumatan"
        NamaHari.SABTU -> "Libur"
        NamaHari.MINGGU -> "Libur"
    }
}

enum class NamaHari {
    SENIN,
    SELASA,
    RABU,
    KAMIS,
    JUMAT,
    SABTU,
    MINGGU
}
