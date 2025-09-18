package course.oop.constructors

/**
 * Kotlin mendukung secondary constructor. Constructor utama terdapat di class, disebut dengan primary constructor, dan
 * constructor tambahan disebut dengan secondary constructor. Saat membuat seondary constructor wajib memanggil primary
 * constructor jika ada primary constrcutor.
 */

class Car(
    var brand: String?,
    var price: Long?,
    var productionYear: String?
) {
    constructor(brand: String?, price: Long?) : this(brand, price, null) {
        // lakukan sesuatu di sini
        this.brand = brand
        this.price = price
        this.productionYear = null
    }

    constructor(brand: String?, productionYear: String?) : this(brand, null, productionYear) {
        // lakukan sesuatu di sini
        this.brand = brand
        this.price = null
        this.productionYear = productionYear
    }

    constructor(price: Long?, productionYear: String?) : this(null, price, productionYear) {
        // lakukan sesuatu di sini
        this.brand = null
        this.price = price
        this.productionYear = productionYear
    }

    constructor(brand: String?) : this(brand, null, null) {
        // lakukan sesuatu di sini
        this.brand = brand
        this.price = null
        this.productionYear = null
    }

    constructor(price: Long?) : this(null, price, null) {
        // lakukan sesuatu di sini
        this.brand = null
        this.price = price
        this.productionYear = null
    }

    /**
     * ketentuan: pertama: tidak boleh sama (override), kedua: jumlah paramater boleh sama tapi nama parameter harus
     * berbeda, ketiga: sebenarnya boleh tidak membuat primary constructor tapi langsung membuat secondary constructor.
     *
     */
}

// contoh tanpa primary constructor
class Address {

    private var street: String = ""
    private var province: String = ""
    private var zipCode: String = ""

    // ini sebagai primary constructor
    // nantinya akan dipanggil oleh secondary constructor di bawah
    constructor(street: String, province: String) {
        this.street = street
        this.province = province
    }

    /**
     * penjelasan singkat: dengan konsep chain constructor dan ibaratkan keyword this() seperti super, constructor ini
     * akan memanggil constructor di atas (primary constructor)
     */

    constructor(street: String, province: String, zipCode: String) : this(street, province) {
        this.zipCode = zipCode
    }

    // membuat fungsi untuk menampilkan datanya
    fun printResult() {
        println("Street: ${this.street}")
        println("Street: ${this.province}")
        println("Street: ${this.zipCode}")
    }
}

fun main() {

    // membuat objek address
    val address = Address("Wahyu Hidayat II", "East Java", "63161")

    // panggil fungsi printResult()
    address.printResult()
}