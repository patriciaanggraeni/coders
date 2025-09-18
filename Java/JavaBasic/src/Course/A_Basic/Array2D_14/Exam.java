package Course.A_Basic.Array2D_14;

public class Exam {
    public static void main(String[] args) {

        // menjumlahkan elemen dalam array 2d
        int[][] arr1 = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15}
        };

        int[][] arr2 = {
                {5,4,3,2,1},
                {10,9,8,7,6},
                {15,14,13,12,11}
        };

        tampil(arr1, arr2);

    }

    private static void tampil(int[][] data1, int[][] data2) {

        int[][] hasil = tambahMatriks(data1, data2);

        for (int[] i : hasil) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }

    private static int[][] tambahMatriks(int[][] data1, int[][] data2) {
        int size_row1 = data1.length;
        int size_col1 = data1[0].length;

        int size_row2 = data2.length;
        int size_col2 = data2[0].length;

        int[][] hasil = new int[size_row1][size_col1];

        // buat kondisi jika jumlah baris dan kolom kedua array sama
        if (size_row1 == size_row2 && size_col1 == size_col2) {
            for (int i = 0; i < hasil.length; i++) {
                for (int j = 0; j < hasil[i].length; j++) {
                    hasil[i][j] = data1[i][j] + data2[i][j];
                }
            }
        } else {
            System.out.println("Jumlah elemen baris atau kolom tidak sama!");
        }

        return hasil;
    }
}
