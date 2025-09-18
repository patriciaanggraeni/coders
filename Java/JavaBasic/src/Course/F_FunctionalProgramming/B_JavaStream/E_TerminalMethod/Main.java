package Course.F_FunctionalProgramming.B_JavaStream.E_TerminalMethod;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    
    public static void main(String[] args) {
        
        List<String> car = Arrays.asList("Avanza", "Nisan", "Lamborgini", "Ducati", "Nisan", "Lamborgini");

        // 1. Penggunan non-terminal method: distinct
        System.out.println("\n----- Penggunaan Non-terminal method - distinct():");
        car.stream().distinct().forEach( x -> System.out.print(x + " ") );
        
        // 2. Penggunaan non-terminal method: limit
        System.out.println("\n\n----- Penggunaan Non-terminal method - limit():");
        car.stream().distinct().limit(2).forEach( x -> System.out.print(x + " ") );
        
        // 3. Penggunaan terminal method: collect()
        List<String> temp = new LinkedList<String>();
        System.out.println("\n\n----- Penggunaan terminal method - collect():");
        temp = car.stream().filter(x -> x.length() > 5).distinct().limit(2).collect(Collectors.toList());        
        temp.forEach( x -> System.out.print(x + " "));
        
        // 4. Penggunaan terminal method: count()
        System.out.println("\n\n----- Penggunaan terminal method - count():");
        long sum = car.stream().distinct().count();
        System.out.println("Jumlah Elemen (Unik): " + sum);
        
        // 5. Penggunaan terminal method: min() dan max()
        System.out.println("\n\n----- Penggunaan terminal method - max() dan min():");
        List<Integer> numOne = Arrays.asList(100, 30, 40, 10, 10202, 90, 99);
        
        Optional<Integer> max = numOne.stream().max( (a, b) -> a.compareTo(b) );
        Optional<Integer> min = numOne.stream().min( (a, b) -> a.compareTo(b) );

        System.out.println("Nilai max: " + max.get());
        System.out.println("Nilai min: " + min.get());
        
        // 6. Penggunaan terminal method: forEach()
        System.out.println("\n\n----- Penggunaan terminal method - forEach():");
        car.stream().forEach( x -> System.out.println(x + " ") );
        
        // 7. Penggunaan terminal method: toArray()
        System.out.println("\n\n----- Penggunaan terminal method - toArray():");
        Integer[] myArray = numOne.stream().toArray(arr -> new Integer[arr]);
        for (int i : myArray) {
            System.out.print(i + " ");
        }

        // 8. Penggunaan terminal method: sorted
        System.out.println("\n\n----- Penggunaan terminal method - sorted():");
        // mengurutkan secara ascending
        System.out.print("\nAscending: ");
        numOne.stream().sorted().forEach( x -> System.out.print(x + " ") );

        // mengurutkan secara descending
        System.out.print("\nDescending: ");
        numOne.stream().sorted( Comparator.reverseOrder() ).forEach( x -> System.out.print(x + " ") );
    }
}
