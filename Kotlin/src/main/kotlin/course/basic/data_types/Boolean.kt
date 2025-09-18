package basic.data_types

/**
 * Tipe data [Boolean] hanya memiliki dua nilai yaitu true atau false (benar/salah). Nilai [Boolean] jika
 * direpresentasikan menjadi nilai [Int] menjadi 0 atau 1. Di mana 0 itu salah dan 1 itu benar. [Boolean]
 * biasanya digunakan untuk control flow/mengontrol aliran program seperti kondisi.
 *
 * [Boolean] sangat berguna untuk membuat perbacangan if, looping dan operasi logika.
 */

fun main() {

    // menggunakan tipe data bolean
    val booleanTrue: Boolean = true
    val booleanFalse: Boolean = false

    // menampilkan hasil
    println("\n--> Data Type: Boolean")
    println("Value: $booleanTrue") // atau 0
    println("Value: $booleanFalse") // atau 1
    println("----------------------\n")

}