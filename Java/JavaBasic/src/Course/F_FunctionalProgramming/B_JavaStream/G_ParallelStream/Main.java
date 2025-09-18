package Course.F_FunctionalProgramming.B_JavaStream.G_ParallelStream;

import java.util.List;
import java.util.Arrays;

class Person {
    String nama;
    byte umur;

    Person(String nama, byte umur) {
        this.nama = nama;
        this.umur = umur;
    }
}

public class Main {
    public static void main(String[] args) {

        List<Person> p = Arrays.asList(
                new Person("Anggara", (byte) 20),
                new Person("Jigan", (byte) 25)
        );

        // 1. Menggunakan parallelStream()
        p.parallelStream().filter( x -> x.nama.length() > 5 ).forEach( x ->
                System.out.println("Nama: " + x.nama + " " + "Umur: " + x.umur) );

        // 2. Convert stream ke stream parallel
         p.stream().parallel().filter( x -> x.nama.length() > 5 ).forEach( x ->
                System.out.println("Nama: " + x.nama + " " + "Umur: " + x.umur) );

    }
}
