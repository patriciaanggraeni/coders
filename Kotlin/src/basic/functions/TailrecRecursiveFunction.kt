package basic.functions

/**
 * Masalah yang cukup serius ketika menggunakan fungsi rekursif adalah ketika fungsi tersebut sudah memanggil dirinya
 * sendiri terlalu dalam akan mengalami error stack overflow, inilah batasan jika menggunakan fungsi rekursif. Jika di
 * bahasa pemrograman Java masalah ini tidak bisa ditangani, namun dikotlin ada solusinya yaitu dengan menggunakan
 * tailrec (tail recursif function), ini akan merupakan fungsi rekursif menjadi looping biasa ketika dijalankan.
 *
 * Tidak semua fungsi rekursif bisa dijadikan tailrec function, ada syaratnya. Syaratnya tambahkan kata kunci tailrec dan
 * saat fungsi dirinya sendiri itu dipanggil, hanya boleh memanggil fungsi itu sendiri tanpa menambahkan embel-embel
 * operasi dengan data lain.
 */

// membuat fungsi biasa tanpa tailrec
private fun factorialOne(value: Int): Int {
    var result = 1
    for (i in value downTo 1) {
        result *= i
    }
    return result
}

// membuat fungsi menggunakan tailrec
private tailrec fun factorialTwo(value: Int, total: Int = 1): Int {
    return when(value) {
        1 -> total
        else -> factorialTwo(value - 1, total * value)
    }
}

fun main() {

    // membuat variabel untuk hasil fungsi rekursif
    val result1: Int = factorialOne(5)
    val result2: Int = factorialTwo(10)

    // menampilkan hasil
    println()
    println("Hasil: $result1")
    println("Hasil: $result2")
    println("--------------")

}