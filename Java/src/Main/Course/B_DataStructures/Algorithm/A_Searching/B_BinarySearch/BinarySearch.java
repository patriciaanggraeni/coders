package Course.B_DataStructures.Algorithm.A_Searching.B_BinarySearch;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        // khusus binary search, data yang ingin dicari harus sudah terurut
        // dengan membagi dua dan menginisialisasikan nilai tengah
        // low untuk sebelah kiri dan high untuk sebelah kanan
        int[] array = {3,4,87,101,32,6,12,31,42,38};

        System.out.println("Sebelum sorting: " + Arrays.toString(array));
        System.out.println("Sesudah sorting: " + Arrays.toString(sorting(array)));

        System.out.printf("\nData %d ditemukan!", binarySearch(sorting(array), 12));
    }

    // urutkan data terlebih dahulu, di sini saya menggunakan selection sort
    private static int[] sorting(int[] array) {

        int n = array.length; // inisialisasikan n dengan panjang array
        for (int i = 0; i < n; i++) { // buat looping dengan nilai ke-i dari nilai 0
            int index = i; // inisialisasikan index dengan nilai ke-i

            for (int j = i; j < n; j++) { // buat inner loop dengan nilai ke-j mulai dari nilai ke-i
                if (array[index] > array[j]) { // buat kondisi
                    index = j; // jika kondisi benar, inisialisasikan nilai ke-index dengan nilai ke-j
                }
            }

            // lakukan swaping data
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        return array; // return nilai array
    }

    // setelah itu baru membuat fungsi binary search
    private static int binarySearch(int[] array, int x) {
        // inisialisasikan nilai low ke 0 dan high ke panjang array - 1
        int low = 0;
        int high = array.length - 1;

        while (low <= high) { // buat looping selama nilai low lebih kecil sama dengan high
            int mid = (low + high) / 2; // inisialisasikan nilai mid sama dengan perjumlahan dari (low + high) / 2

            if (array[mid] == x) { return array[mid]; } // jika nilai dari array dengan index mid == data yang dicari, return data arraynya

            if (x < array[mid]) { // jika array mid tidak sama dengan data yang dicari, cek apakah data yang dicari lebih kecil dari array dengan index mid
                high = mid - 1; // jika iya, maka set high ke mid - 1
            } else {
                low = mid + 1; // jika tidak, maka set low ke mid + 1
            }
        }
        return -1; // jika data yang dicari tidak ditemukan secara keseluruhan, maka return -1
    }
}