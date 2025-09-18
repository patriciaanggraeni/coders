package Course.D_ObjectOrientedProgramming.I_Polymorphism;

public class Main {
    public static void main(String[] args) {

        // Mulai membuat objek baru
        Binatang kucing = new Kucing();
        Binatang anjing = new Anjing();
        Binatang singa = new Singa();

        // panggil fungsi dari kelas masing masing
        kucing.suaraHewan();
        System.out.println(" ");
        anjing.suaraHewan();
        System.out.println(" ");
        singa.suaraHewan();

    }
}
