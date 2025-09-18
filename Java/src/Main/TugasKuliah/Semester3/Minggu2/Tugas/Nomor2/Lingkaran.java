package TugasKuliah.Semester3.Minggu2.Tugas.Nomor2;

public class Lingkaran {
    public double phi;
    public double r;

    Lingkaran(double phi, double r) {
        this.phi = phi;
        this.r = r;
    }

    public double hitungLuas() {
        return phi * r * r;
    }

    public double hitungKeliling() {
        return 2 * phi * r;
    }
}