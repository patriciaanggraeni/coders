package TugasKuliah.Semester3.Minggu11.Tugas;

public class Singa extends Binatang implements Karnivora {
    
    private String suara;
    private String warnaBulu;

    Singa(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }

    @Override
    public void displayBinatang() {
        System.out.println("Nama: " + this.getNama());
    }

    @Override
    public void displayMakanan() {
        System.out.println("Makanan: Daging");
    }

    public void displayData() {
        System.out.printf("\n----- Data Binatang %s -----\n\n", this.getNama());
        System.out.println("Jenis: Karnivora");
        this.displayMakanan();
        this.displayBinatang();
        System.out.println("Jumlah Kaki: " + this.getJmlKaki());
        System.out.println("Suara: " + this.suara);
        System.out.println("Warna Bulu: " + this.warnaBulu);
        System.out.println("\n-------------------------");
    }
}