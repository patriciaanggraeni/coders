package TugasKuliah.Semester3.Minggu5;

public class Pembayaran {

    private String kodePembayaran;
    private Obat obat;
    private Dokter dokter;
    private Pasien pasien;
    private int hargaInap;
    private int biayaAdmin;

    Pembayaran() {}

    public Pembayaran(String kodePembayaran, Obat obat, Dokter dokter, Pasien pasien, int hargaInap, int biayaAdmin) {
        this.kodePembayaran = kodePembayaran;
        this.obat = obat;
        this.dokter = dokter;
        this.pasien = pasien;
        this.hargaInap = hargaInap;
        this.biayaAdmin = biayaAdmin;
    }

    public String getKodePembayaran() {
        return kodePembayaran;
    }

    public void setKodePembayaran(String kodePembayaran) {
        this.kodePembayaran = kodePembayaran;
    }

    public Obat getObat() {
        return obat;
    }

    public void setObat(Obat obat) {
        this.obat = obat;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public void setDokter(Dokter dokter) {
        this.dokter = dokter;
    }

    public Pasien getPasien() {
        return pasien;
    }

    public void setPasien(Pasien pasien) {
        this.pasien = pasien;
    }

    public int getHargaInap() {
        return hargaInap;
    }

    public void setHargaInap(int hargaInap) {
        this.hargaInap = hargaInap;
    }

    public int getBiayaAdmin() {
        return biayaAdmin;
    }

    public void setBiayaAdmin(int biayaAdmin) {
        this.biayaAdmin = biayaAdmin;
    }

    public int getBiayaObat() {
        return this.getObat().getHargaObat() * this.getObat().getJumlahObat();
    }

    public int getBiayaInap() {
        return this.getHargaInap() * this.getPasien().getLamaInap();
    }

    public int getTotalBayar() {
        return this.getBiayaAdmin() + this.getBiayaObat() + this.getBiayaObat();
    }

    public void cetakInfoPembayaran() {
        System.out.println("\n---------- Informasi Pembayaran ----------\n");

        this.getPasien().cetakInfoUser();
        System.out.println(" ");
        this.getDokter().cetakInfoUser();
        System.out.println("Biaya Inap: " + this.getBiayaInap());
        System.out.println(" ");
        this.getObat().cetakInfoObat();
        System.out.println(" ");
        System.out.println("Total Bayar: " + this.getTotalBayar());

        System.out.println("------------------------------------------\n");
    }
}
