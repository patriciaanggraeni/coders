package Course.C_StrandardClasses.D_BigNumber;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        /*
        *
        * di Java bisa menggunakan tipe data Big Number, ini berfungsi jika tipe data long dan double
        * sudah tidak bisa menampung nilai yang ada
        *
        * ada dua tipe data big number, yaitu:
        * - BigInteger: berguna jika tipe data long sudah melebihi kapasitas
        * - BigDecimal: berguna jika tipe data double sudah melebihi kapasitas
        *
        * karena bukan class number seperti biasanya, untuk operasi sendiri menggunakan
        * fungsi antara lain:
        *
        * - add untuk operator tambah ( + )
        * - subtract untuk operator kurang ( - )
        * - multiply untuk operator kali ( * )
        * - divide untuk operator bagi ( / )
        * - mod untuk operator modulus ( % )
        *
        * untuk parameter di dalam fungsi BigInteger/Decimal menggunakan string
        * */

        // cara pembuatan class BigInteger dan BigDecimal
        BigInteger a = new BigInteger("10000000000000000000000000000000000000000000");
        BigDecimal b = new BigDecimal("10000000000000000000000000000000000000000000");
        BigInteger d = b.toBigInteger();

        BigInteger c = a.add(d);
        System.out.println("Hasil penjumlahan: " + c);

    }
}
