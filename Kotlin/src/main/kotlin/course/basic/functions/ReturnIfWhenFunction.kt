package basic.functions

/**
 * Kotlin mendukung return if dan when, fitur ini sangat mempermudah ketika ingin mengembalikan nilai dan labih masuk
 * ke logika. Ekspresi if di Kotlin digunakan sebagai ekspresi yang mengembalikan nilai, tidak hanya sebagai pernyataan.
 * Ini membuat kode lebih ringkas dan mudah dibaca. Untuk return when wajib memberikan kata kunci else dipaling akhir
 * baris kode.
 */

// membuat fungsi return if
private fun max(a: Int, b:Int) = if (a > b) a else b

// membuat fungsi return when
private fun getGrade(score: Int): String {
    return when(score) {
        in 90 .. 100 -> "A (Sangat Baik)"
        in 80 .. 89 -> "B (Baik)"
        in 70 .. 79 -> "C (Cukup)"
        in 60 .. 69 -> "D (Kurang)"
        else -> "F (Jelek)"
    }
}

fun main() {

    // membuat variabel untuk hasil fungsi
    val result1: Int = max(10, 5)
    val result2: String = getGrade(score = 100)

    // menampilkan hasil
    println()
    println("Hasil: $result1")
    println("Hasil: $result2")
    println("----------------------")

}