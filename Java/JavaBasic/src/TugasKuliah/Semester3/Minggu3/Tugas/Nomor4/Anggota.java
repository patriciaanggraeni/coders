package TugasKuliah.Semester3.Minggu3.Tugas.Nomor4;

public class Anggota {

    private String noKTP;
    private String nama;
    private int limitPeminjaman;
    private float jumlahPinjaman;

    Anggota() {}

    Anggota(String noKTP, String nama, int limitPeminjaman) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjaman() {
        return limitPeminjaman;
    }

    public float getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    public void pinjam(int pinjaman) {
        if (pinjaman > limitPeminjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman = pinjaman;
        }
    }

    public void angsur(float angsur) {
        if (angsur <= (jumlahPinjaman * (0.1))) {
            jumlahPinjaman -= angsur;
        } else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
    }
}