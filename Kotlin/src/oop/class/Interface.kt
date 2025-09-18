package course.oop.`class`

/**
 * Dalam Kotlin, interface adalah jenis class khusus yang digunakan untuk mendefinisikan kontrak, yaitu sekumpulan
 * metode dan properti yang harus diimplementasikan oleh class yang mengimplementasikan interface tersebut. Interface
 * tidak bisa mengandung state (yaitu tidak bisa memiliki properti yang menyimpan data), tetapi bisa mendeklarasikan
 * properti dan metode. Sebuah class bisa mengimplementasikan lebih dari satu interface, memungkinkan untuk mendukung
 * multiple inheritance dari perilaku.
 *
 * Karakteristik Interface di Kotlin:
 * 1. Metode dan Properti Abstrak: Interface dapat mendeklarasikan metode dan properti tanpa memberikan implementasi.
 * Class yang mengimplementasikan interface harus mengoverride metode dan properti tersebut.
 * 2. Implementasi Default: Interface di Kotlin dapat menyediakan implementasi default untuk metode. Class yang
 * mengimplementasikan interface tersebut dapat menggunakan implementasi default atau mengoverride-nya.
 * 3. Tidak Bisa Mengandung State: Interface tidak bisa memiliki properti yang menyimpan state, tetapi bisa mendeklarasikan
 * properti yang harus diimplementasikan oleh class.
 */

private interface Animal {
    val name: String
    fun sound(): String
}

private class Dog(override val name: String) : Animal {
    override fun sound() = "Woof"
}

private class Cat(override val name: String) : Animal {
    override fun sound() = "Meow"
}

/**
 * tambahan: Interface di Kotlin bisa menyediakan implementasi default untuk metode. Class yang mengimplementasikan
 * interface tersebut bisa menggunakan implementasi default atau mengoverride-nya.
 *
 */

private interface Vehicle {

    // beri body agar class implementasi tidak wajib mengoverride
    fun start() {
        println("Vehicle started")
    }

    fun stop() {
        println("Vehicle stopped")
    }
}

private class Cars : Vehicle {
    override fun start() {
        println("Car started")
    }
}

private class Bike : Vehicle

fun main() {
    val dog: Animal = Dog("Buddy")
    val cat: Animal = Cat("Whiskers")

    println("${dog.name} says ${dog.sound()}")
    println("${cat.name} says ${cat.sound()}")
}
