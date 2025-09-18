package Course.J_JavaFileIO.D_BufferedChar;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        // membaca file dengan buffered char stream
        // di buffered char stream tidak memakai FileInputStream tetapi memakai FileReader

        // pertama inisialisasikan package FileReader
        FileReader file_pertama = new FileReader("D:\\Documents\\Programming\\Backend\\Java\\BasicsJava\\src\\Course\\D_JavaFile\\FileIO\\E_BufferedChar\\assets\\input.txt");

        // kedua, inisialisasikan package BufferedReader
        BufferedReader readFile = new BufferedReader(file_pertama);

        // ketiga, bisa menggunakan array dengan tipe data char
        // jadi ngambilnya akan per character
        char[] data = new char[50];
        readFile.read(data, 0, data.length);
        System.out.println(Arrays.toString(data));
        readFile.mark(50);

        // keempat, bisa menampilkan langsung perbaris
        System.out.println(readFile.readLine());
        System.out.println(readFile.readLine());

        // reset file, biar bisa dibaca lagi secara keseluruhan
        readFile.reset();


        // ----------------------------------
        // write ke file aoutput
        FileWriter file_output = new FileWriter("D:\\Documents\\Programming\\Backend\\Java\\BasicsJava\\src\\Course\\D_JavaFile\\E_BufferedChar\\assets\\output.txt");
        BufferedWriter writeFile = new BufferedWriter(file_output);

        String baris1 = readFile.readLine();
        writeFile.write(baris1, 0, baris1.length());
        writeFile.flush();


        file_pertama.close();
        file_output.close();
        readFile.close();
        writeFile.close();
    }
}
