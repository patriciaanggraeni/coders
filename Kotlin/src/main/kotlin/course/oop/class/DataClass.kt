package course.oop.`class`

/**
 * Data class digunakan untuk mempresentasikan sebuah data (hanya data saja), seperti bekerja dengan database. Maka
 * tabel dari database bisa dijadikan sebuah data class. Data class secara otomatis akan membuatkan fungsi [equals],
 * [hashCode], [toString], dan [copy]. Khusus fungsi copy, semua properti di primary constructor pada class tersebut
 * bisa diduplikasi dan diisi dengan nilai yang berbeda.
 */

// membuat data class
private data class DataClass(
    val merk: String? = null,
    val price: Int? = null,
    val specification: String? = null
)

fun main() {

    // membuat objek data class
    val dataClass = DataClass("ROG Street V20", 1_000_000_000, "Intel Core i11-15000UX")

    // menampilkan data
    println()
    println("Hasil: $dataClass") // toString otomatis dipanggil
    println("-------------------------------------------------")
}
