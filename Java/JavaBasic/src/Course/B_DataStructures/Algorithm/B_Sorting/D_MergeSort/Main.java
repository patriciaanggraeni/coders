package Course.B_DataStructures.Algorithm.B_Sorting.D_MergeSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {    
        int[] array = {34,67,21,54,89,100,21,32,56};
        mergeSort(array);
    }

    // membuat fungsi pengurutan dan pembagian data
    private static void mergeSort(int[] arrayKu) {
        int n = arrayKu.length;

        // print sebelum di sorting (agar tampak perbedaannya)
        System.out.print("Sebelum sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(Arrays.toString(arrayKu));
        }

        // lakukan reset pada variabel array
        arrayKu = divideData(arrayKu);

        // print sesudah sorting data
        System.out.print("Sesduah sorting: ");
        for (int i = 0; i < n; i++) {
            System.out.print(Arrays.toString(arrayKu));
        }
    } 

    private static int[] divideData(int[] bilangan) {
        int n = bilangan.length;

        // jika panjang sudah mencapai satuan, kembalikan nilai arraynya
        if (n <= 1) { return bilangan; }

        // lalu membuat variabel nilai tengah, kanan dan kiri
        int nilaiTengah = n / 2; // panjang array dibagi 2
        int[] kiri = new int[n/2];
        int[] kanan;
        
        // --------------------- buat kondisi untuk sebelah kiri dan kanan
        // buat kondisi, apakah data array berjumlah ganjil atau genap
        if (n % 2 == 0) { // jika genap
           // set nilai kanan setengah dari panjang array 
            kanan = new int[nilaiTengah];
        } else { // jika ganjil
            // set nilai kanan stengah + 1 dari panjang array
            kanan = new int[nilaiTengah + 1];
        }

        // ------------------- mengisi nilai kiri dan kanan di masing masing array
        // mengisi nilai kiri
        for (int i = 0; i < kiri.length; i++) {
            kiri[i] = bilangan[i];
        }

        // mengisi nilai kanan
        for (int i = 0; i < kanan.length; i++) {
            kanan[i] = bilangan[nilaiTengah + i];
        }

        // buat fungsi rekursif untuk memisahkan sisi kiri dan kanannya lagi, sampai ketemu satuan
        kiri = divideData(kiri);
        kanan = divideData(kanan);

        // membuat array untuk menggbungkan data yang sudah dipisah tadi
        int[] hasil = new int[kiri.length + kanan.length];

        // isi array dengan menggabugan data array kiri dan kanan
        hasil = mergeData(kiri, kanan);

        // kembalikan hasil
        return hasil;
    }

    private static int[] mergeData(int[] kiri, int[] kanan) {
        int[] gabung = new int[kiri.length + kanan.length];

        // siapin masing masing index
        int indexL = 0, indexR = 0, indexM = 0;

        while (indexL < indexR || indexR < kanan.length) {
            if (indexL < kiri.length && indexR < kanan.length) {
                if (kiri[indexL] < kanan[indexR]) {
                    gabung[indexM] = kiri[indexL];
                    indexM++;
                    indexL++;
                } else {
                    gabung[indexM] = kanan[indexL];
                    indexM++;
                    indexR++;
                }
            } else if (indexL < kiri.length) {
                gabung[indexM] = kiri[indexL];
                indexM++;
                indexL++;
            } else if (indexR < kanan.length) {
                gabung[indexM] = kanan[indexL];
                indexM++;
                indexR++;
            }
        }
        return gabung;
    }
}