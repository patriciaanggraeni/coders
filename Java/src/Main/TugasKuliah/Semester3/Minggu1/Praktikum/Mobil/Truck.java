package TugasKuliah.Semester3.Minggu1.Praktikum.Mobil;

public class Truck extends Mobil {

    // Class Mobil Truck
    private String tipeBohlam;
    private int kapasitasMuatan;

    public Truck() {}

    public String getTipeBohlam() {
        return tipeBohlam;
    }

    public void setTipeBohlam(String tipeBohlam) {
        this.tipeBohlam = tipeBohlam;
    }

    public int getKapasitasMuatan() {
        return kapasitasMuatan;
    }

    public void setKapasitasMuatan(int kapasitasMuatan) {
        this.kapasitasMuatan += kapasitasMuatan;
    }

    public void tambahKapasitasMuatan(int kapasitas) {
        this.kapasitasMuatan += kapasitas;
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Tipe Bohlam : " + this.getTipeBohlam());
        System.out.println("Kapasitas Muatan : " + this.getKapasitasMuatan() + "kg");
    }
}
