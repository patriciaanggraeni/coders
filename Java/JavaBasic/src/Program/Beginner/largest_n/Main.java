package Program.Beginner.largest_n;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n, max, a[];

        System.out.print("Masukkan jumlah bilangan: ");
        n = sc.nextInt();
        a = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Masukkan bilangan: ");
            a[i] = sc.nextInt();
        }

        max = maxNumber(a, n);
        System.out.println("\nHasil: " + max);

        sc.close();
    }

    private static int maxNumber(int[] a, int n) {
        int m = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > m) {
                m = a[i];
            }
        }
        return m;
    }
}