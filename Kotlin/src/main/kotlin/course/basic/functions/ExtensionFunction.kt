package basic.functions

/**
 * Extension Function adalah kemampuan menambahkan fungsi ke class yang sudah ada tanpa harus mewarisi class tersebut.
 * Ini merupakan fitur yang terbilang powerfull karena dapat menambahkan fungsionalitas pada class tersebut sebagai
 * pihak ketiga atau class yang tidak dapat dimodifikasi. Untuk membuat extension function, cukup menambahkan tipe data
 * pada nama fungsi lalu diikuti dengan tanda . (titik).
 *
 * Perlu diingat, jika menggunakan fungsi ekstensi akan mengasilkan sebuah konteks yang mana jika ingin mengaksesnya
 * menggunakan kata kunci this. Konteks disini mengacu pada tipe data fungsi yang digunakan.
 */

// membuat fungsi ekstensi
fun String.isPolindrome(): Boolean = this == this.reversed()

fun main() {

    // membuat variabel untuk hasil fungsi
    val isPolindrome: Boolean = "kasur rusak".isPolindrome()
    var result: String

    // membuat kondisi
    if (isPolindrome) result = "Kalimat tersebut polindrome"
    else result = "Tidak polindrome"

    // menampilkan hasil
    println()
    println("Hasil: $result")
    println("----------------------------------")

    /**
     * penjelasan singkat: kata kunci this akan mengambil nilai sesuai tipe datanya, misal "kasur rusak".isPolindrome(),
     * maka this akan mengambil nilai dari string (sesuai tipe data dan konteks), yaitu "kasur rusak".
     */

}