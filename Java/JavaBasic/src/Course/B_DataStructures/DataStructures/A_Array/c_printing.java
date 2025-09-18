package Course.B_DataStructures.DataStructures.A_Array;

public class c_printing {
    public static void main(String[] args) {

        int[] array = new int[5];

        array[0] = 5;
        array[1] = 4;
        array[2] = 3;
        array[3] = 2;
        array[4] = 1;

        print(array);
    }

    private static void print(int[] data) {

        System.out.print("Hasil: ");
        for (int i : data) {
            System.out.print(i + " ");
        }
    }
}
