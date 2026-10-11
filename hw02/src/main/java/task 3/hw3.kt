package com.example.hw02.task3

fun main() {
    val numberOfDays = 5

    // --- Part A ---
    // Loop setiap hari 1 sampai 5
    for (i in 1..numberOfDays) {
        println("Day $i: Study for 20 minutes")
    }

    println() // Pemisah agar output rapi

    // --- Part B ---
    // Loop menggunakan step 2 agar hanya menampilkan ganjil (1, 3, 5)
    for (i in 1..numberOfDays step 2) {
        println("Day $i: Study for 20 minutes")
    }
}