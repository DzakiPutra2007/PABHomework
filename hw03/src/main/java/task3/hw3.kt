package com.example.hw03.task3

fun main() {
    // Uji coba 1: studentName = null
    var studentName: String? = null

    println("Length: ${studentName?.length}")
    println("Name: ${studentName ?: "Unknown"}")
    studentName?.let {
        println("Hello, $it!")
    }

    println("\n--- Testing with name ---")

    // Uji coba 2: studentName = "Ayu"
    studentName = "Ayu"
    println("Length: ${studentName?.length}")
    println("Name: ${studentName ?: "Unknown"}")
    studentName?.let {
        println("Hello, $it!")
    }
}