package basic.functions

/**
 * Fungsi ada dua jenis, pertama tidak mengembalikan nilai dan kedua mengembalikan nilai. Fungsi-fungsi sebelumnya
 * adalah fungsi yang tidak mengembalikan nilai. Sebenarnya fungsi-fungsi sebelumnya mengembalikan nilai [Unit]. Apa
 * itu [Unit]? [Unit] adalah tanda bahwa fungsi tidak mengembalikan nilai apa-apa (hanya menampilkan nilai). Kalau
 * disandingkan dengan basaha pemrograman Java, tipe ini disebut void. Penulisan tipe kembilian [Unit] tidak perlu
 * disebutkan secara eksplisit beda dengan tipe kembalian selain [Unit].
 *
 * Function itu bisa mengembalikan data. untuk memberitahu bahwa fungsi mengembalikan data, harus menuliskan tipe data
 * kembalian dari fungsi tersebut. Penulisan tipe kembalian fungsi ditulis setalah tanda kurung/parameter fungsi. Didahului
 * dengan tanda colon baru menuliskan tipe kembalian (sama seperti mendeklarasikan sebuah variabel). Jika telah menuliskan
 * tipe kembalian, fungsi tersebut harus wajib mengembalikan sebuah nilai, agar bisa mengembalikan sebuah nilai, gunakan
 * kata kunci return dibaris kode paling akhir di dalam fungsi dan diikuti dengan data yang ingin dikembalikan.
 *
 * Dengan menggunakan tipe kembalian/return type, fungsi tersebut dapat diassign ke dalam variabel saat pemanggilan
 * fungsi tersebut.
 */

// membuat fungsi dengan tipe kembalian Unit
private fun sayHello(name: String) { // otomatis menjadi Unit
    println("Hello, $name!")
}

// membuat fungsi dengan tipe kembalian
private fun sumTwoValues(a: Int, b: Int): Int {
    // mengembalikan nilai dari hasil penjumlahan kedua parameter
    return a + b // wajib memberikan nilai kembalian
}

fun main() {

    // membuat variabel untuk menampung hasil dari fungsi
    val result: Int = sumTwoValues(a = 19, b = 11)

    // menampilkan hasil
    println()
    sayHello(name = "Patria Anggara")
    println("Hasil: $result")
    println("----------------------")

}