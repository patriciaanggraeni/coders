package course.oop.`class`

/**
 * Abstract class merupakan class yang tidak konkret atau tidak bisa dijadikan objek. Class ini hanya bisa digunakan
 * sebagai blueprint dari child classnya. Hal ini untuk mengurangi penggunaan kode, misal saat membuat parent class
 * dan class tersebut diturunkan ke child class, maka parent class sebenarnya tidak perlu digunakan lagi, cukup
 * gunakan child class yang bisa disebut versi upgrade dari parent class (lebih spesifik).
 *
 * Untuk membuat class abstract, cukup menambahkan kata kunci abstract sebelum kata kunci class (paling awal).
 */

private abstract class Location(open val name: String)
private class City(override val name: String) : Location(name) {

    fun showCity() {
        println()
        println("Kota saat ini: ${this.name}")
        println("---------------------------")
    }

}

fun main() {

    // membuat obek dari class City
    val city = City("Madiun")

    // memanggil fungsi dari child class
    city.showCity()

}