package basic.operators

/**
 * Operator logika digunakan untuk mengatur logika dari program yang dibuat, apakah program tersebut dieksekusi atau tidak.
 * Ada tiga jenis operator logika di Kotlin, antara lain: AND (&&) dan OR (||).
 *
 * Operator AND akan menghasilkan nilai true jika kedua nilai benar dan false jika salah satu salah.
 * Operator OR akan meghasilkan nilai true jika salah satu nilai benar dan false jika kedua nilai salah.
 */

fun main() {

    val x: Int = 20
    val y: Int = 12
    val z: Int = 4
    var result: Boolean = false

    println()
    println("---> Opearator AND")
    result = x > y && x > z
    println("Hasil: ($x > $y) && ($x > $z) = $result")

    result = x < y && x > y
    println("Hasil: ($x < $y) && ($x > $z) = $result")
    println("------------------------------------\n")

    println("---> Opearator OR")
    result = x > y || x < z
    println("Hasil: ($x > $y) || ($x > $z) = $result")

    result = y < x || z < x
    println("Hasil: ($x < $y) || ($x > $z) = $result")
    println("------------------------------------\n")

}