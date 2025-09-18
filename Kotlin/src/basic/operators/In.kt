package basic.operators

/**
 * Operator in merupakan operator yang berfungsi untuk mengecek apakah objek tersebut mengadung objek lain. Hasilnya
 * akan mengembalikan nilai [Boolean] true atau false. Jika menggunakan operator ini, sebenarnya memanggil sebuah fungsi
 * [contains]. Ada dua jenis operator in, yaitu: in ([contains]) dan !in (![contains]).
 *
 * in memanggil fungsi a.contains(b) sedangkan !in memanggil fungsi !a.contains(b).
 */

fun main() {

    val data: List<Int> = listOf(10, 30, 23, 34)

    // menggunakan operator in dan !in
    val checkData1: Boolean = 10 in data
    val checkData2: Boolean = 23 !in data

    // menampilkan hasil
    println()
    println("Hasil: 5 in ${data.joinToString()} = $checkData1")
    println("Hasil: 23 in ${data.joinToString()} = $checkData2")
    println("-----------------------------------")

}