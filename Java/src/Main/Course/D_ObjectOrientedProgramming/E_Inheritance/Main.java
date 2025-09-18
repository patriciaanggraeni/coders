package Course.D_ObjectOrientedProgramming.E_Inheritance;

public class Main {
    public static void main(String[] args) {

        Parent p1 = new Parent("Angga Susilo", "9012732");
        p1.print();

        Child p2 = new Child("Rizky Hardian", "9843743", (byte) 17, "Jalan. Cendrawasih");
        p2.print();

        p2.setNama("Budiantoro");
        System.out.println(p2.getNama());
        p2.print();
    }
}
