package Course.B_DataStructures.Algorithm.B_Sorting.B_InsertionSort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {

        int[] array = {4,6,5,2,7,1,8,9};

        System.out.println("Logic 1");
        System.out.println("Sebelum: " + Arrays.toString(array));
        System.out.println("Sesudah: " + Arrays.toString(sortLogic1(array)));

        System.out.println(" ");
        System.out.println("Logic 2");
        System.out.println("Sesudah: " + Arrays.toString(sortLogic2(array)));
    }

    private static int[] sortLogic1(int[] array) {
        int n = array.length;

        // membuat for loop dan i dimulai dari 1
        for (int i = 1; i < n; i++) {
            int j = i; // inisialisaikan variabel j = i

            while (j > 0) { // selama j masih lebih besar dari 0
                if (array[j] < array[j-1]) { // cek apakah data index ke 1 < data index ke 0
                    int temp = array[j]; // jika iya, lakukan pertukaran data
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
                j--; // kurangkan nilai j selama looping
            }
        }
        return array;
    }

    private static int[] sortLogic2(int[] array) {
        int n = array.length; // inisialisasikan nilai n ke length array

        // buat looping, dengan nilai i mulari dari 1 (unsorted)
        for (int i = 1; i < n; i++) {
            int temp = array[i]; // simpan nilai data index ke i ke dalam variabel temp
            int j = i - 1; // set variabel j ke i - 1 (sorted)

            // buat perulangan
            while (j >= 0 && array[j] > temp) {
                array[j+1] = array[j];
                j -= 1;
            }

            array[j+1] = temp;
        }
        return array;
    }
}