package TugasKuliah.Semester3.Minggu6.Praktikum.Tugas;

public class Dosen extends Pegawai {

    private int jumlahSks;
    private int tarifSks;

    Dosen(String nip, String nama, String alamat, int jumlahSks, int tarifSks) {
        super(nip, nama, alamat);
        this.jumlahSks = jumlahSks;
        this.tarifSks = tarifSks;
    }

    public void setSks(int jumlahSks) {
        this.jumlahSks = jumlahSks;
    }

    public int getGaji() {
        return this.jumlahSks * this.tarifSks;
    }
    
}
