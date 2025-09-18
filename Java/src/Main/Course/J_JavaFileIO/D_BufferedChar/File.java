package Course.J_JavaFileIO.D_BufferedChar;

// import package untuk memcaba file charstream
import java.io.FileReader;
import java.io.FileWriter;

// import package buffered stream
import java.io.BufferedReader;
import java.io.BufferedWriter;

// import package exception
import java.io.IOException;
import java.util.Arrays;

public class File {
    public static void main(String[] args) throws IOException {
        
        // pertama, load dan baca file yang sudah ada sebelumnya
        FileReader fileRead = new FileReader("D:\\Documents\\Programming\\Backend\\Java\\BasicsJava\\src\\Course\\D_JavaFile\\FileIO\\D_BufferedChar\\assets\\input\\input.txt");
        
        // pashing variabel fileRead ke Buffer
        BufferedReader readBuffer = new BufferedReader(fileRead);
        readBuffer.mark(100);

        // menampilkan isi dari file dengan buffered char stream
        /* syntax: readBuffer(namaArray, offset, panjang_karakter) */
        char[] isiFile = new char[45];
        // isi file (tiap karater) kita taruh ke setiap index di array isiFile
        readBuffer.read(isiFile, 0, isiFile.length);
        System.out.print(Arrays.toString(isiFile));
        readBuffer.reset();
        System.out.println(" ");
        
        // ------------------------------ menampilkan isi dari file
        // menampilkan isi file per baris
        System.out.print("\n" + readBuffer.readLine());
        System.out.print("\n" + readBuffer.readLine());
        readBuffer.reset();
        System.out.println(" ");

        // ------------------------------- koneksi file output
        // mengkoneksikan file output dengan aplikasi
        FileWriter fileWrite = new FileWriter("D:\\Documents\\Programming\\Backend\\Java\\BasicsJava\\src\\Course\\D_JavaFile\\FileIO\\D_BufferedChar\\assets\\output\\output.txt");
        BufferedWriter writeBuffer = new BufferedWriter(fileWrite);

        // -------------------------------- write ke buffer
        // lalu menulis ke file output
        String teks1 = readBuffer.readLine();
        String teks2 = readBuffer.readLine();

        // bisa langsung passing variabel teks ke write, atau
        // menggunakan parameter, write(variabel, offset, length)
        writeBuffer.write(teks1);
        writeBuffer.newLine();
        writeBuffer.write(teks2);

        // -------------------------------- flush buffer ke output file
        writeBuffer.flush();
        writeBuffer.flush();

        // -------------------------------- close semua file
        fileRead.close();
        fileWrite.close();
        readBuffer.close();
        writeBuffer.close();
    }
}