package Course.B_DataStructures.Algorithm.C_Looping.Recursion;

public class Main {

    // fungsi yang memanggil dirinya sendiri
    static int rek(int n) {

        // makanya didalam rekursif wajib ada pembatas (best and worst case)
        // untuk membuatnya, pakai if // finite loop
        if (n == 5) { // best case
            System.out.println("Nilai n: " + n);
            return n;
        } else { // worst case
            System.out.println("Nilai n: " + n);
            return rek(n+1);
        }
    }

    static int rek2(int n) {

        // makanya didalam rekursif wajib ada pembatas (best and worst case)
        // untuk membuatnya, pakai if // finite loop
        // kita variabel counter

        int count = 0;
        if (n == 1) { // best case
            System.out.println("Nilai n: " + n);
            return n; // mengembalikan nilai 1
        } else { // worst case
            count++; // masuk sini, count = 1 -> 2 -> 3 -> 4
            System.out.println("Nilai n: " + n);
            return rek2(n-1) + count; // 4 + 1 -> 3 + 2 -> 2 + 3 -> 1 + 4
        }
    }

    public static void main(String[] args) {

        // tampilkan di sini
        System.out.println("Total perulangan: " + rek(1) + "x");
        System.out.println("Total perulangan: " + rek2(5) + "x");
    }
}
