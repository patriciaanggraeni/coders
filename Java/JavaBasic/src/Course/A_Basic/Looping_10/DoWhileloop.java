package Course.A_Basic.Looping_10;

public class DoWhileloop {
    public static void main(String[] args) {

        // do while loop, menjalankan program terlebih dahulu baru cek kondisi
        // jika salah, minimal yang dijalankan adalah satu kali
        int i = 0;
        boolean run = true;

        do {
            while (run) {
                if(i == 5) {
                    run = false;
                } else {
                    System.out.println("Hello World");
                }
                i++;
            }
        } while (i < 5);

    }
}
