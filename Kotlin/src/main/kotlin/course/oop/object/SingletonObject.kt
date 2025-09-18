package course.oop.`object`

/**
 * Singleton adalah desain pattern yang memastikan sebuah class hanya memiliki satu instance dan menyediakan cara global
 * untuk mengakses instance tersebut. Singleton berguna ketika hanya diperlukan satu instance dari sebuah class untuk
 * mengontrol akses ke resource bersama seperti database connections, file system operations, atau shared data.
 *
 * Karakteristik Singleton:
 * 1. Satu Instance: Singleton memastikan bahwa hanya ada satu instance dari class tersebut yang ada dalam aplikasi pada
 * suatu waktu.
 * 2. Private Constructor: Constructor dari singleton class biasanya dibuat private untuk mencegah pembuatan instance baru
 * dari luar class tersebut.
 * 3. Lazy Initialization (Di Kotlin): Instance dari singleton object lazily (secara malas) diinisialisasi saat pertama
 * kali digunakan.
 * 4. Global Access Point: Singleton menyediakan cara untuk mengakses instance dari mana saja dalam kode, membuatnya mudah
 * digunakan secara global.
 */

// membuat singleton objct class
private object DatabaseConnection {
    private var isConnected: Boolean = false

    fun connect() {
        isConnected = true
        println("Connected to database")
    }

    fun disconnect() {
        isConnected = false
        println("Disconnected from database")
    }

    fun isConnected(): Boolean {
        return isConnected
    }
}

fun main() {

    // tidak perlu membuat menjadi objek (statis akses)
    DatabaseConnection.connect()
    println("Is connected: ${DatabaseConnection.isConnected()}")

    // ini juga sama
    DatabaseConnection.disconnect()
    println("Is connected: ${DatabaseConnection.isConnected()}")

}
