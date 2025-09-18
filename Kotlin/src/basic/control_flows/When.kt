package basic.control_flows

/**
 * Selain menggunakan if untuk membuat sebuah keputusan, di Kotlin terdapat sebuah keyword yang memiliki cara kerja
 * yang sama akan tetapi lebih simple, yaiu keyword when. Keyword ini sama seperti switch di bahasa pemrograman Java.
 * Biasanya digunakan untuk pengecekan ke kondisi dalam satu variabel. when otomatis akan mereturn/mengembalikan nilai
 * jika kondisi benar. Menggunakan tanda -> sebagai indikasi nilai yang akan dikembalikan (seperti penggunaan lambda).
 *
 * Jika statement/kode yang dikembalikan hanya satu baris, tidak perlu menambahkan kurung kurawal dan jika sebaliknya
 * gunakan kurung kurawal. when wajib menambahkan keyword else di akhir baris kondisi.
 */

fun main() {

    val grade: Char = 'E'

    // contoh penggunaan when
    val result: String = when(grade) {
        'A' -> "Luar biasa"
        'B' -> "Baik"
        'C' -> "Cukup Baik"
        'D' -> "Jelek"
        'E' -> "Sangat Jelek"
        else -> "Nilai tidak terdaftar!"
    }

    // menampilkan hasil
    println()
    println("Nilai kamu $grade, $result.")
    println("---------------------------")

}