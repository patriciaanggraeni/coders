package TugasKuliah.Semester3.Minggu11.Percobaan2;

public class MultipleInterface {
    
    public static void main(String[] args) {
        
        Rektor pakRektor = new Rektor();
        PascaSarjana masterCum = new PascaSarjana("Elok");
        Sarjana sarjanaCum = new Sarjana("Dini");
        
        
        System.out.println(" ");
        pakRektor.beriSertifikatMawapres(sarjanaCum);
        pakRektor.beriSertifikatMawapres(masterCum);

    }
}