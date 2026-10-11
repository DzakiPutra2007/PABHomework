package com.example.hw02.task1

fun main() {
    // --- Part A ---
    val studentName = "Alya"
    var completedCredits = 20

    // Update the credits (menambahkan 3 SKS)
    completedCredits += 3

    // Display the name and total
    println("$studentName has completed $completedCredits credits.")

    // --- Part B ---
    val courseName = "Mobile Application Development"
    var meetingsHeld = 2

    // Menambahkan 1 pertemuan
    meetingsHeld += 1

    // Menampilkan dengan String template
    println("$courseName has held $meetingsHeld meetings.")
}