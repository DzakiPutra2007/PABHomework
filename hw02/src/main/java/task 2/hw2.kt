package com.example.hw02.task2

fun main() {
    // --- Part A ---
    val daysRemaining = 2 // Coba ubah menjadi -1 atau 0 untuk mengetes hasilnya

    // Use if, else if, and else.
    if (daysRemaining < 0) {
        println("Overdue")
    } else if (daysRemaining == 0) {
        println("Due today")
    } else {
        println("Upcoming")
    }

    println() // Pemisah agar output rapi

    // --- Part B ---
    val month = 9 // Coba ubah menjadi 13 untuk melihat hasil "Invalid month"

    val monthName = when (month) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> "Invalid month"
    }

    println("Month $month: $monthName")
}