package course.oop.`class`

/**
 * Class [Any] merupakan parent dari semua class yang ada di Kotlin. Class [Any] memiliki tiga fungsi bawaan, yaitu
 * [equals], [hashCode], dan [toString]. Jadi class yang dibuat sebelumnya akan memiliki tiga fungsi tersebut. Jika di
 * Bahasa Pemrograman Java, class [Any] disebut dengan class [Object].
 */

private class Laptop(private val brand: String)   // => class Laptop() : Any()
private class Computer(private val brand: String) // => class Computer() : Any()

fun main() {

    // membuat objek dari class Laptop dan Computer
    val laptop = Laptop("Lenovo")
    val computer = Computer("Skybreak")

    // memanggil fungsi bawaan
    println()
    println("Hasil: ${laptop.toString()}")
    println("Hasil: ${laptop.equals(computer)}")
    println("Hasil: ${laptop.hashCode()}")
    println("Hasil: ${computer.hashCode()}")
    println("--------------------------------")

}