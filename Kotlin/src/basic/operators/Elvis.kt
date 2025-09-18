package basic.operators

/**
 * Elvis operator digunakan untuk menyingkat pengecekan yang biasanya menggunakan keyword if. Tapi khusus operator
 * elvis digunakan untuk pengecekan variabel yang memiliki nilai null. Operator elvis menggunakan tanda ?: untuk
 * melakukan pengecekan. Mengembalikan nilai jika null dan tidak null.
 *
 * Contoh penulisan: val check = object ?: null. Penjelasan: sebelah kiri mengembalikan nilai jika variabel yang
 * dicek ada isinya/tidak null, lalu disebelah kanan mengembalikan nilai null (bisa lainnya tergantung tipe data)
 * jika variabel tersebut bernilai null. Mirip seperti operator ternary yang umum digunakan oleh bahasa pemrograman
 * lain yang mana di sebelah kiri mengembalikan nilai true dan disebelah kanan mengembalikan nilai false.
 */

fun main() {

    // penggunaan elvis bertujuan untuk menyinkat sintaks dari if else
    // contoh jika menggunakan if else
    val data: String? = "Hello World"
    if (data != null) println(data.length)
    else println(data)

    // contoh jika menggunakan operator elvis
    val result = data ?: throw IllegalStateException()

    // menampilkan hasil
    println(result)

}