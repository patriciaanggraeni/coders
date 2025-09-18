package basic.functions

/**
 * Function di Kotlin adalah first-class citizens, artinya dianggap sebagai tipe data yang lainnya. Bisa dimasukkan ke
 * dalam variabel, array bahkan dimasukkan kedalam parameter sebuah fungsi. Fungsi lambda/lambda expression adalah fungsi
 * yang tidak memiliki nama dan biasanya digunakan sebagai ekspresi yang dapat dilewatkan sebagai parameter fungsi lain.
 *
 * Dengan menggunakan lambda expression, tidak perlu lagi menuliskan keyword fun beserta naman fungsinya. Cukup deklarasikan
 * parameter dengan dibungkus menggunakan tanda kurung diikuti tanda panah agar bisa mereturn value. Ada beberapa peraturan
 * dalam pembuatan lambda expression: pertama, tidak perlu menuliskan nama fungsi. kedua, memberikan parameter itu opsional,
 * jadi jika menggunakan/tidak menggunakan parameter, tetap gunakan tanda kurung. ketiga, gunakan tanda panah agar fungsi
 * dalam mengembalikan nilai (pengganti kata kunci return). keempat, gunakan kurung kurawal sebagai badan fungsi. kelima,
 * jika hanya memiliki satu baris kode saja, tidak perlu menambahkan kurung kurawal.
 */

// bisa menggunakan method reference
private fun sayHello(message: String) = "Hello, $message"

// membuat fungsi lambda/lambda expression
private fun transform(value: String, transformer: (String) -> String) = transformer(value)

fun main() {

    // lambda merupakan fungsi yang tidak memiliki nama
    // atau bisa disebut anonymous function
    // (parameter) -> return value
    val lambda: (String) -> String = { value -> value.uppercase() }
    val result = lambda("Angga")
    println("Hasil: $result")

    // menggunakan method reference (mengambil referensi fungsi yang ada)
    val methodReference: (String) -> String = ::sayHello
    println("Hasil: ${methodReference("Angga")}")

    // panggil referensi method lainnya
    val transformReference: (String, (String) -> String) -> String = ::transform
    val lambdaTranform: (String) -> String = { value: String -> value.uppercase() }

    // panggil masing-masing fungsi lambda
    val transformResult1 = transformReference("Angga") { it.uppercase() }
    val transformResult2 = transformReference("Angga", lambdaTranform)

    println("Hasil: $transformResult1")
    println("Hasil: $transformResult2")
    println("------------------------")

    /**
     * penjelasan singkat: lambda tidak perlu menuliskan keyword return secara eksplisit baris terakhir dalam lambda
     * akan dianggap sebagai return value. Lambda juga bisa digunakan sebagai fungsi reference, yaitu mengambil referensi
     * fungsi lambda yang telah di deklarasikan sebelumnya dan mengambil referensinya menggunakan double colon (::).
     */

}