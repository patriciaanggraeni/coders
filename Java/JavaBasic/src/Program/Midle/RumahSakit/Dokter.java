package Program.Midle.RumahSakit;

public class Dokter {

    private String kodeDokter;
    private String namaDokter;
    private int biayaPemeriksaan;

    Dokter() {}

    Dokter(String kodeDokter) {
        this.kodeDokter = kodeDokter;
    }

    public void setKodeDokter(String kodeDokter) {
        this.kodeDokter = kodeDokter;
    }

    public String getNamaDokter() {
        return this.namaDokter;
    }

    public int biayaPemeriksaan() {
        return this.biayaPemeriksaan;
    }

    public void cekBiayaPemeriksaan() {
        if (this.kodeDokter.equals("DK001")) {
            this.namaDokter = "Dr. Andi";
            this.biayaPemeriksaan = 500000;
        } else if (this.kodeDokter.equals("DK002")) {
            this.namaDokter = "Dr. Angga";
            this.biayaPemeriksaan = 400000;
        } else if (this.kodeDokter.equals("DK003")) {
            this.namaDokter = "Dr. Amanah";
            this.biayaPemeriksaan = 300000;
        } else if (this.kodeDokter.equals("DK004")) {
            this.namaDokter = "Dr. Abdul";
            this.biayaPemeriksaan = 200000;
        } else if (this.kodeDokter.equals("DK005")) {
            this.namaDokter = "Dr. Sulaiman";
            this.biayaPemeriksaan = 100000;
        }
    }

    public void cetakDataDokter() {
        System.out.println("Kode Dokter: " + this.kodeDokter);
        System.out.println("Nama Dokter: " + this.namaDokter);
        System.out.println("Biaya Pemeriksaan: " + this.biayaPemeriksaan);
    }
}