package task1

fun main() {
    // 1. Lambda mengalikan dua (double) sebuah Int
    val doubleInt: (Int) -> Int = { it * 2 }
    println(doubleInt(7))

    // 2. Lambda mengecek huruf vokal di awal String (ignore case)
    val startsWithVowel: (String) -> Boolean = { str ->
        str.firstOrNull()?.lowercaseChar() in listOf('a', 'e', 'i', 'o', 'u')
    }
    println(startsWithVowel("apple"))
    println(startsWithVowel("Banana"))
    println(startsWithVowel("orange"))

    // 3. Lambda mengambil nilai terbesar dari dua Int
    val maxOfTwo: (Int, Int) -> Int = { a, b -> if (a > b) a else b }
    println(maxOfTwo(12, 7))
}