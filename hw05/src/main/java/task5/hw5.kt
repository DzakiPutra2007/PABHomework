package task5

data class Student(val name: String, val score: Int, val year: Int)

fun main() {
    val students = listOf(
        Student("Ali",   85, 2023),
        Student("Budi",  62, 2022),
        Student("Citra", 91, 2023),
        Student("Dewi",  58, 2022),
        Student("Eka",   76, 2023)
    )

    // 1. Partition siswa lulus (score >= 70) dan tidak lulus
    val (passing, failing) = students.partition { it.score >= 70 }
    println("Passing: ${passing.size}   Failing: ${failing.size}")

    // 2. Cari pencapai nilai tertinggi dan terendah menggunakan maxByOrNull/minByOrNull dan let
    students.maxByOrNull { it.score }?.let {
        println("Top scorer : ${it.name} (${it.score})")
    }
    students.minByOrNull { it.score }?.let {
        println("Low scorer : ${it.name} (${it.score})")
    }

    // 3. Rata-rata kelas menggunakan fold
    val totalScore = students.fold(0) { acc, student -> acc + student.score }
    val average = totalScore.toDouble() / students.size
    println("Class average: %.1f".format(average))

    // 4. Membangun laporan dengan buildString
    val report = buildString {
        appendLine("--- Grade Report ---")
        students.forEach { s ->
            val status = if (s.score >= 70) "PASS" else "FAIL"
            appendLine("%-8s %-3d %s".format(s.name, s.score, status))
        }
    }
    print(report)
}