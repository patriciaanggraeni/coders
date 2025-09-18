package Course.A_Basic.IfStatement_08;

public class If_ElseIf_Else {
    public static void main(String[] args) {

        // if... else...
        int a = 5;
        int b = 10;

        if (a == 5 || b != 10) {
            System.out.println("Nilai a adalah " + a);
        } else {
            System.out.println("Nilai a bukan " + a);
        }
        System.out.println(" ");

        // if... if else... else...
        int c = 7;
        int d = 8;
        int e = 9;

        if (c == 7 && d == 10) {
            System.out.println("Nilai c adalah " + c + " dan " + "Nilai d adalah " + d);
        } else if (d == 8 && e == 9) {
            System.out.println("Nilai d adalah " + d + " dan " + "Nilai e adalah " + e);
        } else {
            System.out.println("Nilai c adalah " + c + " dan " + "Nilai d adalah " + d);
        }
        System.out.println(" ");
    }
}