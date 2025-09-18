package basic.functions.parameters

/**
 * Sebuah fungsi yang memiliki parameter wajib diisi. Namun jika diberi nilai default pada parameter tersebut, hal ini
 * akan menjadi opsional. Kotlin memungkinkan untuk memberi nilai default pada parameter fungsi. Apa itu nilai default?
 * nilai default merupakan nilai yang telah diinisialisasikan sebelumnya. Untuk memberikan nilai default pada parameter
 * cukup mengassign nilai secara langsung setelah menulis tipe data parameter. Parameter tersebut akan menjadi parameter
 * opsional (tidak wajib diisi), tapi jika memasukkan ulang data ke dalam parameter yang diberi nilai default saat
 * memanggil fungsinya, maka nilai default akan tergantikan dengan nilai yang bari dimasukkan. Default parameter sangat
 * cocok pada jenis parameter yang sekiranya memang tidak wajib untuk diisi.
 */

// membuat fungsi dengan default parameter
private fun sayHello(firstName: String? = null, lastName: String? = null) {
    println()
    if (firstName != null && lastName == null) println("Hello, $firstName!")
    else println("Hello, $firstName $lastName!")
    println("----------------------")
}

fun main() {

    // panggil fungsi di sini (default parameter opsional)
    sayHello("Patria") // tidak mengisi parameter lastName

}