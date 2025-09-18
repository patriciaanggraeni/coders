package TugasKuliah.Semester3.Minggu1.Praktikum;

public class Laptop {

    private String merk;
    private int harga;
    private String spesifikasi;

    Laptop() {}

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getSpesifikasi() {
        return spesifikasi;
    }

    public void setSpesifikasi(String spesifikasi) {
        this.spesifikasi = spesifikasi;
    }

    public boolean powerOn() {
        return true;
    }

    public void cetakInformasi() {
        System.out.println("Merk : " + this.getMerk());
        System.out.println("Spesifikasi : " + this.getSpesifikasi());
        System.out.println("Harga : " + this.getHarga());
        System.out.println("Nyalakan laptop: " + this.powerOn());
    }
}
