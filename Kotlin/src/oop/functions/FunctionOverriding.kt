package course.oop.functions

/**
 * Jika bekerja menggunakan pewarisan, maka tidak asing lagi yang namanya Function Overriding. Function overriding
 * memungkinkan child class memiliki fungsi dengan nama yang sama dengan fungsi di parent class akan tetapi bisa
 * jadi memiliki kelakuan yang berbeda. Maksudnya nama fungsi sama tapi dengan isi dan output yang berbeda. Karena
 * child class pasti memiliki karakteristik yang lebih spesifik dari parent class-nya.
 *
 * Sama seperti melakukan pewarisan class, fungsi di Kotlin secara default adalah final, jika ingin melakukan overriding
 * di child class, gunakan kata kunci open.
 */

// membuat parent class
private open class Employee(private val name: String) {

    // child class akan mewarisi method dari parent classnya
    open fun sayHello(name: String) {
        println("Hello $name, My name is ${this.name}")
    }

}

// membuat child class
private class Manager(private val name: String) : Employee(name) {

    override fun sayHello(name: String) {
        println("Hello $name, My name is ${this.name}. I'm Manager.")
    }

}

private class Staff(private val name: String) : Employee(name) {

    override fun sayHello(name: String) {
        println("Hello $name, My name is ${this.name}. I'm Staff.")
    }

}

fun main() {

    // membuat objek child class
    val manager = Manager("Angga")
    val staff = Staff("Kiko")

     // memanggil method/fungsi yang diwariskan oleh parent class
    println()
    manager.sayHello("Johan")
    staff.sayHello("Hina")
    println("-------------------------------------------")



}