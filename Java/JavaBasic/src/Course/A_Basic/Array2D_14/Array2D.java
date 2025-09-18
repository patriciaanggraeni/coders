package Course.A_Basic.Array2D_14;
import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {

        // mendeklarasikan array multidimensi
        // int[][] = [baris][kolom]
        int[][] array1 = new int[2][5];

        int[][] array2 = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };

        // output akan meghasilakan alamat dari array
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        // menampilkan array2d dengan forloop
        System.out.println(" ");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.deepToString(array1));
    }
}
