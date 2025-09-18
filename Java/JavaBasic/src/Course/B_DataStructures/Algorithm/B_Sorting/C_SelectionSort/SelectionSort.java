package Course.B_DataStructures.Algorithm.B_Sorting.C_SelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        // melakukan perbandingan ke semua data baru melakukan swiping
        // membutuhkan setidaknya 2 variabel
        // variabel ke 1 untuk mulai dari mana melakukan sorting dan untuk melakukan swiping
        // variabel ke 2 menyimpan index variabel yang terkecil (ASC) atau terbesar (DESC)

        int[] array = {6,8,3,1,4,2,9};
        System.out.println("Sebelum: " + Arrays.toString(array));
        System.out.println("Sesudah: " + Arrays.toString(sortLogic1(array)));

    }

    private static int[] sortLogic1(int[] array) {
        int n = array.length;

        // membuat forloop denga i mulai dari 0
        for (int i = 0; i < n; i++) {
            int min = i; // assign nilai i ke variabel min

            // buat forloop lagi dengan nilai j mulai dari i
            for (int j = i; j < n; j++) {
                if (array[min] > array[j] ) { // cek apakah data[min] > data[j]
                    min = j; // jika iya, set nilai j ke variabel min
                }
            }

            // laukan swap data di luar inner loop atau di dalam outerloop
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }
        return array;
    }
}