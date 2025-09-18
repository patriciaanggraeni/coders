package course.oop.constructors

/**
 * Kata kunci super tidak hanya bisa digunakan untuk mengakses function atau properties di class Parent. Kata kunci
 * super bisa digunakan untuk mengakses constructor class Parent. Mengakses constructor class Parent hanya bisa di
 * lakukan di dalam class child. Ini berguna ketika superclass memiliki constructor yang mengambil parameter dan perlu
 * mengisi parameter tersebut saat membuat instance dari subclass.
 *
 * Dengan menggunakan super constructor, data dapat diisi lewat subclassnya, ini berlaku jika parent class dibuat abstract
 * dan tidak dapat dibuat instance. Ini berpengaruh dalam kemudahan pemeliharaan kode di mana jika ada perubahan terhadap
 * constructor superclass, perubahan tersebut otomatis diterapkan ke semua subclass yang memanggil super constructor.
 */

private open class User(open val name: String, open val email: String) {
    open fun print() {
        println("Name: $name")
        println("Email: $email")
    }
}

private class Student(override val name: String, override val email: String, val grade: Int) : User(name, email) {

    // atau bisa menambahkan secondary constructor (opstional)
    // constructor() : super("Bagas", "bagas32@gmail.com", 75)
    // tambahkan constructor lain...

    override fun print() {
        super.print()
        println("Grade: $grade")
    }
}

// atau bisa begini
private open class Shape(val name: String, val shape: Int, val color: String) {
    constructor(name: String, shape: Int) : this(name, shape, "")
    constructor(name: String) : this(name, 4)
}

// menggunakan gaya Java
private class Rectangle : Shape {

    // menggunakan keyword super untuk mengakses parent constructor
    constructor() : super("Rectangle", 4, "Red") // menggunakan primary constructor child
    constructor(name: String) : super(name, 4, "Blue") // secondary constructor parent digunakan
    constructor(name: String, shape: Int, color: String) : super(name, shape, color) // primary constructor parent digunakan

    fun print() {
        println("Name : $name")
        println("Shape: $shape")
        println("Color: $color")
    }
}

fun main() {

    println()

    // membuat objek dari class child dari User (class Student)
    val student = Student("Bagas", "bagas32@gmail.com", 75)

    // membuat objek dari class child dari Shape (class Rectangle)
    val rectangle = Rectangle()
    // val rectangle = Rectangle("Rectangle")
    // val rectangle = Rectangle("Rectangle", 4, "Green")

    // menampilkan hasil
    student.print()
    rectangle.print()

    println("========================================")

}