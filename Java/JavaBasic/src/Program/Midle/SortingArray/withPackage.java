package Program.Midle.SortingArray;
import java.util.Arrays;
import java.util.Scanner;

public class withPackage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Masukkan jumlah array: ");
        n = sc.nextInt();

        int[] array = new int[n];
        int size = array.length;

        System.out.println(" ");
        for (int i = 0; i < size; i++) {
            System.out.printf("Masukkan data array ke-%d: ", (i+1));
            array[i] = sc.nextInt();
        };

        sorted(array);
    }

    static private int[] sortingArray(int[] data) {
        Arrays.sort(data);
        return data;
    }

    static private void sorted(int[] data) {
        int[] sort = sortingArray(data);

        System.out.print("Sorted array: ");
        for (int i : sort) {
            System.out.print(i + " ");
        }
    }
}
