package Course.C_StrandardClasses.C_MathClass;

public class Main {
    public static void main(String[] args) {

        /*
        *
        * Math Class di java, untuk mendukung kalkulasi matematika atau numerik di Java
        * banyak method yang teah tersedia di java untuk math class ini sendiri
        * sifat dari semua fungsi dari class math adalah statis
        *
        * contoh beberapa fungsi math class:
        * - min / max
        * - PI
        * - cos, sin , tan
        * - dan lainnya
        * */

        // contoh mengambil nilai terkeci dan terbesar dengan min / max.
        var min = Math.min(1000, 5000);
        var max = Math.max(10039, 7883);

        var hasil = min + max;
        System.out.println("Hasil penjumlahan: " + hasil);

    }
}
