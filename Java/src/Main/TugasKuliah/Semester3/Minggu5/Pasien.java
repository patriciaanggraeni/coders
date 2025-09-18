package TugasKuliah.Semester3.Minggu5;

public final class Pasien extends User{

    private String kodePasien;
    private String tanggalInap;
    private String namaPasien;
    private String alamatPasien;
    private byte lamaInap;
    private String nomorTelephone;

    Pasien() {}

    public Pasien(String kodePasien, String tanggalInap, String namaPasien, String nomorTelephone, byte lamaInap) {
        this.kodePasien = kodePasien;
        this.tanggalInap = tanggalInap;
        this.namaPasien = namaPasien;
        this.nomorTelephone = nomorTelephone;
        this.lamaInap = lamaInap;
    }

    public String getKodePasien() {
        return kodePasien;
    }

    public void setKodePasien(String kodePasien) {
        this.kodePasien = kodePasien;
    }

    public String getTanggalInap() {
        return tanggalInap;
    }

    public void setTanggalInap(String tanggalInap) {
        this.tanggalInap = tanggalInap;
    }

    public String getNamaPasien() {
        return namaPasien;
    }

    public void setNamaPasien(String namaPasien) {
        this.namaPasien = namaPasien;
    }

    public String getNomorTelephone() {
        return nomorTelephone;
    }

    public void setNomorTelephone(String nomorTelephone) {
        this.nomorTelephone = nomorTelephone;
    }

    public String getAlamatPasien() {
        return alamatPasien;
    }

    public void setAlamatPasien(String alamatPasien) {
        this.alamatPasien = alamatPasien;
    }

    public int getLamaInap() {
        return lamaInap;
    }

    public void setLamaInap(byte lamaInap) {
        this.lamaInap = lamaInap;
    }

    public void cetakInfoUser() {
        System.out.println("\n------- Informasi Data Pasien -------\n");
        System.out.println("Kode Pasien       : " + this.getKodePasien());
        System.out.println("Nama Pasien       : " + this.getNamaPasien());
        System.out.println("Alamat Pasien     : " + this.getAlamatPasien());
        System.out.println("Nomor Telp Pasien : " + this.getNomorTelephone());
        System.out.println("Tanggal Inap      : " + this.getTanggalInap());
        System.out.println("Lama Inap         : " + this.getLamaInap());
        System.out.println("\n-------------------------------------");
    }
}