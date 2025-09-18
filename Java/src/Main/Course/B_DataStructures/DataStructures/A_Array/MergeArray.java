package Course.B_DataStructures.DataStructures.A_Array;

public class MergeArray {
    public static void main(String[] args) {

        int[] array1 = {1,2,3,4,5};
        int[] array2 = {6,7,8,9,10};

        int size1 = array1.length;
        int size2 = array2.length;

        int[] hasilMerge = new int[size1 + size2];

        // menambahkan elemen dengan for loop
        for (int i = 0; i < size1; i++) {
            hasilMerge[i] = array1[i];
        }

        for (int i = 0; i < size2; i++) {
            hasilMerge[i + array1.length] = array2[i];
        }

        tampilData(hasilMerge);
    }

    private static void tampilData(int[] data) {
        System.out.println("Hasil merge: ");
        System.out.print("[ ");
        for (int i : data) {
            System.out.print(i + ", ");
        }
        System.out.print("]");
    }
}
