package Course.A_Basic.String_16;
import java.util.Arrays;

public class Intro {
    public static void main(String[] args) {

        // String adalah tipe data references / high level
        String kata = "Hello World";
        System.out.println(kata);

        // jika menggunakan char (malah repot)
        char[] data = {'H','e','l','l','o'};
        System.out.println(Arrays.toString(data));

        // cara mengakses char dan string
        System.out.println("\nAkses char: " + data[0]);
        System.out.println("Akses String: " + kata.charAt(0));

        // Merubah komponen, dan di java string bertipe immutable (tidak bisa dirubah)
        data[0] = 'K';
        System.out.println("\nStelah dirubah: " + Arrays.toString(data));

        // String hanya membaca input dan compare, kenapa biar lebih aman saya ngetread
        // tapi bukan berarti tidak bisa dirubah, bisa tetapi secara tidak langsung
        String myString = "K" + kata.substring(1,5);
        System.out.println("Merubah string: " + myString);

        // print address
        System.out.println(" ");
        printAdd("Alamat Char: ", kata);
        printAdd("Alamat String: ", myString);

        // Semisal membuat data string dengan value sama
        String dataString1 = "Hello World";
        String dataString2 = "Angga";
        String dataString3 = "Angga Madiun";

        // akan menghasilkan output address yang sama (alokasi memory)
        System.out.println(" ");
        printAdd("String 1: ", dataString1);
        printAdd("String 2: ", dataString2);
        printAdd("String 3: ", dataString3);

        // di java mempunyai alokasi memory sendiri untuk string
        // di java berarti useable
        // jadi ada heap, stack, string pool (memory kushus untuk string)

        // alamat akan berbeda dari dataString ke 2 karena statement di bawah ini
        // menagndung fungsi substring, jadi tidak otomatis masuk ke string pool
        dataString3 = dataString3.substring(0,5);
        printAdd("String 3: ", dataString3);

        // kseimpulan
        // 1. String di memory string pool berdifat reuseable (jadi lebih efisien)
        // 2. Membuat string di dalam fungsi akan berada di luar memory string pool
        // 3. String di java immutable
    }

    private static void printAdd(String s, String data) {
        int address = System.identityHashCode(data);
        System.out.println(s + data + " | " + Integer.toHexString(address));
    }
}
