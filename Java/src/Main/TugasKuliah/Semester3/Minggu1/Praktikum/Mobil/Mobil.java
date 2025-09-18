package TugasKuliah.Semester3.Minggu1.Praktikum.Mobil;

public class Mobil {

    // Class Mobil (parent)
    private String warna;
    private String jenisMobil;

    public Mobil() {}

    public String getWarna() {
        return warna;
    }

    public String getJenisMobil() {
        return jenisMobil;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setJenisMobil(String jenisMobil) {
        this.jenisMobil = jenisMobil;
    }

    public void cetakInformasi() {
        System.out.println("Warna mobil : " + this.getWarna());
        System.out.println("Jenis Mobil : " + this.getJenisMobil());
    }
}
