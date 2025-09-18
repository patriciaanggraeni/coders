package basic.functions

/**
 * Single Expression Function sangat cocok untuk fungsi dengan kode yang sangat sederhana, misal di dalam fungsi tersebut
 * hanya memiliki satu baris kode saja. Jika seperti ini, kita bisa mengubahnya menjadi single expression function. Single
 * Expression Function adalah deklarasi fungsi yang hanya dengan satu baris saja. Untuk membuatnya, tidak perlu menggunakan
 * kurung kurawal, ganti kurung kurawal dengan tanda = (sama dengan) setelah setelah deklarasi nama fungsi dan tipe data
 * kembalian (jika ada). Jika memiliki tipe data kembalian, maka tidak perlu menambahkan kata kunci return. Langsung
 * tulis data yang ingin dikembalikan.
 */

// membuat single expression function
private fun sumTwoValues(a: Int, b: Int): Int = a + b

fun main() {

    // membuat variabel untuk menampung hasil fungsi
    val result: Int = sumTwoValues(10, 10)

    // menampilkan hasil
    println()
    println("Hasil: $result")
    println("----------------------")

}