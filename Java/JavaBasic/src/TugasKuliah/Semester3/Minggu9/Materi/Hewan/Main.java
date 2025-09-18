package TugasKuliah.Semester3.Minggu9.Materi.Hewan;

public class Main {
    public static void main(String[] args) {

        Kucing kucing = new Kucing("Kyttie", "Persia", (byte)10, "Karnivora", "Ikan");
        Burung elang = new Burung("Eagle", "Elang Jawa", (byte)5, "Karnivora", "Daging", (byte)3);

        kucing.cetakInfoHewan();

        System.out.println(" ");

        elang.cetakInfoHewan();


    }
}
