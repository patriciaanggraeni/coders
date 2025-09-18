package Course.B_DataStructures.Algorithm.B_Sorting.A_BubbleSort;

public class BubbleSort {
    public static void main(String[] args) {

        // konsep bubble sort: membandingkan data dan langsung mengganti posisi data tersebut
        // rumus: (data.length - 1) x (data.length - 1)

        int[] newArray = {1,26,4,8,39,21,10,15};

        showSort(newArray);
    }

    static private int[] sorting1(int[] data) {
        int size = data.length;
        int temp;

        for (int i = 0; i < size - 1; i++) {
            temp = 0;
            for (int j = 0; j < size - 1; j++) {
                if (data[j] > data[j+1]) {
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        return data;
    }

    static private void showSort(int[] data) {
        System.out.println("Data after sort: ");
        int[] array = sorting1(data);

        for (int i : array) {
            System.out.print(i + ", ");
        }
    }
}