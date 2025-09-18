package Course.F_FunctionalProgramming.B_JavaStream.D_FlatMethod;

import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Integer> numberList1 = Arrays.asList(10, 20, 30, 12, 14, 22, 66);
        List<Integer> numberList2 = Arrays.asList(71, 89, 101, 9, 11, 31, 19);
        
        // 1. menggunakan stream flatMethod untuk mengambil elemen tiap collection
        List<List<Integer>> myNumber = Arrays.asList(numberList1, numberList2);
        myNumber.stream().flatMap( list -> list.stream().map( x -> x * 2 ) ).forEach( x -> System.out.print(x + " ") );
        
        // 2. Menggunakan lambda expressions yaitu Predicate, Function dan Consumer
        Predicate<Integer> oddNum = x -> x % 2 != 0;
        Function<Integer, Integer> multi = x -> x * 2;
        Consumer<Integer> showData = x -> System.out.print(x + " ");
    
        List<List<Integer>> myNumberOne = Arrays.asList(numberList1, numberList2);
        myNumberOne.stream().flatMap(x -> x.stream().map(multi)).filter(oddNum).forEach(showData);
        
    }
}