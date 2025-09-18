package Course.A_Basic.Looping_10;

public class Whileloop {
    public static void main(String[] args) {

        // membuat deklarasi dan inisialisasi variabel
        boolean run = true;
        int i = 0;

        // akan berjalan / looping terus jika kondisi benar
        while (run) {

            if (i == 5) {
                run = false;
            } else {
                System.out.println("Hello World");
                i++;
            }
        }
    }
}
