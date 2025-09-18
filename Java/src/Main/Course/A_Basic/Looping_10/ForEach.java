package Course.A_Basic.Looping_10;

public class ForEach {
    public static void main(String[] args) {

        int[] data = {1,2,3,4,5};

        System.out.println("Menampilkan data array dengan foreach ---\n");
        for (int i : data) {
            System.out.println("Nilai var: " + i);
        }
    }
}
