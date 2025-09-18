package basic.functions

/**
 * Recursive Function merupakan fungsi yang memanggil dirinya sendiri. Contoh seperti menghitung faktorial.
 * Studi kasus ini lebih gampang jika menggunakan fungsi rekursif. Fungsi recursive sangat cocok untuk program
 * sederhana yang tidak memerlukan banyak baris kode.
 */

// contoh menghitung faktorial tanpa fungsi rekursif
private fun factorialOne(value: Int): Int {
    var result = 1
    for (i in value downTo 1) {
        result *= i
    }
    
    return result
}

// contoh menghitung faktorial dengan fungsi rekursif
private fun factorialTwo(value: Int): Int {
    return when(value) {
        1 -> 1
        else -> value * factorialTwo(value - 1)
    }
}

fun main() {

    // membuat variabel untuk hasil fungsi rekursif
    val result1: Int = factorialOne(5)
    val result2: Int = factorialTwo(5)

    // menampilkan hasil
    println()
    println("Hasil: $result1")
    println("Hasil: $result2")
    println("-------")

}