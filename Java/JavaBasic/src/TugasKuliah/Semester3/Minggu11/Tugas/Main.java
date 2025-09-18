package TugasKuliah.Semester3.Minggu11.Tugas;

public class Main {
    
    public static void main(String[] args) {
        
        // instansiasi objek yang dibutuhkan
        Keledai keledai = new Keledai("Kedelai", 4, "Hehehehe", "Abu-abu");
        Gorilla gorilla = new Gorilla("Gorilla", 4, "Haaum Hauum", "Hitam Manis");
        Singa singa = new Singa("Singa", 4, "Roaar Roaaar", "Coklat");

        keledai.displayData();
        gorilla.displayData();
        singa.displayData();

    }
}
