package Course.D_ObjectOrientedProgramming.C_Method;

public class Main {
    public static void main(String[] args) {

        // buat object baru
        Method objek = new Method("Angga", "1234678");
        objek.print();

        // coba set password dengan memanggil method
        objek.setPassword("8954894n4");
        String pass = objek.getPaswword();

        System.out.println("\nPassword terbaru: " + pass);
    }
}