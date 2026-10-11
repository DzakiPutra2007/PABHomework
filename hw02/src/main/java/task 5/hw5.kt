package com.example.hw02.task5

fun main() {
    // Meminta nilai Assignment
    print("Assignment score: ")
    val assignment = readln().toInt()

    // Meminta nilai Exam
    print("Exam score: ")
    val exam = readln().toInt()

    // Compute the average as a Double
    // (dibagi dengan 2.0 agar hasilnya menjadi desimal/Double, bukan Integer)
    val average = (assignment + exam) / 2.0

    // Store the status with an if expression
    val status = if (average >= 60.0) {
        "Pass"
    } else {
        "Needs improvement"
    }

    // Print the average and the status
    println("Average: $average")
    println("Status: $status")
}