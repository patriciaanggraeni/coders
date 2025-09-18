package course.oop.properties

/**
 * Di Kotlin bisa langsung membuat properti langsung di primary constructornya. Tidak seperti di Bahasa Pemrograman Java,
 * yang mana membuat properti di dalam class lalu membuat constructor lagi untuk memasukkan nilai ke dalam properti, di
 * Kotlin tidak perlu seperti ini. Di Kotlin cukup membuat properti langsung di primary constrcutornya, ini sangat berguna
 * untuk meyingkat kode.
 *
 * Properties Constructor bias diisi dengan nilai default layaknya parameter fungsi. Jika tidak mengisikannya menggunakan
 * nilai default, maka saat pembuatan objek, nilai parameter constructor wajib diisi. Properties Constructor juga bisa
 * ditambahkan kata kunci visibility (seperti private) agar variabel tidak bisa diakes sembarangan.
 */

private class Laptop(
    private var name: String? = null,
    private var processor: String? = null,
    private var ram: Byte? = null,
    private var memory: Short? = null
) {

    init {
        this.name = "Lenovo ThinkPad X260"
        this.processor = "Intel i5-6000U"
        this.ram = 8
        this.memory = 256
    }

    // membuat fungsi getter
    fun getName() = this.name
    fun getProcessor() = this.processor
    fun getRam() = this.ram
    fun getMemory() = this.memory

}

fun main() {

    // membuat objek class Latop
    val laptop = Laptop()

    // menampilkan hasil
    println("\n------ Spesifikasi Laptop ------")
    println("Nama     : ${laptop.getName()}")
    println("Processor: ${laptop.getProcessor()}")
    println("RAM      : ${laptop.getRam()}")
    println("Memory   : ${laptop.getMemory()}")
    println("--------------------------------")

}