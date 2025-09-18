package Course.D_ObjectOrientedProgramming.F_OverridingOverloading;

public class Main {
    public static void main(String[] args) {

        Parent p1 = new Parent("Angga Susilo", "9012732");
        p1.print();

        Child p2 = new Child("Rizky Hardian", "9843743", (byte) 17, "Jalan. Cendrawasih");
        p2.print();

        p2.setNama("Budiantoro");
        System.out.println(p2.getNama());
        System.out.println("\nDengan Overriding ------");
        p2.print();

        /*
            Catatan:
            1. Overloading: Nama fungsi sama akan tetapi parameter berbeda dan tingkat visibilitynya boleh lebih dari induk classnya
            2. Overriding: Nama fungsi dan parameter sama tetapi isi berbeda dan tinkat visibilitynya tidak boleh lebih dari induk classnya

        */
    }
}