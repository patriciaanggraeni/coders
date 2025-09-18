package TugasKuliah.Semester3.Minggu4.Percobaan4;

public class Gerbong {

    private String kode;
    private Kursi[] arrayKursi;
    int nomor;

    Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getKode() {
        return this.kode;
    }

    public void setPenumpang(Penumpang penumpang, int nomor) {

        for (int i = 1; i < arrayKursi.length; i++) {
            if (arrayKursi[nomor - i] != null) {
                System.out.println("Maaf, kursi sudah dipesan oleh penumpang sebelumnya.");
                break;
            } else {
                this.arrayKursi[nomor - i].setPenumpang(penumpang);
                break;
            }
        }

    }

    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }

    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }


}
