package TugasKuliah.Semester3.Minggu1.Praktikum.Binatang;

public class Anjing extends Binatang {

    // Class Hewan Anjing
    private String jenisAnjing;
    private String makananAnjing;

    public Anjing() {}

    public String getJenisAnjing() {
        return jenisAnjing;
    }

    public String getMakananAnjing() {
        return makananAnjing;
    }

    public void setMakananAnjing(String makananAnjing) {
        this.makananAnjing = makananAnjing;
    }

    public void setJenisAnjing(String jenisAnjing) {
        this.jenisAnjing = jenisAnjing;
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Jenis Anjing   : " + this.getJenisAnjing());
        System.out.println("Makanan Anjing : " + this.getMakananAnjing());
        System.out.println("Anjing bersuara: " + super.getSuaraBinatang());
    }

}
