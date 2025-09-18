package Course.D_ObjectOrientedProgramming.G_Encapsulation;

public class Main {
    public static void main(String[] args) {

        Sepeda spd1 = new Sepeda("Sepeda", "Roda 2", 150000, "10-12-2022", "Polygon", (byte) 2);

        spd1.print();

        // panggil fungsi set dan get
        System.out.println("\nSetelah diset -------");
        spd1.setHarga(250000);
        spd1.setTahunKeluaran("09 - 07 - 2025");
        spd1.setMerk("Phoenix");
        spd1.setPemakaian((byte) 5);
        spd1.print();

        System.out.println("\nAmbil nilai yang dirubah tadi -------");
        System.out.println(spd1.getHarga());
        System.out.println(spd1.getTahunKeluaran());
        System.out.println(spd1.getMerk());
        System.out.println(spd1.getPemakaian());
    }
}
