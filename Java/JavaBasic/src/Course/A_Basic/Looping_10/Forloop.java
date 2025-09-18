package Course.A_Basic.Looping_10;

public class Forloop {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println(" ");
            for (int j = 0; j <= i; j++) {
                System.out.print(" " + j);
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" " + k);
            }

            System.out.println(" ");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(" ");
            for (int j = 5; j > i; j--) {
                System.out.print(" " + j);
            }
            for (int k = 5; k > i; k--) {
                System.out.print(" " + k);
            }
            System.out.println(" ");
        }
    }
}
