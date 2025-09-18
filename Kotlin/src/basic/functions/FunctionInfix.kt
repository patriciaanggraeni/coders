package basic.functions


/**
 * Fungsi notasi infix hampir digunakan di semua operator aritmatika, seperti +, -, *, dll. Sebenarnya saat melakukan
 * operasi terhadap dua data menggunakan operasi aritmatika, kita memanggil sebuah fungsi infix bernama fungsi [plus]
 * begitu juga dengan pengurangan/[subtract], perkalian/[times]. Fungsi infix merupakan sebuah fungsi ekstensi/anggota
 * yang bisa dipanggil menggunakan notasi infix.
 *
 * Ketika memanggil sebuah fungsi infix, tidak perlu lagi menuliskan tanda titik dan kurung. Fungsi ini membuat kode
 * lebih bersih dan mudah dibaca/dipahami, terutama ketika bekerja menggunakan operator. Biasanya kita akan mengganti
 * istilah tanda operasi menjadi tekstual agar lebih paham.
 *
 * Ada syarat untuk membuat fungsi infix, yaitu pertama: fungsi harus merupakan fungsi ekstensi/anggota, kedua: harus
 * memiliki tepat satu parameter (tidak boleh lebih), ketiga: fungsi tidak boleh memiliki default parameter. Sama
 * seperti fungsi ekstensi, fungsi infix mengakses nilai sesuai konteks menggunakan kata kunci this.
 */

// membuat fungsi notasi infix
infix fun Int.kali(value: Int): Int = this * value
infix fun Int.isGreaterThan(other: Int): Boolean = this > other

fun main() {

    val a = 100;
    val b = 50;

    // membuat variabel untuk hasil fungsi
    val result1: Int = 2 kali 6
    val result2 = if (a isGreaterThan b) { "Hasil benar: $a > $b" }
    else { "Hasil salah" }

    // menampilkan hasil
    println()
    println("Hasil: $result1")
    println("Hasil: $result2")
    println("----------------------------")

    /**
     * penjelasan singkat: angka dua akan menjadi konteksnya (di dalam fungsi diakses menggunakan this), jadi this bernilai
     * dua sedangkan angka enam merupakan nilai yang dikirim ke paramater fungsi (value).
     */

}