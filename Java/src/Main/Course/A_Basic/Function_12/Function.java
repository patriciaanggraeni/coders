package Course.A_Basic.Function_12;

public class Function {

    // Ada fungsi tanpa kembalian dan dengan kembalian
    // membuat fungsi tanpa kembalian
    static void tampilkanText(String nama) {
        System.out.println("Hello World");
        System.out.println("Halo " + nama + " Semangat codingnya!\n");
    }

    // membuat fungsi dengan kembalian
    static int hitungLuas(int s) {
        int luas;
        luas = s * s;

        return luas;
    }

    // menampilkan hasil dengan memanggil fungsi didalam fungsi lainnya
    static void tampilLuas() {
        int tampil = hitungLuas(10);
        System.out.println("Hasil luas: " + tampil);
    }

    public static void main(String[] args) {

        int hasil = hitungLuas(5);
        String nama = "Angga";

        // panggil fungsi
        tampilkanText(nama);

        System.out.println("Hasil luas: " + hitungLuas(4));
        System.out.println("Hasil luas: " + hasil);
        tampilLuas();
    }
}
