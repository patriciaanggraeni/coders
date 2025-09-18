package basic.functions

/**
 * Function (fungsi) adalah sebuah blok kode yang dibuat, dipanggil lalu digunakan dalam program berkali-kali (reuseable). Digunakan
 * untuk mengelompokan atau mengemas sebuah kode agar terlihat rapi dan bersih, dan kumpulan kode tersebut digunakan untuk
 * melakukan tugas tertentu. Cara membuat function di kotlin didefinisikan dengan kata kunci fun diikiuti nama function dan
 * blok kode dengan membungkusnya menggunakan tanda kurung kurawal {}. Setelah membuat function, bisa memanggilnya dengan
 * menggunakan kata kunci nama fungsi tersebut.
 */

// membuat sebuah fungsi
private fun printSomething() {
    // isikan sebuah kode...
    println()
    println("Menampilkan pesan teks dari fungsi")
    println("----------------------------------")
}

fun main() {

    // panggil fungsi di sini
    printSomething()

}