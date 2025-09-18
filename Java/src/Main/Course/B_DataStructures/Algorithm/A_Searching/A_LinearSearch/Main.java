package Course.B_DataStructures.Algorithm.A_Searching.A_LinearSearch;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {10,4,5,3,87,438,28,19,29};

        printSearch(myArray, 438);
    }

    // menggunakan chain method atau method saling terhubung
    private static int search(int[] array, int x) {
        int n = array.length;

        for (int i = 0; i < n; i++) { // menggunakan forloop seperti biasanya
            if (array[i] == x) { // jika nilai pada index i sama dengan nilai yang dicari
                return i; // kembalikan nilai i
            }
        }
        return -1;
    }

    private static boolean cekSearch(int[] array, int x) {
        return search(array, x) != -1;
    }

    private static void printSearch(int[] array, int x) {
        System.out.println("Data Array: " + Arrays.toString(array));

        if (cekSearch(array, x)) {
            System.out.println("Data: " + array[search(array,x)]);
            System.out.println("Ditemukan di index ke-" + search(array, x));
        } else {
            System.out.println("Data: " + array[search(array,x)]);
            System.out.println("Data tidak ditemukan!");
        }
    }
}
