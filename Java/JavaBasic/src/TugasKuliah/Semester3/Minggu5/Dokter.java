package TugasKuliah.Semester3.Minggu5;

public final class Dokter extends User {

    private String kodeDokter;
    private String namaDokter;
    private String alamatDokter;
    private String nomorTelephone;

    Dokter() {}

    public Dokter(String username, String password, String kodeDokter, String namaDokter, String alamatDokter, String nomorTelephone) {
        super(username, password);
        this.kodeDokter = kodeDokter;
        this.namaDokter = namaDokter;
        this.alamatDokter = alamatDokter;
        this.nomorTelephone = nomorTelephone;
    }

    public String getKodeDokter() {
        return kodeDokter;
    }

    public void setKodeDokter(String kodeDokter) {
        this.kodeDokter = kodeDokter;
    }

    public String getNamaDokter() {
        return namaDokter;
    }

    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }

    public String getAlamatDokter() {
        return alamatDokter;
    }

    public void setAlamatDokter(String alamatDokter) {
        this.alamatDokter = alamatDokter;
    }

    public String getNomorTelephone() {
        return nomorTelephone;
    }

    public void setNomorTelephone(String nomorTelephone) {
        this.nomorTelephone = nomorTelephone;
    }

    @Override
    public void cetakInfoUser() {
        System.out.println("\n---------- Informasi Data Dokter -----------\n");
        System.out.println("Username: " + this.getUsername());
        System.out.println("Password: " + this.getPassword());
        System.out.println(" ");
        System.out.println("Kode Dokter       : " + this.getKodeDokter());
        System.out.println("Nama Dokter       : " + this.getNamaDokter());
        System.out.println("Alamat Dokter     : " + this.getAlamatDokter());
        System.out.println("Nomor Telp Dokter : " + this.getNomorTelephone());
        System.out.println("\n--------------------------------------------");

    }
}
