package Course.D_ObjectOrientedProgramming.D_SetterGetter;

public class Main {
    public static void main(String[] args) {

        Barang barang1 = new Barang((short) 12345, "Piatos", 5, "12-10-2021");
        barang1.print();

        barang1.setKode((short) 3000);
        barang1.setNama("Qtela");
        barang1.setJumlah(5);
        barang1.setExpired("09-12-2000");

        System.out.println(barang1.getKode());
        System.out.println(barang1.getNama());
        System.out.println(barang1.getJumlah());
        System.out.println(barang1.getExpired());
    }
}
