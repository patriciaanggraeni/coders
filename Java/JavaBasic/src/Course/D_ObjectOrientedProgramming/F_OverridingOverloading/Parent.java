package Course.D_ObjectOrientedProgramming.F_OverridingOverloading;

public class Parent {

    String nama = "no name", nim = "no nim";

    Parent() {}

    Parent(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void print() {
        System.out.println("Nama: " + nama);
        System.out.println("Nim : " + nim);
    }
}