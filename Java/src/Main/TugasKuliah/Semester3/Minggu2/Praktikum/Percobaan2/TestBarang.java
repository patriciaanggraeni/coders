package TugasKuliah.Semester3.Minggu2.Praktikum.Percobaan2;

public class TestBarang {
    public static void main(String[] args) {

        Barang brg1 = new Barang();

        brg1.namaBarang = "Pensil";
        brg1.jenisBarang = "ATK";
        brg1.stok = 10;
        brg1.tampilBarang();

        System.out.println("Stok baru adalah " + brg1.tambahStok(20));
    }
}
