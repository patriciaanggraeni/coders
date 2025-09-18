package TugasKuliah.Semester3.Minggu6.Materi.Tugas1;

public class Lingkaran extends BangunDatar {

    public float r;

    Lingkaran(float r) {
        this.r = r;
    }

    public float luas() {
        return 3.14F * (this.r * this.r);
    }

    public float keliling() {
        return 2 * 3.14F * this.r;
    }
    
}