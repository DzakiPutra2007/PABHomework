package task2

// 1. Fungsi applyTwice
fun applyTwice(n: Int, operation: (Int) -> Int): Int {
    return operation(operation(n))
}

// 2. Fungsi printIf
fun printIf(items: List<String>, condition: (String) -> Boolean) {
    items.filter(condition).forEach { println(it) }
}

// 3. Fungsi transform (Generic)
fun <T> transform(list: List<T>, mapper: (T) -> String): List<String> {
    return list.map(mapper)
}

fun main() {
    // Uji coba 1: applyTwice
    val doubleInt: (Int) -> Int = { it * 2 }
    println(applyTwice(3, doubleInt))

    // Uji coba 2: printIf
    val startsWithVowel: (String) -> Boolean = { str ->
        str.firstOrNull()?.lowercaseChar() in listOf('a', 'e', 'i', 'o', 'u')
    }
    val courses = listOf("Algorithms", "Database", "Operating Systems", "Interaction", "Architecture")
    printIf(courses, startsWithVowel)

    // Uji coba 3: transform
    val numbers = listOf(2, 3, 4)
    val squaredStrings = transform(numbers) { (it * it).toString() }
    println(squaredStrings)
}