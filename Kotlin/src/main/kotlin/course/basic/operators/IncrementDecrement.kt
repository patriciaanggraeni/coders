package basic.operators

/**
 * Kotlin mempunyai operator untuk melakukan increment dan decement nilai (menambah dan mengurangi nilai). Dengan menambahkan
 * tanda ++ (untuk increment) dan -- (untuk decrement). Gaya penulisannya sama seperti bahasa pemorgraman lainnya. Setiap
 * nilai akan ditambah/dikurangi sebanyak 1. Biasanya operator ini digunakan untuk melakukan looping. Jika melakukan operasi
 * menggunakan operator ini, kotlin memanggil fungsi [inc] dan [dec].
 *
 * a++ berarti menambahkan nilai dari variabel a sebanyak satu atau tergantung iterasi sedangkan a-- berarti mengurangi
 * nilai dari variabel a sebanyak satu atau tergantung iterasi. Nah increment dan decrement dibagi menjadi dua jenis,
 * yaitu post dan pre increment/decrement.
 *
 * Penjelasan: post berarti menambahkan operator setelah variabel sedangan pre menambahkan operator sebelum variabel. Khusus
 * post increment/decrement jika langsung ditampilkan menggunakan perintah [print]/[println], maka compiler akan memberitahukan
 * bahwa nilai yang ditambahkan tidak akan ditampilkan karena nilai tersebut ditampilkan setelah ditambahkan.
 */

fun main() {

    var x: Int = 1
    var y: Int = 1

    // contoh menggunakan operator increment dan decrement
    val inc: Int = x++ // atau x.inc()
    val dec: Int = y-- // atau y.dec()

    println()
    // jika menggunakan looping
    var initialValue = 0
    print("Hasil iterasi: ")
    while (initialValue <= 10) { print("${initialValue++} ") }

    // post dan pre increment/decrement
    val post: Int = x++ // post incement
    val pre: Int = --y  // pre decrement

    // menampilkan hasil
    println("\n")
    println("Increment: $inc")
    println("Decrement: $dec")
    println("Post-increment: $post")
    println("Pre-decrement : $pre")
    println("-------------------------------------")

}