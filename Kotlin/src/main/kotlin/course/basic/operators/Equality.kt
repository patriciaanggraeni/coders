package basic.operators

/**
 * Equality Oparator digunakan untuk membandingkan kedua nilai apakah memiliki nilai yang sama
 * atau tidak. Operator ini sebenarnya memanggil fungsi eqluas(other: Any?). Ada dua operator equality,
 * antara lain: == (sama dengan/equality) dan != (tidak sama dengan/inequalty).
 *
 * Operator eaquality mengambalikan nilai true jika kedua nilai sama dan false jika tidak sama.
 * Operator inequality mengembalikan nilai true jika kedua nilai tidak sama dan false jika sama.
 */

fun main() {

    val x: Int = 100
    val y: Int = 100

    // menggunakan operator equality
    val result1: Boolean = x == y

    // menggunakan operator inequality
    val result2: Boolean = x != y

    // menampilkan hasil
    println()
    println("Hasil: $x == $y = $result1")
    println("Hasil: $x != $y = $result2")
    println("-------------------------")

}