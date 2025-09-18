package course.oop.properties

/**
 * Di Kotlin selain melakukan override terhadap fungsi juga bisa melakukan override properti. Memiliki mekanisme yang
 * sama dengan override fungsi, yang mana namanya sama akan tetapi isi boleh berbeda. Properti juga secara default
 * adalah final jadi jika ingin dioverride gunakan kata kunci open.
 */

private open class Shape() {
    open val corner: Int = 0
}

private open class Rectangle() : Shape() {
    override val corner: Int = 4
}

private class Triangle() : Shape() {
    override val corner: Int = 3
}

fun main() {

    // membuat objek Retangle dan Triangle
    val rect = Rectangle()
    val triangle = Triangle()

    // menampilkan hasil
    println()
    println("Jumlah sudut Persegi : ${rect.corner}")
    println("Jumlah sudut Segitiga: ${triangle.corner}")
    println("------------------------")

}