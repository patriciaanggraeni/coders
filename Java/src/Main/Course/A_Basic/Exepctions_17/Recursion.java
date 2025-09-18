package Course.A_Basic.Exepctions_17;

public class Recursion {

    static int loopRekAs(int n) {
        if (n >= 5) { // base case
            System.out.println("Nilai n: " + n);
            return n;
        } else { // worst case
            System.out.println("Nilai n: " + n);
            return loopRekAs(n+1);
        }
    }

    static int loopRekDes(int n) {
        int counter = 0;

        if (n <= 1) {
            System.out.println("Nilai n: " + n);
            return n;
        } else {
            ++counter;
            System.out.println("Nilai n: " + n);
            return loopRekDes(n-1) + counter;
        }
    }

    public static void main(String[] args) {

        // dasar rekursif / fungsi yang memanggil dirinya sendiri
        // alurnya, dia membagi sebuah masalah menjadi sub kecil
        // dan memiliki batas pemanggilan

        System.out.println("Ascending forloop ---");
        int hasil = loopRekAs(1);
        System.out.println("Total perulangan: " + hasil + "x");

        System.out.println("\nDescending forloop ---");
        int hasil2 = loopRekDes(5);
        System.out.println("Total perulangan: " + hasil2 + "x");
    }
}