package TugasKuliah.Semester3.Minggu9.Materi.Mahasiswa;

public class Mahasiswa {

    public String nama;
    public String nim;
    public byte umur;

    public MahasiswaReguler mhsR;
    public MahasiswaPrestasi mhsP;

    Mahasiswa() {}

    Mahasiswa(String nama, String nim, byte umur) {
        this.nama = nama;
        this.nim = nim;
        this.umur = umur;
    }

    Mahasiswa(MahasiswaReguler mhsR) {
        this.mhsR = mhsR;
    }

    Mahasiswa(MahasiswaPrestasi mhsP) {
        this.mhsP = mhsP;
    }

    public void cetakInfoReguler() {
        System.out.println("----- Data Mahasiswa -----");
        System.out.println("Nama: " + this.mhsR.nama);
        System.out.println("Nim : " + this.mhsR.nim);
        System.out.println("Umur: " + this.mhsR.umur);
        System.out.println("========================");
    }

    public void cetakInfoPrestasi() {
        System.out.println("----- Data Mahasiswa -----");
        System.out.println("Nama: " + this.mhsP.nama);
        System.out.println("Nim : " + this.mhsP.nim);
        System.out.println("Umur: " + this.mhsP.umur);
        System.out.println("========================");
    }
}
