package basic.functions

/**
 * Anonymous Function merupakan sebuah fungsi yang hampir sama seperti fungsi lambda, bedanya anonymous function masih
 * menggunakan kata kunci fun untuk membuat fungsinya. Lambda menganggap baris terakhir sebagai hasil kembalian, ini
 * sebenarnya kurang fleksibel, kita tidak bisa menaruh hasil kembalian di manapun (dalam lingkup fungsi). Untuk mengatasinya
 * gunakan anonymous function, fungsi ini lebih fleksibel dari lambda jika memang ingin membuat kode yang lebih kompleks.
 */

private inline fun transform(value: String, transformer: (String) -> String) = transformer(value)

fun main() {

    // jika ingin lebih fleksibel daripada lambda, bisa menggunakan anonymous function
    // masih menggunakan keyword fun, tapi tidak disertai nama fungsinya
    val anonymousFunction = fun(value: String?) = value?.uppercase() ?: "Value is null"
    val result = transform("Angga", anonymousFunction)

    // menampilkan hasil
    println()
    println("Hasil: $result")
    println("-------------")
}