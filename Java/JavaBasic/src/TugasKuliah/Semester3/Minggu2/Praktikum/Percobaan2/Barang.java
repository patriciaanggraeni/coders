package TugasKuliah.Semester3.Minggu2.Praktikum.Percobaan2;

public class Barang {

    public String namaBarang;
    public String jenisBarang;
    public int stok;

    Barang() {}

    public void tampilBarang() {
        System.out.println("Nama Barang  : " + namaBarang);
        System.out.println("Jenis Barang : " + jenisBarang);
        System.out.println("Stok : " + stok);
    }

    public int tambahStok(int barangMasuk) {
        int stokBaru = barangMasuk + stok;
        return stokBaru;
    }
}