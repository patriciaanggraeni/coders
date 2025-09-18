package TugasKuliah.Semester3.Minggu6.Materi.Tugas1;

public class Segitiga extends BangunDatar {
    
    public float alas;
    public float tinggi;

    Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public float alas() {
        return 0.5F * this.alas * this.tinggi;
    }
}
