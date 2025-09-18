package Course.A_Basic.IfStatement_08;

public class NestedIf {
    public static void main(String[] args) {

        int a, b;
        a = 10;
        b = 11;

        if (a == 10 && b == 1) {
            System.out.println("Inner if : 1");
            if (a == 10 || b == 10) {
                System.out.println("Inner if : 2");
                if (a == 10 && b == 7) {
                    System.out.println("Inner if : 3");
                } else {
                    System.out.println("Inner if : 3 (else)");
                }
            } else {
                System.out.println("Inner if : 2 (else)");
            }
        } else {
            System.out.println("Inner if : 1 (else)");

            if (a == 10 && b == 11) {
                System.out.println("Inner if (else) 1");
            } else {
                System.out.println("Inner else (if) 1");
            }
        }
    }
}
