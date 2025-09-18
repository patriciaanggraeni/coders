package Testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {

        List<Integer> rawNumber = Arrays.asList(100, 11, 43, 32, 21, 32);
        List<Integer> filteredNumber = new ArrayList<>();

        for (int i : rawNumber) {
            if (i % 2 == 0) {
                filteredNumber.add(i);
            }
        }

        filteredNumber = rawNumber.stream().filter( x -> x % 2 == 0 ).collect(Collectors.toList());
        System.out.println(filteredNumber);

    }
}
