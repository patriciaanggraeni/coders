package Course.D_ObjectOrientedProgramming.A_ObjectClass;

public class Main {
    public static void main(String[] args) {

        // menginstansiasi sebuah objek baru
        // mengkoneksikan antara main class dengan class utama
        Orang orang = new Orang(); // prinsip seperti koneksi ke database

        // pamggil method di sini
        orang.tambahNama("Angga");
        orang.tambahUmur((byte) 20);
        orang.print();
    }
}
