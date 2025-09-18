package basic

/**
 * Variabel merupakan sebuah container yang memiliki fungsi untuk menyimpan sebuah data. Setiap variabel
 * mempunyai alamat di memori.
 *
 * Kotlin mempunyai dua cara untuk mendeklarasikan variabel yaitu menggunakan keyword var dan val
 * lalu diikuti dengan nama dari variabel. var berarti variabel tersebut bersifat mutable/bisa dirubah,
 * jika val berarti variabel tersebut bersifat immutable/tidak bisa dirubah/fiks, atau lebih tepatnya
 * hanya bisa diassign nilai sekali saja sedang var bisa diassign kembali.
 *
 * Di Kotlin, variabel mendukung yang namanya Inference Type. Apa itu? sebuah konsep yang mana sebuah
 * variabel bisa mendeteksi tipe data secara otomatis. Gampangnya jika tidak menuliskan tipe data secara
 * eksplisit, maka variabel tersebut akan mempunyai tipe inference.
 *
 * Mendeklarasikan variabel di Kotlin sangat mudah. Deklarasi nama dan tipe data dipisah menggunakan
 * tanda colon/titik dua (:). Berikut patternnya:
 *
 * [[type]] [[name]]: [[data_type]] = [[values]]
 */

fun main() {

    // mendeklarasikan variabel
    val x: Int
    val y: String

    // membuat mutable variabel
    var data1: Int = 0
    data1 = 100 // tidak error

    // membuat immutable variabel
    val data2: Int = 10
    // data2 = 92 // error

    // menampilkan hasil
    println("Data pertama: $data1")
    println("Data kedua  : $data2")
}