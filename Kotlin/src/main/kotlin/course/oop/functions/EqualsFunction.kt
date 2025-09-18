package course.oop.functions

/**
 * Di Kotlin semua objek bisa dibandingkan menggunakan operasi == dan !=. Saat membanfingkan objek menggunakan kedua
 * operasi tersebut, sebenarnya Kotlin memanggil fungsi equals() milik class [Any]. Untuk mengubah cara membandingkannya,
 * override fungsi equals().
 */

private class Animal1(val name: String)

private class Animal2(val name: String) {

    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Animal2 -> name == other.name
            else -> false
        }
    }

}

fun main() {

    // membuat object animal
    val animal1 = Animal1("Singa")
    val animal2 = Animal1("Singa")

    val animal3 = Animal2("Harimau")
    val animal4 = Animal2("Tapir")

    // membandingkan tanpa menggunakan fungsi equals
    val result1 = animal1 == animal2 // false (objek tidak sama)
    val result2 = animal1 == animal1 // true  (objek sama)
    val result3 = animal2 == animal2 // true  (objek sama)

    val result4 = animal3 == animal4 // false (nilai tidak sama)
    val result5 = animal3 == animal3 // true  (nilai sama)
    val result6 = animal4 == animal4 // true  (nilai sama)

    // menampilkan hasilnya
    println("Reasult: $result1")
    println("Reasult: $result2")
    println("Reasult: $result3")

    println("Reasult: $result4")
    println("Reasult: $result5")
    println("Reasult: $result6")

}