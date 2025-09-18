package Program.Midle.SortingArray;
import java.util.Scanner;

public class withForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Masukkan jumlah array: ");
        n = sc.nextInt();

        int[] dataArray = new int[n];
        int size = dataArray.length;

        System.out.println(" ");
        for (int i = 0; i < size; i++) {
            System.out.printf("Masukkan data array ke-%d: ", (i+1));
            dataArray[i] = sc.nextInt();
        }

        showData(dataArray);
    }

    static private int[] sortingArray(int[] data) {
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

    static private void showData(int[] data) {
        int[] array = sortingArray(data);

        System.out.print("Data sorted: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
