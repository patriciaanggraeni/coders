package TugasKuliah.Semester3.Minggu1.Praktikum.Binatang;

public class Binatang {

    // Class Binatang
    private String namaBinatang;
    private byte umurBinatang;
    private String suaraBinatang;

    Binatang() {}

    public void setNamaBinatang(String namaBinatang) {
        this.namaBinatang = namaBinatang;
    }

    public void setUmurBinatang(byte umurBinatang) {
        this.umurBinatang = umurBinatang;
    }

    public void setSuaraBinatang(String suaraBinatang) {
        this.suaraBinatang = suaraBinatang;
    }

    public String getNamaBinatang() {
        return this.namaBinatang;
    }

    public byte getUmurBinatang() {
        return this.umurBinatang;
    }

    public String getSuaraBinatang() {
        return this.suaraBinatang;
    }

    public void cetakInformasi() {
        System.out.println("Nama Binatang  : " + getNamaBinatang());
        System.out.println("Umur Binatang  : " + getUmurBinatang() + " tahun");
    }
}
