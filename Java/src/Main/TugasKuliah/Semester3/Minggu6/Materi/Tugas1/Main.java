package TugasKuliah.Semester3.Minggu6.Materi.Tugas1;

public class Main {
    public static void main(String[] args) {
        
        PersegiPanjang persegiPanjang = new PersegiPanjang(10, 5);
        Lingkaran lingkaran = new Lingkaran(27);
        Segitiga segitiga = new Segitiga(10, 17);

        System.out.println("\n----- Rumus Persegi Panjang");
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling());
        
        System.out.println("\n----- Rumus Lingkaran");
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());


        System.out.println("\n----- Rumus Segitiga");
        System.out.println("Luas Segitiga: " + segitiga.alas());
    }
}
