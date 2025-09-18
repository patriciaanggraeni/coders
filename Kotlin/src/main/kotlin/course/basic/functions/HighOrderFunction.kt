package basic.functions

/**
 * High-order function merupakan fungsi yang menerima fungsi lain sebagai parameter, mengembalikan fungsi atau bisa
 * keduanya. Penggunaan high-order function kadang berguna ketika ingin membuat fungsi yang general dan ingin mendapatkan
 * input yang fleksibel berupa lambda. Jika di bahasa pemrograman Java, konsep ini disebut dengan Functional Programming.
 */

// membuat high-order function
private fun toUppercase(value: String, transform: (String) -> String): String {
    return transform(value) // mengembalikan nilai
}

// bisa digabungkan menggunakan single expression
private fun operateTwoNumbers(a: Int, b: Int, operate: (Int, Int) -> Int) = operate(a, b)

fun main() {

    // membuat variabel untuk fungsi lambda
    val upperTransformer: (String) -> String = { value: String -> value.uppercase() }
    val operate: (Int, Int) -> Int = { a, b -> a * b }

    // memanggil fungsi high-order function
    val result1: String = toUppercase("Angga", upperTransformer)
    val result2: Int = operateTwoNumbers(100, 30, operate)

    // menampilkan hasil
    println()
    println("Hasil: $result1")
    println("Hasil: $result2")
    println("------------")

}