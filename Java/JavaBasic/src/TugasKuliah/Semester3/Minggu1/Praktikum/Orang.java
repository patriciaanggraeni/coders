package TugasKuliah.Semester3.Minggu1.Praktikum;

public class Orang {

    private String nama;
    private byte umur;

    Orang() {}

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public byte getUmur() {
        return umur;
    }

    public void setUmur(byte umur) {
        this.umur = umur;
    }

    public String makan() {
        return "makan";
    }

    public void cetakInformasi() {
        System.out.println("Nama : " + this.getNama());
        System.out.println("Umur : " + this.getUmur());
        System.out.println(this.getNama() + " sedang " + this.makan() + " kerupuk");
    }
}
