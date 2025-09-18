package TugasKuliah.Semester3.Minggu6.Praktikum.Tugas;

public class Pegawai {
    
    public String nip;
    public String nama;
    public String alamat;

    Pegawai(String nip, String nama, String alamat) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return this.nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public int getGaji() {
        return 0;
    }
}