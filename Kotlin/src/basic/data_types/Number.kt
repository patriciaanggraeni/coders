package basic.data_types

/**
 * Tipe data number di Kotlin dibagi menjadi dua jenis, yaitu bilangan bulat dan pecahan.
 * Bilangan bulat antara lain: [Byte], [Short], [Int], [Long]
 * Bilangan pecahan antara lain: [Float] dan [Double]
 *
 * Ada juga tipe data yang bisa memuat kedua jenis bilangan di atas, yaitu [Number]. Tipe data [Number]
 * merupakan parent dari semua tipe data bilangan, karena itulah dia bisa menyimpan kedua jenis tipe data
 * tersebut. Setiap tipe data bilangan bisa menyimpan nilai negatif dan positif.
 *
 * Di Kotlin sebenarnya juga bisa menyimpan hanya nilai positif (tidak negatif) atau bisa disebut unsigned type.
 * Dengan menggunakan menambahkan huruf U didepan nama tipe data, seperti [UByte], [UShort], [UInt]. dan [ULong], maka
 * variable yang dideklarasikan tidak akan bisa diisi dengan angka negatif. Tapi dengan menggunakan unsigned type,
 * variabel dapat menyimpan 2x lipat lebih banyak dari biasanya. Misal [Int] memiliki range nilai 2_000_000_000 (2 milyar),
 * maka jika menggunakan unsigned type seperti [UInt] variabel tersebut dapat menyimpan nilai hingga 4_000_000_000 (4 milyar).
 *
 * Untuk bilangan pecahan, bisa menggunakan [Float] dan [Double], bedanya hanya diukuran tipe datanya. [Double] bisa menampung
 * nilai lebih banyak dari [Float]. Oh ya, khusus tipe data [Float] dan [Long], tambahkan huruf f/F untuk tipe data [Float] dan
 * L untuk tipe data [Long]. Ini berguna untuk mengindikasikan tipe data apa yang dipakai. Jika menggunkan tipe data [ULong], maka
 * tambahkan saja huruf U sebelum L, contoh 3_xxx_xxx_xxx_xxxUL.
 *
 * Penggunaannya terserah mau pakai yang mana (huruf kecil/besar), tapi disarankan menggunakan huruf besar. Untuk [Long] memang
 * hanya diberi opsi menggunakan huruf besar, beda dengan [Float] yang bisa menggunkaan huruf kecil/besar. Ukuran bytes antara
 * Tipe data signed dan unsigned sama, yang berubah range nilai yang dapat di simpan.
 *
 * Note: semua tipe data memiliki batas nilai yang dapat ditampung.
 */

fun main() {

    // penggunaan tipe data Byte dan UByte
    val signedByte: Byte = 127
    val unsignedByte: UByte = 200U // jika memasukkan nilai negatif akan error

    // penggunaan tipe data Short dan UShort
    val signedShort: Short = 32000
    val unsignedShort: UShort = 50000U // jika memasukkan nilai negatif akan error

    // penggunaan tipe data Int dan UInt
    val signedInt: Int = 2000000000
    val unsignedInt: UInt = 4000000000U // jika memasukkan nilai negatif akan error

    // penggunaan tipe data Long dan ULong
    val signedLong: Long = 9000000000000000000L
    val unsignedLong: ULong = 18000000000000000000UL // jika memasukkan nilai negatif akan error

    // penggunaan tipe data Float dan UFloat
    val float: Float = 9.8F // bisa menggunakan huruf f kecil

    // penggunaan tipe data Double dan UDouble
    val double: Double = 10.3 // tidak perlu menambahkan huruf f/F

    // penggunaan tipe data Number
    val number1: Number = 1000  // bisa diisi bilangan bulat
    val number2: Number = 30.43 // bisa diisi bilangan pecahan

    // menampilkan hasil
    println("\n---> Non-unsigned Byte")
    println("Value: $signedByte")
    println("Min value : ${Byte.MIN_VALUE}")
    println("Max value : ${Byte.MAX_VALUE}")
    println("Bits size : ${Byte.SIZE_BITS} bits")
    println("Bytes size: ${Byte.SIZE_BYTES} bytes")

    println("\n---> Unsigned Byte")
    println("Value: $unsignedByte")
    println("Min value : ${UByte.MIN_VALUE}")
    println("Max value : ${UByte.MAX_VALUE}")
    println("Bits size : ${UByte.SIZE_BITS} bits")
    println("Bytes size: ${UByte.SIZE_BYTES} bytes")
    println("-------------------------------------")

    println("\n---> Non-unsigned Short")
    println("Value: $signedShort")
    println("Min value : ${Short.MIN_VALUE}")
    println("Max value : ${Short.MAX_VALUE}")
    println("Bits size : ${Short.SIZE_BITS} bits")
    println("Bytes size: ${Short.SIZE_BYTES} bytes")

    println("\n--->Unsigned Short")
    println("Value: $unsignedShort")
    println("Min value : ${UShort.MIN_VALUE}")
    println("Max value : ${UShort.MAX_VALUE}")
    println("Bits size : ${UShort.SIZE_BITS} bits")
    println("Bytes size: ${UShort.SIZE_BYTES} bytes")
    println("-------------------------------------")

    println("\n---> Non-unsigned Int")
    println("Value: $signedInt")
    println("Min value : ${Int.MIN_VALUE}")
    println("Max value : ${Int.MAX_VALUE}")
    println("Bits size : ${Int.SIZE_BITS} bits")
    println("Bytes size: ${Int.SIZE_BYTES} bytes")

    println("\n---> Unsigned Int")
    println("Value: $unsignedInt")
    println("Min value : ${UInt.MIN_VALUE}")
    println("Max value : ${UInt.MAX_VALUE}")
    println("Bits size : ${UInt.SIZE_BITS} bits")
    println("Bytes size: ${UInt.SIZE_BYTES} bytes")
    println("-------------------------------------")

    println("\n---> Non-unsigned Long")
    println("Value: $signedLong")
    println("Min value : ${Long.MIN_VALUE}")
    println("Max value : ${Long.MAX_VALUE}")
    println("Bits size : ${Long.SIZE_BITS} bits")
    println("Bytes size: ${Long.SIZE_BYTES} bytes")

    println("\n---> Unsigned Long")
    println("Value: $unsignedLong")
    println("Min value : ${ULong.MIN_VALUE}")
    println("Max value : ${ULong.MAX_VALUE}")
    println("Bits size : ${ULong.SIZE_BITS} bits")
    println("Bytes size: ${ULong.SIZE_BYTES} bytes")
    println("-------------------------------------")

    println("\n---> Data Type: Float")
    println("Value: $float")
    println("Min value : ${Float.MIN_VALUE}")
    println("Max value : ${Float.MAX_VALUE}")
    println("Bits size : ${Float.SIZE_BITS} bits")
    println("Bytes size: ${Float.SIZE_BYTES} bytes")
    println("-------------------------------------")

    println("\n---> Data Type: Double")
    println("value: $double")
    println("Min value : ${Double.MIN_VALUE}")
    println("Max value : ${Double.MAX_VALUE}")
    println("Bits size : ${Double.SIZE_BITS} bits")
    println("Bytes size: ${Double.SIZE_BYTES} bytes")
    println("-------------------------------------")

    println("\n---> Data Type: Number")
    println("Tipe data Number [bulat]  : $number1")
    println("Tipe data Number [pecahan]: $number2")
    println("-------------------------------------\n")

    println("Note: 1 byte sama dengan 8 bits")
    println("-------------------------------------\n")

}