package TugasKuliah.Semester3.Minggu11.Tugas;

public class Keledai extends Binatang implements Herbivora {
    
    private String suara;
    private String warnaBulu;

    Keledai(String nama,int jmlKaki, String suara, String warnaBulu) {
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
        System.out.println("Makanan: Tumbuhan");
    }

    public void displayData() {
        System.out.printf("\n----- Data Binatang %s -----\n\n", this.getNama());
        System.out.println("Jenis: Herbivora");
        this.displayMakanan();
        this.displayBinatang();
        System.out.println("Jumlah Kaki: " + this.getJmlKaki());
        System.out.println("Suara: " + this.suara);
        System.out.println("Warna Bulu: " + this.warnaBulu);
        System.out.println("\n-------------------------");
    }

}
