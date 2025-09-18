package Course.F_FunctionalProgramming.B_JavaStream.C_MapMethod;

import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Predicate;

class Person {

    private String nama;
    private byte umur;
    private String hobi;

    Person(String nama, byte umur, String hobi) {
        this.nama = nama;
        this.umur = umur;
        this.hobi = hobi;
    }

    public String getNama() { return nama; }
    public byte getUmur() { return umur; }
    public String getHobi() { return hobi; }
}

public class Main {
    public static void main(String[] args) {

        // ----- 1. Mengkombinasi map dengan Function dan Consumer
        List<Integer> myNumber = Arrays.asList(19, 10, 23, 12, 34, 55, 72, 17);
        List<Integer> result = new LinkedList<Integer>(); 

        // lalu buat lambda Function ddan Consummer
        Function<Integer, Integer> multiply = x -> (int) Math.pow(x, 2);
        Consumer<Integer> consume = x -> System.out.print(x + " ");
        result = myNumber.stream().map(multiply).collect(Collectors.toList());
        result.forEach(consume);

        // ----- 2. Menkombinasikan map dengan Predicate dan Consumer
        List<Person> listPr = new LinkedList<Person>();
        List<Person> myListPr = new LinkedList<Person>();

        listPr.add(new Person("Halim", (byte) 22, "Menggambar"));
        listPr.add(new Person("Ijono", (byte) 20, "Sunmori"));
        listPr.add(new Person("Painem", (byte) 18, "Mancing"));

        // lalu buat lambda Predicate dan Consumner
        Predicate<Person> cekUmur = x -> x.getUmur() <= 20;
        Predicate<Person> cekNama = x -> x.getNama().length() <= 5;
        Consumer<Person> showDataPerson = x -> {
            Supplier<String> nama = () -> x.getNama();
            Supplier<Byte> umur = () -> x.getUmur();
            Supplier<String> hobi = () -> x.getHobi();

            System.out.println(" ");
            System.out.println("Nama: " + nama.get());
            System.out.println("Umur: " + umur.get());
            System.out.println("Hobi: " + hobi.get());
        };

        myListPr = listPr.stream().filter(cekUmur.and(cekNama)).collect(Collectors.toList());
        myListPr.forEach(showDataPerson);
    }
}