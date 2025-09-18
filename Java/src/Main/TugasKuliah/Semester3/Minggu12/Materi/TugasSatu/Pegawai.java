package TugasKuliah.Semester3.Minggu12.Materi.TugasSatu;

public class Pegawai {

    protected String nama;
    protected int gaji;

    Pegawai() {}

    Pegawai(String nama, int gaji) {
        this.nama = nama;
        this.gaji = gaji;
    }

    public int getGaji() {
        return this.gaji;
    }
}