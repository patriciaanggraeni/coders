package TugasKuliah.Semester3.Minggu11.Percobaan1;

public class InterfaceMain {
    
    public static void main(String[] args) {
        
        // di main class panggil obejk yang dibutuhkan
        Rektor pakrektor = new Rektor();
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
        System.out.println(" ");
        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(masterCumlaude);

        /*
            Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
            pakrektor.beriSertifikatCumlaude(mhsBiasa);
        */
    }
}