package Course.F_FunctionalProgramming.B_JavaStream.F_Matching;

import java.util.List;
import java.util.Arrays;
import java.util.Optional;

import java.util.function.Predicate;

class Person {

    private String nama;
    private byte umur;

    Person(String nama, byte umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public String getNama() { return this.nama; }
    public byte getUmur() { return this.umur;  }

}

public class Main {
    
    public static void main(String[] args) {
        
        List<Person> daftarNama = Arrays.asList(
            new Person("Pak. Ali", (byte) 50),
            new Person("Muhhammed", (byte) 18),
            new Person("Joko", (byte) 25),
            new Person("Putri", (byte) 31),
            new Person("Agnes", (byte) 20)
        );
        
        // 1. Penggunaan method: AllMatch
        Predicate<Person> pNama = x -> x.getNama().equals("Muhammed");
        boolean cariNama = daftarNama.stream().allMatch(pNama);
        System.out.println(cariNama);

        // 2. Menggunakan method: AnyMatch
        Predicate<Person> pUmur = x -> x.getUmur() == 25;
        boolean cariUmur = daftarNama.stream().anyMatch(pUmur);
        System.out.println(cariUmur);

        // 3. Menggunakan method: noneMatch
        Predicate<Person> none = x -> x.getUmur() < 18;
        boolean hasil = daftarNama.stream().noneMatch(none);
        System.out.println(hasil);

        // 4. Menggunakan method: findFirst
        Optional<Person> firstName = daftarNama.stream().findFirst();
        System.out.println("Nama: " + firstName.get().getNama());
        System.out.println("Umur: " + firstName.get().getUmur());

        // 4. Menggunakan method: findAny
        Optional<Person> names = daftarNama.stream().findAny();
        names.ifPresent( x -> {
            System.out.println("Nama: " + x.getNama());
            System.out.println("Umur: " + x.getUmur());
        } );
    }
}
