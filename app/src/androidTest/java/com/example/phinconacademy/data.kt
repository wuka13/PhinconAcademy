package com.example.phinconacademy

data class Mahasiswa(
    var nama: String,
    val nim: String,
    val jurusan: String?
)

fun main(){
    val mahasiswaSepuh = Mahasiswa("Bagas", "121314", null)
    println(mahasiswaSepuh)
    println(mahasiswaSepuh.nama)
    mahasiswaSepuh.nama = "Ali"
    println(mahasiswaSepuh.nama)
}
