package task3

data class Student(val name: String, val score: Int, val year: Int)

fun main() {
    val students = listOf(
        Student("Ali",   85, 2023),
        Student("Budi",  62, 2022),
        Student("Citra", 91, 2023),
        Student("Dewi",  58, 2022),
        Student("Eka",   76, 2023)
    )

    // 1. Filter nilai >= 70 dan cetak jumlahnya
    val passingCount = students.filter { it.score >= 70 }.size
    println("Passing students count: $passingCount")

    // 2. Map ke format "Name (Score)" lalu cetak dengan forEach
    students.map { "${it.name} (${it.score})" }.forEach { println(it) }

    // 3. Urutkan descending berdasarkan nilai, ambil 3 teratas
    val top3Names = students.sortedByDescending { it.score }.take(3).map { it.name }
    println("Top 3 students: $top3Names")

    // 4. Hitung total dan rata-rata menggunakan fold
    val totalScore = students.fold(0) { acc, student -> acc + student.score }
    val averageScore = totalScore.toDouble() / students.size
    println("Total: $totalScore   Average: $averageScore")

    // 5. Kelompokkan berdasarkan tahun dengan groupBy
    val groupedByYear = students.groupBy { it.year }
    groupedByYear.forEach { (year, list) ->
        val names = list.map { it.name }
        println("$year: $names")
    }
}