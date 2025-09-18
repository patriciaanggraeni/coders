package basic.control_flows

/**
 * Keyword if digunakan untuk membuat sebuah descision/keputusan sebuah kondisi. Biasanya dibarengi dengan penggunaan
 * operator perbandingan, equality dan logika. Block if akan dieksekusi jika kondisi itu benar/true dan jika salah
 * maka akan mengeksekusi block else. Block else sendiri biasanya sepaket dengan if, dan fungsinya untuk mengeksekusi
 * jika nilai dari kondisi bernilai salah/false. if juga bisa bersarang (nested if) yang mana didalam block if terdapat
 * block if lagi, bahkan block else juga bisa diberi kondisi bersarang.
 *
 * Jika ingin membuat percabangan lebih dari satu bisa menggunakan keyword else if. Ini akan dieksekusi jika block if
 * tidak memenuhi kondisi, dan jika block else if juga tidak memenuhi kondisi, maka baru block else akan dieksekusi.
 * Block else akan langsung dieksekusi jika block if tidak memenuhi kondisi dengan syarat tidak menambahkan block
 * else if.
 */

fun main() {

    var username: String? = null
    var password: String? = null
    println()

    // penggunaan if untuk pengecekan username dan password
    if (username != null) { // block if akan dieksekusi jika kondisi benar
        if (password == null) {
            println("Password tidak boleh kosong")
        }
    } else if (password != null) { // jika kondisi block if tidak terpenuhi, block else if akan dieksekusi
        if (username == null) {
            println("Username tidak boleh kosong")
        }
    } else { // jika kedua kondisi tidak terpenuhi, block else akan dieksekusi
        if (username == null && password == null) {
            println("Username dan password tidak boleh kosong!")
        } else {
            println("Berhasil login akun")
        }
    }

    println("-----------------------------------------")

}