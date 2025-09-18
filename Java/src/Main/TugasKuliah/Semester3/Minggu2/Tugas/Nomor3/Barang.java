package TugasKuliah.Semester3.Minggu2.Tugas.Nomor3;

public class Barang {

    public String kode;
    public String  namaBarang;
    public int hargaDasar;
    public float diskon;

    Barang() {}

    public void setKode(String kode) {
        this.kode = kode;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setHargaDasar(int hargaDasar) {
        this.hargaDasar = hargaDasar;
    }

    public void setDiskon(float diskon) {
        this.diskon = diskon;
    }

    public double hitungHargaJual() {
        return hargaDasar - (diskon * hargaDasar);
    }

    public void tampilData() {
        System.out.println("Kode Barang : " + this.kode);
        System.out.println("Nama Barang : " + this.namaBarang);
        System.out.printf("Harga Dasar : Rp %d\n", this.hargaDasar);
        System.out.printf("Diskon      : %.1f%%\n", this.diskon);
        System.out.println("Harga Jual  : " + this.hitungHargaJual() + "\n");
    }
}
