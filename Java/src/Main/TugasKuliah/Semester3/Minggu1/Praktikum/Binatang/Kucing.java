package TugasKuliah.Semester3.Minggu1.Praktikum.Binatang;

public class Kucing extends Binatang {

    // Class Hewan Kucing
    private String jenisKucing;
    private String makananKucing;

    public Kucing() {}

    public void setJenisKucing(String jenisKucing) {
        this.jenisKucing = jenisKucing;
    }

    public void setMakananKucing(String makananKucing) {
        this.makananKucing = makananKucing;
    }

    public String getJenisKucing() {
        return this.jenisKucing;
    }

    public String getMakananKucing() {
        return this.makananKucing;
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Jenis Kucing   : " + this.getJenisKucing());
        System.out.println("Kucing memakan : " + this.getMakananKucing());
        System.out.println("Kucing bersuara: " + super.getSuaraBinatang());
    }

}
