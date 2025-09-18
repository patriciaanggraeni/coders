package Course.J_JavaFileIO.C_BufferedByte;

// import module untuk membaca file dengan byte stream
import java.io.FileInputStream;
import java.io.BufferedInputStream;

// import module untuk menulis file dengan byte stream
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

// import module exception
import java.io.IOException;

public class File {
    public static void main(String[] args) throws IOException {
        
        FileInputStream fileInput = new FileInputStream("D:\\Documents\\Programming\\Backend\\Java\\BasicsJava\\src\\Course\\D_JavaFile\\FileIO\\C_BufferedByte\\assets\\input\\input.txt");
        BufferedInputStream inputBuffer = new BufferedInputStream(fileInput);

        // menampilkan isi dari file (cara 1 - for loop)
        byte[] isiFile = inputBuffer.readAllBytes();
        for (int i = 0; i < isiFile.length; i++) {
            System.out.print((char) isiFile[i]);
        }

        // menampilkan isi dari file (cara 2 - Arrays)
        /* 
            System.out.print(Arrays.toString(isiFile));
        */
        
        // menulis file ke file output
        FileOutputStream fileOutput = new FileOutputStream("D:\\Documents\\Programming\\Backend\\Java\\BasicsJava\\src\\Course\\D_JavaFile\\FileIO\\C_BufferedByte\\assets\\output\\output.txt");
        
        // variabel fileOutput kita pashing ke dalam buffered output stream
        BufferedOutputStream outputBuffer = new BufferedOutputStream(fileOutput);

        // lalukan write file dengan array yang sudah di isi oleh kumpulan karakter tadi
        outputBuffer.write(isiFile);

        // setelah itu lakukan flush, agar file dapat tampil di output file
        outputBuffer.flush();

        // selalu tutup file jika telah digunakan
        fileInput.close();
        fileOutput.close();
        inputBuffer.close();
        outputBuffer.close();
    }
}
