package TugasKuliah.Semester3.Minggu4.Percobaan2;

public class Sopir {

    private String nama;
    private int biaya;

    Sopir() {}

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getBiaya() {
        return biaya;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int hitungBiayaSopir(int hari) {
        return biaya * hari;
    }
}
