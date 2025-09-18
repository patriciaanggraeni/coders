package basic.operators

/**
 * Operator Assertion merupakan operator yang menangani nilai null. Operator ini sebagai verifikasi bahwa nilai tersebut
 * tidak null. Jadi sangat berhubungan dengan operator nullable. Assertion menggunakan tanda (!!) setelah nama variabel.
 * Ini menegaskan bahwa variabel tersebut tidak null.
 */

fun main() {

    var x: String? = null
    x = "Hello World"

    // penggunaan operator assertion
    val result: String = x!! // jika x tidak diinisialisasi, error NullPointerException

    // menampilkan hasil
    println()
    println("Hasil: $x")
    println("------------------")

}