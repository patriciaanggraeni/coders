package Course.A_Basic.Array2D_14;
import java.util.Arrays;

public class Array2dAdvance {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {6,7,8,9,10};

        int[][] arr = { a, b};

        // menampilkan dengan for each
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Integer.toHexString(System.identityHashCode(a)));
        System.out.println(Integer.toHexString(System.identityHashCode(b)));

        // di java, jumlah kolom boleh tidak sama (array ragged)
    }
}
