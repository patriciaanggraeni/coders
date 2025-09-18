package TugasKuliah.Semester3.Minggu1.SepedaDemo;

public class SepedaDemo {
    public static void main(String[] args) {

        Sepeda spd1 = new Sepeda();
        Sepeda spd2 = new Sepeda();
        SepedaGunung spd3 = new SepedaGunung();

        System.out.println("===== Percobaan Satu =====");
        spd1.setMerk("polygon");
        spd1.tambahKecepatan(10);
        spd1.gantiGear(2);
        spd1.cetakStatus();

        System.out.println(" ");

        spd2.setMerk("Wimm Cycle");
        spd2.tambahKecepatan(10);
        spd2.gantiGear(2);
        spd2.tambahKecepatan(10);
        spd2.gantiGear(3);
        spd2.cetakStatus();

        System.out.println(" ");

        spd3.setMerk("Klinee");
        spd3.tambahKecepatan(5);
        spd3.gantiGear(7);
        spd3.setTipeSuspensi("Gas Suspension");
        spd3.cetakStatus();

    }
}
