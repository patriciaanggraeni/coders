package TugasKuliah.Semester3.Minggu1.Praktikum.Mobil;

public class Lamborgini extends Mobil {

    // Class Mobil Lamborgini
    private String statusTurbo;
    private String tipeBohlam;
    private int kecepatan;

    public Lamborgini() {}

    public String getStatusTurbo() {
        return statusTurbo;
    }

    public int getKecepatan() {
        return this.kecepatan;
    }

    public void setStatusTurbo(String statusTurbo) {
        this.statusTurbo = statusTurbo;
    }

    public String getTipeBohlam() {
        return tipeBohlam;
    }

    public void setTipeBohlam(String tipeBohlam) {
        this.tipeBohlam = tipeBohlam;
    }

    public void tambahKecepatan(int kecepatan) {
        this.kecepatan += kecepatan;
    }

    @Override
    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Status Turbo : " + this.getStatusTurbo());
        System.out.println("Tipe Bohlam  : " + this.getTipeBohlam());
        System.out.println("Kecepatan    : " + this.getKecepatan() + "km/h");
    }
}
