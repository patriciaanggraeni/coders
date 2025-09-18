package Course.A_Basic.Exepctions_17;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException  {

        // Mencoba try exception / error handling
        int x = 10;

        FileInputStream file;

        // menggunakan try catch
        try { // ayo coba ini
            // pesan error akan bergantian sesuai mana dulu yang error
            File f = new File("new.txt");
            InputStream files = new FileInputStream(f);
            x = x /0;

        } catch (FileNotFoundException e) { // kalau error coba tangkap
            e.printStackTrace(); // menampilkan jenis error
            System.err.println("File tidak ada!");
        } catch (ArithmeticException e) { // generic / umum / semuanya
            e.printStackTrace(); // menampilkan jenis error
            System.err.println("Error pembagian nol");
        } finally { // ah... akhirnya kehandle
            System.out.println("Selesai");
        }
        System.out.println("Program selesai");


         /*
            Apa itu Exception Handling? mekanisme yang diperlukan untuk mengatasi error yang terjadi saat runtime
            (saat program berjalan) atau bisa disebut error runtime (suatu kondisi abnormal). jika saat runtime terjadi error, maka program
            akan berhenti secara paksa dan program yang ada di bawahnya tidak akan dieksekusi. maka dari itu diperlukan
            mekanisme agar program tetap berjalan walaupun ada error saat java runtime.

            untuk mengatasi hal tersebut, bisa menggunakan try-catch-finally:

            - try keyword: digunakan untuk menentukan statement program di mana akan terjadi Exception. block try
              harus diikuti dengan block catch atau finally.

            - catch keyword: digunakan untuk menangani kesalahan / error / exception yang terjadi. block catch tidak
              dapat berdiri sendiri tanpa block try. block catch dapat diikuti oleh block finally. catch bisa banyak /
              bisa lebih dari satu.

            - finally keyword: digunakan untuk mengeksekusi bagian penting dari program. bagian ini akan tetap
              dijalankan secara baik walaupun terjadi exception ataupun tidak. biasanya digunakan untuk menutup
              file.

            - throw keyword: untuk men-throw exception yang terjadi, dimana throw digunakan di dalam body / fungsi /
              method.

            - throws keyword: untuk mendeklarasikan sebuah exception yang akan terjadi pada bagian fungsi. biasanya
              ditaruh di samping pas fungsi / class / method.
        */

        /*

            int[] array = {1, 2, 3, 4, 5};

            // akan meghasilkan error ArrayIndexOutOfBounds
            // index di luar jangkauan array
            System.out.println(array[6]);

            // statement ini tidak akan dijalankan
            System.out.println("baris ini tidak akan dijalankan");

        */

        // untuk mengatasinya, menggunakan try and catch
        try {

            // program yang kemungkinan / sekiranya terjadi exception, taruh di sini
            int[] array = {2, 5, 7, 0, 1};
            System.out.println(array[1]);

        } catch (Exception pesanError) {

            // tangkap error jika ada sebuah exception
            System.err.println(pesanError);

        } finally {

            // walaupun ada exception atau tidak, block ini akan tetap dijalankan secara baik
            System.out.println("Ini adalah block finally");
        }

        FileInputStream myfile = new FileInputStream("myfile.txt");

        // block program setelahnya, akan tetap berjalan
        System.out.println("Akhir dari program");
    }
}
