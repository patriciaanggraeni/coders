package Course.A_Basic.Operator_05;

public class Logics {
    public static void main(String[] args) {

        // Operator logika
        boolean c1 = true;
        boolean c2 = false;
        boolean c3 = c1 && c2;
        boolean c4 = c1 || c2;
        boolean c5 = !c1;
        boolean c6 = !c2;

        System.out.printf("%b && %b = %b\n", c1, c2, c3);
        System.out.printf("%b || %b = %b\n", c1, c2, c4);
        System.out.printf("!%b = %b\n", c1, c5);
        System.out.printf("!%b = %b", c2, c6);
        System.out.println("\n");
    }
}
