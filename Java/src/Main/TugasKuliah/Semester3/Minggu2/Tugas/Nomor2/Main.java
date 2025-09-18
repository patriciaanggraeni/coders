package TugasKuliah.Semester3.Minggu2.Tugas.Nomor2;

public class Main {
    public static void main(String[] args) {

        Lingkaran lingkaran = new Lingkaran(3.14, 7.8);

        System.out.println("----- Hitung Bangun Datar : Lingkaran -----\n");
        System.out.printf("Luas Lingkaran     : %.1f\n", lingkaran.hitungLuas());
        System.out.printf("Keliling Lingkaran : %.1f\n",lingkaran.hitungKeliling());
        System.out.println("------------------------------------------");
    }
}
