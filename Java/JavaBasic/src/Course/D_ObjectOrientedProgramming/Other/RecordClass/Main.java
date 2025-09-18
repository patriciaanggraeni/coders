package Course.D_ObjectOrientedProgramming.Other.RecordClass;

public class Main {
    public static void main(String[] args) {

        Akun akun = new Akun("Anggara","12345");

        // data akan otomatis menjadi to string
        System.out.println(akun);
        System.out.println(new Akun("Angga"));
        System.out.println(new Akun());
    }
}
