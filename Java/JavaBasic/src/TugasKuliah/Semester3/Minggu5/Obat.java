package TugasKuliah.Semester3.Minggu5;

public class Obat {

    private String kodeObat;
    private String namaObat;
    private int hargaObat;
    private int jumlahObat;

    Obat() {}

    public Obat(String kodeObat, String namaObat, int hargaObat, int jumlahObat) {
        this.kodeObat = kodeObat;
        this.namaObat = namaObat;
        this.hargaObat = hargaObat;
        this.jumlahObat = jumlahObat;
    }

    public String getKodeObat() {
        return kodeObat;
    }

    public void setKodeObat(String kodeObat) {
        this.kodeObat = kodeObat;
    }

    public String getNamaObat() {
        return namaObat;
    }

    public void setNamaObat(String namaObat) {
        this.namaObat = namaObat;
    }

    public int getHargaObat() {
        return hargaObat;
    }

    public void setHargaObat(int hargaObat) {
        this.hargaObat = hargaObat;
    }

    public int getJumlahObat() {
        return jumlahObat;
    }

    public void setJumlahObat(int jumlahObat) {
        this.jumlahObat = jumlahObat;
    }

    public void cetakInfoObat() {
        System.out.println("\n---------- Informasi Data Obat ----------\n");
        System.out.println("Kode Obat   : " + this.getKodeObat());
        System.out.println("Nama Obat   : " + this.getNamaObat());
        System.out.println("Harga Obat  : " + this.getHargaObat());
        System.out.println("Jumlah Obat : " + this.getJumlahObat());
        System.out.println("\n-----------------------------------------\n");
    }
}
