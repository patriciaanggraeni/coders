package TugasKuliah.Semester3.Minggu9.Tugas.Overriding;

class Manusia {
    public void bernafas() { System.out.println("Manusia sedang bernafas..."); }

    public void makan() { System.out.println("Manusia sedang makan..."); }
}

class Dosen extends Manusia {

    @Override
    public void makan() { System.out.println("Dosen sedang makan..."); }

    public void lembur() {  System.out.println("Dosen sedang lembur..."); }
}

class Mahasiswa extends Manusia {
    @Override
    public void makan() { System.out.println("Mahasiswa sedang makan..."); }

    public void tidur() { System.out.println("Mahasiswa sedang tidur..."); }
}

public class Main {
    public static void main(String[] args) {

        // menggunakan konsep polymorphism
        Manusia manusia = new Dosen();
        manusia.bernafas();
        manusia.makan();

        System.out.println(" ");

        // menggunakan konsep dynamic method dispatch
        manusia = new Mahasiswa();
        manusia.bernafas();
        manusia.makan();

        /*
         * jadi method yang dapat dipanggil adalah method yang ada di Super Class dan method yang meng-overriding dari Super Class
         * contoh method makan, jadi selain ketentuan di atas, tidak bisa memanggil method lainnya.
         */
    }
}