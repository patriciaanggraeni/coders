package basic.operators

/**
 * Operator unary merupakan sebuah operator prefiks (awalan) yang hanya membutuhkan satu operand untuk melakukan
 * operasi.Operand bisa berupa variabel, konstanta atau ekspresi. Operator unary digunakan untuk melakukan perubahan
 * nilai atau tindakan tertentu pada operand yang diberikan. Ada tiga operator unary di Kotlin, yaitu + (positif), - (negatif)
 * dan ! (negasi/kebalikan). Operator negasi digunakan untuk operasi [Boolean].
 *
 * Operator unary + akan menghasilkan nilai plus/positif, ini sebenarnya memanggil fungsi unaryPlus()
 * Operator unary - akan menghasilkan nilai minus/negatif, ini sebenarnya memanggil fungsi unaryMinus()
 * Operator unary ! akan menghasilkan nilai kebalikan, ini sebenarnya memanggil fungsi not()
 */

fun main() {

    // menggunakan opearor plus/positif
    val positif: Int = +10

    // menggunakan opearor plus/negatif
    val negatif: Int = -10

    // menggunakan opearor plus/negasi
    val negasi: Boolean = !true

    // menampilkan hasil
    println()
    println("Hasil (positif): $positif")
    println("Hasil (negatif): $negatif")
    println("Hasil (negasi) : $negasi")
    println("----------------------")

}