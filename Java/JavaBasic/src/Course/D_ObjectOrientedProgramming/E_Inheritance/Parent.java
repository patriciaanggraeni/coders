package Course.D_ObjectOrientedProgramming.E_Inheritance;

public class Parent {

    String nama = "no name", nim = "no nim";

    Parent() {}

    Parent(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    void print() {
        System.out.println("Nama: " + nama);
        System.out.println("Nim : " + nim);
    }
}
