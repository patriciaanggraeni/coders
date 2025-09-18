package Course.J_JavaFileIO.A_ByteStream;

// pertama import bahannya dulu
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class File {
    public static void main(String[] args) throws IOException {

        // membuat objek filenya dulu
        // FileInputStream artinya menarik / membaca file yang sudah ada sebelumnya
        // FileInputStream termasuk dalam ByteStream
        FileInputStream myInputFile1 = new FileInputStream("D:\\Documents\\Programming\\Backend\\Java\\BasicsJava\\src\\Course\\D_JavaFile\\FileIO\\B_ByteStream\\assets\\InputFile\\fileone.txt");
        FileInputStream myInputFile2 = new FileInputStream("D:\\Documents\\Programming\\Backend\\Java\\BasicsJava\\src\\Course\\D_JavaFile\\FileIO\\B_ByteStream\\assets\\InputFile\\fileone.txt");
        FileInputStream myInputFile3 = new FileInputStream("D:\\Documents\\Programming\\Backend\\Java\\BasicsJava\\src\\Course\\D_JavaFile\\FileIO\\B_ByteStream\\assets\\InputFile\\fileone.txt");
        FileInputStream myInputFile4 = new FileInputStream("D:\\Documents\\Programming\\Backend\\Java\\BasicsJava\\src\\Course\\D_JavaFile\\FileIO\\B_ByteStream\\assets\\InputFile\\fileone.txt");

        System.out.print((char) myInputFile1.read());
        System.out.print((char) myInputFile1.read());
        System.out.print((char) myInputFile1.read());
        System.out.print((char) myInputFile1.read());
        System.out.print((char) myInputFile1.read());
        System.out.print((char) myInputFile1.read());
        System.out.print((char) myInputFile1.read());
        System.out.println(" ");

        // menampilkan isi file dengan while loop
        int temp = myInputFile2.read();
        while (temp != -1) {
            System.out.print((char) temp);
            temp = myInputFile2.read();
        }
        System.out.println(" ");

        // mengambil panjang karakter di suatu file
        int ambilPanjang = myInputFile3.available();
        System.out.printf("Panjang teks sebanyak %d karakter\n", ambilPanjang);

        // contoh melakukan read file yang salah
        for (int i = 0; i < myInputFile4.available(); i++) {
            System.out.print((char) myInputFile4.read());
        }

        // ---------------------------------------------------------------------------- //
        // mulai menulis file ke dalam file lainnya
        // menggunakan FileOutputStream
        // jika di FileInputStream harus ada filenya, maka di sini tidak harus ada filenya
        // nanti filenya akan otomatis dibuat
        FileInputStream myInputFile5 = new FileInputStream("D:\\Documents\\Programming\\Backend\\Java\\BasicsJava\\src\\Course\\D_JavaFile\\FileIO\\B_ByteStream\\assets\\InputFile\\fileone.txt");
        FileOutputStream myOutputFile1 = new FileOutputStream("D:\\Documents\\Programming\\Backend\\Java\\BasicsJava\\src\\Course\\D_JavaFile\\FileIO\\B_ByteStream\\assets\\OutputFile\\outputone.txt");

        try {
            int write = myInputFile5.read();
            while (write != -1) {
                myOutputFile1.write(write);
                write = myInputFile5.read();
            }
        } catch (IOException e) {
            System.err.println(e);
        } finally {
            System.out.println("\n\nFile berhasil di tulis");
        }


        // ------------------------------------------------------------------------------------------------------------\\
        // menulis isi file dari konsol dimasukkan ke file  output
        Scanner inputText = new Scanner(System.in);
        FileOutputStream myOutputFile2 = new FileOutputStream("D:\\Documents\\Programming\\Backend\\Java\\BasicsJava\\src\\Course\\D_JavaFile\\FileIO\\B_ByteStream\\assets\\OutputFile\\outputtwo.txt");

        System.out.print("\n\nMasukkan teks: ");
        String teks = inputText.nextLine();

        // buat variabel tambahan
        int start = teks.charAt(0);
        int panjang = teks.length();
        int index = 0;

        while (true) {
            myOutputFile2.write(start);

            if (index == panjang - 1) {
                break;
            } else {
                index++;
                start = teks.charAt(index);
            }
        }


        // jangan lupa close file jika telah digunakan (selau taruh yang paling bawah ya..)
        myInputFile1.close();
        myInputFile2.close();
        myInputFile3.close();
        myInputFile4.close();
        myInputFile5.close();

        myOutputFile1.close();
        myOutputFile2.close();
    }
}
