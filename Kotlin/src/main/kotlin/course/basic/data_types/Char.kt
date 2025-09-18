package basic.data_types

/**
 * Tipe data [Char] merupakan sebuah karakter tunggal yang mana jika sigabungkan akan menjadi sebuah [String].
 * nilai [Char] dapat dibuat menggunakan tanda kutip tunggal. Contoh: 'A', 'B', dan lainnya. Tipe data [Char] tidak
 * sama dengan [String]. Ketika mendeklarasikan variabel dengan nilai [Char] tapi menggunakan tipe data [String]
 * akan menghasilkan error. Begitu juga sebaliknya, jika menggunakan tanda kutip ganda (ini untuk [String]) dan
 * menggunakan tipe data [Char] ujungnya akan menghasilkan error.
 *
 * Uniknya tipe data [Char] bisa dikonversi menjadi kode ASCII. ASCII merupakan kode yang mempresentasikan nilai
 * [Char] tersebut.
 */

fun main() {

    // menggunakan tipe data Char
    val myChar: Char = 'A'
    val asciiCode: Int = myChar.code
    val test = (Char.MIN_VALUE).code

    // menampilkan hasil
    println("\n---> Data Type: Char")
    println("value: $myChar")
    println("ASCII: $asciiCode")
    println("Min value: ${Char.MIN_VALUE.code}")
    println("Max value: ${Char.MAX_VALUE.code}")
    println("Bits size: ${Char.SIZE_BITS} bits")
    println("Bytes size: ${Char.SIZE_BYTES} bytes")
    println("--------------------\n")

    println("Note: 1 byte sama dengan 8 bits")
    println("--------------------------------\n")

}