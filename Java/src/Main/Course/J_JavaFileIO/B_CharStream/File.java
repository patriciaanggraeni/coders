package Course.J_JavaFileIO.B_CharStream;

// seperti biasa import bahannya dulu
import java.io.IOException;

// package untuk membaca dan menulis file byte stream
import java.io.FileInputStream;
import java.io.FileOutputStream;

// package untuk membaca dan menulis file char stream
import java.io.FileReader;
import java.io.FileWriter;

public class File {
    public static void main(String[] args) throws IOException {

        // membuat file terlebih dahulu
        // ukuran char stream 2x dari ukuran byte stream
        // char stream = 16bit
        // byte stream = 8bit
        FileInputStream byteFile = new FileInputStream("D:\\Documents\\Programming\\Backend\\Java\\BasicsJava\\src\\Course\\D_JavaFile\\FileIO\\B_CharStream\\assets\\input\\mybyteinput.txt");
        FileReader charFile = new FileReader("D:\\Documents\\Programming\\Backend\\Java\\BasicsJava\\src\\Course\\D_JavaFile\\FileIO\\B_CharStream\\assets\\input\\mycharinput.txt");


        // membaca file byte stream
        System.out.print("byte stream read: ");
        int byteTemp = byteFile.read();
        while (byteTemp != -1) {
            System.out.print((char) byteTemp);
            byteTemp = byteFile.read();
        }

        // membaca file char stream
        System.out.print("\nchar stream read: ");
        int charTemp = charFile.read();
        while (charTemp != -1) {
            System.out.print((char) charTemp);
            charTemp = charFile.read();
        }

        // ------------------------------------------------------------------------------------------------------------//
        // menulis file ke file output
        FileOutputStream outputByteFile = new FileOutputStream("D:\\Documents\\Programming\\Backend\\Java\\BasicsJava\\src\\Course\\D_JavaFile\\FileIO\\B_CharStream\\assets\\output\\byteout.txt");
        FileWriter outputCharFile = new FileWriter("D:\\Documents\\Programming\\Backend\\Java\\BasicsJava\\src\\Course\\D_JavaFile\\FileIO\\B_CharStream\\assets\\output\\charout.txt");

        // menulis karakter dari file sebelumnya ke file output
        int byteStream = byteFile.read();
        while (byteStream != -1) {
            outputByteFile.write(byteStream);
            byteStream = byteFile.read();
        }

        int charStream = charFile.read();
        while (charStream != -1) {
            outputCharFile.write(charStream);
            charStream = charFile.read();
        }


        // close file
        byteFile.close();
        charFile.close();

        outputByteFile.close();
        outputCharFile.close();

        /*
            note:
            - byte dan char stream, menulis huruf nasional (huruf unik) bisa dan tidak error
            - byte menampilkan huruf unik tidak bisa
            - char menampilkan huruf unik bisa
        */
    }
}
