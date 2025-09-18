package course.oop.functions

/**
 * Function Overloading adalah kemampuan membuat function dengan nama yang sama akan tetapi dengan tipe atau jumlah
 * parameter yang berbeda di dalam sebuah class atau ruang lingkup yang sama. Prinsipnya, nama fungsi harus sama dan
 * fungsi-fungsi tersebut harus memiliki paramter tang berbeda, baik jumlah atau tipe.
 *
 * Untuk return type tidak boleh beda, return type tidak mempengaruhi overloading, jadidua fungsi dengan nama dan parameter
 * yang sama tetapi dengan return type yang berbeda tidak bisa di-overload. Intinya jika ingin menggunakan return type,
 * type returnnya dari fungsi yang dioverload harus sama.
 */

private class Student(val name: String) {

    // membuat fungsi overloading
    fun sayHello(firstName: String) {
        println("Hello $firstName, my name is $name")
    }

    fun sayHello(firstName: String, lastName: String) {
        println("Hello $firstName $lastName, my name is $name")
    }
}

fun main() {

    println()

    // membuat objek dari class Student
    val student = Student("Angga")

    // memanggil fungsi overloading dan menampilkan hasil
    student.sayHello(firstName = "Anata")
    student.sayHello(firstName = "Jane", lastName = "Mercury")

    println("===================================")

}