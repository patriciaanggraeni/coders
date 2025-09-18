package TugasKuliah.Semester3.Minggu2.Tugas.Nomor3;

public class Main {
    public static void main(String[] args) {

        Barang barang1 = new Barang();
        Barang barang2 = new Barang();

        System.out.println("------- Data Barang -------\n");
        barang1.setKode("1FGRH431");
        barang1.setDiskon(0.3f);
        barang1.setNamaBarang("Keyboard");
        barang1.setHargaDasar(500000);
        barang1.tampilData();

        barang2.setKode("2FGGRH33");
        barang2.setDiskon(2.2f);
        barang2.setNamaBarang("Laptop");
        barang2.setHargaDasar(7000000);
        barang2.tampilData();
        System.out.println("---------------------------");
    }
}
